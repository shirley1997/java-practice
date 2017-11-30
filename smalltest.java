public class smalltest{
 final int N = 100;
 double[] b = new double[N]; 
for (int i = 0; i < N/2; i++) {
double temp = b[i];
b[i] = b[N-1-i];
b[N-1-i] = temp;
System.out.println(b[i]);
}


}