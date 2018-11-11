package org.wicketstuff.foundation;

import org.junit.jupiter.api.Test;
import org.wicketstuff.foundation.VisibilityPage;

public class VisibilityPageTest extends AbstractPageTest {

	@Test
	public void test() {
		tester.startPage(VisibilityPage.class);
		tester.assertRenderedPage(VisibilityPage.class);
	}

}
