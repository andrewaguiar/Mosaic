import java.util.Arrays;
import java.util.List;

public class TestNestle {

	public static void main(final String[] args) {
		final A a;

		final A c = new A(new A(new A(), new A(), new A()), new A(new A(), (a = new A())));

		System.out.println(a.getAbsolutePosition());
	}

	private static class A {
		private final List<A> childs;
		private A parent;
		private int index;

		public A(final A... childs) {
			int i = 0;
			for (final A a : childs) {
				a.parent = this;
				a.index = i++;
			}
			this.childs = Arrays.asList(childs);
		}

		private int getAbsolutePosition() {
			return this.index + (this.parent != null ? this.parent.getAbsolutePosition() : 0);
		}
	}
}
