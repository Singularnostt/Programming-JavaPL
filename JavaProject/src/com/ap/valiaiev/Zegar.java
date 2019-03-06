package com.ap.valiaiev;

import java.util.*;

public class Zegar {
	
		public ArrayList<Integer> oblicz(int a, int b, int c, int d)
		
		{
			int n=4;
			ArrayList<Integer> numberList = new ArrayList<>();
			numberList.add(a);
			numberList.add(b);
			numberList.add(c);
			numberList.add(d);
			
			Collections.sort(numberList);	
//			Collections.reverse(numberList);
			
			if(numberList.get(0)<=2)
			{
				if(numberList.get(1)<=4)
				{
					if(numberList.get(2)<=5)
					{
						if(numberList.get(3)<=9)
						{
							for (int i = 0; i < numberList.size(); i++) {
							     
							   
							}
				        }  
							System.out.println("Zegar" + numberList);
						}
						else 
						{
							System.out.println("To nie jest zegar");
						}
					}
					else 
					{
						System.out.println("To nie jest zegar");
					}
				}
				else 
				{
					System.out.println("To nie jest zegar");
				}
			}
			else
			{
				System.out.println("To nie jest zegar");
			}
			return numberList;
		}
}