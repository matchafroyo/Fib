
public class FibCalc{
	public int fib(int nth) {
		int x = 0;
		int y = 1;
		for (int n=0; n<nth; n++){
			int newy = x + y;
			x = y;
			y = newy;
		}
		return y;

	}
	
	
	public int fibRecursive(int n)  {
    		if (n == 0) {
        		return 0;
    		}
	    	else if (n == 1) {
	      		return 1;
	    	}
	   	else {
	   		return fibRecursive(n - 1) + fibRecursive(n - 2);
	   	}
	}

}
