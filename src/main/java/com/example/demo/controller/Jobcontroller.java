package com.example.demo.controller;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Jobs;
import com.example.demo.respository.Job_respository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/job")
public class Jobcontroller {
    @Autowired
    Job_respository job;

    @GetMapping("/all")
    public ResponseEntity<List<Jobs>> getAll(@RequestParam(required = false) String title) {
        try {
          List<Jobs> jobs = new ArrayList<Jobs>();
            job.findAll().forEach(jobs::add);
          if (jobs.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
          }
      
          return new ResponseEntity<>(jobs, HttpStatus.OK);
        } catch (Exception e) {
          System.out.println(e.toString());
          return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
      }
}
