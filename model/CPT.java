package com.optum.cs.training.patterns.model;

public class CPT implements Code {
	private String code;
	private String description;
//	private String type;
	//... more attributes
	
	
	public CPT() {
		// TODO Auto-generated constructor stub
	}
	public CPT(String code, String description /* more attributes */) {
		this.code = code;
		this.description = description;
	}
	/* (non-Javadoc)
	 * @see com.optum.cs.training.patterns.model.Code#getCode()
	 */
	@Override
	public String getCode() {
		return code;
	}
	/* (non-Javadoc)
	 * @see com.optum.cs.training.patterns.model.Code#setCode(java.lang.String)
	 */
	@Override
	public void setCode(String code) {
		this.code = code;
	}
	/* (non-Javadoc)
	 * @see com.optum.cs.training.patterns.model.Code#getType()
	 */
	@Override
	public String getType() {
		return "CPT";
	}
	
	@Override
	public String getDescription() {
		return description;
	}
	
	@Override 
	public void setDescription(String description) {
		this.description = description;
	}
}
