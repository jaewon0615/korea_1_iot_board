package com.korit.board_back.service.implement;




import com.korit.board_back.common.ResponseMessage;
import com.korit.board_back.dto.ResponseDto;
import com.korit.board_back.dto.drug.DrugRequestDto;
import com.korit.board_back.dto.drug.DrugResponseDto;
import com.korit.board_back.entity.MedicineSchedule;
import com.korit.board_back.repository.DrugScheduleRepository;
import com.korit.board_back.service.DrugScheduleService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DrugServiceImpl implements DrugScheduleService {
    private final DrugScheduleRepository drugScheduleRepository;

    public DrugServiceImpl(DrugScheduleRepository drugScheduleRepository) {
        this.drugScheduleRepository = drugScheduleRepository;
    }

    // 약품 정보 저장
    @Override
    public ResponseDto<DrugResponseDto> drugScheduleSave(String userId, DrugRequestDto dto) {
        DrugResponseDto data = null;
        String itemName = dto.getItemName();
        String itemSeq = dto.getItemSeq();
        String useMethodQesitm = dto.getUseMethodQesitm();
        String atpnQesitm = dto.getAtpnQesitm();
        String seQesitm = dto.getSeQesitm();
        String depositMethodQesitm = dto.getDepositMethodQesitm();
        String intrcQesitm = dto.getIntrcQesitm();

        try {
            MedicineSchedule medicineSchedule = MedicineSchedule.builder()
                    .itemName(itemName)
                    .itemSeq(itemSeq)
                    .useMethodQesitm(useMethodQesitm)
                    .atpnQesitm(atpnQesitm)
                    .seQesitm(seQesitm)
                    .depositMethodQesitm(depositMethodQesitm)
                    .intrcQesitm(intrcQesitm)
                    .userId(userId)
                    .build();
            drugScheduleRepository.save(medicineSchedule);

            data = new DrugResponseDto(medicineSchedule);

        } catch (Exception e){
            e.printStackTrace();
            return ResponseDto.setFailed(ResponseMessage.DATABASE_ERROR);
        }
        return ResponseDto.setSuccess(ResponseMessage.SUCCESS,data);
    }

    // 약품 정보 전체 조회
    @Override
    public ResponseDto<DrugResponseDto> getDrugAllByUserId(String userId) {
        DrugResponseDto data = null;


        try {
            Optional<MedicineSchedule> optionalMedicineSchedule = drugScheduleRepository.getDrugAllByUserId(userId);
            if (optionalMedicineSchedule.isEmpty()) {
                return ResponseDto.setFailed(ResponseMessage.DATABASE_ERROR);
            }
            MedicineSchedule medicineSchedule = optionalMedicineSchedule.get();
            data = new DrugResponseDto(medicineSchedule);
        } catch (Exception e){
            e.printStackTrace();
            return ResponseDto.setFailed(ResponseMessage.DATABASE_ERROR);
        }
        return ResponseDto.setSuccess(ResponseMessage.SUCCESS,data);
    }

    // 약품 정보 단건 조회
//    @Override
//    public ResponseDto<DrugResponseDto> getDrugByUserId(String userId, String itemSeq) {
//        DrugResponseDto data = null;
//
//        try {
//            Optional<MedicineSchedule> optionalMedicineSchedule = drugScheduleRepository.getDrugByUserId(userId,itemSeq);
//            if (optionalMedicineSchedule.isEmpty()) {
//                return ResponseDto.setFailed(ResponseMessage.DATABASE_ERROR);
//            }
//            MedicineSchedule medicineSchedule = optionalMedicineSchedule.get();
//            data=new DrugResponseDto(medicineSchedule);
//        } catch (Exception e){
//            e.printStackTrace();
//            return ResponseDto.setFailed(ResponseMessage.DATABASE_ERROR);
//        }
//        return ResponseDto.setSuccess(ResponseMessage.SUCCESS,data);
//    }


    // 약품 정보 삭제
//    @Override
//    public ResponseDto<DrugResponseDto> deleteByItemSeq(String userId, String itemSeq) {
//
//        try {
//            Optional<MedicineSchedule> optionalMedicineSchedule = drugScheduleRepository.deleteByItemSeq(userId,itemSeq);
//            if (optionalMedicineSchedule.isEmpty()) {
//                return ResponseDto.setFailed(ResponseMessage.DATABASE_ERROR);
//            }
//            MedicineSchedule medicineSchedule = optionalMedicineSchedule.get();
//            drugScheduleRepository.delete(medicineSchedule);
//        } catch (Exception e){
//            e.printStackTrace();
//            return ResponseDto.setFailed(ResponseMessage.DATABASE_ERROR);
//        }
//        return ResponseDto.setSuccess(ResponseMessage.SUCCESS,null);
//    }
}

