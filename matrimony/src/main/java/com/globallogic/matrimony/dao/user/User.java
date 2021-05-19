package com.globallogic.matrimony.dao.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {

	@Id
	@Column(name="USER_ID")
	Long id;

	String name;
	String mailId;
	String mobileNumber;
	String description;
	String preferenceId;


}
