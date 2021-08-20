 package com.example.repository;

import com.example.model.Tutorial;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;



public interface TutorialRepository extends JpaRepository<Tutorial, String> {
//  List<Tutorial> findByPublished(boolean published);

  List<Tutorial> findByTitleContaining(String title);
}
