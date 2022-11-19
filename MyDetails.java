import java.util.Scanner;
public class MyDetails{

	public static void main(String[] args)
	{
		String name = "Jane Doe", hobby="Hiking";
		int bornyear=1998, age = 23, currentyear = 2020;
		boolean older_21=true;
		double sum=0, prereq_marks, averagescore = 67.3;

		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name?");
		name = input.nextLine();

		System.out.println("What is your hobby - type in one word?");
		hobby = input.next();

		System.out.println("Which year you were born?");
		bornyear = input.nextInt();

		//System.out.println("What is the averagescore?");
		//averagescore = input.nextDouble();

		for(int i = 1; i <= 3; i++)
		{
			do{
				System.out.println("Enter marks for course " + i);
				prereq_marks = input.nextDouble();
				sum = sum + prereq_marks;
			}while(prereq_marks < 50 || prereq_marks > 100);
		}
		averagescore = sum / 3;
		age = currentyear - bornyear;
		if(age < 21)
		{
			older_21=false;
		}
		
		System.out.println("My Details");
		System.out.println("----------");
		System.out.print("Name : "+name);
		System.out.print(" Hobby: "+hobby);
		System.out.println();
		System.out.println("Year of birth: "+bornyear);
		System.out.printf("Average score %.1f", averagescore);
		if(older_21==true)
		{
			System.out.println("You are enrolled!");
		}else{
			System.out.println("You are younger than 21 - sorry you are not enrolled!");
		}
	}
}