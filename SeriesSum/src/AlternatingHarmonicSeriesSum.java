/*
	 Print the sum of the first n terms in the alternating harmonic series
	 Math note: the alternating harmonic series converges to ln2
 */
public class AlternatingHarmonicSeriesSum {
	public static void main (String[] args) {
		int n = 1000;
		double sum = 0;
		for (int i=1; i<=n; ++i) {
			if(i % 2 == 1) { sum += 1.0/i; }
			else { sum -= 1.0/i; }
		}
		System.out.println(sum);
	}
}
