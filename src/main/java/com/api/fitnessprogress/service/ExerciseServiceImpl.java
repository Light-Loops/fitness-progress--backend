package com.api.fitnessprogress.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.fitnessprogress.entity.Exercise;
import com.api.fitnessprogress.repository.ExerciseRepository;

@Service
public class ExerciseServiceImpl implements ExerciseService{

    @Autowired
    ExerciseRepository exerciseRepository;

    @Override
    public List<Exercise> findAllExercises() {
        return exerciseRepository.findAll();
    }

    @Override
    public List<Exercise> findExercisesByBodyPart(String bodypart) {
        return exerciseRepository.findExercisesByBodyPart(bodypart);
    }
    
}
