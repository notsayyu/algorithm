package chapterA;

public class Code {

    public static void main(String[] args){
//        System.out.println(gcd(12, 9 ));
//
//        int[] whiteList = {1,2,7,3,9,6,5,11};
//        int[] keyList = {4,7,9,10,8};
//        Arrays.sort(whiteList);
//        Arrays.stream(whiteList).forEach(i -> System.out.print(i));
//        System.out.println();
//        for (int j= 0; j < keyList.length; j ++){
//                //读取键值，如果不存于白名单中则将其打印
//                int key = keyList[j];
//                if (rank(key, whiteList) < 0) {
//                    System.out.println(key);
//                }
//        }
//        //整型溢出的典型例子
        System.out.println(Math.abs(-2147483648));
        System.out.println(Math.abs(-214748364));
        System.out.println(Math.abs(-999999999));
        System.out.println(Math.abs(-2147483647));
        //输出一个无穷大：Infinity
        System.out.println(1.0/0.0);
//
//        System.out.println(2.0e-6 * 100000000.1);





    }

    /**
     * 欧几里得算法：找到两个数的最大公约数
     * 定理：两个整数的最大公约数等于其中较小的那个数和两数相除余数的最大公约数。最大公约数（greatest common divisor）缩写为gcd。
     * gcd(a,b)=gcd(b,amodb)(不妨设a>b且r=amodb,r≠0)
     * aa  可以表示成 a=kb+r(a，b，k，r皆为正整数，且r<ba=kb+r(a，b，k，r皆为正整数，且r<b)，则 r=amodbr=amodb
     * 假设 dd 是 a,ba,b 的一个公约数，即 aa 和 bb 都可以被 dd 整除。
     * 而 r=a−kbr=a−kb，两边同时除以 dd，可得：
     * 至此，我们得知，如果一个数是两个数的公约数，那么，它也是这两个数的余数和较小数公约数。
     * @param a
     * @param b
     * @return
     */
    public static int gcd(int a, int b){
        if(b == 0) {
            return a;
        }
        int r = a % b;
        return gcd(b, r);
    }

    /**
     * 查找二分法：也称为折半法，是一种在有序数组中查找特定元素的搜索算法
     */
    public static int rank(int key, int[] a){
        //数组必须是有序的
        int lo = 0;
        int hi = a.length -1;
        while (lo <= hi){
            //被查找的键要么不存在，要么必然存在于a[lo..hi]之中
            int mid = lo + (hi - lo) / 2;
            if(key < a[mid]) {
                hi = mid - 1;
            }else if (key > a[mid]){
                lo = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

}
