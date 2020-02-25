package chapter.basis;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 集合类型测试
 * @author haitao.chen
 * public static void test() {}
 * @date 2020/2/25
 */
public class CollectionSort {


    /**
     * Arraylist底层使用的是数组（存读数据效率高，插入删除特定位置效率低），
     * LinkedList底层使用的是双向循环链表数据结构（插入，删除效率特别高）。
     * 采用链表存储，插入，删除元素时间复杂度不受元素位置的影响，都是近似O（1）而数组为近似O（n），
     * 因此当数据特别多，而且经常需要插入删除元素时建议选用LinkedList.
     * 一般程序只用Arraylist就够用了，因为一般数据量都不会蛮大，Arraylist是使用最多的集合类。
     * 但是数据量非常巨大（150w ？）的时候，Arraylist是比LinkedList效率高一点的，可能是因为没有频繁的扩容了，但是LinkedList会涉及到频繁的节点分配
     *
     */
    public static void test1() {

        long start = System.currentTimeMillis();
        ArrayList list = new ArrayList();
        for (int i = 0; i < 5000000; i++) {
            list.add(1);
        }
        long end = System.currentTimeMillis();
        System.out.println("arraylist time:" + (end - start));


        start = System.currentTimeMillis();
        LinkedList list1 = new LinkedList();
        for (int i = 0; i < 5000000; i++) {
            list1.add(1);
        }
        end = System.currentTimeMillis();
        System.out.println("linkedlist time:" + (end - start));

    }

    /**
     * HashMap jdk7和jdk8的区别，线程不安全的原因
     * ConcurrentHashMap jdk7是使用分段锁segment实现的，但是jdk8是使用CAS加sync来实现的。
     */
    public static void test2() {

    }


    public static void main(String[] args) {
        test1();
    }
}
