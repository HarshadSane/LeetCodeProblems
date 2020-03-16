package stringsEasy;

import java.util.HashSet;
import java.util.Set;

/* 1309. Decrypt String from Alphabet to Integer Mapping */
import org.testng.Assert;
import org.testng.annotations.Test;

public class UniqueMorseCodeWords {

	public String getMorseCode(String word) {
		final String[] code = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
				"--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		final StringBuilder sb = new StringBuilder();
		for (final char c : word.toCharArray()) {
			sb.append(code[c - 'a']);
		}

		return sb.toString();
	}

	@Test
	public void test() {
		final String[] s1 = { "gin", "zen", "gig", "msg" };
		Assert.assertEquals(uniqueMorseRepresentations(s1), 2);
	}

	public int uniqueMorseRepresentations(String[] strs) {
		final Set<String> set = new HashSet<>();
		for (final String s : strs) {
			set.add(getMorseCode(s));
		}
		return set.size();
	}
}
