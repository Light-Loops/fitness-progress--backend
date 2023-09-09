package com.api.fitnessprogress.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.api.fitnessprogress.entity.Exercise;

public interface ExerciseRepository extends JpaRepository<Exercise,String>{
    
    @Query("SELECT e FROM Exercise e WHERE e.bodypart = :bodypart")
    List<Exercise> findExercisesByBodyPart(String bodypart);
}
