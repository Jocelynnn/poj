import java.io.*;
import java.util.*;
public class p1477
{
            public static void main(String args[]) throws Exception
            {
                    Scanner cin=new Scanner(System.in);
                    int numofSet = 0;
                    while(cin.hasNext()) {
                    	int numOfStacks = cin.nextInt();
                    	if (numOfStacks == 0) {
                    		break;
                    	}
                    	numofSet++;
                    	int[] stacks = new int[numOfStacks];
                    	int sum = 0;
                    	for (int i = 0; i < numOfStacks; i++) {
                    		stacks[i] = cin.nextInt();
                    		sum += stacks[i];
                    	}
                    	int avg = sum / numOfStacks;
                    	int steps = 0;
                    	for (int i = 0; i < numOfStacks; i++) {
                    		if (stacks[i] > avg) {
                    			steps += stacks[i] - avg;
                    		}
                    	}
                    	System.out.println("Set #"+numofSet);
            			System.out.println("The minimum number of moves is "+steps+".");
            			System.out.println();
                    }
            }
            
}