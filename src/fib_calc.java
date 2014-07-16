
public class fib_calc {
	public static int fib(int nth) {
		int x = 0;
		int y = 1;
		for (int n=0; n<nth; n++){
			int newy = x + y;
			x = y;
			y = newy;
		}
		return y;

	}

}
