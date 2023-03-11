package com.multifocal.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multifocal.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}
