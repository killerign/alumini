package com.example.demo.respository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Jobs;

public interface Job_respository extends MongoRepository<Jobs,String>{
    
}
