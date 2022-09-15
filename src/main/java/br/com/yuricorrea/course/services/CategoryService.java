package br.com.yuricorrea.course.services;

import br.com.yuricorrea.course.entities.Category;
import br.com.yuricorrea.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping
    public List<Category> FindAll(){
        return categoryRepository.findAll();
    }

    public Category findById (Long id){
        Optional <Category> obj = categoryRepository.findById(id);
        return obj.get();
    }
}
