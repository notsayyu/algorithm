package chapter2;

import static chapter2.Example.*;

/**
 * 选择排序
 * @author dsy
 */
public class Selection {

    public static void main(String[] args){
        Comparable[] a = {7,5,23,14,1,0,8,9};
        //将a[]按升序排列
        int N = a.length;
        for (int i = 0; i < N; i ++){
            //将a[i]和a[i+1..N]中最小的元素交换
            int min = i;
            for (int j = i + 1; j < N; j ++){
                if (less(a[j], a[min])){
                    min = j;
                }
                exch(a, i, min);
            }
        }
        for (Comparable x : a){
            System.out.println(x);
        }
    }

}
