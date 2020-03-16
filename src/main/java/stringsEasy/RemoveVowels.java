package stringsEasy;

/* 1119. Remove Vowels from a String */
import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveVowels {
	public String removeVowels(String S) {
		final String vowels = "aeiou";
		final StringBuilder sb = new StringBuilder();
		for (final char c : S.toCharArray()) {
			if (vowels.indexOf(c) == -1) {
				sb.append(c);
			}
		}
		return sb.toString();
	}

	public String removeVowels1(String S) {
		return S.replaceAll("[aeiou]", "");
	}

	@Test
	public void test() {
		final String s1 = "leetcodeisacommunityforcoders";
		Assert.assertEquals(removeVowels(s1), "ltcdscmmntyfrcdrs");

		final String s2 = "aeiou";
		Assert.assertEquals(removeVowels(s2), "");
	}
}
