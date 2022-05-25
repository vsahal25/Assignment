package assignm5;

import java.util.ArrayList;

public class PhoneBook1 {
	static Person p= new Person(1,"8910455262", "Vishal", "Sahal", "Shree Sumukha PG", "J P Nagar", "Bengaluru", "Karnataka", "India");
	static Person p1= new Person(2,"8170013737", "Papa", "Jio", "Ankush Club", "Vidyasagarpur", "Kharagpur", "West Bengal", "India");
	static ArrayList<Person> list=new ArrayList<Person>();

	public static void add() {
		// TODO Auto-generated method stub
		list.add(p);
		list.add(p1);
		//		System.out.println(list.toString());
	}
	public static void delete() {
		// TODO Auto-generated method stub
		list.remove(p);
		System.out.println(list.toString());
	}

	public static void printAll() {
		// TODO Auto-generated method stub
		for(Person persons: list)  
		{  
			System.out.println(persons.toString());  
		}   

	}
	
	


	public static void main(String args[])
	{
		add();
		//	  delete();
		printAll();
		// Printing all the elements in an ArrayList  
	}

}
