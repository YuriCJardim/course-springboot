package br.com.yuricorrea.course.services;

import br.com.yuricorrea.course.entities.User;
import br.com.yuricorrea.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> FindAll(){
        return userRepository.findAll();
    }

    public User findById (Long id){
        Optional <User> obj = userRepository.findById(id);
        return obj.get();
    }
}
