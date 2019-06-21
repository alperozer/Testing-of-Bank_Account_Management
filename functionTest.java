import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class functionTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	private String nameOutput;
	private int output;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
		void test() {
			Account test1 = new Account();
			nameOutput = test1.getName();
			assertEquals(null , nameOutput);
				
			Account test2 = new Account();
			output = test2.getAccNumber();
			assertEquals( -1, output);
			
			Account test3 = new Account();
			output = test3.getBalance();
			assertEquals( 0, output);
			
					
			
			Account test4 = new Account("name1",1,1000);
			nameOutput = test4.getName();
			assertEquals( "name1", nameOutput);
			
			Account test5 = new Account(null,1,1000);
			output = test5.getAccNumber();
			assertEquals( 1, output);
			
			
			Account test6 = new Account(null,1,1000);
			output = test6.getBalance();
			assertEquals( 1000, output);
			
			Account test7 = new Account();
			output = test7.depositMoney(100);
			assertEquals(100 , output);
			
			
			Account test8 = new Account(null,1,1000);
			output = test8.depositMoney(100);
			assertEquals(1100 , output);
			
			Account test9 = new Account();
			output = test9.depositMoney(0);
			assertEquals(0 , output);
			
					
			Account test10 = new Account(null,1,1000);
			output = test10.depositMoney(-1);
			assertEquals(1000 , output);
			
			Account test11 = new Account(null,1,1000);
			output = test11.withdrawMoney(100);
			assertEquals(900 , output);
			
			Account test12 = new Account(null,1,1000);
			output = test12.withdrawMoney(0);
			assertEquals(1000 , output);
			
			Account test13 = new Account(null,1,1000);
			output = test13.withdrawMoney(-1);
			assertEquals(1000 , output);
			
						
	}
	
}


