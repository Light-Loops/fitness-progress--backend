package com.api.fitnessprogress.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.api.fitnessprogress.entity.Exercise;
import com.api.fitnessprogress.service.ExerciseService;

@RestController
public class ExerciseController {
    
    @Autowired
    ExerciseService exerciseService;

    @GetMapping("/findAllExercises")
    public List<Exercise> findAllExercises(){
        return exerciseService.findAllExercises();
    }

    @GetMapping("findExercisesByBodyPart/{bodypart}")
    List<Exercise> findExercisesByBodyPart(@PathVariable String bodypart){
        return exerciseService.findExercisesByBodyPart(bodypart);
    }

}
