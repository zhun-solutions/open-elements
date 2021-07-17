package com.zhun.euon.ele;

import java.util.HashMap;

 //@NodeEntity
public class EuonUnit extends EuonElementImpl{
private HashMap<String, EuonField>fields= new HashMap<>();


//private HashMap<String,HashMap<String,EuonUnit>> relationalElements ;

public HashMap<String, EuonField> getFields() {
	return fields;
}


public void setFields(HashMap<String, EuonField> fields) {
	this.fields = fields;
}


public void getField(EuonField field)
{
   fields.put(field.getName(),field);	
}


public void setFieldValue(String name,Object value)
{
	if(fields.get(name)==null) {
		 EuonField ef = new EuonField();
		 ef.setName(name);
		 ef.setFieldValue(value);
		fields.put(name,ef);
	}else {
  fields.get(name).setFieldValue(value);	
	}
}


public EuonField getField(String name)
{
return  fields.get(name);	
}


public Object getFieldValue(String name)
{
return  fields.get(name).getFieldValue();	
}

//
//
//public HashMap<String, EuonUnit> getRelationalElements(String type) {
//	return relationalElements.get(type);
//}
//
//public EuonUnit getRelationalElements(String type,String key) {
//	return relationalElements.get(type).get(key);
//}


//
//public HashMap<String, HashMap<String, EuonUnit>> getRelationalElements() {
//	return relationalElements;
//}

//
//public void setRelationalElements(HashMap<String, HashMap<String, EuonUnit>> relationalElements) {
//	this.relationalElements = relationalElements;
//}
//
//public void setRelationalElements(String type, HashMap<String, EuonUnit> relationalElements) {
//	this.relationalElements.put(type, relationalElements);
//}
//
//public void addRelationalElements(String type, HashMap<String, EuonUnit> relationalElements) {
//	HashMap<String, EuonUnit> relEles = this.relationalElements.get(type);
//			if(relEles==null){
//				relEles= new HashMap<String, EuonUnit>();
//				this.relationalElements.put(type, relEles);
//			}
//			this.relationalElements.get(type).putAll(relationalElements);
//}
//
//
//public void addRelationalElements(String type,EuonUnit relationalElement) {
//	HashMap<String, EuonUnit> relEles = this.relationalElements.get(type);
//			if(relEles==null){
//				relEles= new HashMap<String, EuonUnit>();
//				this.relationalElements.put(type, relEles);
//			}
//			this.relationalElements.get(type).put(relationalElement.getName(),relationalElement);
//} 


}
