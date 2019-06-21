
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class ArrayListTest {

	private List<String> accountlist;
	
	@Before
	public void setUp(){
		accountlist = new ArrayList<String>();
	}
	
	@Test
	public void testListInit(){
		assertTrue(accountlist.isEmpty());
		assertTrue(accountlist.size() == 0);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testInvalidCapacity(){
		accountlist = new ArrayList<String>(-1);
	}
	
	@Test
	public void testAddElements(){
		accountlist.add(0, "name1");
		accountlist.add(1, "name2");
		accountlist.add(2, "name3");
		
		assertEquals("name1", accountlist.get(0));
		assertEquals("name2", accountlist.get(1));
		assertEquals("name3", accountlist.get(2));
		
		accountlist.add(1, "name4");
		
		assertEquals("name1", accountlist.get(0));
		assertEquals("name4", accountlist.get(1));
		assertEquals("name2", accountlist.get(2));
		assertEquals("name3", accountlist.get(3));	
		
		assertTrue(accountlist.size()==4);
	}
	
	
		
	@Test
	public void testSetElement(){
		accountlist.add(0, "name1");
		accountlist.add(1, "name2");
		accountlist.add(2, "name3");
		
		accountlist.set(1, "name5");
		
		assertEquals("name1", accountlist.get(0));
		assertEquals("name5", accountlist.get(1));
		assertEquals("name3", accountlist.get(2));
	}
	
	@Test
	public void testRemoveElement(){
		accountlist.add(0, "name1");
		accountlist.add(1, "name2");
		accountlist.add(2, "name3");
		
		assertEquals("name3", accountlist.remove(2));
		assertTrue(accountlist.size() == 2);
	}
	
	@Test (expected = IndexOutOfBoundsException.class)
	public void testRemoveWithEmptyList(){
		accountlist.remove(0);
	}
	
	/*@Test (expected = NullPointerException.class)
	public void testAddElementNull(){
		accountlist.add(0, null);
	}*/

}