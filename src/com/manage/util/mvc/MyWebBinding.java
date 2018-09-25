package com.manage.util.mvc;

import java.beans.PropertyEditorSupport;
import java.util.Date;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

public class MyWebBinding implements WebBindingInitializer {

	public void initBinder(WebDataBinder binder, WebRequest request) {
		//1. 使用spring自带的CustomDateEditor
		//SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		//binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
		
		//2. 自定义的PropertyEditorSupport
		//日期属性编辑器
		binder.registerCustomEditor(Date.class, new DateConvertEditor());
		//int类型属性编辑器
		binder.registerCustomEditor(int.class, new PropertyEditorSupport() {  
			  
            @Override  
            public String getAsText() {  
                return getValue().toString();  
            }  
  
            @Override  
            public void setAsText(String text) throws IllegalArgumentException {  
                setValue(Integer.parseInt(text));  
            }  
              
        });  
	}

}
