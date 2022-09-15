package br.com.yuricorrea.course.services;

import br.com.yuricorrea.course.entities.Product;
import br.com.yuricorrea.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> FindAll(){
        return productRepository.findAll();
    }

    public Product findById (Long id){
        Optional <Product> obj = productRepository.findById(id);
        return obj.get();
    }
}
