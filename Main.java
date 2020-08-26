package poo;

import java.util.Scanner; 
import java.util.*;
public class Main {

    public static void main(String[] args) {
        //my first object 
        Scanner s = new Scanner(System.in); s.useLocale(Locale.US);
        int sizeStudent;
        System.out.println("How many students do you want to register?");
        sizeStudent = s.nextInt();
        Student[] arr = new Student[sizeStudent];
        
        for(int i=0; i<arr.length; i++) {  
        Student newObj = new Student();
        System.out.println("********* STUDENT'S REGISTER *********");
        System.out.println("\nStudent name:");
        newObj.name = s.next();
        System.out.println("\nStudent age:");
        newObj.setAge(s.nextInt());
        System.out.println("\nStudent weight:");
        newObj.setWeight(s.nextDouble());
        System.out.println("\nStudent height:");
        newObj.setHeight(s.nextDouble());
        System.out.println("\nType note 1:");
        newObj.setNote1(s.nextDouble());
        System.out.println("\nType note 2:");
        newObj.setNote2(s.nextDouble());
        System.out.println("\nStudent frequency:");
        newObj.setFrequency(s.nextInt());
       
        //adding the object into Array
        arr[i] = newObj;
    }
        
        System.out.println("***** STUDENT INFORMATION *****"); 
       for(int i=0; i < arr.length; i++){
           System.out.println("Student"+ (i+1)+ "\n"+ arr[i].getInfoStudent());
       }
       
    }

}
