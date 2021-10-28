package com.zhun.euon.ele;

import java.util.HashMap;
import java.util.UUID;

 
public class CompRelIdsUIXRef extends CompositionRelation {
	private UUID relId;
	private UUID 	verId;
	private int progress;
	private HashMap<String,String> fields= new HashMap<String,String>();
	public UUID getRelId() {
		return relId;
	}
	public void setRelId(UUID relId) {
		this.relId = relId;
	}
	public UUID getVerId() {
		return verId;
	}
	public void setVerId(UUID verId) {
		this.verId = verId;
	}
	public int getProgress() {
		return progress;
	}
	public void setProgress(int percentage) {
		this.progress = percentage;
	}
	public HashMap<String, String> getFields() {
		return fields;
	}
	public void setFields(HashMap<String, String> fields) {
		this.fields = fields;
	}	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append("<"+this.getClass().getSimpleName()+">");
		sb.append("<id>");
		sb.append(this.getId());
		sb.append("</id>");
		sb.append("<type>");
		sb.append(this.getType());
		sb.append("</type>");
		sb.append("<verId>");
		sb.append(this.verId);
		sb.append("</verId>");
		sb.append("<relId>");
		sb.append(this.relId);
		sb.append("</relId>");
		sb.append("<composeeId>");
		sb.append(this.getComposeeId());
		sb.append("</composeeId>");
		sb.append("<compositerId>");
		sb.append(this.getCompositerId());
		sb.append("</compositerId>");
		sb.append("</"+this.getClass().getSimpleName()+">");
		return super.toString();
	}
}
