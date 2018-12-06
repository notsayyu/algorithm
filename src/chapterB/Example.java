package chapterB;

import java.util.Arrays;

/**
 * 排序算法类模板
 * @author dsy
 */
@SuppressWarnings("unchecked")
public class Example {
    public static void sort(Comparable[] a){

    }

    protected static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    protected static void exch(Comparable[] a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    protected static void show(Comparable[] a){
        //在单行中打印数组
        Arrays.stream(a).forEach(x -> System.out.println(x + ""));
    }

    protected static boolean isSorted(Comparable[] a){
        //测试数组元素是否有序
        for(int i = 1; i < a.length; i ++){
            if(less(a[i], a[i-1])){
                return false;
            }
        }
        return true;
    }
}
