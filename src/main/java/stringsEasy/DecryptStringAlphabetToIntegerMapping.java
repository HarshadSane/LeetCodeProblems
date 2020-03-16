package stringsEasy;

/* 1309. Decrypt String from Alphabet to Integer Mapping */
import org.testng.Assert;
import org.testng.annotations.Test;

public class DecryptStringAlphabetToIntegerMapping {
	public String freqAlphabets(String s) {
		final int n = s.length();
		final StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n;) {
			if (i < n - 2 && s.charAt(i + 2) == '#') {
				final int num = Integer.parseInt(s.substring(i, i + 2));
				sb.append((char) (num + 96));
				i = i + 3;
				continue;
			}
			sb.append((char) (97 + s.charAt(i) - '1'));
			i++;
		}
		return sb.toString();
	}

	@Test
	public void test() {
		final String s1 = "10#11#12";
		Assert.assertEquals(freqAlphabets(s1), "jkab");

		final String s2 = "1326#";
		Assert.assertEquals(freqAlphabets(s2), "acz");

		final String s3 = "25#";
		Assert.assertEquals(freqAlphabets(s3), "y");
	}
}
