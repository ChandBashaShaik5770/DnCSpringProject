package dnc.rest.demo.students.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import dnc.rest.demo.students.entity.Student;

@Service
public class StudentService 
{
	List<Student> students;
	
	List<Student> createStudents()
	{
		students = new ArrayList<Student>();
		students.add(new Student(1,"aaa",1,80));
		students.add(new Student(2,"bbb",3,85));
		students.add(new Student(3,"ccc",5,90));
		students.add(new Student(4,"ddd",7,75));
		return students;
	}
	
	
	public List<Student> getStudents()
	{
		if(students == null)
		{
		createStudents();
		}
		return students;
	}


	public Student getStudentById(int id) {
		return students.stream().filter(s->s.getId() == id).findFirst().get();
	}


	public void addStudent(Student student) 
	{
			students.add(student);
		}


	public void updateStudent(Student student, int id) {

			for(int i = 0; i< students.size(); i++) 
			{
				Student s = students.get(i);
				if(s.getId() == id) {
					students.set(id, student);
					return;
				}
			}

	}
	
	
	
	public void removeStudent(int id) {
		students.removeIf(s -> s.getId() == id);
	}
	
	
	
	
	
	}

