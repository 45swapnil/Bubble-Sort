package javaprogram;
import java.util.*;

public class Pracctice  {
	
		public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the Array size");
			int i,j,size=sc.nextInt();
			int Array[]=new int[size];
			System.out.println("Enter the array element");
			
			for(i=0;i<size;i++)
			{
				Array[i]=sc.nextInt();
			}
			for(i=0;i<size-1;i++)
			{
		
				for(j=0;j<size-i-1;j++)
				{
					if(Array[j]>Array[j+1])
					{
						int temp;
						temp=Array[j];
						Array[j]=Array[j+1];
						Array[j+1]=temp;
					}
				}
				
			
			}
			System.out.println("sorted");
			for(i=0;i<size;i++) {
				
				System.out.println(Array[i]);
			}
			
			
		}
}
		
		
	

