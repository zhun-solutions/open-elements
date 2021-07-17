package com.zhun.euon.ele;

import java.util.UUID;

  

public class DataRange extends EuonElementImpl {

private UUID compositionRelId;
private String rangeLowWaterMark;
private String rangeHighWaterMark;
private String valueXrefSrc;
public UUID getCompositionRelId() {
	return compositionRelId;
}
public void setCompositionRelId(UUID compositionRelId) {
	this.compositionRelId = compositionRelId;
}
public String getRangeLowWaterMark() {
	return rangeLowWaterMark;
}
public void setRangeLowWaterMark(String rangeLowWaterMark) {
	this.rangeLowWaterMark = rangeLowWaterMark;
}
public String getRangeHighWaterMark() {
	return rangeHighWaterMark;
}
public void setRangeHighWaterMark(String rangeHighWaterMark) {
	this.rangeHighWaterMark = rangeHighWaterMark;
}
public String getValueXrefSrc() {
	return valueXrefSrc;
}
public void setValueXrefSrc(String valueXrefSrc) {
	this.valueXrefSrc = valueXrefSrc;
}

/*
 * private UUID compositionRelId;
private String rangeLowWaterMark;
private String rangeHighWaterMark;
private String valueXrefSrc;
 * *******/
 
	public String getElementString() {
		StringBuilder sb= new StringBuilder();
		sb.append("<compositionRelId>");
		sb.append(compositionRelId);
		sb.append("</compositionRelId>");
		sb.append("<rangeLowWaterMark>");
		sb.append(rangeLowWaterMark);
		sb.append("</rangeLowWaterMark>");
		sb.append("<rangeHighWaterMark>");
		sb.append(rangeHighWaterMark);
		sb.append("</rangeHighWaterMark>");

		sb.append("<valueXrefSrc>");
		sb.append(valueXrefSrc);
		sb.append("</valueXrefSrc>");

		return sb.toString();
	}
}
