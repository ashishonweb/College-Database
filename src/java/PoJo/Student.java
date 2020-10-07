package PoJo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;


@Entity
public class Student{
    
    @Column(name="ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="Name")    
    @Size(min=1,message="Column Cannot Be Left Blank")
    private String name;
    @Column(name="Gender")
    @Size(min=1,message="Column Cannot Be Left Blank")
    private String gender;
    @Column(name="E_Mail")
   @Size(min=1,message="Column Cannot Be Left Blank")
    private String email;
    @Column(name="Phone_No")
   @Size(min=10,message="Enter the valid Phone Number")
    private String phone;
    @Column(name="Stream")
   @Size(min=1,message="Column Cannot Be Left Blank")
    private String stream;

    public Student() {
    }

    public Student(int id, String name, String gender, String email, String phone, String stream) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.stream = stream;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getStream() {
        return stream;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

   
    

    
     
}
    

