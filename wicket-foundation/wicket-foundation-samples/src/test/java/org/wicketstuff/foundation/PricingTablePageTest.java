package org.wicketstuff.foundation;

import org.junit.jupiter.api.Test;
import org.wicketstuff.foundation.PricingTablePage;

public class PricingTablePageTest extends AbstractPageTest {

	@Test
	public void test() {
		tester.startPage(PricingTablePage.class);
		tester.assertRenderedPage(PricingTablePage.class);
	}
}
