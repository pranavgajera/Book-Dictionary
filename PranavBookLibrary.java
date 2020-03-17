import java.util.Scanner;

public class PranavBookLibrary 
{

	public static void main(String[] args) 
	{

		Scanner scan=new Scanner(System.in);
		Book[] library=new Book[10];
		int input=1;
		Boolean t=false;
		String BookN;
		int bookCount=0;
		do {
			System.out.println("add a book to the library enter 1, delete a book from the library enter 2,change the books information press 3,to terminate press 0");
			input=Integer.parseInt(scan.nextLine());
			if(input==1){
				if(bookCount==10) 
				{
					System.out.println("Error the library is full");
				}
				else 
				{
					System.out.println("Please enter the name of the book");
					BookN=scan.nextLine();
					t=false;
					for(int i=0;i<library.length;i++) 
					{
						if(library[i]!= null) 
						{
							if(library[i].getTitle().equals(BookN)) {
								t=true;
								System.out.println("This title already is a part of the library please enter a new book ");
								break;

							}
						}
					}

					if(!t) {
						System.out.println("Please enter the number of pages in the book");
						int Bookpg=Integer.parseInt(scan.nextLine());
						Book b=new Book(Bookpg,BookN);
						for(int i=0;i<library.length;i++) {
							if(library[i]==null) 
							{
								library[i]=b;
								System.out.println();
								for (int j = 0; j <= bookCount; j++)
								{
									if (library[j] != null)
										System.out.println("Book: " + library[j].getTitle() + " Pages: " + library[j].getPage());
								}
								bookCount+=1;
								break;
							}
						}

					}	
				}
			}
			else if (input==2) {
				if(bookCount==0) {
					System.out.println("The library is empty.");
				}
				else {
					System.out.println("Enter the name of the book that you want to delete:");
					BookN=scan.nextLine();
					for(int i=0;i<bookCount;i++) {
						if(library[i].getTitle().equals(BookN)) {
							t=true;
							library[i]=null;

							System.out.println("The book has been removed \nUpdated library:");

							System.out.println();
							for (int j = 0; j <= bookCount; j++)
							{
								if (library[j] != null)
									System.out.println("Book: " + library[j].getTitle() + " Pages: " + library[j].getPage());
							}
							bookCount--;
							break;
						}
					}
					if(!t) {
						System.out.println("The book does not exist");
					}
				}
			}
			else if(input==3) {
				t=false;
				if(bookCount==0) {
					System.out.println("The library is empty.");
				}
				else {
					System.out.println("Please enter the title of the book that you want to change the information of:");
					BookN=scan.nextLine();
					for(int i=0;i<bookCount;i++) {
						if (library[i] != null) {
							if(library[i].getTitle().equals(BookN)) {
								System.out.println("Enter the title of the new book:");
								String name2=scan.nextLine();
								t=true;
								System.out.println("Enter the number of pages in the new book:");
								int pg2=Integer.parseInt(scan.nextLine());
								Book b2=new Book(pg2,name2);
								for(int n=0;n<library.length;n++) {
									library[n]=b2;
									System.out.println("The book's information has been changed\nUpdated library:");
									System.out.println();
									for (int j = 0; j <= bookCount; j++)
									{
										if (library[j] != null)
											System.out.println("Book: " + library[j].getTitle() + " Pages: " + library[j].getPage());
									}
									break;
								}

							}
						}
						if(!t) {
							System.out.println("The book does not exist");
						}
					}
				}
			}
		}while(input!=0);

	}

}
