package edu.mum.cs.cs425.studentmgmt;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mum.cs.cs425.studentmgmt.model.Classroom;
import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.model.Transcript;
import edu.mum.cs.cs425.studentmgmt.repository.ClassRoomRepository;
import edu.mum.cs.cs425.studentmgmt.repository.StudentRepository;
import edu.mum.cs.cs425.studentmgmt.repository.TranscriptRepository;

@SpringBootApplication
public class MyStudentMgmtAppApplication  implements CommandLineRunner{
	@Autowired 
	private StudentRepository studentRepository;
	@Autowired
	private TranscriptRepository transcriptRepository;
	
	@Autowired
	private ClassRoomRepository classRoomRepository;
	public static void main(String[] args) {
		SpringApplication.run(MyStudentMgmtAppApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		Student student = new Student(101, "Desale", "Fessehaye", "Hdremariam", 3.6, LocalDate.of(2019, 8, 5));
		Transcript transcript = new Transcript("SWE course");
		
		Student student2 = new Student(101, "Desales", "Yonas", "Senay", 3.8, LocalDate.of(2019, 11, 5));
		Transcript transcript2 = new Transcript("SWE course");
		student.addTranscript(transcript);
		student2.addTranscript(transcript2);
		Classroom clr = new Classroom("Maclaphin", 105);
//		clr.addStudent(student);
//		clr.addStudent(student2);
		student.addClassRoom(clr);
		student2.addClassRoom(clr);
		studentRepository.save(student);
		studentRepository.save(student2);
//		classRoomRepository.save(clr);
	}
	
	
}
