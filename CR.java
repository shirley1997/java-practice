import java.util.*;  
public class CR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);  
		int a,b,c; //represent 28*33*k1,23*33*k2,23*28*k3
		int p,e,i,d;
		int k,days,count = 1;
		
		for(k=1; (28*33*k)%23 != 1;k++);
		a = 28*33*k;
		for(k=1; (23*33*k)%28 != 1;k++);
		b = 23*33*k;
		for(k=1; (23*28*k)%33 != 1;k++);
		c = 23*28*k;
		
		while(s.hasNext()) {
			p = s.nextInt();
			i = s.nextInt();
			e = s.nextInt();
			d = s.nextInt();
			
			if(p ==-1 && i ==-1 && e==-1 && d==-1)
				break;
			days = (a*p+b*i+c*e)%21252 - d;
			if(days <=0)
				days = days + 21252;
			System.out.println("Case" + count + ": the next triple peak occurs in "+ days +" days.");
			count++;
			//s.close();
			
			
			
		}
	}

}
