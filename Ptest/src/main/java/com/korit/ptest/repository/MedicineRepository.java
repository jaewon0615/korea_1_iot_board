package com.korit.ptest.repository;

import com.korit.ptest.dto.request.searchDrugRequestDto;
import com.korit.ptest.entity.Medicine;
import jakarta.persistence.Column;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Long> {
    List<Medicine> getDrugInfoBySearchOption(
            String drugShape, String color, String line, String name);

    List<Medicine> getDrugInfoByName(
            String name );

}


