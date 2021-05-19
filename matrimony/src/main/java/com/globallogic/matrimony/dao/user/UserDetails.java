package com.globallogic.matrimony.dao.user;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class UserDetails {

	@Id
	@Column(name = "USER_ID")
	Long id;

	Date dateOfBirth;

	Integer age;

	Integer heightInCms;
	@Enumerated(EnumType.STRING)
	MARITAL_STATUS maritalStatus;
	Integer weight;
	Integer salary;
	@Enumerated(EnumType.STRING)
	EATING_HABITS eatingHabits;
	@Enumerated(EnumType.STRING)
	MOTHER_TONGUE motherTongue;

	public enum MARITAL_STATUS {
		SINGLE, DIVORCED, WIDOWED, SEPERATED
	}

	public enum EATING_HABITS {
		VEGETARIAN, NON_VEGETARIAN, EGGETARIAN
	}

	public enum MOTHER_TONGUE {
		TAMIL, TELUGU, HINDI, URDU, ENGLISH
	}

}
