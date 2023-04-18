package encapulation;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a=new Author("Akshay","akshay@gmail.com",'M');
		Book b1=new Book("way of life",a,200.0,50);
		  
        System.out.println("Name of the book is: " + b1.getName());
        System.out.println("Author of the book is: " + b1.getAuthor().getName() + ", " +
                            "Email: " + b1.getAuthor().getEmail() + ", "+
                            "Gender: " + b1.getAuthor().getGender());
        System.out.println("Price of Book is: "+b1.getPrice());
        System.out.println("Total no. of Books are : "+b1.getQtyInStock());

	}

}

 class Book {

	String name;
	Author author;
	double price;
	int qtyInStock;
	
	Book(String name,Author author,double price,int qtyInStock){
	this.name=name;
	this.author=author;
	this.price=price;
	this.qtyInStock=qtyInStock;
	}

	public String getName() {
		return this.name;
	}

	public Author getAuthor() {
		return this.author;
	}

	public double getPrice() {
		return this.price;
	}

	public double getQtyInStock() {
		return this.qtyInStock;
	}
	
	

}
class Author{
	String name;
	String email;
	char gender;
	
	Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	 String getName() {
	        return name;
	    }
	    String getEmail() {
	        return email;
	    }
	    char getGender() {
	        return gender;
	    }
}

