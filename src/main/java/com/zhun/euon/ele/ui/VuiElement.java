package com.zhun.euon.ele.ui;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.UUID;

import com.zhun.euon.ele.EuonComponent;

public class VuiElement extends EuonComponent{
//	private String name;
//	private String type;
	private UUID pId;
	private UUID sId;
	private Map<String,VuiElement> childMap;
	private LinkedList<VuiElement> childList;
	private String roletnm;	
	private String state;
	private String status;
	private Map<String,Object> fieldsMap;
	
	public VuiElement(){
		childMap= new HashMap<String, VuiElement>();
		childList= new LinkedList<>();
		fieldsMap= new HashMap<String, Object>();
	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getType() {
//		return type;
//	}
//	public void setType(String type) {
//		this.type = type;
//	}
	public UUID getpId() {
		return pId;
	}
	public void setpId(UUID pId) {
		this.pId = pId;
	}
	public UUID getsId() {
		return sId;
	}
	public void setsId(UUID sId) {
		this.sId = sId;
	}
	public Map<String, VuiElement> getChildMap() {
		return childMap;
	}
	public void setChildMap(Map<String, VuiElement> childMap) {
		this.childMap = childMap;
	}
	public LinkedList<VuiElement> getChildList() {
		return childList;
	}
	public void setChildList(LinkedList<VuiElement> childList) {
		this.childList = childList;
	}
	public String getRoletnm() {
		return roletnm;
	}
	public void setRoletnm(String roletnm) {
		this.roletnm = roletnm;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Map<String, Object> getFieldsMap() {
		return fieldsMap;
	}
	public void setFieldsMap(Map<String, Object> fieldsMap) {
		this.fieldsMap = fieldsMap;
	}
	
}
