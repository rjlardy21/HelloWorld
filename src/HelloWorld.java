import java.util.Scanner;

//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title:           HelloWorld
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

public class HelloWorld {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "";
		System.out.print("Enter a string: ");
		if (sc.hasNextLine() == false) {
			System.out.println("Hello, world!");
		} else {
			s = sc.nextLine();
			System.out.println("Hello, " + s + "!");
		}
	}

}
