package stringsEasy;

/* 929. Unique Email Addresses */
import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UniqueEmailAddresses {

	public String getEmail(String word) {
		final StringBuilder sb = new StringBuilder();
		final String[] strs = word.split("@");
		final String local = strs[0];
		final String domain = strs[1];

		for (int i = 0; i < local.length(); i++) {
			final char c = local.charAt(i);
			if (c == '.') {
				continue;
			} else if (c == '+') {
				break;
			} else {
				sb.append(c);
			}
		}

		sb.append("@").append(domain);
		return sb.toString();
	}

	public int numUniqueEmails(String[] strs) {
		final Set<String> set = new HashSet<>();
		for (final String s : strs) {
			set.add(getEmail(s));
		}
		return set.size();
	}

	@Test
	public void test() {
		final String[] s1 = { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
				"testemail+david@lee.tcode.com" };
		Assert.assertEquals(numUniqueEmails(s1), 2);
	}
}
