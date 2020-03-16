package stringsEasy;

/* 1108. Defanging an IP Address */
import org.testng.Assert;
import org.testng.annotations.Test;

public class DefangingIPAddress {
	public String defangIPaddr(String address) {
		final StringBuilder sb = new StringBuilder();
		for (final char c : address.toCharArray()) {
			if (c == '.') {
				sb.append("[.]");
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}

	public String defangIPaddr1(String address) {
		return address.replaceAll("\\.", "[.]");
	}

	public String defangIPaddr2(String address) {
		final StringBuilder sb = new StringBuilder();
		for (int i = 0; i < address.length(); i++) {
			if (address.charAt(i) == '.') {
				sb.append("[.]");
			} else {
				sb.append(address.charAt(i));
			}
		}
		return sb.toString();
	}

	@Test
	public void test() {
		final String s1 = "1.1.1.1";
		Assert.assertEquals(defangIPaddr(s1), "1[.]1[.]1[.]1");

		final String s2 = "255.100.50.0";
		Assert.assertEquals(defangIPaddr(s2), "255[.]100[.]50[.]0");
	}
}
