package com.springrest.springrest.couseSQLConnetor;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entities.Course;

public interface courseSqlc extends JpaRepository<Course , Long> {

}
