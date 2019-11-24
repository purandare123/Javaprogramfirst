package programs;

import java.util.ArrayList;
import java.util.Scanner;

public class CountryNameSearch {

	public static void main(String[] args) {
		
		 int len;
         String countryname;
         
         Scanner sc=new Scanner(System.in);
         
         System.out.println("Enter a Country name:");
         int flag=0;
         countryname=sc.next();
         len=countryname.length();
         String search=countryname.substring(0,2);
         
         ArrayList <String> al=new ArrayList<String>();
         al.add("India");
         al.add("United Kingdom");
         al.add("China");
         al.add("Chile");
         al.add("Germany");
         al.add("Israel");
         al.add("Netherland");
         al.add("Japan");
         al.add("South Koria");
         al.add("philippines");
		 al.add("Nigeria");
		 al.add("Niger");
		 al.add("Indonesia");
		 
		for(int i=0;i<al.size();i++)
		{
			
			String Country=al.get(i);
			
			boolean check=Country.contains(search);
			
			if(countryname.equals(Country))
			{
				System.out.println("Search Result: "+Country);
				flag=flag+1;
				System.exit(1);
			}
			
			else if(check==true){
				
				System.out.println("We have suggestion: "+Country);
				flag=flag+1;
			}
			
		}
		if(flag==0)
		{
			System.out.println("Search result not found");
		}
		
	}

}
