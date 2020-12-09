package programming;

import java.util.List;

public class FP01Exercises {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
//		printOddNumbers(numbers);
//		printCubesOfOddNumbers(numbers);

		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");

//		courses.stream()
//				.forEach(System.out::println);

//		List of courses contains 'Spring' word
//		courses.stream()
//				.filter(course -> course.contains("Spring"))
//				.forEach(System.out::println);

//		List of courses whose name has atleast 4 letters
//		courses.stream()
//				.filter(course -> course.length() >= 4)
//				.forEach(System.out::println);

//		Print length of courses
		courses.stream()
				.map(course -> course + " " + course.length())
				.forEach(System.out::println);

	}

	private static void printOddNumbers(List<Integer> numbers) {
		numbers.stream()
				.filter(i -> i % 2 != 0)
				.forEach(System.out::println);
	}

	private static void printCubesOfOddNumbers(List<Integer> numbers) {
		numbers.stream()
				.filter(num -> num % 2 != 0)
				.map(num -> num * num * num)
				.forEach(System.out::println);
	}

}
