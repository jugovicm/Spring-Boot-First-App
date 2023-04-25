package com.jugovicm.springboot.firstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    //http:/localhost:8080/student
    // use HTTP Msg Converters to convert JAVA obj in JSON
    @GetMapping(path ="/student")
    public Student getStudent(){
        //convert JAVA obj in JSON
        return new Student ("Milica", "Jugovic");
    }

    @GetMapping(path ="/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<> ();
        students.add ( new Student ("Milica", "Jugovic") );
        students.add ( new Student ("Bogdan", "Jugovic") );
        students.add ( new Student ("Mihailo", "Jugovic") );
        return students;
    }
}
