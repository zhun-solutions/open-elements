package com.zhun.euon.ele;

import java.util.HashMap;
 
public class EuonComponent extends EuonUnit{
private EuonCore definition;
private EuonMetadata metaData;
private EuonData fieldsData;


public EuonComponent() {
	super();
	this.fieldsData= new EuonData();
}
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
public EuonData getData() {
	return fieldsData;
}
public void setFieldsData(EuonData data) {
	this.fieldsData = data;
}

public void loadMetadataValue(String name,String value)
{
	metaData.setFieldValue( name,value);	
}

public void setData(HashMap<String,Object> data) {
	this.fieldsData.setCoreData(data);	
}
public void setData(String key,Object data) {
 this.fieldsData.setCoreData(key, data);
 
}
public String getMetadata(String str) {
return	(String) this.metaData.getFieldValue(str);
}
 
}
