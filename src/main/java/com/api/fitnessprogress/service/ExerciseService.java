package com.api.fitnessprogress.service;

import java.util.List;
import com.api.fitnessprogress.entity.Exercise;

public interface ExerciseService {
    List<Exercise> findAllExercises();
    List<Exercise> findExercisesByBodyPart(String bodypart);
}
