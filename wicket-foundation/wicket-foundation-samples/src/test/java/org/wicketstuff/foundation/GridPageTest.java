package org.wicketstuff.foundation;

import org.junit.jupiter.api.Test;
import org.wicketstuff.foundation.GridPage;

public class GridPageTest extends AbstractPageTest {

	@Test
	public void test() {
		tester.startPage(GridPage.class);
		tester.assertRenderedPage(GridPage.class);
	}

}
