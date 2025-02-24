package com.korit.board_back.controller;

// src/main/java/com/example/medicines/controller/MedicineController.java


import com.korit.board_back.dto.medicine.MedicineResponseDto;
import com.korit.board_back.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/medicines")
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    @GetMapping("/search")
    public ResponseEntity<MedicineResponseDto> searchMedicine(@RequestParam String name) {
        MedicineResponseDto medicine = medicineService.searchMedicine(name);
        if (medicine != null) {
            return ResponseEntity.ok(medicine);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
