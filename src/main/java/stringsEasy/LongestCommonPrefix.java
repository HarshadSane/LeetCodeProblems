package stringsEasy;

/* 14. Longest Common Prefix */
import org.testng.Assert;
import org.testng.annotations.Test;

public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}
		for (int i = 0; i < strs[0].length(); i++) {
			final char c = strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++) {
				if (i == strs[j].length() || strs[j].charAt(i) != c) {
					return strs[0].substring(0, i);
				}
			}
		}
		return strs[0];
	}

	@Test
	public void test() {
		final String[] s1 = { "aa", "a" };
		Assert.assertEquals(longestCommonPrefix(s1), "a");

		final String[] s2 = { "dog", "racecar", "car" };
		Assert.assertEquals(longestCommonPrefix(s2), "");

		final String[] s3 = { "flower", "flow", "flight" };
		Assert.assertEquals(longestCommonPrefix(s3), "fl");
	}
}
