package com.globallogic.matrimony.dao.location;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Location")
@Getter
@Setter
@NoArgsConstructor
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

	public enum CITY {
		CHENNAI, VELLORE, COIMBATORE, HYDERABAD, COCHIN
	}

	public enum STATE {
		TAMIL_NADU, TELENGANA, KERALA
	}

	public enum CITIZENSHIP {
		INDIAN, SRILANKAN, AMERICAN
	}

	public Location(Long id, CITY city, STATE state, CITIZENSHIP citizenship) {
		super();
		this.id = id;
		this.city = city;
		this.state = state;
		this.citizenship = citizenship;
	}

}
