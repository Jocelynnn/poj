import java.io.*;
import java.util.*;
public class Main
{
            public static void main(String args[]) throws Exception
            {
                    Scanner cin=new Scanner(System.in);
                    double d = 0;
                    for (int i = 0; i < 12; i++) {
                         d +=cin.nextDouble();
                    }
                    System.out.printf("$%.2f\n", d/12.0);
            }
            
}