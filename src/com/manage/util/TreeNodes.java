package com.manage.util;

import java.util.List;
import java.util.Map;

public class TreeNodes {

	private String id; // 节点id,它是重要的来加载远程数据
	private String text; // 节点文本来显示
	private String state; // 节点状态,“open”或“closed”,默认是“open”。当设置为“closed”,节点有子节点,并将负载从远程站点
	private boolean checked; // 显示选定的节点是否选中。
	private Map<String, Object> attributes; // 自定义属性可以被添加到一个节点
	private List<TreeNodes> children; // 一个数组节点定义了一些子节点
	private String parentId; // 父级节点ID
	private boolean isChild; // 有上级，是子节点
	private String iconCls; // 图标

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public Map<String, Object> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, Object> attributes) {
		this.attributes = attributes;
	}

	public List<TreeNodes> getChildren() {
		return children;
	}

	public void setChildren(List<TreeNodes> children) {
		this.children = children;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public boolean isChild() {
		return isChild;
	}

	public void setChild(boolean isChild) {
		this.isChild = isChild;
	}

	public String getIconCls() {
		return iconCls;
	}

	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

}
