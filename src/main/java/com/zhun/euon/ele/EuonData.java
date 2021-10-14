package com.zhun.euon.ele;

import java.util.HashMap;

public class EuonData extends EuonUnit{
private HashMap<String,Object>   coreData;

public EuonData() {
	coreData= new HashMap<String, Object>();
}
public EuonData(String name,HashMap<String,Object>  coreData) {
//	this.coreData=new HashMap<>();
	this.setName(name);
	this.coreData.put(name, coreData);
}
public EuonData(String name) {
	this.coreData=new HashMap<>();
	this.setName(name);
}

public Object getCoreData(String key) {
	return coreData.get(key);
}
public HashMap getCoreData() {
	return coreData;
}


public void setCoreData(HashMap<String,Object> coreDataMap) {
	this.coreData.putAll(coreDataMap);
	}
public void setCoreData(String key,Object coreData) {
	this.coreData.put(key, coreData);
}
}
