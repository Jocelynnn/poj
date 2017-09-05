import java.io.*;
import java.util.*;
public class p3030
{
            public static void main(String args[]) throws Exception
            {
                    Scanner cin=new Scanner(System.in);
                    int cases = cin.nextInt();
                    for(int i = 0; i < cases; i++) {
                    	int r = cin.nextInt();
                        int e = cin.nextInt();
                        int c = cin.nextInt();
                        if (r + c == e) {
                            System.out.println("does not matter");
                        } else if (r + c < e) {
                            System.out.println("advertise");
                        } else {
                            System.out.println("do not advertise");
                        }
                    }
            }
            
}