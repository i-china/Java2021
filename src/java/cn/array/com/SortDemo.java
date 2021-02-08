package cn.array.com;

import java.util.Arrays;

/**
 * @author HaleLv
 * @date 2021-02-08
 **/
public class SortDemo {
    public static void main(String[] args) {
        int[] a = {1,2321,2312,23132,232,32123,21,23};
        System.out.println(Arrays.toString(a));
        for(int i = 0; i < a.length -1; i++){
            for(int j = 0; j < a.length -i -1; j++){
                if(a[j] > a[j+1]){
                    int tmp = a[j];
                    a[j] = a[i+1];
                    a[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
