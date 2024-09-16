
public class InstanceCounter {
	
	static int count=0;
	
	InstanceCounter()
	{
		count++;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceCounter i1= new InstanceCounter();
		InstanceCounter i2= new InstanceCounter();
		InstanceCounter i3= new InstanceCounter();
		InstanceCounter i4= new InstanceCounter();
		InstanceCounter i5= new InstanceCounter();
		
		System.out.println("Number of Objects created: "+count);

	}

}

/*Output:
 Number of Objects created: 5
 */
