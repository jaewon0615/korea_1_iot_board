package com.korit.ptest.service;

import com.korit.ptest.common.constant.ResponseMessage;
import com.korit.ptest.dto.response.MedicineResponseDto;
import com.korit.ptest.dto.response.ResponseDto;
import com.korit.ptest.dto.response.searchDrugResponseDto;
import com.korit.ptest.repository.MedicineRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineServiceImpl  {


    private final MedicineRepository medicineRepository;

    public MedicineServiceImpl(MedicineRepository medicineRepository) {
        this.medicineRepository = medicineRepository;
    }

    public ResponseDto<String> getDrugInfoByName(String name) {
        try {
            List<MedicineResponseDto> data = null;
            return ResponseDto.setSuccess(ResponseMessage.SUCCESS, "성공");
        } catch (Exception e) {
            return ResponseDto.setFailed(ResponseMessage.DATABASE_ERROR);
        }
    }


    public ResponseDto<List<MedicineResponseDto>> getDrugInfoBySearchOption(String shape, String color, String line) {
        try {
            List<MedicineResponseDto> data = medicineRepository.findAll().stream()
                    .filter(medicine -> medicine.getColorClass1().equals(color))
                    .filter(medicine -> medicine.getDrugShape().equals(shape))
                    .filter(medicine -> medicine.getLineFront().equals(line))
                    .map(MedicineResponseDto::new)
                    .toList();
            return ResponseDto.setSuccess(ResponseMessage.SUCCESS, data);
        } catch (Exception e) {
            return ResponseDto.setFailed(ResponseMessage.DATABASE_ERROR);
        }
    }



    // 약품 전체 조회
//    public ResponseDto<List<MedicineResponseDto>> getMedicineList() {
//        try {
//            List<MedicineResponseDto> data = medicineRepository.findAll().stream()
//                    .map(MedicineResponseDto::new)
//                    .toList();
//
//            return ResponseDto.setSuccess(ResponseMessage.SUCCESS, data);
//        } catch (Exception e) {
//            logError(e, "Failed to fetch medicine list");
//            return ResponseDto.setFailed(ResponseMessage.DATABASE_ERROR);
//        }
//    }

//    public ResponseDto<List<MedicineResponseDto>> getSearchMedicine(searchDrugRequestDto dto) {
//        List<MedicineResponseDto> data = null;
//
//        try {
//            // findBy 메소드 사용
//            List<Medicine> medicineList = medicineRepository.findByDrugShapeAndColorClass1AndLineFrontAndItemName(
//                    dto.getShape(), dto.getColor(), dto.getLine(), dto.getName());
//
//            // 검색된 데이터를 DTO로 변환
//            data = medicineList.stream()
//                    .map(MedicineResponseDto::new)
//                    .collect(Collectors.toList());
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            return ResponseDto.setFailed(ResponseMessage.DATABASE_ERROR);
//        }
//
//        return ResponseDto.setSuccess(ResponseMessage.SUCCESS, data);
//    }
//}

    // 약품 이름으로 검색
//    public ResponseDto<MedicineResponseDto> searchMedicineByName(String medicineName) {
//
//    }




}