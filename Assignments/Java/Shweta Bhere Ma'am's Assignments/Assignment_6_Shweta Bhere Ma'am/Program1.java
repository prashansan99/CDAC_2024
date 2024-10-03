/*1)Write a Java program that takes a list of integers as input and returns a list of duplicate integers. */

import java.util.*; 
import java.util.stream.*; 
  
public class Program1 { 
  
    public static <T> Set<T> 
    findDuplicateInStream(Stream<T> stream) 
    { 
  
        Set<T> items = new HashSet<>(); 
  
        return stream 
  
            .filter(n -> !items.add(n)) 
  
        
            .collect(Collectors.toSet()); 
    } 
  
   
    public static void main(String[] args) 
    { 
  
        Stream<Integer> stream 
            = Stream.of(10, 10, 8, 3, 8, 7, 1, 3, 4); 
  
        // Print the found duplicate elements 
        System.out.println( 
            findDuplicateInStream(stream)); 
    } 
}

/*Output:
[3, 8, 10]
*/



