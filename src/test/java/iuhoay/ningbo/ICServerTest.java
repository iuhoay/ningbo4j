package iuhoay.ningbo;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author wuyaohui
 *
 */
public class ICServerTest {

	/**
	 * Test method for {@link iuhoay.ningbo.ICServer#getCurrentMoney(java.lang.String)}.
	 */
	@Test
	public void testGetCurrentMoney() {
		ICServer server = new ICServer();
		System.out.println(server.getCurrentMoney("89599331"));
		
		assertEquals(server.getCurrentMoney("0"), ICServer.MESSAGE_NO_RESULT);
	}

}
