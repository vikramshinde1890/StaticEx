package com.staticex.I;

public class B {
	public static void main(String[] args) {
		A aa=new A();
		aa.a++;
		aa.b++;
		System.out.println(aa.a);
		System.out.println(aa.b);
		A aa1=new A();
		aa1.a++;
		aa1.b++;
		System.out.println(aa1.a);
		System.out.println(aa1.b);
	}

}

/*o/p- 11
	   11
	   11
	   12*/
