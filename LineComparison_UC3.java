package Day3Assignment;

import java.util.Scanner;

public class LineComparison_UC3 {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program ");
		Scanner sc = new Scanner (System.in);
		System.out.println("First Line co-ordinates ");
		int x1=sc.nextInt();
		int x2=sc.nextInt();
		int y1=sc.nextInt();
		int y2=sc.nextInt();
		System.out.println("Second Line co-ordinates ");
		int x3=sc.nextInt();
		int x4=sc.nextInt();
		int y3=sc.nextInt();
		int y4=sc.nextInt();
		double lengthofLine1 =(int)Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		double lengthofLine2 =(int)Math.sqrt(Math.pow((x4-x3),2)+Math.pow((y4-y3),2));
		Integer obj1=new Integer ((int)lengthofLine1);
	    Integer obj2=new Integer ((int)lengthofLine2);
	    
	    System.out.println("The points x1="+x1);
	    System.out.println("The points x2="+x2);
	    System.out.println("The points y1="+y1);
	    System.out.println("The points y2="+y2);
	    System.out.println("The points x3="+x3);
	    System.out.println("The points x4="+x4);
	    System.out.println("The points y3="+y3);
	    System.out.println("The points y4="+y4);
	    
	    System.out.println("Length of Line1="+lengthofLine1);
	    System.out.println("Length of Line2="+lengthofLine2);
	    
	    System.out.println("Line1 and Line2 are Equal :="+obj1.equals(obj2));
	    
	    System.out.println("Comparing 2 Lines :="+obj1.compareTo(obj2));
	    
	    if(obj1.compareTo(obj2)==0)
	    {
	    	System.out.println("Two Line are Equals");
	    }
	    else if(obj1.compareTo(obj2) > 0)
	    	System.out.println("Line 1 is greater than Line 2");
	    else
	    	System.out.println("Line 1 is less than Line 2");
	}

}
