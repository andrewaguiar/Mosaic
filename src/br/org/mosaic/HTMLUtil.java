package br.org.mosaic;

import java.util.Arrays;

/**
 * @author andrew
 */
public class HTMLUtil {
	public static String createLevel(final int i) {
		if (i < 1) {
			return "";
		}
		final char[] c = new char[i + 1];
		Arrays.fill(c, '\t');
		c[0] = '\n';
		return new String(c);
	}

	public static String createCoords(final int... coords) {
		final StringBuilder s = new StringBuilder();
		for (final int i : coords) {
			s.append(',');
			s.append(i);
		}
		return s.substring(1, s.length());
	}

	public static String createList(final String[] headersIds, final String separator) {
		final StringBuilder s = new StringBuilder();
		for (final String i : headersIds) {
			s.append(separator);
			s.append(i);
		}
		return s.substring(separator.length(), s.length());
	}

	public static String ltrim(final String s) {
		final int len = s.length();
		int st = 0;
		final char[] val = s.toCharArray();

		while ((st < len) && (val[st] <= ' ')) {
			st++;
		}
		return s.substring(st, len);
	}
}