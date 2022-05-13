import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BoccoJacopoTest_A {

	@Test
	void test1() 
	{
		BoccoJacopoClass b =new BoccoJacopoClass();
		int risAtteso=336;
		int risOttenuto=b.boccoMet(2, 5);
		assertEquals(risAtteso, risOttenuto);
	}
	
	@Test
	void test2() 
	{
		BoccoJacopoClass b =new BoccoJacopoClass();
		int risAtteso=24;
		int risOttenuto=b.boccoMet(1, 3);
		assertEquals(risAtteso, risOttenuto);
	}
	
	@Test
	void test3() 
	{
		BoccoJacopoClass b =new BoccoJacopoClass();
		int risAtteso=360;
		int risOttenuto=b.boccoMet(5, 7);
		assertEquals(risAtteso, risOttenuto);
	}

}
