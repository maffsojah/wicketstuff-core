package org.wicketstuff.foundation;

import org.junit.jupiter.api.Test;
import org.wicketstuff.foundation.RevealModalPage;

public class RevealModalPageTest extends AbstractPageTest {

	@Test
	public void test() {
		tester.startPage(RevealModalPage.class);
		tester.assertRenderedPage(RevealModalPage.class);
	}
}
