package org.wicketstuff.foundation;

import org.junit.jupiter.api.Test;
import org.wicketstuff.foundation.DropdownButtonsPage;

public class DropdownButtonPageTest extends AbstractPageTest {

	@Test
	public void test() {
		tester.startPage(DropdownButtonsPage.class);
		tester.assertRenderedPage(DropdownButtonsPage.class);
	}
}
