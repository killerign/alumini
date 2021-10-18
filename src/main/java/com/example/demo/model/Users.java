package com.example.demo.model;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("users")
public class Users {
    @Id
    private ObjectId id;
    private String LinkedinID; 
    private String Rollno;
    private String Password;

    /**
     * @return String return the id
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * @return String return the LinkedinID
     */
    public String getLinkedinID() {
        return LinkedinID;
    }

    /**
     * @param LinkedinID the LinkedinID to set
     */
    public void setLinkedinID(String LinkedinID) {
        this.LinkedinID = LinkedinID;
    }

    /**
     * @return String return the Rollno
     */
    public String getRollno() {
        return Rollno;
    }

    /**
     * @param Rollno the Rollno to set
     */
    public void setRollno(String Rollno) {
        this.Rollno = Rollno;
    }

    /**
     * @return String return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

}
