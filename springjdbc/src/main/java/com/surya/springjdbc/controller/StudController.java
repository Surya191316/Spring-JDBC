package com.surya.springjdbc.controller;

import com.surya.springjdbc.Service.StudentService;
import com.surya.springjdbc.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudController{
    @Autowired
    private StudentService studentService;

    // @RequestBody - maps the body of an HTTP request (JSON or XML) directly into a Java object
    // @PostMapping - to post data through link /addStudent
    @PostMapping("/addStudent")
    public Student postDetails(@RequestBody Student student){
        return studentService.saveDetails(student);
    }

    @PostMapping("/addListStudent")
    public List<Student> postListDetails(@RequestBody List<Student> students){
        return studentService.saveListDetails(students);
    }

    // @DeleteMapping - to delete a record we usd with ID
    @DeleteMapping("/removeStudent/{id}")
    public String DeleteStudent(@PathVariable int id){
        return studentService.deleteDetails(id);
    }

    // @GetMapping - to retrieve data from DB with that link
    // This is with in-build method in service
    @GetMapping("/getAllStudents")
    public List<Student> getDetails(){
        return studentService.getAllDetails();
    }

    // @PathVariable - to accept an additional parameter along with URL in this case its id
    // If not given inside {}, it will consider id as a part of URL and doesn't take as a parameter
    @GetMapping("/getStudentById/{id}")
    public Student fetchById(@PathVariable int id){
        return studentService.getDetailsById(id);
    }

    // @PutMapping - to update a row
    @PutMapping("/updateStudent")
    public Student updateDetails(@RequestBody Student student) {
        return studentService.updateDetails(student);
    }

    //To get max age record
    @GetMapping("/getMaxAge")
    public int getMaxAge(){
        return studentService.getMaxAge();
    }

    //To get min age record
    @GetMapping("/getMinAge")
    public int getMinAge(){
        return studentService.getMinAge();
    }

    //To get all records
    //This is with custom query but same result as inbuilt method
    @GetMapping("/getAll")
    public List<Student> fetchAllStudents(){
        return studentService.fetchAllStudents();
    }

    //To get a record with its name
    @GetMapping("/fetchUsingName")
    public Student fetchUsingName(){
        return studentService.fetchUsingName();
    }
}
