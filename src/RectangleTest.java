import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RectangleTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		String line = "i\t17\t100\t100\t255\t0\t0\t40\t50";
		String[] parts = line.split("\t");
		Rectangle r = new Rectangle(parts);
		assertEquals(17,r.getID());
	}

}
