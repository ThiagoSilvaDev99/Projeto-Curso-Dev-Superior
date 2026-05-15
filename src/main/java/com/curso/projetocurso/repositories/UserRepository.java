package com.curso.projetocurso.repositories;

import com.curso.projetocurso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
