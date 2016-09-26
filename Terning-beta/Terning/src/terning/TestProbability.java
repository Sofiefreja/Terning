package terning;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestProbability {

	@Test
	public void test() {
		Dice cup = new Dice();
		
		int et=0,to=0,tre=0,fire=0,fem=0,seks=0;
		
		for (int i=0; i<10000;i++){
			int n=cup.roll();
			switch(n){
			case 1:
				et++;
				break;
			case 2:
				to++;
				break;
			case 3:
				tre++;
				break;
			case 4:
				fire++;
				break;
			case 5:
				fem++;
				break;
			case 6:
				seks++;
				break;
			}
		}
		System.out.println(et);
		System.out.println(to);
		System.out.println(tre);
		System.out.println(fire);
		System.out.println(fem);
		System.out.println(seks);
	}
}
