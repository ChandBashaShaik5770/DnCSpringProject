package dnc.rest.demo.students.controllers;
import dnc.rest.demo.students.entity.Student;
import dnc.rest.demo.students.services.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class StudentController 
{
	@Autowired
	StudentService studentService;
	
	/**
	 * Getting All Students List
	 * @return
	 */
	@RequestMapping("students")
	List<Student> getStudents()
	{
		return studentService.getStudents();
	}
	/**
	 * Searching Student By ID
	 * @param id
	 * @return
	 */
	@RequestMapping("students/{id}")	
	Student getStudentById(@PathVariable("id") int id)
		{
			return studentService.getStudentById(id);
		}
	
	/**
	 * Adding Student
	 * @param student
	 */
	@RequestMapping(method = RequestMethod.POST, value ="students") //create a resource
	public void addStudent(@RequestBody Student student)
	{
		
		studentService.addStudent(student);
	}
	
	/**
	 * Updating Student By ID
	 * @param student
	 * @param id
	 */
	@RequestMapping(method = RequestMethod.PUT, value = "students/{id}")
	public void updateStudent(@RequestBody Student student, @PathVariable int id) {
		studentService.updateStudent(student,id);
	}
	
	
	@RequestMapping(method =  RequestMethod.DELETE, value = "students/{id}")
	public void  deleteStudent(@PathVariable("id") int id) {
		studentService.removeStudent(id);
	}
	
	
	@GetMapping("/")
	public String home() {
		return ("<h1>welcome home</h1>");
	}

	@GetMapping("/admin")
	public String admin() {
		return ("<h1>welcome admin</h1>");
	}

	@GetMapping("/user")
	public String user() {
		return ("<h1>welcome user</h1>");
	}
	
	
	
}
