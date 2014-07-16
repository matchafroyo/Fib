import java.io.*;

public class Store {
	
	private final FibCalc fibCalc;
	static int MAX_ARRAY_SIZE = 100;
	private int[] fibStore = new int[MAX_ARRAY_SIZE];

	public static void main(String[] args) {
		// let's first test that the arguments we're taking are integral inputs
		final int[] convertedInputs = parseInt(args);
		
		for (int i = 0 ; i < convertedInputs.length; i++){
			fibStore[i] = fibCalc.fib(convertedInputs[i]);
			System.out.println(convertedInputs[i] + " " + fibStore[i]);
		}	
	}
	
	private int[] parseInt(String[] args) {
		if (args.length <= 0) {
			System.err.println("Not enough arguments. Please retry.");
			System.exit(-1);
		}
		
		final int[] argsToInt = new int[args.length];
	
		for (String s: args) {
    			try {
        			argsToInt.append(Integer.parseInt(args[0]));
    			} catch (NumberFormatException e) {
        			System.err.println("Argument" + args[0] + " must be an integer.");
        			System.exit(-1); // we can also comment this line out, to just skip nonvalid inputs
    			}
		}
	}	
	
	
}
