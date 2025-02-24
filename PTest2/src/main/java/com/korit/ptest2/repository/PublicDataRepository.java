package com.korit.ptest2.repository;


import com.korit.ptest2.entity.PublicData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicDataRepository extends JpaRepository<PublicData, Long> {
}
