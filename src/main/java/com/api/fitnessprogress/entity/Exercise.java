package com.api.fitnessprogress.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "exercise")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Exercise {
    @Id
    private String id_exercise;
    private String name;
    private String bodypart;
    private String target;
    private String equipment;
    private String gifurl;
}
