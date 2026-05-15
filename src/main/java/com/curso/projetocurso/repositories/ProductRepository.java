package com.curso.projetocurso.repositories;

import com.curso.projetocurso.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
