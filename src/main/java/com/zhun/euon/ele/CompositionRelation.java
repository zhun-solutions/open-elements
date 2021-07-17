package com.zhun.euon.ele;

import java.util.UUID;

 
public class CompositionRelation extends EuonElementImpl {
private UUID compositerId;
private UUID composeeId;
private UUID componentId;

public UUID getCompositerId() {
	return compositerId;
}

public void setCompositerId(UUID compositerId) {
	this.compositerId = compositerId;
}

public UUID getComposeeId() {
	return composeeId;
}

public void setComposeeId(UUID composeeId) {
	this.composeeId = composeeId;
}
 
	public String getElementString() {
		StringBuilder sb= new StringBuilder();
		sb.append("<compositerId>");
		sb.append(compositerId);
		sb.append("</compositerId>");
		sb.append("<composeeId>");
		sb.append(composeeId);
		sb.append("</composeeId>");
		sb.append("<componentId>");
		sb.append(componentId);
		sb.append("</componentId>");
		
		return sb.toString();
	}

public UUID getComponentId() {
	return componentId;
}

public void setComponentId(UUID componentId) {
	this.componentId = componentId;
}
}
