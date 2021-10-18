package com.example.demo.model;
import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("job")
public class Jobs {
    @Id 
    public ObjectId id;
    public String role; 
    public String name; 
    public int experience;
    public long salaryl;
    public long salrayh;
    public String location; 
    public String jobdescription;
    public String responsibilities;
    public Date dateo; 
    public Date datec; 
    
}
