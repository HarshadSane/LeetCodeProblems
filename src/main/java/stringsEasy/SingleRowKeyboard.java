package stringsEasy;

/* 1165. Single-Row Keyboard */
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SingleRowKeyboard {
	public int calculateTime(String keyboard, String word) {
		final int[] index = new int[26];
		for (int i = 0; i < keyboard.length(); ++i) {
			index[keyboard.charAt(i) - 'a'] = i;
		}

		int sum = 0;
		int last = 0;
		for (final char c : word.toCharArray()) {
			sum += Math.abs(index[c - 'a'] - last);
			last = index[c - 'a'];
		}
		return sum;
	}

	public int calculateTime1(String keyboard, String word) {

		final HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < keyboard.length(); i++) {
			map.put(keyboard.charAt(i), i);
		}

		int sum = 0;
		for (int i = 0; i < word.length(); i++) {
			if (i == 0) {
				sum += Math.abs(map.get(word.charAt(i)) - map.get(keyboard.charAt(i)));
			} else {
				sum += Math.abs(map.get(word.charAt(i)) - map.get(word.charAt(i - 1)));
			}
		}

		return sum;
	}

	@Test
	public void test() {
		final String k1 = "abcdefghijklmnopqrstuvwxyz";
		final String s1 = "cba";
		Assert.assertEquals(calculateTime(k1, s1), 4);

		final String k2 = "pqrstuvwxyzabcdefghijklmno";
		final String s2 = "leetcode";
		Assert.assertEquals(calculateTime(k2, s2), 73);
	}
}
