package com.surya.springjdbc.Repository;

import com.surya.springjdbc.entity.Student;
import org.springframework.aop.target.LazyInitTargetSource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudRepo extends JpaRepository<Student, Integer> {
    //age is the variable that u assign in entity
    @Query(value = "SELECT MAX(age) FROM Student")
    public int getMaxAge();

    @Query(value = "SELECT MIN(age) FROM Student")
    public int getMinAge();

    // Table name is not the table, not the table we assign in entity, but the class we assign that table to
    // Here in our case the table and the class it was assigned to are both are 'Student'
    // Can't use a * there, we have to use alise
    @Query(value = "SELECT s FROM Student s")
    public List<Student> fetchAllStudents();

    // Filtered record with name
    // @Param - is to accept
    @Query(value = "SELECT s FROM Student s WHERE name=:val")
    public Student fetchUsingName(@Param("val") String n1);
}
