/*
 Print the sum of the first n terms in the geometric series with ratio r
 Math note: the geometric series converges to 1/(1-r) for 0 <= r < 1
 */
public class GeometricSeriesSum {
	public static void main (String[] args) {
		int n = 1000;
		double r = 0.5; //ratio
		double sum = 1;
		for (int i=1; i<=n; ++i) {
			sum += r;
			r *= r; 	//optimisation: instead of computing r^i, update r at each iteration of the cycle
		}
	System.out.println(sum);
	}
}