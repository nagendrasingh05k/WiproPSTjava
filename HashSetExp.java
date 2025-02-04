package Assignment4;

/*Write a Java program to create a HashSet of strings. Perform the following operations:
Add five city names to the set, ensuring at least one duplicate entry.
Display the elements to show that duplicates are not allowed.
Check if a particular city exists in the set.
Remove a city and display the updated set. */

import java.util.*;

public class HashSetExp {
    public static void main(String[] args) {
        
        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Lucknow");
        cities.add("Chandigarh");
        cities.add("Pune");
        cities.add("Delhi");

        System.out.println("Cities in hashSet : "+ cities);

        // checking if perticula city is present of not 

        String CityToCheck = "Lucknow";

        if(cities.contains(CityToCheck)){
            System.out.println(CityToCheck + " is present");
        }
        else{
            System.out.println(CityToCheck + " is not present");
        }

        // removing the city form hashSet 

        String CityToRemove = " Pune";
        cities.remove(CityToRemove);

        System.out.println("Updated City after removing the HashSet is : " + cities);


    }
}
