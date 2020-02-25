package chapter.basis;

/**
 * 基础类型测试
 *
 * @author haitao.chen
 * public static void test() {}
 * @date 2020/2/25
 */
public class BasicType {


    /**
     * Java基本数据类型和引用类型
     * https://juejin.im/post/59cd71835188255d3448faf6#comment
     */
    public static void test1() {
        char[] charArray = {'1', '2', '3'};
        char[] charArray1 = charArray;
        charArray[0] = 'a';
        System.out.println(charArray1);
    }

    /**
     * Java的8种基本类型(Byte, Short, Integer, Long, Character, Boolean, Float, Double), 除Float和Double以外, 其它六种都实现了常量池, 但是它们只在大于等于-128并且小于等于127时才使用常量池。
     *
     * 当我们给Integer赋值时，实际上调用了Integer.valueOf(int)方法，查看源码，使用了IntegerCache的机制。
     * 而使用new的时候，无论数字大小，== 判断都为false
     *
     * 实际上，上面的valueOf其实是java编译器提供的一种自动装箱，
     *                      Integer a = 100; 自动装箱，编译后为Integer a = Integer.valueOf();
     *                      int b = a; 自动拆箱，编译后为int b = a.intValue();
     *
     */
    public static void test2() {
        Integer a = 127;
        Integer b = 127;
        System.out.println("等于127");
        System.out.println(a == b);
        System.out.println("********************");

        a = 128;
        b = 128;
        System.out.println("等于128");
        System.out.println(a == b);
        System.out.println("********************");

        a = -128;
        b = -128;
        System.out.println("等于-128");
        System.out.println(a == b);
        System.out.println("********************");

        a = -129;
        b = -129;
        System.out.println("等于-129");
        System.out.println(a == b);
        System.out.println("********************");

        a = new Integer(0);
        b = new Integer(0);
        System.out.println("两个new出来的Integer对象，数值相等。");
        System.out.println(a == b);

        System.out.println("********************");

        System.out.println("测试Boolean");
        Boolean c = true;
        Boolean d = true;
        System.out.println(c == d);

        d = new Boolean(true);
        System.out.println(c == d);

    }

    /**
     * 字符串与常量池
     *
     * 面试题：String str4 = new String(“abc”) 创建多少个对象？
     * 在常量池中查找是否有“abc”对象
     *      有则返回对应的引用实例
     *      没有则创建对应的实例对象
     * 在堆中 new 一个 String("abc") 对象
     * 将对象地址赋值给str4，
     * 所以，常量池中没有“abc”字面量则创建两个对象，否则创建一个对象，以及创建一个引用。
     */
    public static void test3() {
        String a = "123";
        String b = "123";
        System.out.println(a == b);

        String c = "123";
        String d = c;
        System.out.println(c == d);
        c = "456";
        System.out.println(c == d);

        String s1 = "hello";
        String s2 = new String("hello");
        String s3 = s2.intern();
        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s1 == s3 " + (s1 == s3));


    }


    public static void main(String[] args) {
        test3();
    }

}
