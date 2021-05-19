package com.globallogic.matrimony.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.matrimony.dao.location.Location;

public interface LocationRepository extends JpaRepository<Location, Long>{

}
