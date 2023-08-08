package demo1;

interface AdvanceArthematic{
	int divisor_sum(int n);
}

final class MyCalculator implements AdvanceArthematic{
	public int divisor_sum(int n) {
		int sumation = 0;
		for(int i=1;i<=n;i++) {
			if(n%i == 0) {
				sumation = sumation + i;
			}
		}
		return sumation;
	}
}

public class Question08082301 {

	public static void main(String[] args) {
		MyCalculator obj = new MyCalculator();
		System.out.println(obj.divisor_sum(6));

	}

}
