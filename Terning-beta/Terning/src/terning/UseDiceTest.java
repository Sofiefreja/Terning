package terning;

import static org.junit.Assert.*;

import org.junit.Test;

public class UseDiceTest {

	@Test
	public void test() {
		Dice cup = new Dice();
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int deft = 0;
		
		for(int i = 0; i < 1000; i++) {
		int n = cup.roll();
			switch(n) {
				case 1: 
					one++;
					break;
				case 2: 
					two++;
					break;
				case 3:
					three++;
					break;
				case 4:
					four++;
					break;
				case 5:
					five++;
					break;
				case 6:
					six++;
					break;
				default:
					deft++;
		}
		}
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);
		System.out.println(six);
		System.out.println(deft);
	}

}
