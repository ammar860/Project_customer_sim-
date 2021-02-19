package sample;


import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer> customers=new ArrayList();
		ArrayList<Sim> sims=new ArrayList();
		Scanner in =new Scanner(System.in);
		
		while(true) {
			char input;
			System.out.println("Press 'c' for create customer");
			System.out.println("Press 's' for create sim");
			System.out.println("Press 'l' for link sim to customer");
			System.out.println("Press 'd' for Display customer ");
			System.out.println("Press 'a' for Display sims");
			System.out.println("Press e' for exit");
			input=in.nextLine().charAt(0);
			switch(input) {
			
			case'c':
				customers.add(addCustumer());
				System.out.println("customer created Successfuly");
				break;
			case's':
				sims.add(addSim());
				System.out.println("sim created Successfuly");
				break;
			case'l':
				sims=link_customer(get_tolink_customer(customers),sims);
				break;
				
			case'd':
				display_customer(customers);
				break;
				
			case'a':
				display_sim(sims);
				break;
				
			case'e':
				System.exit(0);
			
			default:
				System.out.println("invalid input");
				
	
			}
					
		}
	
	}
	
	public static void display_customer(ArrayList<Customer> temp) {
		for(Customer obj : temp) {
			System.out.println(obj);
		}
		
	}
	
	public static void display_sim(ArrayList<Sim> temp) {
		for(Sim obj : temp) {
			System.out.println(obj);
		}
		
	}
	
	public static Customer addCustumer() {
		Scanner in =new Scanner(System.in);
		
		int id ;
		String name ;
		String email;
		int mm;
		int dd;
		int yyyy;
		Date date_of_birth;
		System.out.println("Enter customer id");
		id=in.nextInt();
		System.out.println("Enter customer name");
		name=in.next();
		System.out.println("Enter customer email");
		email=in.next();
		System.out.println("Enter customer date of birth date");
		dd=in.nextInt();
		System.out.println("Enter customer date of birth month");
		mm=in.nextInt();
		System.out.println("Enter customer date of birth year");
		yyyy=in.nextInt();
		mm--;
		
		
			date_of_birth=new Date(yyyy,mm,dd);
		
		Customer obj=new Customer(id,name,email,date_of_birth);	
		return obj;
	}
	
	public static Sim addSim() {
		var in =new Scanner(System.in);
		int id;
		String operator;
		System.out.println("Enter sim id");
		id=in.nextInt();
		System.out.println("Enter sim's operator name");
		operator=in.next();
		Sim obj=new Sim(id ,operator);
		
		return obj;
	}
	
	public static ArrayList<Sim> link_customer(Customer temp,ArrayList<Sim> temp1){
		Scanner in =new Scanner(System.in);
		int id_sim;
		System.out.println("Enter sim id to link");
		id_sim=in.nextInt();
		for(Sim obj:temp1) {
			if(obj.getSim_id()==id_sim) {
				obj.setCustomer(temp);
			}
		}
		
		return temp1;
		
		
	}
	
	
	public static Customer get_tolink_customer(ArrayList<Customer> temp){
		Scanner in =new Scanner(System.in);
		int id_customer;
	    
		System.out.println("Enter customer id to link");
		id_customer=in.nextInt();
		
		for (Customer obj: temp ) {
			if(obj.getCustumer_id()==id_customer) {
				
			return obj;	
			}
		}
		return null;
		
	}
	
	
	
	

}
