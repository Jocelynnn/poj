import java.io.*;
import java.util.*;
public class p1012
{
            public static void main(String args[]) throws Exception
            {
                    Scanner cin=new Scanner(System.in);
                    while (cin.hasNext()) {
                        int k = Integer.valueOf(cin.nextLine());
                        if (k == 0) {
                            break;
                        }
                        String[] array = new String[count];
                        for (int i = 0; i < count; i++) {
                            array[i] = cin.nextLine();
                        }
                        System.out.println(maxStep(array));
                    }
            }
            private int getMininumM(int k) {
                
            }
            
}