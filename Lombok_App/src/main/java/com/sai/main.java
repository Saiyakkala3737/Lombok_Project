package com.sai;



import com.sai.dao.Student;

public class main {

	public static void main(String[] args) {

		Student student = new Student();
		student.setUname("Sai");
		student.setEmail("saikumar@gmail.com");
		String email=student.getUname();
		String name=student.getEmail();

		System.out.println(student);
	}
}
