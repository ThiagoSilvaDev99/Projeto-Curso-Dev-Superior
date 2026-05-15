package com.curso.projetocurso.repositories;

import com.curso.projetocurso.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
