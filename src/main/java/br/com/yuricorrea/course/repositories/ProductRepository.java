package br.com.yuricorrea.course.repositories;

import br.com.yuricorrea.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository <Product, Long> {

}


