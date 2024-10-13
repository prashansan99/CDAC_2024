import java.util.Scanner;
class Program3_1
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		
		char [] strArray= str.toCharArray();
		StringBuffer sb= new StringBuffer();
		for(int i= 0; i< strArray.length; i++)
		{
			if((strArray[i] != ' ') && (strArray[i] != '\t'))
			{
				sb.append(strArray[i]);
			}
		}
		
		String noSpaceStr2= sb.toString();
		System.out.println(noSpaceStr2);
	}		
}