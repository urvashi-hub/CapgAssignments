package lab2;
import java.util.*;
 abstract class Item
{
	private int Identification_number;
	private int num_ofCopies;
	private String Title;
	protected String topic;
    public Item(int W_idno,int W_copies,String W_title)
	{
		Identification_number=W_idno;
		num_ofCopies=W_copies;
		Title=W_title;
		
				
	}
	int getIdentification_number()
	{
		return Identification_number;
	}
	public void setIdentification_number(int new_id)
	{
		Identification_number=new_id;
	}
	int getNumberOfCopies()
	{
		return num_ofCopies;
	}
	public void setNumberOfCopies(int new_copies)
	{
		num_ofCopies=new_copies;
		
	}
	String getTitle()
	{
		return Title;

	}
	public void setTitle(String new_Title)
	{
		Title=new_Title;
		
	}
	 public void checkIn()
	 {
		 System.out.println("Title is: " +Title);
		 num_ofCopies=num_ofCopies+1;
		 System.out.println("Number of Copies is: "+num_ofCopies);
	 }
	 public void checkOut()
	 {
		 System.out.println("Title is: " +Title);
		 num_ofCopies=num_ofCopies-1;
		 System.out.println("Number of copies is: "+num_ofCopies);
	 }
	void addItem(int add_id,int add_num,String add_title)
	{
		add_id=getIdentification_number();
		add_num=getNumberOfCopies();
		add_title=getTitle();
	}
	 
	
}
class WrittenItem extends Item
{
	private String author;
	private String publication;
	WrittenItem(int W_idno,int W_copies,String W_title,String W_author, String W_publication)
	{
		super(W_idno,W_copies,W_title);
		author=W_author;
		publication=W_publication;
		System.out.println("Author is: "+author);
		System.out.println("Publication is: "+publication);
	}

}
class Book extends WrittenItem
{
	Book(int W_idno,int W_copies,String W_title,String W_author,String W_publication,String topic)
	{
	super(W_idno,W_copies,W_title,W_author,W_publication);
	this.topic=topic;
	System.out.println("Topic is: "+topic);
	
    }
}
class JournalPaper extends WrittenItem
{
	private int year_published;
	JournalPaper(int W_idno,int W_copies,String W_title,String W_author,String W_publication,int year_published)
	{
		super(W_idno,W_copies,W_title,W_author,W_publication);
		this.year_published=year_published;
	}
}
class MediaItem extends Item
{
	private int runtime;
	MediaItem(int W_idno,int W_copies,String W_title,int M_runtime)
	{
		super(W_idno,W_copies,W_title);
		runtime=M_runtime;
		System.out.println("Runtime is: "+runtime);
	}
}
class Video extends MediaItem
{
	private String director_name;
	private String genre_video;
	private int year;
	public Video(int W_idno,int W_copies,String W_title,int M_runtime,String director_name,String genre_video,int year)
	{
		super(W_idno,W_copies,W_title,M_runtime);
		this.director_name=director_name;
		this.genre_video=genre_video;
		this.year=year;
	}
}
class CD extends MediaItem
{
	private String genre_CD;
	private int year_CD;
	public CD(int W_idno,int W_copies,String W_title,int M_runtime,String genre_CD,int year_CD)
	{
		super(W_idno,W_copies,W_title,M_runtime);
		this.genre_CD=genre_CD;
		this.year_CD=year_CD;
		System.out.println("ID Number is: "+W_idno);
		System.out.println("genre is: "+genre_CD);
		System.out.println("year is: "+year_CD);
	}
	
}
public class LibraryMngmt
{
	public static void main(String args[])
	{
		
		MediaItem obj1=new CD(123,12,"badminton",2,"sports",2012);
		obj1.checkIn();
		
	}
}

