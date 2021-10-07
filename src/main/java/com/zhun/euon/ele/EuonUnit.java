package com.zhun.euon.ele;

import java.util.ArrayList;
import java.util.HashMap;

import com.zhun.euon.api.exec.event.cntxt.EVENTFLAG;
import com.zhun.euon.api.exec.process.cntxt.EventContext;
import com.zhun.euon.api.exec.process.cntxt.EventContextState;
import com.zhun.euon.api.exec.process.cntxt.ProcessContext;

 //@NodeEntity
public class EuonUnit extends EuonElementImpl{
private HashMap<String, EuonField>fields= new HashMap<>();
private EuonContext euonContext;


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
public EuonContext getEuonContext() {
	return euonContext;
}
public void setEuonContext(EuonContext context) {
	this.euonContext = context;
}

public void setEuonContextBasic(String StatusMessage, String EventName, String EventType, EVENTFLAG eventFlag, String evtContext) {
	EventContextState eventContextState = new EventContextState();
    eventContextState.setStatusMessage(StatusMessage);
    
    EventContext eventContext = new EventContext();
    eventContext.setProcessContextState(eventContextState);
    eventContext.setProcessContextState(eventContextState);
    eventContext.setEventName(EventName);
    eventContext.setEventType(EventType);
    eventContext.addEventFlag(eventFlag);
    eventContext.setEventContext(evtContext);
    
    EuonContext euonContext = new EuonContext();
    euonContext.setContext(eventContext);
    
    this.euonContext = euonContext;
}

//public void updateEventName(String eventName) {
//	ProcessContext pc = this.euonContext.getContext();
//	pc.setEventName(eventName);
//}
//public void updateEventType(String eventType) {
//	
//}
//public void updateEventFlag(EVENTFLAG eventFlag) {
//	
//}

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
