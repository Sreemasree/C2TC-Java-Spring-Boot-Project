package com.tnsif.StudentService.Controller;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.*;

	import com.tnsif.StudentService.entity.Student;
	import com.tnsif.StudentService.service.StudentService;

	@RestController
	public class StudentController {

	    @Autowired
	    private StudentService studentService;

	    @PostMapping("/student")
	    public Student createStudent(@RequestBody Student student) {
	        return studentService.saveStudent(student);
	    }

	    @GetMapping("/students")
	    public List<Student> getAllStudents() {
	        return studentService.getAllStudents();
	    }

	    @GetMapping("/student/{id}")
	    public Student getStudentById(@PathVariable Long id) {
	        return studentService.getStudentById(id);
	    }

	    @PutMapping("/student/{id}")
	    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
	        return studentService.updateStudentById(id, student);
	    }

	    @DeleteMapping("/student/{id}")
	    public void deleteStudent(@PathVariable Long id) {
	        studentService.deleteStudent(id);
	    }
	}



