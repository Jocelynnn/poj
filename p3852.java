import java.io.*;
import java.util.*;
public class p3852
{
            public static void main(String args[]) throws Exception
            {
                    Scanner cin=new Scanner(System.in);
                    while (cin.hasNext()) {
                        int count = Integer.valueOf(cin.nextLine());
                        if (count == 0) {
                            break;
                        }
                        String[] array = new String[count];
                        for (int i = 0; i < count; i++) {
                            array[i] = cin.nextLine();
                        }
                        System.out.println(maxStep(array));
                    }
            }
            private static int maxStep(String[] array) {
                int step = 0;
                HashSet<String> set = new HashSet();
                while(true){
                    step++;
                    set.clear();
                    for (int i = 0; i < array.length; i++) {
                        String s = array[i];
                        if (s.length() == 1 || set.contains(s.substring(1))) {
                            return step - 1;
                        }
                        array[i] = s.substring(1);
                        set.add(s.substring(1));
                    }
                }
            }                
            
            
}