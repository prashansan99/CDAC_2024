/*2)Create a Person class with attributes name and age. Write a Java program that sorts a list of Person objects first by age and then by name if the ages are equal.*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {

    String fname;

    int age;

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public Person(String fname,  int age) {
        this.fname = fname;

        this.age = age;
    }

    @Override
    public String toString() {
        return fname  + age;
    }
}
public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Person> persons = new ArrayList<>();
		    persons.add(new Person("tarun", 28));
		    persons.add(new Person("arun", 29));
		    persons.add(new Person("varun", 12));
		    persons.add(new Person("arun", 22));

		    Collections.sort(persons, new Comparator<Person>() {

		        public int compare(Person t, Person t1) {
		        	  //int comp = t1.getFname().compareTo(t.getFname());
		            int comp = t.getFname().compareTo(t1.getFname());
		            if (comp != 0) {    // names are different
		                return comp;
		            }
		            //return t1.getAge() - t.getAge();
		            return t.getAge() - t1.getAge();
		        }
		    });
		    System.out.println(persons);

	}

}

/*Output:
[arun22, arun29, tarun28, varun12]
*/
