import java.util.Scanner;
public class TestBooks
{
	public static void main(String[] args)
	{
		int pageSum=0;
		int numBooks=0;
		Book smallest=null;
		Book obj=null;
		Scanner scan=new Scanner(System.in);
		System.out.println("How many books did you read during summer:");
		numBooks=Integer.parseInt(scan.nextLine());
		for(int i=1;i<=numBooks;i++) 
		{
			System.out.println("Enter the name of the book "+i+":");
			String nameBook = scan.nextLine();
			System.out.println("Enter the number of pages in book "+i+":");
			int numPages=Integer.parseInt(scan.nextLine());
			pageSum+=numPages;
			if (i == 1)
			{
				smallest=new Book(numPages,nameBook);
			}
			else {
				obj=new Book(numPages,nameBook);
				if (smallest.compareTo(obj)==1) {
					smallest=new Book(numPages,nameBook);
				}
			}
		}
		double average=pageSum/numBooks;
		System.out.println("The smallest book is "+smallest.toString());
		System.out.println("average pages read: "+average);
	}
} 