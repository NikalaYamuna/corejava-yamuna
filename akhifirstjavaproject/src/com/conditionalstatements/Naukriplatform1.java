package com.conditionalstatements;

import java.util.Scanner;

public class Naukriplatform1 {

	public static void main(String[] args) {
		   System.out.println("************************* Welcome to Naukri.com *******************************");
	        Scanner sc = new Scanner(System.in);
	        
	       
	        System.out.println("\nEnter your Full Name:");
	        String fname = sc.nextLine();
	        
	        System.out.println("Enter your E-mail Address:");
	        String mail = sc.nextLine();
	        
	        System.out.println("Enter your 10-digit Mobile Number:");
	        long phnno = sc.nextLong();
	        sc.nextLine();
	        
	        System.out.println("Enter your Education Branch/Specialization :");
	        String branch = sc.nextLine();
	        
	        System.out.println("Are you a Fresher? (Type 'true' for Fresher, 'false' if you have Experience):");
	        boolean isFresher = sc.nextBoolean();
	        sc.nextLine();
	        
	       
	        if (!isFresher) {
	           
	            System.out.println(" Great! Experienced profiles get up to 3x more recruiter visibility.");
	            
	            System.out.println("Which targeted job role are you interested in? ");
	            String role = sc.nextLine();
	            
	            System.out.println("How many total years of professional experience do you have?");
	            double experience = sc.nextDouble();
	            sc.nextLine();
	            
	            if (experience >= 1) {
	                System.out.println("What is your current Designation/Job Title?");
	                String designation = sc.nextLine();
	                
	                System.out.println("What is your current Fixed CTC ? ");
	                double currentCTC = sc.nextDouble();
	                sc.nextLine();
	                
	                System.out.println("What is your Expected CTC (LPA) for your next switch?");
	                double expectedCTC = sc.nextDouble();
	                sc.nextLine();
	                
	                System.out.println("What is your official Notice Period? ");
	                String noticePeriod = sc.nextLine();
	                
	                
	                if (currentCTC >= 12.0) { 
	                    System.out.println(" You are already in a high-income bracket. Are you switching primarily for a Domain Change? (");
	                    boolean domainChange = sc.nextBoolean();
	                    sc.nextLine();
	                    
	                    if (domainChange) {
	                        System.out.println("Excellent choice. We will prioritize premium Product Development roles matching your goals!");
	                    } else {
	                        System.out.println("Understood. We will look for roles maximizing your financial growth up to your expected " + expectedCTC + " LPA.");
	                    }
	                } else {
	                    System.out.println("Profile optimized! We will target premium openings to help you bridge the gap towards your target CTC.");
	                }
	            } else {
	                System.out.println(" Early career stage detected. We will process your profile for Junior " + role + " positions.");
	            }
	            
	        } else {
	           
	            System.out.println(" Welcome aboard! For Freshers, companies focus heavily on technical skills and academic foundation.");
	            
	            System.out.println("Enter your Year of Graduation / Passing Year (e.g., 2025, 2026):");
	            int passoutYear = sc.nextInt();
	            sc.nextLine();
	            
	            System.out.println("Enter your overall College CGPA or Percentage :");
	            String academicScore = sc.nextLine();
	            
	            System.out.println("Enter your Primary Technical Skill / Programming Language (e.g., Java, Python, SQL):");
	            String primarySkill = sc.nextLine();
	            
	            System.out.println("Have you completed any internship or capstone project? (Yes/No):");
	            String projectStatus = sc.nextLine();
	            
	            System.out.println("Enter your Preferred Job Location (e.g., Bangalore, Hyderabad, Remote):");
	            String preferredLocation = sc.nextLine();
	            
	           
	            System.out.println("Profile created successfully!");
	           
	        }
	        
	        System.out.println("\nThank you, " + fname + ". Your profile is now 100% complete and visible to matching recruiters.");
	        sc.close();

	}

}
