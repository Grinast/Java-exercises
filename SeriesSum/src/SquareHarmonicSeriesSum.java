/*
 Print the sum of the first n terms in the square harmonic series (sum of the reciprocal of the first n squares)
 Math note: the square harmonic series converges to pi^2/6
 */
public class SquareHarmonicSeriesSum {
	public static void main (String[] args) {
		int n = 1000;
		double sum = 0;
		for (int i=1; i<=n; ++i) {
			//Casting to double is required here. If not, 1/i is of type int/int = int so it is truncated to 0
			//sum += (double) 1/i; 	
			
			//Alternatively
			sum += 1.0/(i*i);	
			}
	System.out.println(sum);
	}
}

