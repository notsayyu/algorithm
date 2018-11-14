package chapter2;
import static chapter2.Example.*;
/**
 * 插入排序(很多高级排序算法的中间过程)
 * @author dsy
 */
public class Insertion {
    public static void main(String[] args){
        Comparable[] a = {7,5,23,14,1,0,8,9};
        //将a[]按升序排列
        int N = a.length;
        for (int i = 1; i < N; i ++){
            //将a[i]插到a[i-1]、a[i-2]、a[i-3]..之中
            for (int j = i; j >0 && less(a[j], a[j - 1]); j --){
                exch(a, j, j-1);
            }
        }
        for (Comparable x : a){
            System.out.println(x);
        }
    }

}
