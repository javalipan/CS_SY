package com.manage.action;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.manage.dao.model.User;
import com.manage.util.TreeNodes;
//父级
public class BaseController {
	
	/** 
	* @Title: DataGridJson 
	* @Description: 转换easyui datagrid所需的json
	* @param list： 列表
	* @param count: 条数
	* @return String     
	*/
	public String DataGridJson(List<?> list,int count){
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("total", count);
		map.put("rows", list);
		return JSONObject.fromObject(map).toString();
	}
	
	/** 
	* @Title: List2ComboboxJson 
	* @Description: 将list转换为easyui combobox所需json
	* @param list： 要转换的list
	* @param id: 下拉选项值对应的实体属性
	* @param text ：下拉选项显示文本对应的实体属性
	* @return String     
	*/
	public String List2ComboboxJson(List<?> list,String id,String text){
		List<Map<String, String>> result=new ArrayList<Map<String,String>>();
		for(Object object:list){
			Map<String, String> map=new HashMap<String, String>();
			try {
				map.put("id", BeanUtils.getProperty(object, id));
				map.put("text", BeanUtils.getProperty(object, text));
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			}
			result.add(map);
		}
		return JSONArray.fromObject(result).toString();
	}
	
	/** 
	* @Title: getUUID 
	* @Description: 获取UUID
	* @return String     
	*/
	public String getUUID(){
		return UUID.randomUUID().toString();
	}
	
	/** 
	* @Title: list2TreeNodes 
	* @Description: 组合父子关系
	* @param list
	* @return List<TreeNodes>     
	*/
	public List<TreeNodes> list2TreeNodes(List<TreeNodes> list) {
		for (TreeNodes bean : list) {
			bean.setChildren(new ArrayList<TreeNodes>());
			for (TreeNodes tn : list) {
				if (bean.getId().equals(tn.getParentId())) {
					bean.getChildren().add(tn);
					// 标记为子节点
					tn.setChild(true);
				}
			}
		}
		List<TreeNodes> tagList = new ArrayList<TreeNodes>();
		for (TreeNodes b : list) {
			if (!b.isChild()) {
				tagList.add(b);
			}
		}
		return tagList;
	}
	
	/** 
	* @Title: getSessionInfo 
	* @Description: 获取当前登录用户
	* @return User     
	*/
	public User getSessionInfo(){
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest(); 
		return (User) request.getSession().getAttribute("USER_INFO_CASHIER");
	}
	
	@ModelAttribute
	public void modelattribute(ModelMap model,HttpServletRequest request){
		model.put("ctx", request.getContextPath());
		String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/";
		model.put("basePath", basePath);
	}
	
	/**
	 * <p>说明： 把普通集合转换成 EasyUiTree要求的json数据格式</p>
	 * @param list 待转换的集合
	 * @param id 集合中表示ID的对象属性名的字符串，如："organizationCode"，必须
	 * @param text 集合中表示text的对象属性名的字符串，必须
	 * @param parentId 集合中表示父级ID的对象属性名的字符串
	 * @param state 集合中表示节点状态的对象属性名的字符串
	 * @param checked 集合中表示显示选定的节点是否选中的对象属性名的字符串
	 * @param isAttributes 集合中表示自定义属性的对象属性名的字符串
	 * @param params[0] 图标列表
	 * @return String 出错时返回null
	 * @author tuxy
	 * @date 2013-5-29
	 * <p>修改说明：</p>
	 * <p>修改者： 修改时间： </p>
	 */
	@SuppressWarnings("unchecked")
	public static String list2easyUiTreeData(List<?> list,String id,String text,String parentId,String state,String checked,boolean isAttributes,Object... params) {
		String td = "";
		List<String> iconlist=null;
		if(params!=null&&params.length>0){
			iconlist=(List<String>) params[0];
		}
		try {
			if(list!=null && id != null && text != null){
				List<Map<String,Object>> treeList = new ArrayList<Map<String,Object>>();
				Map<String,Object> tree = null;
				Iterator<?> it = list.iterator();
				while(it.hasNext()){  //迭代
					tree = new HashMap<String,Object>();
					Object itObj = it.next(); //获取对象
					
					Class<? extends Object> type = itObj.getClass();
					BeanInfo beanInfo = Introspector.getBeanInfo(type);
					PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
					Map<String, Object> attrs=new HashMap<String, Object>();
					for (int i = 0; i < propertyDescriptors.length; i++) {
						PropertyDescriptor descriptor = propertyDescriptors[i];
						String propertyName = descriptor.getName();
						Object value=null;
						if (!propertyName.equals("class")) {
							Method readMethod = descriptor.getReadMethod();
							value = readMethod.invoke(itObj, new Object[0]);
						}
						attrs.put(propertyName, value);
						if(propertyName.equals(id)){
							tree.put("id", value);
							continue;
						}
						if(propertyName.equals(text)){  //属性为text的则存入tree的text属性里
							tree.put("text", value);
							continue;
						}
						if(propertyName.equals(state)){  //state
							tree.put("state", value);
							continue;
						}
						if(propertyName.equals(checked)){  //checked
							tree.put("checked", value);
							continue;
						}
						if(propertyName.equals(parentId)){  //parentId
							tree.put("parentId", value);
							continue;
						}
						if(propertyName.equals("attributes")){
							if(isAttributes){
								tree.put("attributes", value);
								continue;
							}
						}
					}
					if(tree.get("state")==null){
						tree.put("state", "closed");
					}
					treeList.add(tree);
				}
				if(parentId != null){
					List<Map<String,Object>> treeList2 = parentFlag2childrenArray(treeList);  //组装children
					if(iconlist!=null){
						setGrade(treeList2, 1,iconlist);
					}
					td = JSONArray.fromObject(treeList2).toString();  //转成json
				}else{
					td = JSONArray.fromObject(treeList).toString();  //转成json
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return td;
	}
	
	/**
	 * <p>说明： 按parentId组装成children数组 </p>
	 * @param treeList 格式为List<Map<String,Object>>，需包含id,parentId元素
	 * @return List<Map<String,Object>>
	 * @author tuxy
	 * @date 2013-5-29
	 * <p>修改说明：</p>
	 * <p>修改者： 修改时间： </p>
	 */
	private static List<Map<String,Object>> parentFlag2childrenArray(List<Map<String,Object>> treeList){
		//按pareantId把各个对象放入对应的父级对象的children数字里
		for(Map<String,Object> td:treeList){
			List<Map<String,Object>> children = new ArrayList<Map<String,Object>>();
			for(Map<String,Object> tdc:treeList){
				if(td.get("id").equals(tdc.get("parentId"))){
					children.add(tdc);
					tdc.put("isChild", "1");  //标记为子节点
				}
			}
			td.put("children",children);
		}
		//去掉被加为子节点的
		List<Map<String,Object>> childListReturn = new ArrayList<Map<String,Object>>();
		for(Map<String,Object> td:treeList){
			if(td.get("isChild")==null || !td.get("isChild").equals("1")){
				childListReturn.add(td);  //非子节点的才是要返回的
			}
		}
		return childListReturn;
	}
	
	public static void setGrade(List<Map<String,Object>> treeList,int i,List<String> iconlist){
    	for(Map<String,Object> map:treeList){
    		map.put("grade", i);
    		if(iconlist.size()<i-1){
    			map.put("iconCls","tree-file");
    		}
    		else{
    			map.put("iconCls", iconlist.get(i-1));
    		}
    		if(map.get("children")!=null){
    			@SuppressWarnings("unchecked")
				List<Map<String,Object>> children=(List<Map<String, Object>>) map.get("children");
    			setGrade(children, i+1,iconlist);
    		}
    	}
    }
	
	@ModelAttribute
	public void initPath(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		String base = request.getContextPath();
		String fullPath="";
		if("80".equals(request.getServerPort())){
			fullPath = request.getScheme() + "://" + request.getServerName()+ base;
		}
		else{
			fullPath = request.getScheme() + "://" + request.getServerName()+":"+request.getServerPort() + base;
		}
		
		model.put("base", base);
		model.put("fullPath", fullPath);
		model.put("ftppath", "");
	}
}
