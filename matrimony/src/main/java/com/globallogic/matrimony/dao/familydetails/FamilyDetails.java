package com.globallogic.matrimony.dao.familydetails;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "FamilyDetails")
@Getter
@Setter
@NoArgsConstructor
public class FamilyDetails {

	@Id
	@Column(name = "USER_ID")
	Long id;

	String fatherName;
	String FatherOccupation;
	String motherName;
	String motherOccupation;
	int brothers;
	int marriedBrothers;
	int sisters;
	int marriedSisters;

}
