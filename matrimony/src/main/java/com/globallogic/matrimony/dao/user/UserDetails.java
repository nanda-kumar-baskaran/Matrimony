package com.globallogic.matrimony.dao.user;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class UserDetails {

	@Id
	@Column(name = "USER_ID")
	Long id;

	Date dateOfBirth;

	Integer age;

	Integer heightInCms;
	MARITAL_STATUS maritalStatus;
	Integer weight;
	Integer salary;
	EATING_HABITS eatingHabits;
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
