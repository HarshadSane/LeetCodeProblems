package stringsEasy;

/* 1309. Decrypt String from Alphabet to Integer Mapping */
import org.testng.Assert;
import org.testng.annotations.Test;

public class ImplementStrStr {

	public int strStr(String haystack, String needle) {
		if (needle == null || needle.isEmpty()) {
			return 0;
		}
		final int L = needle.length(), n = haystack.length();
		int pn = 0;
		while (pn < n - L + 1) {
			// find the position of the first needle character
			// in the haystack string
			while (pn < n - L + 1 && haystack.charAt(pn) != needle.charAt(0)) {
				++pn;
			}

			// compute the max match string
			int currLen = 0, pL = 0;
			while (pL < L && pn < n && haystack.charAt(pn) == needle.charAt(pL)) {
				++pn;
				++pL;
				++currLen;
			}

			// if the whole needle string is found,
			// return its start position
			if (currLen == L) {
				return pn - L;
			}

			// otherwise, backtrack
			pn = pn - currLen + 1;
		}
		return -1;
	}

	@Test
	public void test() {
		final String haystack = "mississippi";

		final String needle = "issip";
		Assert.assertEquals(strStr(haystack, needle), 4);
	}
}
