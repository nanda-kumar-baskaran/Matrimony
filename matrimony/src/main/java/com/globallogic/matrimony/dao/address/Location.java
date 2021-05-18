package com.globallogic.matrimony.dao.address;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Location")
public class Location {

	@Id
	@Column(name = "USER_ID")
	Long id;

	@Enumerated(EnumType.STRING)
	CITY city;

	@Enumerated(EnumType.STRING)
	STATE state;

	@Enumerated(EnumType.STRING)
	CITIZENSHIP citizenship;

	public Location() {

	}

	public enum CITY {
		CHENNAI, VELLORE, COIMBATORE, HYDERABAD, COCHIN
	}

	public enum STATE {
		TAMIL_NADU, TELENGANA, KERALA
	}

	public enum CITIZENSHIP {
		INDIAN, SRILANKAN, AMERICAN
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CITY getCity() {
		return city;
	}

	public void setCity(CITY city) {
		this.city = city;
	}

	public STATE getState() {
		return state;
	}

	public void setState(STATE state) {
		this.state = state;
	}

	public CITIZENSHIP getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(CITIZENSHIP citizenship) {
		this.citizenship = citizenship;
	}

	public Location(Long id, CITY city, STATE state, CITIZENSHIP citizenship) {
		super();
		this.id = id;
		this.city = city;
		this.state = state;
		this.citizenship = citizenship;
	}

}
