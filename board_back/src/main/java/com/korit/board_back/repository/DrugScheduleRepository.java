package com.korit.board_back.repository;




import com.korit.board_back.entity.MedicineSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DrugScheduleRepository extends JpaRepository<MedicineSchedule,Long>{
    Optional<MedicineSchedule> getDrugAllByUserId(String userId);

//    Optional<MedicineSchedule> getDrugByUserId(String userID,String itemSeq);

//    Optional<MedicineSchedule> deleteByItemSeq(String userId, String itemSeq);
}

