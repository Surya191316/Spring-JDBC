package com.surya.springjdbc.Service;

import com.surya.springjdbc.Repository.StudRepo;
import com.surya.springjdbc.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudRepo studRepo;

    // Why public because controller should be able to use it
    // To add one record
    public Student saveDetails(Student student){
        return studRepo.save(student);
    }

    // To add list of records
    public List<Student> saveListDetails(List<Student> students){
        return studRepo.saveAll(students);
    }

    // To delete a record with its id
    public String deleteDetails(int id){
        if(studRepo.existsById(id)) {
            studRepo.deleteById(id);
            return "deleted the record with id " + id;
        }else {
            return "Bro that record is not there";
        }

    }

    // To get all details
    public List<Student> getAllDetails(){
        return studRepo.findAll();
    }

    // To get details of a record with its id
    public Student getDetailsById(int id){
        return studRepo.findById(id).orElse(null);
    }

    // To update a record
    public Student updateDetails(Student student){
        Student updateStudent = studRepo.findById(student.getId()).orElse(null);
        if(updateStudent!=null){
            updateStudent.setName(student.getName());
            updateStudent.setAge(student.getAge());
            studRepo.save(updateStudent);
            return student;
        }
        return null;
    }

    //To get max age we have written in StudRepo
    public int getMaxAge(){
        return studRepo.getMaxAge();
    }

    //To get min age we have written in StudRepo
    public int getMinAge(){
        return studRepo.getMinAge();
    }

    //To get all the students
    public List<Student> fetchAllStudents(){
        return studRepo.fetchAllStudents();
    }

    //To get the record with name
    public Student fetchUsingName(){
        return studRepo.fetchUsingName("Siddu");
    }
}
