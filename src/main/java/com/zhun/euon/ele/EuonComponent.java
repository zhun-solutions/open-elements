package com.zhun.euon.ele;

import java.util.HashMap;
 
public class EuonComponent extends EuonUnit{
private EuonCore definition;
 private EuonMetadata metaData;
private EuonContext context;
private EuonData data;
public EuonCore getDefinition() {
	return definition;
}
public void setDefinition(EuonCore definition) {
	this.definition = definition;
}
public EuonMetadata getMetaData() {
	return metaData;
}
public void setMetaData(EuonMetadata metaData) {
	this.metaData = metaData;
}
public EuonContext getContext() {
	return context;
}
public void setContext(EuonContext context) {
	this.context = context;
}
public EuonData getData() {
	return data;
}
public void setData(EuonData data) {
	this.data = data;
}

public void loadMetadataValue(String name,String value)
{
	metaData.setFieldValue( name,value);	
}

public void setData(String key,HashMap<String,Object> data) {
	this.data=new EuonData(key, data);
}
public void setData(String parent,String key,Object data) {
 EuonData ed = new EuonData(parent) ;
 ed.setCoreData(key, data);
 this.data=ed;
 
}
public String getMetadata(String str) {
return	(String) this.metaData.getFieldValue(str);
}
 
}
