/*
3)Write a Java program to find the first non-repeated character in a string using a HashMap.


String input = "aabbccddeffg";
Expected output = 'e';
*/
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String str="aabbccddeffg";
          HashMap  <Character,Integer>hm=new LinkedHashMap<Character,Integer>();

                    for(int i=0;i<str.length();i++)
                      {
                       if(!hm.containsKey(str.charAt(i)))
                       hm.put(str.charAt(i),1);
                       else
                       hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
                      }

           for (Character key : hm.keySet())
               {
                      if(hm.get(key)==1)
                   { 
                   System.out.println(key);
                   System.exit(0) ; 
                   }         

               }
	}

}
/*Output:
e
*/
