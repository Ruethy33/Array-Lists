import java.util.ArrayList;

public class ArrayListPractices
	{
		static 	ArrayList <Double> myArray = new ArrayList<Double>();
		public static void main(String[] args)
			{
			doAddDoubles();
			doSumDoubles();
			doAverageDoubles();
			}
		
		public static void doAddDoubles()
			{
			myArray.add(4.5);
			myArray.add(1.6);
			myArray.add(1.5);
			myArray.add(2.8);
			myArray.add(9.3);
			
			for( int i = 0; i < myArray.size(); i++)
				{
				System.out.println(myArray.get(i));
				}
			}
		
		public static void doSumDoubles()
		{
		double sum = 0;
		for (int i = 0; i < myArray.size(); i++)
			{
			sum = sum + myArray.get(i);
			}
		System.out.println(sum);
		}
		
		public static void doAverageDoubles()
		{
		myArray.remove("firstItem");
		myArray.add(6.7);
		myArray.add(4.1);
		
		double sum = 0;
		for (int i = 0; i < myArray.size(); i++)
			{
			sum = sum + myArray.get(i);
			}
		System.out.println(sum/myArray.size());
		}
		
	}
