import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test; //viene importata la liberia per il Before

class BoccoJacopoTest_B 
{
	static BoccoJacopoClass b;


	@Before
	static void setUpBeforeClass() throws Exception 
	{
		b = new BoccoJacopoClass(); //la classe test viene ottimizzata con l'inserimento di @before che inizializza l'oggetto prima dell'inizio di ogni test
		
	}

	@Test
	void test1() 
	{
		int risAtteso=336;
		int risOttenuto=b.boccoMet(2, 5);
		assertEquals(risAtteso, risOttenuto);
	}
	
	@Test
	void test2() 
	{
		int risAtteso=24;
		int risOttenuto=b.boccoMet(1, 3);
		assertEquals(risAtteso, risOttenuto);
	}
	
	@Test
	void test3() 
	{
		int risAtteso=360;
		int risOttenuto=b.boccoMet(5, 7);
		assertEquals(risAtteso, risOttenuto);
	}

}
