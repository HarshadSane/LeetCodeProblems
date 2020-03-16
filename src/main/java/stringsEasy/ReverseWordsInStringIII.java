package stringsEasy;

/* 557. Reverse Words in a String III*/
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseWordsInStringIII {
	public String reverse(char[] s) {
		int i = 0;
		int j = s.length - 1;
		while (i < j) {
			final char c = s[i];
			s[i++] = s[j];
			s[j--] = c;
		}
		return new String(s);
	}

	public String reverseWords(String s) {

		final String[] words = s.split(" ");
		final StringBuilder sb = new StringBuilder();
		for (final String str : words) {
			sb.append(reverse(str.toCharArray()) + " ");
		}
		return sb.toString().trim();

	}

	@Test
	public void test() {
		final String s1 = "Let's take LeetCode contest";
		Assert.assertEquals(reverseWords(s1), "s'teL ekat edoCteeL tsetnoc");
	}
}
