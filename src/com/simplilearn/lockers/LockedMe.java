package com.simplilearn.lockers;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class LockedMe {
public static void ListingFile() {
	        File fileDir = new File("D:\\Ajay Simplilearn\\");
	        if(fileDir.isDirectory()){
	            List <String>listFile = Arrays.asList(fileDir.list());
	            Collections.sort(listFile);
	            System.out.println("--------------------------------------");
	            System.out.println("Sorting by filename in ascending order");
	            for(String s:listFile){
	                System.out.println(s);	                
	            }
	        }
	        else{
	            System.out.println(fileDir.getAbsolutePath() + " is not a directory");
	        }LockedMe.MainMenu();
	    }
	    public static void CreateFile() {
	        Scanner sc = new Scanner(System. in ); //object of Scanner class
	        System.out.println("Enter the file name : ");
	        String name = sc.nextLine(); //variable name to store the file name
	        File file = new File("D:\\Ajay Simplilearn\\"+name);

	        try {
	            if (file.createNewFile()) {
	                System.out.println("File Created! :)");
	                LockedMe.BusinessOperations();
	            } else {
	                System.out.println("File already exists :(");
	                LockedMe.BusinessOperations();
	            }
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }
	    public static void Delete() {
	        String filename;
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the Name of File to Delete: ");
	        filename = scan.nextLine();
	        File file= new File("D:\\Ajay Simplilearn\\"+filename);
	        if (file.delete()) {
	            System.out.println("File deleted successfully");
	            LockedMe.BusinessOperations();
	        }
	        else {
	            System.out.println("Oops !! File not found.Please try again ");
	            LockedMe.BusinessOperations();
	        }
	    }
	    public static void Search() {
	        System.out.println("Enter the name of the file to Search");
	        Scanner s1 = new Scanner(System.in);
	        String folderName = s1.next();
	        File file = new File("D:\\Ajay Simplilearn\\"+folderName);
	        if (file.exists()) {
	            System.out.println("Yep! File found!");
	            System.out.println(file.getAbsolutePath());
	            LockedMe.BusinessOperations();
	        } else {
	            System.out.println("Sorry, File is not here (File Not Found)");
	            LockedMe.BusinessOperations();
	        }
	    }
	    public static void MainMenu() {
	    	System.out.println("Please select one the following");
	        System.out.println("1 To Display current file names in ascending order ");
	        System.out.println("2 To Perform your Business Operation");
	        System.out.println("3 To Exit Application");    	
	    }	    
	    public static void BusinessOperations() {	    	
	    	System.out.println("Please choose one of the following options :");
	        System.out.println("1. Create a New File");
	        System.out.println("2. Delete a File");
	        System.out.println("3. Search a File");
	        System.out.println("4. For Main Menu");
	        Scanner sc2=new Scanner(System.in);
	    	try {	    		
	            int choice=sc2.nextInt();
	             switch(choice) {
	             case 1:
	                 System.out.println("You have selected to create file");
	                 CreateFile();
	                 break;
	             case 2:
	                 System.out.println("You have selected to Delete file");
	                 Delete();
	                 break;
	             case 3:
	                 System.out.println("You have Selected to search file");
	                 Search();
	                 break;
	             case 4:
	                 System.out.println("Going back to MainMenu");
	                 LockedMe.MainMenu();
	                  break;
	         }
	        }catch(Exception e) {
	           System.out.println("Oops!! Please Enter valid number");
	          LockedMe.BusinessOperations();
	        }	
	    }
	    public static void main(String[] args) {
	        System.out.println("********************************");
	        System.out.println("Welcome to Lockers Pvt. Ltd.");
	        System.out.println("LockedMe.com");
	        System.out.println("Develop by Ajay Kumar");
	        System.out.println("********************************");
	 Scanner sc=new Scanner(System.in);
	         LockedMe.MainMenu();
	        while(true) {
	              int option=sc.nextInt();
	              switch(option) {
	                case 1 :
	                    System.out.println("These are the files in ascending");
	                    ListingFile();
	                    break;
	                case 2 :
	                	LockedMe.BusinessOperations();
	                	break;       
	                case 3 :
	            	   System.out.println("Have a nice day!! Thanks for using lockers Pvt Ltd ");
	                   System.out.println("Application closed");
	                   System.exit(option);
	                    break;
	                default:
	                    System.out.println("Oops!! Please Enter the Valid Number");
	                    break;
	            }
	         }
	      }
	   }