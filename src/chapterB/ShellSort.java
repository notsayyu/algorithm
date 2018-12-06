package chapterB;

import java.util.Arrays;

import static chapterB.Example.*;

/**
 * @description: 希尔排序（分组的直接插入排序法）
 * @author: dsy
 * @date: 2018/11/29 23:14
 */
public class ShellSort {

    public static void main(String[] args){
        Comparable[] a = {1,4,5,2,5,8,0,7,0,9};
        shell(a);
        Arrays.stream(a).forEach(x -> System.out.println(x));
    }


    private static void shell(Comparable[] a){
        //将a[]按升序排列
        int N = a.length;
        //h是增幅（步长、跨度），如下标0到下标1的步长就是1
        int h = 1;
        //这里将N个元素的数组分成了N/3组，三个元素为一组，三个元素的步长为N/3
        //假设有一个数组为{1,4,5,2,5,8,0,7,4,9}，N为10，则步长h=3，那么下标0、3、6为一组，1、4、7；2、5、8；9各自分组
        while (h < N/3){
            //一种步长计算方法
            h = 3*h + 1;
        }
        while (h >= 1){
            for (int i = h; i < N; i ++){
                //将a[i]插入到a[i-h], a[i-2*h], a[i-3*h] ...之中
                for (int j = i; j >= h; j -= h){
                    if(less(a[j], a[j-h])) {
                        exch(a, j, j - h);
                    }
                }
            }
            h = h/3;
        }
    }

}
