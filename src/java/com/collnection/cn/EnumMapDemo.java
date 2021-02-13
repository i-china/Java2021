package com.collnection.cn;

import java.time.DayOfWeek;
import java.util.EnumMap;
import java.util.Map;

/**
 * @author HaleLv
 * @date 2021-02-13
 **/
public class EnumMapDemo {
    public static void main(String[] args) {
        EnumMap1 em = new EnumMap1();
    }
}

class EnumMap1{
    EnumMap1(){
        Map<DayOfWeek,String> map = new EnumMap<>(DayOfWeek.class);
        map.put(DayOfWeek.MONDAY," 星期一 ");
        map.put(DayOfWeek.TUESDAY," 星期二 ");
        map.put(DayOfWeek.WEDNESDAY," 星期三 ");
        map.put(DayOfWeek.THURSDAY," 星期四 ");
        map.put(DayOfWeek.FRIDAY," 星期五 ");
        map.put(DayOfWeek.SATURDAY," 星期六 ");
        map.put(DayOfWeek.SUNDAY," 星期日 ");
        System.out.println(map);
        System.out.println(map.get(DayOfWeek.WEDNESDAY));
    }
}
