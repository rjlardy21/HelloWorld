// Enter your program here
import java.util.Scanner;

//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title:           EclipseVsZyBooks
// Files:           a list of all source files used by that program
// Course:          CS200 Spring 2018
//
// Author:          Reece Lardy
// Email:           rlardy@wisc.edu
// Lecturer's Name: Mark Renault
//
///////////////////////////// CREDIT OUTSIDE HELP /////////////////////////////
//
// Students who get help from sources other than their partner must fully 
// acknowledge and credit those sources of help here.  Instructors and TAs do 
// not need to be credited here, but tutors, friends, relatives, room mates 
// strangers, etc do.  If you received no outside help from either type of 
// source, then please explicitly indicate NONE.
//
// Persons:         identify each person and describe their help in detail
// Online Sources:  identify each URL and describe their assistance in detail
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////
public class EclipseVsZyBooks {

		    public static void main(String[] args) {
		       Scanner sc = new Scanner(System.in);
		        System.out.println("Enter an integer: ");
		        int a = sc.nextInt();
		        System.out.println("Enter a second integer: ");
		        int b = sc.nextInt();
		        if(a == b)
		            System.out.println(a + " equals " + b);
		        else if (a < b)
		            System.out.println(a + " is less than " + b);
		        else
		            System.out.println(a + " is more than " + b);
		    
}
}

