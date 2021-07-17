package com.zhun.euon.ele;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.UUID;

import org.apache.ignite.cache.query.annotations.QuerySqlField;
import com.zhun.euon.api.exec.process.cntxt.ProcessContext;
 
public class EuonElementImpl implements EuonElement{

    //TODO uncomment to enable ignite
    @QuerySqlField(index = true)
private UUID id;

    //TODO uncomment to enable ignite
    @QuerySqlField(index = true)
private String name;

    //TODO uncomment to enable ignite
    @QuerySqlField(index = true)
private String type;

    //TODO uncomment to enable ignite
    @QuerySqlField(index = true)
private String  core_type;
private HashMap<EuonElementImpl.ELE_TYPES,LinkedHashMap<UUID, EuonElementImpl>> relationalElements=new HashMap<EuonElementImpl.ELE_TYPES,LinkedHashMap<UUID, EuonElementImpl>>();
private HashMap<EuonElementImpl.ELE_TYPES,HashMap<Integer, UUID>> relationalSeqs=new HashMap<EuonElementImpl.ELE_TYPES,HashMap<Integer,UUID>>();
private  ProcessContext pc;
private String parentName;
private String parentType;
private String createdBy ;
private String updatedBy;
private Date createdDate;
private Date updatedDate;
private String state;
private String status;
private Integer seqId;
public enum ELE_TYPES {
COMP,VER,REL,SEQ,TRANS,MD
}
public static final HashMap<String,ELE_TYPES> eleTypemap= new HashMap<String, EuonElementImpl.ELE_TYPES>(){{
	put("Component",ELE_TYPES.COMP);
	put("ComponentVersion",ELE_TYPES.VER);
	put("CompositionRelation",ELE_TYPES.REL);
	put("ProcessSequence",ELE_TYPES.SEQ);
	}};
	public Integer getSeqId(){
		return seqId;
	}
	public void setSeqId(Integer i){
		seqId=i;
	}
public UUID getId() {
	return id;
}
public void setId(UUID id) {
	this.id = id;
}
public void setId (String id) {
	this.id =UUID.fromString(id);
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getCore_type() {
	return core_type;
}
public void setCore_type(String core_type) {
	this.core_type = core_type;
}
public void clearRelationalElements(){
	this.relationalElements.clear();
}	public HashMap<UUID, EuonElementImpl> getRelationalElements(EuonElementImpl.ELE_TYPES str) {
	return relationalElements.get(str);
}

public HashMap<ELE_TYPES, LinkedHashMap<UUID, EuonElementImpl>> getRelationalElements() {
	return relationalElements;
}
public  EuonElementImpl getRelationalElement(String str,UUID uuid) {
	return relationalElements.get(str).get(uuid);
}
public	boolean hasOneToOneRelationalElements(){
	return this.relationalElements.size()==1;
}

public	EuonElementImpl getBaseRelationalElement(String str){
if(this.relationalElements!=null&&this.relationalElements.size()>0){
	ELE_TYPES elt = ELE_TYPES.valueOf(str);
	if(this.relationalElements.get(elt)!=null&&this.relationalElements.get(elt).size()>0){
			
return	this.relationalElements.get(elt).values().iterator().next();
}}	return null; 
}

public String getParentName() {
	return parentName;
}
public void setParentName(String parentName) {
	this.parentName = parentName;
}
public ProcessContext getProcessContext() {
	return pc;
}
public void setProcessContext(ProcessContext pc) {
	this.pc = pc;
}
public String getParentType() {
	return parentType;
}
public void setParentType(String parentType) {
	this.parentType = parentType;
}

private String  versionId;

public String getVersionId() {
	return versionId;
}
public void setVersionId(String versionId) {
	this.versionId = versionId;
}
public void setRelationalElements(EuonElementImpl.ELE_TYPES str,LinkedHashMap<UUID, EuonElementImpl> relationalElements) {
	Set<UUID> keys = relationalElements.keySet();
	if(keys.contains(null)){
		System.out.println("____________________________setting relational elements hashmap some of relationnal-element the id is null:"+relationalElements+"___________________________");
	}
	this.relationalElements.put(str,  relationalElements);
}	
public void setRelationalElement(EuonElementImpl.ELE_TYPES str,EuonElementImpl relationalElement) {
	if(relationalElement.getId()==null){
	System.out.println("____________________________setting relational elements for relationnal-element the id is null:"+relationalElement.getId()+"___________________________");
//	throw new AplicationException("0060","setting relational elements for relationnal-element the id is null:"+relationalElement.getId());
	}
	if(		this.relationalElements.get(str)==null){
		this.relationalElements.put(str, new LinkedHashMap<UUID, EuonElementImpl>());
	}
	this.relationalElements.get(str).put(relationalElement.getId(),relationalElement);
}


public void setRelationalElement(EuonElementImpl relationalElement) {
	if(relationalElement.getId()==null){
	System.out.println("____________________________setting relational elements for relationnal-element the id is null:"+relationalElement.getId()+"___________________________");
//	throw new AplicationException("0060","setting relational elements for relationnal-element the id is null:"+relationalElement.getId());
	}
	
	 ELE_TYPES namex = eleTypemap.get(relationalElement.getClass().getSimpleName());
	if(this.relationalElements.get(namex) == null){
		this.relationalElements.put(namex, new LinkedHashMap<UUID, EuonElementImpl>());
	}
	this.relationalElements.get(namex).put(relationalElement.getId(),relationalElement);
}
public String getCreatedBy() {
	return createdBy;
}
public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
}
public String getUpdatedBy() {
	return updatedBy;
}
public void setUpdatedBy(String updatedBy) {
	this.updatedBy = updatedBy;
}
public Date getCreatedDate() {
	return createdDate;
}
public void setCreatedDate(Date createdDate) {
	this.createdDate = createdDate;
}
public Date getUpdatedDate() {
	return updatedDate;
}
public void setUpdatedDate(Date updatedDate) {
	this.updatedDate = updatedDate;
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
}public HashMap<EuonElementImpl.ELE_TYPES,HashMap<Integer, UUID>> getRelationalSeqs() {
	return relationalSeqs;
}
public void setRelationalSeqs() {
	
	 Iterator<ELE_TYPES> hkItr = relationalElements.keySet().iterator();
	while (hkItr.hasNext()) {
		EuonElementImpl.ELE_TYPES eleType = (EuonElementImpl.ELE_TYPES) hkItr.next();
		if(this.relationalSeqs.get(eleType)==null){
			this.relationalSeqs.put(eleType, new HashMap<>());
		}
		LinkedHashMap<UUID, EuonElementImpl> reles = this.relationalElements.get(eleType);
		 
		Iterator<UUID> values = reles.keySet().iterator();
		Integer i=1;
			HashMap<Integer, UUID> seqmap = this.relationalSeqs.get(eleType);
		while (values.hasNext()) {
			UUID uuid = (UUID) values.next();
			reles.get(uuid).seqId=i;
			seqmap.put(i, uuid);
			i++;
		}
	}
	//this.relationalSeqs = relationalSeqs;
} 
}
