package br.com.yuricorrea.course.repositories;

import br.com.yuricorrea.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository <Category, Long> {

}


