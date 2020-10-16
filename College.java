package snippet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class College {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> list = new ArrayList<Student>();
		int count =0;
		for(int i=0 ;i<10;i++) {
			System.out.println("Enter Result :: \n Student Name  & percentage" );
			String name = sc.nextLine();
			int num = sc.nextInt();sc.nextLine();
		     Student s = new Student(name, num);
		     if(s.getNum() ==1 ) {
		    	 System.out.println(s.getName()+ " is  pass ");
		    	 count++;
		    	 System.out.println("count :: "+ count);
		     }
		     else {
		    	 System.out.println(s.getName()+ " is  Failed ");
		     }
		}
		if(count>8)System.out.println("Bonus to instructor!");
		}

	}


