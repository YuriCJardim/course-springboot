package br.com.yuricorrea.course.repositories;

import br.com.yuricorrea.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository <User, Long> {

}


