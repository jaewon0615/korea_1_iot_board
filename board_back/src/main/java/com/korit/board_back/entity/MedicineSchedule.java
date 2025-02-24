package com.korit.board_back.entity;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.w3c.dom.Text;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name = "medicine_schedule")
@Builder
public class MedicineSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 사용자 id
    private String userId;


    @Column
    private String itemSeq;
    // 약품 아이디

    @Column
    private String itemName;
    /// 약품 이름

    @Column
    private String useMethodQesitm;
    /// 약품 사용방법

    @Column
    private String atpnQesitm;
    /// 약품 복용 시 주의사항

    @Column
    private String seQesitm;
    /// 약품 부작용

    @Column
    private String depositMethodQesitm;
    // 약품 보관 방법

    @Column
    private String intrcQesitm;


    // 약품  상호작용


}
