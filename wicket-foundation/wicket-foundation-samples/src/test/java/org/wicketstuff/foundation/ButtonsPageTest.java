package org.wicketstuff.foundation;

import org.junit.jupiter.api.Test;
import org.wicketstuff.foundation.ButtonsPage;

public class ButtonsPageTest extends AbstractPageTest {

	@Test
	public void test() {
		tester.startPage(ButtonsPage.class);
		tester.assertRenderedPage(ButtonsPage.class);
	}

}
