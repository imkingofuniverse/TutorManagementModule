package com.tutor.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutor.project.entity.Tutor;

@Repository
public interface ITutorRepository extends JpaRepository<Tutor, String>{

}
