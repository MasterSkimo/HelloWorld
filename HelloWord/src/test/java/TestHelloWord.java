import junit.framework.Assert;

import org.junit.Test;

public class TestHelloWord {
	
	@Test
	public void HelloWordTest(){
		Assert.assertEquals("Hello Word", Hello.HelloWord());
	}
}
