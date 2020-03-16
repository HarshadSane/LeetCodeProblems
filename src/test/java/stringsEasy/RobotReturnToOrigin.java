package stringsEasy;

/* 1309. Decrypt String from Alphabet to Integer Mapping */
import org.testng.Assert;
import org.testng.annotations.Test;

public class RobotReturnToOrigin {

	public boolean judgeCircle(String moves) {
		int x = 0, y = 0;
		for (final char c : moves.toCharArray()) {
			if (c == 'L') {
				x++;
			} else if (c == 'R') {
				x--;
			} else if (c == 'U') {
				y++;
			} else if (c == 'D') {
				y--;
			}
		}
		return x == 0 && y == 0;

	}

	@Test
	public void test() {
		final String s1 = "UD";
		Assert.assertTrue(judgeCircle(s1));

		final String s2 = "LL";
		Assert.assertFalse(judgeCircle(s2));
	}
}
