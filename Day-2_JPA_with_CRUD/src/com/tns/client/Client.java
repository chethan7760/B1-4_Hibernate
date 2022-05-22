package com.tns.client;

import com.tns.entities.Student;
import com.tns.service.StudentService;
import com.tns.service.StudentServiceImp;

public class Client {

	public static void main(String[] args) {
		StudentService service=new StudentServiceImp();
		Student student=new Student();
		//CRUD Operation
		//create 
		student.setID(24);
		student.setName("Raina");
		service.addStudent(student);
		
		/*//retrive data-find();
		student=service.findStudentById(20);
		System.out.println("ID: "+student.getID());
		System.out.println("ID: "+student.getName());
		*/
		
		/*//update
		student=service.findStudentById(21);
		student.setName("Kohli");
		service.updateStudent(student);
		*/
		
		//delete
		student=service.findStudentById(21);
		student.setName("Kohli");
		service.removeStudent(student);
		
	}

}
