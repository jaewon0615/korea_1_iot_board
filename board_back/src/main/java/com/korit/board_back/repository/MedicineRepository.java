package com.korit.board_back.repository;

// src/main/java/com/example/medicines/repository/MedicineRepository.java


import java.util.Optional;

import com.korit.board_back.entity.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Long> {
    Optional<Medicine> findByItemName(String itemName);
}

