package com.example.jobonics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jobonics.model.RoleRecruiter;

@Repository("roleRecruiterRepository")
public interface RoleRecruiterRepository extends JpaRepository<RoleRecruiter, Integer> {
    RoleRecruiter findByRole(String role);
}
