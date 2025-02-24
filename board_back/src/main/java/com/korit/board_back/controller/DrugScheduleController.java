package com.korit.board_back.controller;


import com.korit.board_back.dto.ResponseDto;
import com.korit.board_back.dto.drug.DrugRequestDto;
import com.korit.board_back.dto.drug.DrugResponseDto;
import com.korit.board_back.service.DrugScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import static com.korit.board_back.common.ApiMappingPattern.MEDICINE;

@RestController
@RequestMapping(MEDICINE)
@RequiredArgsConstructor
public class DrugScheduleController {

    private final DrugScheduleService drugScheduleService;

    // 약품 저장
    private static final String MEDICINE_POST = "/";
    private static final String MEDICINE_LIST_GET = "/";
    private static final String MEDICINE_GET = "/{itemSeq}";
    private static final String MEDICINE_DELETE = "/{itemSeq}";

    /*
     * PostDrugSchedule 메서드
     *
     * @Params
     *   : 로그인 유저 정보, 저장할 약품 정보
     * @Return
     *
     * */
    @PostMapping(MEDICINE_POST)
    public ResponseEntity<ResponseDto<DrugResponseDto>> drugScheduleSave(
            @AuthenticationPrincipal String userId ,
            @RequestBody DrugRequestDto dto
    ){
        ResponseDto<DrugResponseDto> response = drugScheduleService.drugScheduleSave(userId,dto);
        HttpStatus status = response.isResult() ? HttpStatus.OK : HttpStatus.BAD_REQUEST;
        return ResponseEntity.status(status).body(response);
    }

    @GetMapping(MEDICINE_LIST_GET)
    public ResponseEntity<ResponseDto<DrugResponseDto>> getDrugAllByUserId(@AuthenticationPrincipal String userId) {
        ResponseDto<DrugResponseDto> response = drugScheduleService.getDrugAllByUserId(userId);
        HttpStatus status = response.isResult() ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return ResponseEntity.status(status).body(response);
    }

//    @GetMapping(MEDICINE_GET)
//    public ResponseEntity<ResponseDto<DrugResponseDto>> getDrugByUserId (@AuthenticationPrincipal String userId,@PathVariable String itemSeq){
//        ResponseDto<DrugResponseDto> response = drugScheduleService.getDrugByUserId(userId,itemSeq);
//        HttpStatus status = response.isResult() ? HttpStatus.OK : HttpStatus.NOT_FOUND;
//        return ResponseEntity.status(status).body(response);
//    }

//    @DeleteMapping(MEDICINE_DELETE)
//    public ResponseEntity<Void> deleteByItemSeq(@AuthenticationPrincipal String userId,@PathVariable String itemSeq){
//        ResponseDto<DrugResponseDto> response = drugScheduleService.deleteByItemSeq(userId,itemSeq);
//        HttpStatus status = response.isResult() ? HttpStatus.OK : HttpStatus.NOT_FOUND;
//        return ResponseEntity.status(status).body(null);
//    }
}
