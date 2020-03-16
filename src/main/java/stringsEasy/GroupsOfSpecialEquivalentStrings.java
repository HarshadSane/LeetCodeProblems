package stringsEasy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 1309. Decrypt String from Alphabet to Integer Mapping */
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupsOfSpecialEquivalentStrings {

	public int numSpecialEquivGroups(String[] A) {
		final Set<String> seen = new HashSet<>();
		for (final String S : A) {
			final int[] count = new int[52];
			for (int i = 0; i < S.length(); ++i) {
				count[S.charAt(i) - 'a' + 26 * (i % 2)]++;
			}
			seen.add(Arrays.toString(count));
		}
		return seen.size();
	}

	@Test
	public void test() {
		final String[] s1 = { "abcd", "cdab", "cbad", "xyzz", "zzxy", "zzyx" };
		Assert.assertEquals(numSpecialEquivGroups(s1), 3);
	}
}
