package com.korit.board_back.service.implement;

// src/main/java/com/example/medicines/serviceimpl/MedicineServiceImpl.java


import com.korit.board_back.dto.medicine.MedicineResponseDto;
import com.korit.board_back.entity.Medicine;
import com.korit.board_back.repository.MedicineRepository;
import com.korit.board_back.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MedicineServiceImpl implements MedicineService {

    @Autowired
    private MedicineRepository medicineRepository;

    @Autowired
    private RestTemplate restTemplate;

    private final String API_URL = "https://api.example.com/medicines?name="; // 실제 API URL로 교체 필요

    @Override
    public MedicineResponseDto searchMedicine(String itemName) {
        // 데이터베이스에서 약품 검색
        return medicineRepository.findByItemName(itemName)
                .map(this::convertToDto)
                .orElseGet(() -> {
                    // API 호출하여 데이터 가져오기
                    MedicineResponseDto apiResponse = callMedicineApi(itemName);
                    if (apiResponse != null) {
                        // 데이터베이스에 저장
                        Medicine medicine = convertToEntity(apiResponse);
                        medicineRepository.save(medicine);
                    }
                    return apiResponse;
                });
    }

    private MedicineResponseDto callMedicineApi(String itemName) {
        try {
            String url = API_URL + itemName;
            MedicineResponseDto response = restTemplate.getForObject(url, MedicineResponseDto.class);
            return response;
        } catch (Exception e) {
            log.error("API 호출 중 오류 발생: {}", e.getMessage());
            return null;
        }
    }

    private MedicineResponseDto convertToDto(Medicine medicine) {
        MedicineResponseDto dto = new MedicineResponseDto();
        dto.setEntpName(medicine.getEntpName());
        dto.setItemName(medicine.getItemName());
        dto.setItemSeq(medicine.getItemSeq());
        dto.setEfcyQesitm(medicine.getEfcyQesitm());
        dto.setUseMethodQesitm(medicine.getUseMethodQesitm());
        dto.setAtpnQesitm(medicine.getAtpnQesitm());
        dto.setDepositMethodQesitm(medicine.getDepositMethodQesitm());
        return dto;
    }

    private Medicine convertToEntity(MedicineResponseDto dto) {
        Medicine medicine = new Medicine();
        medicine.setEntpName(dto.getEntpName());
        medicine.setItemName(dto.getItemName());
        medicine.setItemSeq(dto.getItemSeq());
        medicine.setEfcyQesitm(dto.getEfcyQesitm());
        medicine.setUseMethodQesitm(dto.getUseMethodQesitm());
        medicine.setAtpnQesitm(dto.getAtpnQesitm());
        medicine.setDepositMethodQesitm(dto.getDepositMethodQesitm());
        return medicine;
    }
}

