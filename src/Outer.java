/**
 * Created by HaohaoChang on 2017/5/25.
 */
public final class Outer {

    private int bar = 100;

    public static class Nester {

        public final String foo() {

            return "Hello Kotlin!";
        }
    }

    public final class Inner {

        public final int foo() {
            return bar;
        }

    }

}

