public class T {
 public static void main(String[] args) {
 
 int a = Integer.parseInt(args[0]);
 int b = Integer.parseInt(args[1]);
 int gcd = gcd(a, b);
 int temp;
 System.out.println(gcd);
 }
 

 public static int gcd(int a, int b) {
 while(b != 0) {
  int temp = a%b;
  a = b;
  b = temp;
 }
 return a;
 }
 
}