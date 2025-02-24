package com.korit.ptest.service;

import com.korit.ptest.dto.response.MedicineResponseDto;
import com.korit.ptest.dto.response.ResponseDto;

import java.util.List;

public interface MedicineService {

    ResponseDto<List<MedicineResponseDto>> getDrugInfoByName(String name);

    ResponseDto<List<MedicineResponseDto>> getDrugInfoBySearchOption(String shape, String color, String line);


}
