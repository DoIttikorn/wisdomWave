package com.school.teacher.person.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "teacher")
public record Teacher(
        @Id int id,
        @Column("firstName") String firstName,
        @Column("lastName") String lastName,
        @Column("email") String email,
        @Column("phone") String phone) {
}
