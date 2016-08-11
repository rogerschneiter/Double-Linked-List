package JRCollection;

import org.junit.Assert;
import org.junit.Before;

import org.junit.Test;


public class JRLinkJUnitTest {

	static final String[] TEXTS = { "this", "are", "some", "test", "strings" };
	JRCollection list = null;
	
	
	@Before  
	public void runBeforeEveryTest() {  
		this.list = new JRList();  
	}  	
	
	
	@Test (expected = NullPointerException.class)
	public void addNullPointerException() {
		this.list.add(null);
	}

	
	@Test
	public void add() {
		for (String text : TEXTS) {
			this.list.add(text);
		}
		Assert.assertEquals(Boolean.FALSE, this.list.isEmpty());
	}

	@Test
	public void addByIndexOutOfBoundsException() {

		try {
			this.list.add(-1, TEXTS[0]);
			Assert.assertTrue(false);
		} catch (IndexOutOfBoundsException e) {
			Assert.assertTrue(true);
		}

		try {
			this.list.add(1, TEXTS[0]);
			Assert.assertTrue(false);
		} catch (IndexOutOfBoundsException e) {
			Assert.assertTrue(true);
		}
		
		for (String text : TEXTS) {
			this.list.add(text);
		}

		try {
			this.list.add(TEXTS.length+1, TEXTS[0]);
			Assert.assertTrue(false);
		} catch (IndexOutOfBoundsException e) {
			Assert.assertTrue(true);
		}
	}

	@Test
	public void addByIndexFirst() {
		this.list.add(0, TEXTS[0]);
		this.list.add(0,TEXTS[1]);
		
		Assert.assertEquals(TEXTS[0], this.list.get(1));
		Assert.assertEquals(TEXTS[1], this.list.get(0));
	}

	@Test
	public void addByIndexArbitary() {
		this.list.add(0, TEXTS[0]);
		this.list.add(1,TEXTS[2]);
		this.list.add(1,TEXTS[1]);

		for (int i=0; i<3; i++) {
			Assert.assertEquals(TEXTS[i], this.list.get(i));
		}
	}
	
	@Test
	public void addByIndexLast() {

		for(int i=0; i<TEXTS.length; i++) {
			this.list.add(i, TEXTS[i]);
		}
		
		Assert.assertEquals(Boolean.FALSE, this.list.isEmpty());

		for (int i=0; i< TEXTS.length; i++) {
			String data = this.list.get(i);
			Assert.assertEquals(TEXTS[i], data);
		}
	}
	
	
	@Test 
	public void getIndexOutOfBounds() {
		try {
			this.list.get(-1);
			Assert.assertTrue(false);
		} catch (IndexOutOfBoundsException e) {
			Assert.assertTrue(true);
		}
		
		try {
			this.list.get(0);
			Assert.assertTrue(false);
		} catch (IndexOutOfBoundsException e) {
			Assert.assertTrue(true);
		}

		for (String text : TEXTS) {
			this.list.add(text);
		}

		try {
			this.list.get(TEXTS.length);
			Assert.assertTrue(false);
		} catch (IndexOutOfBoundsException e) {
			Assert.assertTrue(true);
		}
	}

	
	@Test
	public void get() {

		for (String text : TEXTS) {
			this.list.add(text);
		}

		for (int i=0; i< TEXTS.length; i++) {
			String data = this.list.get(i);
			Assert.assertEquals(TEXTS[i], data);
		}
	}

	@Test
	public void isEmpty() {
		Assert.assertTrue(this.list.isEmpty());
		this.list.add(TEXTS[0]);
		Assert.assertFalse(this.list.isEmpty());
	}
	
	@Test 
	public void removeIndexOutOfBounds() {
		try {
			this.list.remove(-1);
			Assert.assertTrue(false);
		} catch (IndexOutOfBoundsException e) {
			Assert.assertTrue(true);
		}
		
		try {
			this.list.remove(0);
			Assert.assertTrue(false);
		} catch (IndexOutOfBoundsException e) {
			Assert.assertTrue(true);
		}

		for (String text : TEXTS) {
			this.list.add(text);
		}

		try {
			this.list.remove(TEXTS.length);
			Assert.assertTrue(false);
		} catch (IndexOutOfBoundsException e) {
			Assert.assertTrue(true);
		}
	}

	@Test
	public void removeFirst() {
		this.list.add(0,TEXTS[0]);
		this.list.add(1,TEXTS[1]);

		this.list.remove(0);
		Assert.assertEquals(1, this.list.size());
		Assert.assertEquals(TEXTS[1], this.list.get(0));

		this.list.remove(0);
		Assert.assertEquals(0, this.list.size());
	}
	
	@Test
	public void removeArbitary() {

		for (int i=0; i<3; i++) {
			this.list.add(i, TEXTS[i]);
		}

		this.list.remove(1);

		Assert.assertEquals(TEXTS[0], this.list.get(0));
		Assert.assertEquals(TEXTS[2], this.list.get(1));
	}
	
	@Test
	public void removeLast() {
		this.list.add(0,TEXTS[0]);
		this.list.add(1,TEXTS[1]);

		this.list.remove(1);
		Assert.assertEquals(1, this.list.size());
		Assert.assertEquals(TEXTS[0], this.list.get(0));

		this.list.remove(0);
		Assert.assertEquals(0, this.list.size());
		
	}
	
	@Test
	public void size() {
		for (String text : TEXTS) {
			this.list.add(text);
		}
		Assert.assertEquals(TEXTS.length, this.list.size());
	}
	

} // end
