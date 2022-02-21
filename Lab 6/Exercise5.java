import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise5

{
    public static int getSecondSmallest(Integer[] arr)
      {
    	
    	List<Integer> secsmall=Arrays.asList(arr); 
    	Collections.sort(secsmall);
    	int smallest= secsmall.get(1);
    	return smallest;
    	  
      }

    public static void main(String[] args) {


          Integer[] arr={10,35,43,56,12};
    int smallest=getSecondSmallest(arr);
    System.out.println("Second Smallest element:"+smallest);
    }
	}