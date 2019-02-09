package com.example.jobonics.model;



import javax.persistence.*;


@Entity
@Table(name = "role")
public class Role2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private int id;
    @Column(name = "role")
    private String role;
}
