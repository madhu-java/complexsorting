import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableSorting {

	public static void main(String[] args) {
	Student s1= new Student(10,"arya",22);
	Student s2= new Student(29,"sma",29);
	Student s3= new Student(5,"varun",20);
	List<Student> list = new ArrayList<>();
	list.add(s1);
	list.add(s2);
	list.add(s3);
	System.out.println("before sorting"+list);
	Collections.sort(list);
	System.out.println("before sorting"+list);
	}

}
