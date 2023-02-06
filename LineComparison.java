package com.linecomparison;

import java.util.Scanner;

public class LineComparison {


		  public static double length1,length2,length;
		  static int x1,y1,x2,y2,value,count;
		  
		  //To give input of line Coordinates
		  public void coordinates()
		  {
			  Scanner sc = new Scanner(System.in);
			  count++;
			  System.out.println("Enter coordinate of Line " + count + "\nx1,y1,x2,y2");
			  int x1 =sc.nextInt();
			  int y1 =sc.nextInt();
			  int x2 =sc.nextInt();
			  int y2 =sc.nextInt();
			  System.out.println("Points Entered for Line " + count);
			  System.out.println("The Points x1= "+x1);
			  System.out.println("The Points y1= "+y1);
			  System.out.println("The Points x2= "+x2);
			  System.out.println("The Points y2= "+y2);
			  System.out.println(" ");
			  
			  length = (double) Math.sqrt(Math.pow ((x2-x1),2) + Math.pow((y2-y1),2));
			  
		  }
		  
		  //To calculate length
		  public void lineLength()
		  {
			  coordinates();
			  length1=length;
			  System.out.println(" ");
			  System.out.println("The Length of Line1 is = "+length1);
			  System.out.println("The Length of Line2 is = "+length2);		  
			  
		  }
		  
		  //To compare both line length
		  public void Comparing()

		  {
			  value = Double.compare(length1, length2);
			  if (value==0)
				  System.out.println("The Lines are Equal ");
			  else if (value > 1)
				  System.out.println("The Line1 is Greater than Line 2 =");
			  else
				  System.out.println("The Line 2 is Greater than Line 1=");

		  }
	}


