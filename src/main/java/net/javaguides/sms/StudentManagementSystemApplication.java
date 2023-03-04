package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	 @Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
	/*	
		Student stu1 =new Student("Pawan","Konidela","pawan@gmail.com");
		studentRepository.save(stu1);
		
		Student stu2 =new Student("Arjun","Bharatham","arjun@gmail.com");
		studentRepository.save(stu2);
		
		Student stu3 =new Student("Bhemma","Bharatham","bhemma@gmail.com");
		studentRepository.save(stu3);
		
		Student stu4 =new Student("Dhrama","Bharatham","dhrama@gmail.com");
		studentRepository.save(stu4);
		*/
	}

}
