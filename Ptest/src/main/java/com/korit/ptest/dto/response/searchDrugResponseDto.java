package com.korit.ptest.dto.response;

import jakarta.persistence.Column;
import org.hibernate.annotations.ColumnDefault;

public class searchDrugResponseDto {
    @Column(name = "drugShape")
    @ColumnDefault("전체")
    private String shape;

    @Column(name = "colorClass1")
    @ColumnDefault("전체")
    private String color;

    @Column(name = "lineFront")
    @ColumnDefault("전체")
    private String line;

    @Column(name = "itemName")
    @ColumnDefault("전체")
    private String name;
}
