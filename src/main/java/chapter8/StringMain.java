package chapter8;

import javax.lang.model.SourceVersion;
import javax.tools.ForwardingFileObject;

public class StringMain {
    enum SomEnum{
        foo
    }
    public static void main(String... args) {
        String s = new String("foo");
        String intern = s.intern();
        String s2 = SomEnum.foo.name() + "";

        boolean b1 = intern == "foo";
        System.out.println("b1 = " + b1);

        s.stripIndent();
        s.strip();
        s.trim();

        foo();
    }

    private static void foo(){
        String s = """
                "a""b\"""";
        String ss = "sss";
        StringBuilder stringBuilder = new StringBuilder(ss);
        boolean equals = ss.equals(stringBuilder);
        System.out.println("equals = " + equals);

        StringBuilder sb = new StringBuilder("  foo  ");
        sb.trimToSize();
        System.out.println("sb = " + sb);
        StringBuilder sb2 = new StringBuilder(sb);
        //boolean b2 = ss == sb; //ILLEGAL
    }
}
