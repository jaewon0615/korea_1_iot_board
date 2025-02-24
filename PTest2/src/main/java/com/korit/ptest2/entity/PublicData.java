package com.korit.ptest2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "public_data")
public class PublicData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String entpName;

    private String itemName;

    private String efcyQesitm;

    private String useMethodQesitm;

    private String atpnWarnQesitm;

    private String atpnQesitm;

    private String intrcQesitm;

    private String seQesitm;

    private String depositMethodQesitm;

    private String openDe;

    private String  updateDe;

    private String itemImage;

    private String bizrno;


}

