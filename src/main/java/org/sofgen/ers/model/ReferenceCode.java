package org.sofgen.ers.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="REFERENCE_CODE")
public class ReferenceCode extends BaseEntity implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2633195810135821991L;

	
	@Column(name="KEY_VAL")
	private String key;
	
	@Column(name="VALUE", unique=true)
	private String value;
	
	@Column(name="DESCRIPTION")
	private String description;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
