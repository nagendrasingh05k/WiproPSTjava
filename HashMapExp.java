package Assignment4;


import java.util.*;

public class HashMapExp {
    
    public static void main(String[] args) {
        
        HashMap<Integer, String> student = new HashMap<>();

        student.put(101, "rahul");
        student.put(102, "nagendra");
        student.put(103, "sunita");
        student.put(104, "monks");
        student.put(105, "abhay");


        // Retrieve and display the name of a student using a specific roll number

        int searchRoll = 103;

        if(student.containsKey(searchRoll)){
            System.out.println("student with roll number " + searchRoll + " : " + student.get(searchRoll));
        }
        else {
            System.out.println("student with given roll number not found");
        }

        // Remove a student entry using a roll number

        int removeRoll = 102;
        if(student.containsKey(removeRoll)){
            student.remove(removeRoll);
            System.out.println("roll number " + removeRoll + " deleted succesfully");
        }
        else{
            System.out.println("the given rollnumber is not found");
        }

        // Display all student records

        System.out.println(" All student recode are ....");

        for (Map.Entry<Integer, String> entry : student.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
