package edu.mum.cs.cs425.studentmgmt;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.model.Transcript;
import edu.mum.cs.cs425.studentmgmt.repository.StudentRepository;
import edu.mum.cs.cs425.studentmgmt.repository.TranscriptRepository;

@SpringBootApplication
public class MyStudentMgmtAppApplication  implements CommandLineRunner{
	@Autowired 
	private StudentRepository studentRepository;
//	{
//		System.out.println("I have been here");
//	}
	@Autowired
	private TranscriptRepository transcriptRepository;
	{
//		System.out.println("I have been here");
	}
	public static void main(String[] args) {
//		System.out.println("I have been here from main");
		SpringApplication.run(MyStudentMgmtAppApplication.class, args);
//		System.out.println("I have been here from main lower");
		
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("I have been here");
		Student student = new Student(101, "Desale", "Fessehaye", "Hdremariam", 4.8, LocalDate.of(2019, 8, 5));
		Transcript transcript = new Transcript("SWE course", student);

		
		studentRepository.save(student);
	}
	
	
}
