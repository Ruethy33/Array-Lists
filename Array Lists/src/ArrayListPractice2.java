import java.util.ArrayList;

public class ArrayListPractice2
	{
		static 	ArrayList <Double> myArray = new ArrayList<Double>();
		
		public static void main(String[] args)
			{
			doAddDoubles();
			doPrintFevers();
			doConvertArrayList();
			doRemoveFevers();
			doPrintHighestAndLowest();
			}
		
		public static void doAddDoubles()
		{
		myArray.add(99.7);
		myArray.add(95.7);
		myArray.add(98.7);
		myArray.add(96.3);
		myArray.add(94.6);
		myArray.add(100.2);
		myArray.add(95.5);
		myArray.add(97.6);
		myArray.add(99.4);
		myArray.add(96.2);
		
		for( int i = 0; i < myArray.size(); i++)
			{
			System.out.println(myArray.get(i) + " degrees Fahrenheit");
			}

		}
		
		public static void doPrintFevers()
		{
		for(int i = 0; i < myArray.size(); i++)
			{
			if(myArray.get(i) > 98.6)
				{
				System.out.println("The person with a fever of " + myArray.get(i) + " has a fever and should go home.");
				}
			}
		}
		
		public static void doConvertArrayList()
			{
			for(int i = 0; i < myArray.size(); i++)
				{
				System.out.println((myArray.get(i) - 32)/1.8 + " degrees Celcius");
				}
			}
		
		public static void doRemoveFevers()
		{
		for(int i = myArray.size() - 1; i >= 0; i--)
			{
			if(myArray.get(i) > 98.6)
				{
				myArray.remove(i);
				}
			else
				{
				System.out.println("The person with the temperature of " + myArray.get(i) + " is healthy. Yay!");
				}
			}
		}
		
		public static void doPrintHighestAndLowest()
		{
		double biggestNumber = myArray.get(0);
		for(int i = 0; i < myArray.size(); i++)
			{
			if(myArray.get(i) > biggestNumber)
				{
				biggestNumber = myArray.get(i);
				}
			}
		System.out.println(biggestNumber + " is the highest temperature");
		
		double smallestNumber = myArray.get(0);
		for(int i = 0; i < myArray.size(); i++)
			{
			if(myArray.get(i) < smallestNumber)
				{
				smallestNumber = myArray.get(i);
				}
			}
		System.out.println(smallestNumber + " is the loest temperature");
		}
		
	}
