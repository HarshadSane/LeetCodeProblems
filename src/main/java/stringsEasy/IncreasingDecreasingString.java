package stringsEasy;

/* 1370. Increasing Decreasing String */
import org.testng.Assert;
import org.testng.annotations.Test;

public class IncreasingDecreasingString {
	private int[] createArray(String s) {
		final int[] arr = new int[26];
		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i) - 'a']++;
		}
		return arr;
	}

	public String sortString(String s) {
		final int[] arr = createArray(s);
		int count = s.length();

		final StringBuilder sb = new StringBuilder();
		while (count != 0) {
			for (int j = 0; j < 26; j++) {
				if (arr[j] > 0) {
					sb.append((char) (j + 'a'));
					count--;
					arr[j]--;
				}
			}
			for (int j = 25; j >= 0; j--) {
				if (arr[j] > 0) {
					sb.append((char) (j + 'a'));
					count--;
					arr[j]--;
				}
			}
		}
		return sb.toString();
	}

	@Test
	public void test() {
		final String s1 = "aaaabbbbcccc";
		Assert.assertEquals(sortString(s1), "abccbaabccba");

		final String s2 = "ggggggg";
		Assert.assertEquals(sortString(s2), "ggggggg");

		final String s3 = "leetcode";
		Assert.assertEquals(sortString(s3), "cdelotee");
	}
}
