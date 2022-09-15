package br.com.yuricorrea.course.resources;

import br.com.yuricorrea.course.entities.Category;
import br.com.yuricorrea.course.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping (value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryService categoryService;


    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
     List<Category> list = categoryService.FindAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity <Category> findById(@PathVariable Long id){
        Category obj = (Category) categoryService.findById(id);
        return  ResponseEntity.ok().body(obj);
    }

}
