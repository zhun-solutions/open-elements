package com.zhun.euon.ele;

 
public class EuonField extends EuonElementImpl {
	private String field_td_type; //technical data type
	private Object fieldValue;
	private String field_b_typ; //business type
	private String ref_comp_type;// reference componentname 
	/** name of this field in the reference component**/
	private String ref_comp_fld_name;
	
	
	public String getField_td_type() {
		return field_td_type;
	}
	public void setField_td_type(String field_td_type) {
		this.field_td_type = field_td_type;
	}
	public Object getFieldValue() {
		return fieldValue;
	}
	public void setFieldValue(Object fieldValue) {
		this.fieldValue = fieldValue;
	}
	public String getField_b_typ() {
		return field_b_typ;
	}
	public void setField_b_typ(String field_b_typ) {
		this.field_b_typ = field_b_typ;
	}
	public String getRef_comp_type() {
		return ref_comp_type;
	}
	public void setRef_comp_type(String ref_comp_type) {
		this.ref_comp_type = ref_comp_type;
	}
	public String getRef_comp_fld_name() {
		return ref_comp_fld_name;
	}
	public void setRef_comp_fld_name(String ref_comp_fld_name) {
		this.ref_comp_fld_name = ref_comp_fld_name;
	}
 

	
}
