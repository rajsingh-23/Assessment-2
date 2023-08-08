package demo1;

import java.util.Scanner;

public class Question08082302 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N == 1) {
			System.out.println(validate(false));
			return;
		}
		int K = sc.nextInt();
		if(K ==1) {
			System.out.println(validate(false));
			return;
		}
		String[] s = new String[N];
		for(int i=0;i<N;i++) {
			s[i] = sc.next();
		}
		String o = sc.next();
		boolean flag = false;
		int o1=0;
		int o2=0;
		for(int i=0;i<N-1;i++) {
			String s1,s2;
			s1 = s[i];
			s2 = s[i+1];
			char c1,c2;
			c1 = s1.charAt(0);
			c2 = s2.charAt(0);
			for(int ii=0;ii<K;ii++) {
				if(o.charAt(ii) == c1) {
					o1 = ii;
				}
			}
			for(int iii=0;iii<K;iii++) {
				if(o.charAt(iii) == c2) {
					o2 = iii;
				}
			}
			if(o1 > o2) {
				flag = true;
				break;
			}
		}
		System.out.println(validate(flag));
	}

	private static int validate(boolean flag) {
		if(flag == true) {
			return 0;
		}else {
			return 1;
		}
		
	}

}
