package br.com.yuricorrea.course.resources;

import br.com.yuricorrea.course.entities.Product;
import br.com.yuricorrea.course.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping (value = "/products")
public class ProductResource {

    @Autowired
    private ProductService productsService;


    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        List<Product> set = productsService.FindAll();
        return ResponseEntity.ok().body(set);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity <Product> findById(@PathVariable Long id){
        Product prod = (Product) productsService.findById(id);
        return  ResponseEntity.ok().body(prod);
    }

}
