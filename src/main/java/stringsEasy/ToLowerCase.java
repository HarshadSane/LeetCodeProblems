package stringsEasy;

/* 709. To Lower Case */
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToLowerCase {
	@Test
	public void test() {
		final String s1 = "Hello";
		Assert.assertEquals(toLowerCase(s1), "hello");

		final String s2 = "here";
		Assert.assertEquals(toLowerCase(s2), "here");

		final String s3 = "LOVELY";
		Assert.assertEquals(toLowerCase(s3), "lovely");
	}

	public String toLowerCase(String str) {

		final StringBuilder sb = new StringBuilder();
		for (final char c : str.toCharArray()) {
			if (Character.isUpperCase(c)) {
				sb.append((char) (c - 'A' + 'a'));
			} else {
				sb.append(c);
			}
		}

		return sb.toString();

	}
}
