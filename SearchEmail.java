package email;
import java.util.Scanner;
import java.util.ArrayList;

public class SearchEmail {	//Creating a SearchEmail class
public static void main(String[] args) {
	ArrayList<String> emailid = new ArrayList<>(); 
	emailid.add("abc@gmail.com");
	emailid.add("def@gmail.com");
	emailid.add("ghi@gmail.com");
	emailid.add("jkl@gmail.com");
	emailid.add("mno@gmail.com");
	emailid.add("pqr@gmail.com");
	emailid.add("st@gmail.com");
	emailid.add("uvc@gmail.com");
	emailid.add("wc@gmail.com");
	emailid.add("xyz@gmail.com");
	
	
	 System.out.println("Enter the emailid you need to search");
     Scanner sc = new Scanner(System.in);	//Creating scanner to get the emailid to be searched from the user
     String search = sc.nextLine();
     System.out.println("The emailid to be searched is"+" "+search);
     
    if(emailid.contains(search)) {
    	System.out.println(search+" "+"is found in the list");
    }else {
    	System.out.println(search+" "+"is not found in the list");
    }
   
}
}
