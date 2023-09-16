import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.PF;
import entities.PJ;
import entities.Tax;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<Tax> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for(int i = 0;i<n;i++) {
			
			System.out.println("Tax payer "+ i + " data:");
		
			

			System.out.print("Name:");
			String Name = sc.next();
			sc.nextLine();
			System.out.print("Anual income: ");
			Double AnualIncome = sc.nextDouble();
			
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				Double health = sc.nextDouble();
				PF p1 = new PF(Name, AnualIncome, health);
				list.add(p1);
				
			}else {
				System.out.print("Number of employees: ");
				Integer employees = sc.nextInt();
				PJ p1 = new PJ(Name, AnualIncome, employees);
				list.add(p1);
			}
			
		}
		
		double sum = 0.0;
		System.out.println("TAXES PAID");
		for(Tax t : list) {
			double tax = t.Incometax();
			System.out.println(t.getName() + ": $ " + String.format("%.2f", tax));
			sum += tax;
			
			
		}
		
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		sc.close();
		
	}

}
