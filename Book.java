

public class Book 
{
	private int page;
	private String title;
	public Book(int page,String title)
	{
		this.page=page;
		this.title=title;
	}
	public void setPage(int pageC)
	{
		page=pageC;
	}
	public int getPage()
	{
		return page;
	}
	public void setTitle(String ttle)
	{
		title=ttle;
	}
	public String getTitle()
	{
		return title;
	}
	public String toString()
	{
		return "The book title is: "+title+" "+"and the total number of pages in the book are: "+page;
	}
	 public boolean equals(Book obj) 
	 {
    	 return (page == obj.getPage() && title.equals(obj.getTitle()));   
     }
	 public int compareTo(Book obj)
	 {
    	 if (page < obj.getPage()) {
    		 return -1;
    	 }
    	 else if(page > obj.getPage()) {
    		 return 1;
    	 }
    	 else
    		 return 0;
     }
}
