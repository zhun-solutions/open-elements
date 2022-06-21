package com.zhun.euon.ele;

import java.util.UUID;

 
public class ProcessSequence extends EuonElementImpl {
private UUID soruceId;
private UUID targetId;
public UUID getSoruceId() {
	return soruceId;
}
private String strat_id;

public void setSoruceId(UUID soruceId) {
	this.soruceId = soruceId;
}

public UUID getTargetId() {
	return targetId;
}

public void setTargetId(UUID targetId) {
	this.targetId = targetId;
}

public String getStrat_id() {
	return strat_id;
}

public void setStrat_id(String strat_id) {
	this.strat_id = strat_id;
}


 
		public String getElementString() {
		StringBuilder sb= new StringBuilder();
		sb.append("<soruceId>");
		sb.append(soruceId);
		sb.append("</soruceId>");
		sb.append("<targetId>");
		sb.append(targetId);
		sb.append("</targetId>");
		sb.append("<strat_id>");
		sb.append(strat_id);
		sb.append("</strat_id>");
		return sb.toString();
	}
}
