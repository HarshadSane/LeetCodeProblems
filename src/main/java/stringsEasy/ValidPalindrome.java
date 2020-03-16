package stringsEasy;

/* 	125 Valid Palindrome    */
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidPalindrome {

	public boolean isPalindrome(String s) {
		final String lowerCase = s.toLowerCase();
		int i = 0;
		int j = lowerCase.length() - 1;
		while (i < j) {
			final char start = lowerCase.charAt(i);
			final char end = lowerCase.charAt(j);
			if (!Character.isLetterOrDigit(start)) {
				i++;
			} else if (!Character.isLetterOrDigit(end)) {
				j--;
			} else {
				if (start != end) {
					return false;
				}
				i++;
				j--;

			}
		}
		return true;

	}

	@Test
	public void test() {
		final String s1 = "A man, a plan, a canal: Panama";
		Assert.assertTrue(isPalindrome(s1));

		final String s2 = "race a car";
		Assert.assertFalse(isPalindrome(s2));

	}
}
