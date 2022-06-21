package com.zhun.euon.ele;

import com.zhun.euon.api.exec.process.cntxt.ProcessContext;

public class EuonContext extends EuonUnit{
	
 private ProcessContext context;

public ProcessContext getContext() {
	return context;
}

public void setContext(ProcessContext context) {
	this.context = context;
}

}
