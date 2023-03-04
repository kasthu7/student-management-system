package net.javaguides.sms.servicesImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.repository.StudentRepository;
import net.javaguides.sms.services.StudentService;


@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepositoty;

	public StudentServiceImpl(StudentRepository studentRepositoty) {
		super();
		this.studentRepositoty = studentRepositoty;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepositoty.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		
		return studentRepositoty.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
	
		return studentRepositoty.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		
		return studentRepositoty.findById(id).get();
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepositoty.deleteById(id);
		
	}

}
