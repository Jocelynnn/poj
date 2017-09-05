import java.io.*;
import java.util.*;
public class p3096
{
            public static void main(String args[]) throws Exception
            {
                    Scanner cin=new Scanner(System.in);
                    while (cin.hasNext()) {
                        String line = cin.nextLine();
                        if (line.equals("*")) {
                            break;
                        }
                        if (isSurprising(line)) {
                            System.out.println(line + " is surprising.");
                        } else {
                            System.out.println(line + " is NOT surprising.");
                        }
                    }
            }
            private static boolean isSurprising(String line) {
                if (line == null || line.length() < 3) {
                    return true;
                }
                int len = line.length();
                for (int dis = 1; dis < len; dis++) {
                    for (int i = 0; i + dis < len; i++) {
                        for (int j = i + 1; j + dis < len; j++) {
                            if (line.charAt(i) == line.charAt(j) && line.charAt(i + dis) == line.charAt(j + dis)) {
                                return false;
                            }
                        }
                    }
                }
                return true;
            }
            
}