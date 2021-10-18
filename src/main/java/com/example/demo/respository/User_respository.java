package com.example.demo.respository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Users;

public interface User_respository extends MongoRepository<Users,String>{

}
