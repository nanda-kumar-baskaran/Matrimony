package com.globallogic.matrimony.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.matrimony.dao.credentials.Credentials;

public interface CredentialsRepository extends JpaRepository<Credentials, Long> {

}
