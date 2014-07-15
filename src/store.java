import java.io.*;

public class store {

	public static void main(String[] args) {
		int nth = 10;
		int[] fibstore = new int[nth];
		for (int n=0; n<nth; n++){
			fibstore[n]=fib_calc.fib(n);
			System.out.println(n + " " +fibstore[n]);
		}	
	}
}
