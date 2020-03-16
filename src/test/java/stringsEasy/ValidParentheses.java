package stringsEasy;

import java.util.HashMap;
import java.util.Stack;

/* 20. ValidParentheses */
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidParentheses {
	private final HashMap<Character, Character> mappings;

	public ValidParentheses() {
		this.mappings = new HashMap<Character, Character>();
		this.mappings.put(')', '(');
		this.mappings.put('}', '{');
		this.mappings.put(']', '[');
	}

	public boolean isValid(String s) {
		final String brackets = "{}[]()";
		final Stack<Character> stack = new Stack<>();
		for (final char c : s.toCharArray()) {
			if (brackets.indexOf(c) == -1) {
				continue;
			}
			if (mappings.containsKey(c)) {
				final char top = stack.isEmpty() ? '#' : stack.pop();
				if (top != mappings.get(c)) {
					return false;
				}
			} else {
				stack.push(c);
			}

		}
		return stack.isEmpty();
	}

	@Test
	public void test() {
		final String s1 = "{121453[hasbb]bhbsdb}qwjhhjsbm";
		Assert.assertTrue(isValid(s1));

		final String s2 = "(123sjgsvjvb[asbbas,)]";
		Assert.assertFalse(isValid(s2));

	}
}
