package com.test;
 
import java.util.Date;
import org.junit.Assert;
import org.junit.Test;

import com.hw.Directory;

public class FSElementTest {

	@Test
	public void directoryTest(){
		Directory d1 = new Directory("Dir1", "admin", new Date(), new Date(), 0);

		
		String expectedName = "Dir1";
		String actualName = d1.getName();
		String expectedOwner = "admin";
		String actualOwner = d1.getOwner();
		
		Assert.assertEquals(expectedName, actualName);
		Assert.assertEquals(expectedOwner, actualOwner);
		Assert.assertNotNull(d1.getCreatedDate());
		Assert.assertNotNull(d1.getLastModified());
		Assert.assertSame(true, d1 instanceof Directory);
	}
	
	
}
