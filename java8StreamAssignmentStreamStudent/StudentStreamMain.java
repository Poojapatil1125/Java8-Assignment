package java8StreamAssignmentStreamStudent;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class StudentStreamMain {

	public static void main(String[] args) {
		
		List l=Arrays.asList(
				new StudentStream(1, LocalDate.of(2021, 8, 23), LocalDate.of(2005,8,23), new StuSubjects(45, 33, 39, 40, 44), "10th"),
				new StudentStream(2, LocalDate.of(2021, 5, 22), LocalDate.of(2004,4,13), new StuSubjects(45, 30, 32, 44, 44), "10th"),
				new StudentStream(3, LocalDate.of(2021, 9, 26), LocalDate.of(2004,10,14), new StuSubjects(35, 37, 41, 46, 34), "10th"),
				new StudentStream(4, LocalDate.of(2021, 2, 28), LocalDate.of(2005,12,22), new StuSubjects(45, 39, 48, 42, 34), "10th"),
				new StudentStream(5, LocalDate.of(2021, 4, 19), LocalDate.of(2003,6,7), new StuSubjects(45, 37, 39, 40, 44), "10th"),
				new StudentStream(6, LocalDate.of(2021, 6, 3), LocalDate.of(2006,9,8), new StuSubjects(44, 33, 39, 38, 42), "10th")
				
				);
		System.out.println("student who scored less than 40%");
		l.stream().filter(null);
		
		
	}

}
