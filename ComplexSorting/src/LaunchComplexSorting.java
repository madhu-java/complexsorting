import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LaunchComplexSorting {

	public static void main(String[] args) {
		Employee e1= new Employee(2, "aryan", 27);
		Employee e2= new Employee(1, "bobby", 45);
		Employee e3= new Employee(3, "royan", 22);
		
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		System.out.println("before sorting"+list);
		//using annonymous class
	/*	Comparator<Employee> comparator = new Comparator<Employee>(){
			@Override
			public int compare(Employee em1,Employee em2) {
				if(em1.getId()>em2.getId())
						return 1;
				else 
					return -1;
			}
		};
		Collections.sort(list,comparator);*/
		Collections.sort(list,( Employee emp1,Employee emp2)->{
			if(emp1.getAge()>emp2.getAge())
				return 1;
			else
				return -1;
		});
		System.out.println("after sorting"+list);
	}

}
