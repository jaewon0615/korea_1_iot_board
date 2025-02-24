package com.korit.ptest.dto.request;

import jakarta.persistence.Column;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class searchDrugRequestDto {

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
