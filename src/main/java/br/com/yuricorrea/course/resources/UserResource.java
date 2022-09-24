package br.com.yuricorrea.course.resources;

import br.com.yuricorrea.course.entities.User;
import br.com.yuricorrea.course.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    Logger logger = LoggerFactory.getLogger(UserResource.class);

    @Autowired
    private UserService userService;


    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        logger.info("Obtendo todos os usuarios");
        List<User> list = userService.FindAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        logger.info("Obtendo usuario ",id);

        User obj = (User) userService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<User> insert(@RequestBody User user) {
        User nUser = userService.insert(user);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(uri).body(nUser);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete (@PathVariable long id){
        userService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<User> update (@PathVariable long id, @RequestBody User obj){
       User newObj = userService.update(id, obj);
       return ResponseEntity.ok(newObj);

    }

}
