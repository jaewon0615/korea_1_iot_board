package com.korit.ptest.dto.request;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MedicineRequestDto {

    @Column
    private String ItemName;
    // 약품 이름

    @Column
    private String DrugShape;
    // 약품 모양
    @Column
    private String ColorClass1;
    // 약품 색깔(앞)

    @Column
    private String ColorClass2;
    // 약품 색깔(뒤)

    @Column
    private String LineFront;
    // 약품 분할선 모양(앞)

    @Column
    private String LineBack;
    // 약품 분할선 모양(뒤)

}

