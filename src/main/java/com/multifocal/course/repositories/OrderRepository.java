package com.multifocal.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multifocal.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
