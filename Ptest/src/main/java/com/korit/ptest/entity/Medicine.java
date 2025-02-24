package com.korit.ptest.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name = "medicines")
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String itemSeq;
    // 약품 아이디

    @Column
    private String ItemName;
    /// 약품 이름

    @Column
    private String McName;
    /// 약품 제조사 이름

    @Column
    private String Efcyqesitm;
    /// 약품 복용방법

    @Column
    private String Usemethodqesitm;
    /// 약품 부작용

    @Column
    private String Atpnqesitm;
    /// 약품 복용 시 주의사항

    @Column
    private String Seqesitm;
    /// 약품 보관 방법

    @Column
    private String Depositmethodqesitm;
    /// 약품 효능

    @Column
    private String Intrcqesitm;
    /// 약품 표시(앞)

    @Column
    private String ItemImage;
    /// 약품 표시(뒤)

    @Column
    private String DrugShape;
    /// 약품 모양

    @Column
    private String ColorClass1;
    /// 약품 색깔(앞)

    @Column
    private String ColorClass2;
    /// 약품 색깔(뒤)

    @Column
    private String LineFront;
    /// 약품 분할선 모양(앞)

    @Column
    private String LineBack;
    /// 약품 분할선 모양(뒤)
}