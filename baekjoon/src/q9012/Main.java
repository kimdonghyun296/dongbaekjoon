package q9012;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s;
      boolean b;
      for (int i=0,c1,c2; i < n; i++) {
         s = sc.next();
         c1 = c2 = 0;
         b = true;
         for (int k = 0; k < s.length(); k++) {
            if (s.charAt(k) == '(') c1++;
            else if (s.charAt(k) == ')') c2++;
            if (c2 > c1) {
               b = false;
               break;
            }
         }
         if (b != false && c1 == c2) System.out.println("YES");
         else System.out.println("NO");
         }
      sc.close();
   }
}
