import java.util.*;
public class substring {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input a string");
		String name=sc.nextLine();
		
		int l,i,j,max=0;
		char ch;
		String temp=" ";
		String longest=" ";
		l=name.length();
		for( i=0;i<l;i++)
		{
			for(j=i+1;j<l;j++)
			{
			if(name.charAt(i)==name.charAt(j))
				{temp=name.substring(i,j+1);
				}
			
			else 
				{
				int l1=temp.length();
				if(l1>max)
				{
				
				max=l1;
				longest=temp;
				temp=" ";}
			break;}
		}
	}
	System.out.println(longest.charAt(0)+" "+max);
    
	}}