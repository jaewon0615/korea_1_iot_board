package com.korit.board_back.dto.drug;



import com.korit.board_back.entity.MedicineSchedule;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DrugRequestDto {
    private String userId;
    private String itemSeq;
    private String itemName;
    private String useMethodQesitm;
    private String atpnQesitm;
    private String seQesitm;
    private String depositMethodQesitm;
    private String intrcQesitm;

    public DrugRequestDto(MedicineSchedule medicineSchedule){
        this.itemSeq = medicineSchedule.getItemSeq();
        this.itemName = medicineSchedule.getItemName();
    }
}

