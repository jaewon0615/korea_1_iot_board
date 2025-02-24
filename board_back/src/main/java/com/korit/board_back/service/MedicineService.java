package com.korit.board_back.service;

// src/main/java/com/example/medicines/service/MedicineService.java


import com.korit.board_back.dto.medicine.MedicineResponseDto;

public interface MedicineService {
    MedicineResponseDto searchMedicine(String itemName);
}

