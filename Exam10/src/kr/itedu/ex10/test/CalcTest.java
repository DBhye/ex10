package kr.itedu.ex10.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import kr.itedu.ex10.Calc;

class CalcTest {

	@Test
	void test() {
		int n1 = 2;
		int n2 = 3;
		
		assertEquals(n1 + n2 , Calc.sum(n1,n2));
	}

}
