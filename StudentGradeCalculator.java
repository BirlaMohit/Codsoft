

               //  STUDENT GRADE CALCULATOR  //

package com.codsoft;

import java.util.Scanner;

public class StudentGradeCalculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the total number of subjects: ");
	        int totalSubjects = scanner.nextInt();
	        
	        int[] marks = new int[totalSubjects];
	        
	        //This loop iterates through each subject and prompts the user to enter the marks obtained in that subject. The marks are then stored in the marks array.
	       
	        for (int i = 0; i < totalSubjects; i++) {
	            System.out.print("Enter marks obtained in subject " + (i + 1) + ": ");
	            marks[i] = scanner.nextInt();
	        }
	        
	        
//	        This loop calculates the total marks by summing up the values stored in the marks array.
	  
	        
	        int totalMarks = 0;
	        for (int mark : marks) {
	            totalMarks += mark;
	        }
	        
	        double averagePercentage = (double) totalMarks / (totalSubjects * 100) * 100;
	        
	        String grade;
	        if (averagePercentage >= 90) {
	            grade = "A";
	        } else if (averagePercentage >= 80) {
	            grade = "B";
	        } else if (averagePercentage >= 70) {
	            grade = "C";
	        } else if (averagePercentage >= 60) {
	            grade = "D";
	        } else {
	            grade = "F";
	        }
	        
	        System.out.println("Total Marks: " + totalMarks);
	        System.out.println("Average Percentage: " + averagePercentage + "%");
	        System.out.println("Grade: " + grade);
	        
	        scanner.close();
	    }
}

