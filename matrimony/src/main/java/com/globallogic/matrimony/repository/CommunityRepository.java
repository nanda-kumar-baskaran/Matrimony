package com.globallogic.matrimony.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.matrimony.dao.community.Community;

public interface CommunityRepository extends JpaRepository<Community, Long> {

}
