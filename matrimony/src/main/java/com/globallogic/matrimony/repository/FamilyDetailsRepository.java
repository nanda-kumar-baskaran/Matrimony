package com.globallogic.matrimony.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.matrimony.dao.familydetails.FamilyDetails;

public interface FamilyDetailsRepository extends JpaRepository<FamilyDetails, Long> {

}
