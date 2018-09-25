package com.manage.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;


/** 
* @ClassName: FileUtils 
* @Description: 文件工具类
* @author lipan@cqrainbowsoft.com
* @date 2013-5-13 下午01:51:02 
*  
*/
public class FileUtils {
	
	
	/**创建文件
	 * @param file:要创建的文件
	 * @return
	 */
	public static File creatFile(File file){
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return file;
	}
	
	/**创建文件夹
	 * @param dir:要创建的文件夹
	 * @return
	 */
	public static File createDirs(File dir){
		if(!dir.exists()){
			dir.mkdirs();
		}
		return dir;
	}
	
	/**判断一个文件或者路径是否存在
	 * @param path:文件或者文件夹路径
	 * @return
	 */
	public static boolean isFileExist(String path){
		File file = new File(path);
		return file.exists();
	}
	
	/**删除指定的文件
	 * @param file:要删除的文件
	 * @return
	 */
	public static boolean deleteFile(File file){
		boolean flag=true;
		if(file.exists()){
			file.delete();
		}
		else{
			flag=false;
		}
		return flag;
	}
	
	/**删除指定文件夹或文件（注意:如果是文件夹，将会删除文件夹里面所有内容）
	 * @param dir:要删除的文件夹或文件
	 */
	public static void deleteDir(File dir){
		if(dir.exists()){
			if(dir.isDirectory()){
				File[] files=dir.listFiles();
				for(File f:files){
					deleteDir(f);
				}
			}
			dir.delete();
		}
	}
	
	/**将一个输入流写入到指定文件中
	 * @param path:文件的路径(如：C:/)
	 * @param fileName:文件的名称(如:test.txt)
	 * @param input:输入流
	 * @return
	 */
	public static boolean fileUpload(InputStream input,String path,String fileName){
        BufferedOutputStream outBuff = null;
        BufferedInputStream inBuff=null;
        try {
        	File f=new File(path);
        	if(!f.exists()){
        		f.mkdirs();
        	}
            // 新建文件输入流并对它进行缓冲
        	inBuff = new BufferedInputStream(input);
            // 新建文件输出流并对它进行缓冲
            outBuff = new BufferedOutputStream(new FileOutputStream(path+"//"+fileName));
            // 缓冲数组
            byte[] b = new byte[1024 * 5];
            int len;
            while ((len = inBuff.read(b)) != -1) {
                outBuff.write(b, 0, len);
            }
            // 刷新此缓冲的输出流
            outBuff.flush();
        }
            catch (Exception e) {
				e.printStackTrace();
				return false;
			}
        finally {
            // 关闭流
				try {
					if (inBuff != null){
						inBuff.close();
					}
					if (outBuff != null){
						outBuff.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
        }
        return true;
	}
	
	/**
     * 将一个文件中的内容读出来
     * @param file:卡的文件
     * @return
     */
    public static String readFile(File file){
    	if(file==null||!file.exists()){
    		return null;
    	}
    	String result="";
    	String text = "";
    	try{
    		BufferedReader buf = new BufferedReader(new FileReader(file));
    		while ((text = buf.readLine()) != null) {
    			result+=text;
    		}
    		buf.close();
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	return result;
    }
    
}
