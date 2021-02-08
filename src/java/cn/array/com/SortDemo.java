package cn.array.com;

import java.util.Arrays;

/**
 * @author HaleLv
 * @date 2021-02-08
 **/
public class SortDemo {
    public static void main(String[] args) {
        int[] a = {1,23,2,132,3,2};
        System.out.println(Arrays.toString(a));

        sortDemo();
        for(int i = 0; i < a.length - 1; i++){
            for(int j = 0; j < a.length -i - 1; j++){
                if(a[j] > a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void sortDemo(){
        int[] a = {123,231,223,21,213,1,2,3};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
