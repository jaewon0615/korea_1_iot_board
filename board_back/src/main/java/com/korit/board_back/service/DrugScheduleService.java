package com.korit.board_back.service;





import com.korit.board_back.dto.ResponseDto;
import com.korit.board_back.dto.drug.DrugRequestDto;
import com.korit.board_back.dto.drug.DrugResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface DrugScheduleService {
    ResponseDto<DrugResponseDto> drugScheduleSave (String userId, DrugRequestDto dto);

    ResponseDto<DrugResponseDto> getDrugAllByUserId(String userId);

//    ResponseDto<DrugResponseDto> getDrugByUserId(String userId,String itemSeq);

//    ResponseDto<DrugResponseDto> deleteByItemSeq(String userId,String itemSeq);
}

