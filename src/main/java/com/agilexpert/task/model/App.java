package com.agilexpert.task.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class App {

    @Id
    private String id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    private User user;

    @PrePersist
    private void ensureId() {
        this.setId(UUID.randomUUID().toString());
    }
}
