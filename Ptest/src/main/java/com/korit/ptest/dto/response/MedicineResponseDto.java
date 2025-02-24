package com.korit.ptest.dto.response;

import com.korit.ptest.entity.Medicine;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MedicineResponseDto {

    private Long id;
    // 약품 고유 식별자

    private String itemSeq;
    // 약품 아이디

    @Column(name = "item_name")
    private String ItemName;
    // 약품 이름

    private String McName;
    // 제조사 이름

    private String Efcyqesitm;
    // 약품 사용(복용)방법

    private String Usemethodqesitm;
    // 약품 부작용

    private String Atpnqesitm;
    // 약품 복용시 주의사항

    private String Seqesitm;
    // 약품 보관 방법

    private String Depositmethodqesitm;
    // 약품 효능

    private String Intrcqesitm;
    // 약품 표시(앞)

    private String ItemImage;
    // 약품 표시(뒤)

    @Column
    private String DrugShape;
    // 약품 모양

    @Column(name = "color_class1")
    private String ColorClass1;
    // 약품 색깔(앞)

    private String ColorClass2;
    // 약품 색깔(뒤)

    @Column(name = "line_front")
    private String LineFront;
    // 약품 분할선 모양(앞)

    private String LineBack;

    public MedicineResponseDto(Medicine medicine) {
        this.id = medicine.getId();
        this.itemSeq = medicine.getItemSeq();
        this.ItemName = medicine.getItemName();
        this.McName = medicine.getMcName();
        this.Efcyqesitm = medicine.getEfcyqesitm();
        this.Usemethodqesitm = medicine.getUsemethodqesitm();
        this.Atpnqesitm = medicine.getAtpnqesitm();
        this.Seqesitm = medicine.getSeqesitm();
        this.Depositmethodqesitm = medicine.getDepositmethodqesitm();
        this.Intrcqesitm = medicine.getIntrcqesitm();
        this.ItemImage = medicine.getItemImage();
        this.DrugShape = medicine.getDrugShape();
        this.ColorClass1 = medicine.getColorClass1();
        this.ColorClass2 = medicine.getColorClass2();
        this.LineFront = medicine.getLineFront();
        this.LineBack = medicine.getLineBack();


    }


    // 약품 분할선 모양(뒤)


}
