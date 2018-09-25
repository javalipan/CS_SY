package com.manage.util.mybatis;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.mybatis.generator.api.GeneratedJavaFile;
import org.mybatis.generator.api.GeneratedXmlFile;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.ProgressCallback;
import org.mybatis.generator.api.ShellCallback;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.Context;
import org.mybatis.generator.config.MergeConstants;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.ShellException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.mybatis.generator.internal.NullProgressCallback;
import org.mybatis.generator.internal.ObjectFactory;
import org.mybatis.generator.internal.XmlFileMergerJaxp;
import org.mybatis.generator.internal.util.ClassloaderUtility;
import org.mybatis.generator.internal.util.messages.Messages;
@SuppressWarnings("all")

public class LocalMyBatisGenerator extends MyBatisGenerator {

	private Configuration configuration;
	private ShellCallback shellCallback;
	private List generatedJavaFiles;
	private List generatedXmlFiles;
	private List warnings;
	private Set projects;
	private boolean isMergeable = false;
	
	public LocalMyBatisGenerator(Configuration configuration,
			ShellCallback shellCallback, List<String> warnings)
			throws InvalidConfigurationException {
		super(configuration, shellCallback, warnings);
		if (configuration == null)
			throw new IllegalArgumentException(
					Messages.getString("RuntimeError.2"));
		this.configuration = configuration;
		if (shellCallback == null)
			this.shellCallback = new DefaultShellCallback(false);
		else
			this.shellCallback = shellCallback;
		if (warnings == null)
			this.warnings = new ArrayList();
		else
			this.warnings = warnings;
		generatedJavaFiles = new ArrayList();
		generatedXmlFiles = new ArrayList();
		projects = new HashSet();
		this.configuration.validate();
	}

	public void generate(ProgressCallback callback, Set contextIds,
			Set fullyQualifiedTableNames) throws SQLException, IOException,
			InterruptedException {
		if (callback == null)
			callback = new NullProgressCallback();
		generatedJavaFiles.clear();
		generatedXmlFiles.clear();
		List contextsToRun;
		if (contextIds == null || contextIds.size() == 0) {
			contextsToRun = configuration.getContexts();
		} else {
			contextsToRun = new ArrayList();
			Iterator i$ = configuration.getContexts().iterator();
			do {
				if (!i$.hasNext())
					break;
				Context context = (Context) i$.next();
				if (contextIds.contains(context.getId()))
					contextsToRun.add(context);
			} while (true);
		}
		if (configuration.getClassPathEntries().size() > 0) {
			ClassLoader classLoader = ClassloaderUtility
					.getCustomClassloader(configuration.getClassPathEntries());
			ObjectFactory.setExternalClassLoader(classLoader);
		}
		int totalSteps = 0;
		Iterator i$;
		for (i$ = contextsToRun.iterator(); i$.hasNext();) {
			Context context = (Context) i$.next();
			totalSteps += context.getIntrospectionSteps();
		}

		callback.introspectionStarted(totalSteps);
		Context context;
		for (i$ = contextsToRun.iterator(); i$.hasNext(); context
				.introspectTables(callback, warnings, fullyQualifiedTableNames))
			context = (Context) i$.next();

		totalSteps = 0;
		for (i$ = contextsToRun.iterator(); i$.hasNext();) {
			Context context_1 = (Context) i$.next();
			totalSteps += context_1.getGenerationSteps();
		}

		callback.generationStarted(totalSteps);
		Context context_2;
		for (i$ = contextsToRun.iterator(); i$.hasNext(); context_2
				.generateFiles(callback, generatedJavaFiles, generatedXmlFiles,
						warnings))
			context_2 = (Context) i$.next();

		callback.saveStarted(generatedXmlFiles.size()
				+ generatedJavaFiles.size());
		i$ = generatedXmlFiles.iterator();
		do {
			if (!i$.hasNext())
				break;
			GeneratedXmlFile gxf = (GeneratedXmlFile) i$.next();
			projects.add(gxf.getTargetProject());
			File targetFile;
			String source;
			try {
				File directory = shellCallback.getDirectory(
						gxf.getTargetProject(), gxf.getTargetPackage());
				targetFile = new File(directory, gxf.getFileName());
				if (targetFile.exists()) {
					if (isMergeable)
						source = XmlFileMergerJaxp.getMergedSource(gxf,
								targetFile);
					else if (shellCallback.isOverwriteEnabled()) {
						source = gxf.getFormattedContent();
						warnings.add(Messages.getString("Warning.11",
								targetFile.getAbsolutePath()));
					} else {
						source = gxf.getFormattedContent();
						targetFile = getUniqueFileName(directory,
								gxf.getFileName());
						warnings.add(Messages.getString("Warning.2",
								targetFile.getAbsolutePath()));
					}
				} else {
					source = gxf.getFormattedContent();
				}
			} catch (ShellException e) {
				warnings.add(e.getMessage());
				continue;
			}
			callback.checkCancel();
			callback.startTask(Messages.getString("Progress.15",
					targetFile.getName()));
			writeFile(targetFile, source);
		} while (true);
		for (i$ = generatedJavaFiles.iterator(); i$.hasNext();) {
			GeneratedJavaFile gjf = (GeneratedJavaFile) i$.next();
			projects.add(gjf.getTargetProject());
			try {
				File directory = shellCallback.getDirectory(
						gjf.getTargetProject(), gjf.getTargetPackage());
				File targetFile = new File(directory, gjf.getFileName());
				String source;
				if (targetFile.exists()) {
					if (shellCallback.isMergeSupported())
						source = shellCallback.mergeJavaFile(
								gjf.getFormattedContent(),
								targetFile.getAbsolutePath(),
								MergeConstants.OLD_ELEMENT_TAGS);
					else if (shellCallback.isOverwriteEnabled()) {
						source = gjf.getFormattedContent();
						warnings.add(Messages.getString("Warning.11",
								targetFile.getAbsolutePath()));
					} else {
						source = gjf.getFormattedContent();
						targetFile = getUniqueFileName(directory,
								gjf.getFileName());
						warnings.add(Messages.getString("Warning.2",
								targetFile.getAbsolutePath()));
					}
				} else {
					source = gjf.getFormattedContent();
				}
				callback.checkCancel();
				callback.startTask(Messages.getString("Progress.15",
						targetFile.getName()));
				writeFile(targetFile, source);
			} catch (ShellException e) {
				warnings.add(e.getMessage());
			}
		}

		String project;
		for (i$ = projects.iterator(); i$.hasNext(); shellCallback
				.refreshProject(project))
			project = (String) i$.next();

		callback.done();
	}
	
	private void writeFile(File file, String content) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(file, false));
		bw.write(content);
		bw.close();
	}
	
	private File getUniqueFileName(File directory, String fileName) {
		File answer = null;
		StringBuilder sb = new StringBuilder();
		int i = 1;
		do {
			if (i >= 1000)
				break;
			sb.setLength(0);
			sb.append(fileName);
			sb.append('.');
			sb.append(i);
			File testFile = new File(directory, sb.toString());
			if (!testFile.exists()) {
				answer = testFile;
				break;
			}
			i++;
		} while (true);
		if (answer == null)
			throw new RuntimeException(Messages.getString("RuntimeError.3",
					directory.getAbsolutePath()));
		else
			return answer;
	}
	
}
