package stringsEasy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SplitStringBalancedStrings {
	public int balancedStringSplit(String s) {
		int count = 0;
		int sum = 0;
		for (final char c : s.toCharArray()) {
			if (c == 'L') {
				sum += 1;
			} else {
				sum += -1;
			}
			if (sum == 0) {
				count += 1;
			}
		}
		return count;
	}

	@Test
	public void test() {
		final String s1 = "RLRRRLLRLL";
		Assert.assertEquals(balancedStringSplit(s1), 2);

		final String s2 = "LLLLRRRR";
		Assert.assertEquals(balancedStringSplit(s2), 1);
	}
}
