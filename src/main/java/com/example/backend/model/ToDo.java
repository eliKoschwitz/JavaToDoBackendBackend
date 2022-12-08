package com.example.backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ToDo {
    String id;
    String description;
    String status;

    public ToDo(String id, String description, String status) {
        this.id = id;
        this.description = description;
        this.status = status;
    }
}
