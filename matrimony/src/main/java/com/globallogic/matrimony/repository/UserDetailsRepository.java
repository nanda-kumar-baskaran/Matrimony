package com.globallogic.matrimony.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.matrimony.dao.user.UserDetails;

public interface UserDetailsRepository extends JpaRepository<UserDetails, Long>{

}
