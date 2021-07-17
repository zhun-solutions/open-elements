package com.zhun.euon.ele;

import java.util.UUID;

 
public class ComponentVersion extends EuonElementImpl {
private UUID componentId;
private Integer versionNo;
private String versionState;
public UUID getComponentId() {
	return componentId;
}

public void setComponentId(UUID componentId) {
	this.componentId = componentId;
}

public Integer getVersionNo() {
	return versionNo;
}

public void setVersionNo(Integer versionNo) {
	this.versionNo = versionNo;
}

public String getVersionState() {
	return versionState;
}

public void setVersionState(String versionState) {
	this.versionState = versionState;
} 


	public String getElementString() {
		StringBuilder sb= new StringBuilder();
		sb.append("<componentId>");
		sb.append(componentId);
		sb.append("</componentId>");
		sb.append("<versionNo>");
		sb.append(versionNo);
		sb.append("</versionNo>");
		sb.append("<versionState>");
		sb.append(versionState);
		sb.append("</versionState>");
		return sb.toString();
	}
}
