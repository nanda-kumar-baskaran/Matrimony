package com.globallogic.matrimony.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.matrimony.dao.user.User;

public interface UserDetailsRepository extends JpaRepository<User, Long>{

}
