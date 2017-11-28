import java.util.ArrayList;
import java.util.Collections;

public class Sort {

	public static void main(String[] args) {
		
		//taking few random numbers for sorting
		int[] numList = {1,12,33,37,44,55,65,69,76};
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i : numList){
        al.add(i);		
		}
		System.out.println(al);
		long startTime = System.currentTimeMillis();
		Collections.sort(al);
		
		long endTime = System.currentTimeMillis();
		long elapsedTime = endTime - startTime;
		System.out.println("Sorted order is "+al);
		System.out.println("time taken to execute is "+elapsedTime);
		
		   Integer list2[] = new Integer[al.size()];
		   list2 = al.toArray(list2);
		   
		   //to check how many numbers have shifted places while being sorted
		   int counter = 0;
		  
		   for(int i=0;i <al.size(); i++){
			   
			   if(numList[i]!=list2[i])
				   counter++;	   
		   } 
		   
		   System.out.println("Total numbers that shifted places are "+counter);
		   
	}		
		
	}


