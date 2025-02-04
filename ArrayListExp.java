package Assignment4;

/*Write a Java program to create an ArrayList of integers. Perform the following operations:
Add five integer elements to the list.
Remove the third element.
Update the second element with a new value.
Display all the elements using a loop.
 */

import java.util.*;

public class ArrayListExp {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<>();

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);

        // performing the operaton here...

        number.remove(2);

        number.set(1, 25);

        System.out.println("Updated ArrayList elements are...");

        Iterator<Integer> itr = number.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
