package com.enums.cn;

/**
 * @author HaleLv
 * @date 2021-02-08
 **/
public class EnumDemo {
    public static void main(String[] args) {
        Weekday day = Weekday.SUN;
        if(day == Weekday.SAT || day == Weekday.SUN){
            System.out.println("work at home!");
        }else{
            System.out.println("work at office! ");
        }
        String s = Weekday.SUN.name();
        int n = Weekday.MON.ordinal();
        EnumSwitch en = new EnumSwitch();
    }
}

class EnumSwitch{
    EnumSwitch(){
        Weekday day = Weekday.SUN;
        switch(day){
            case MON:
            case TUE:
            case WED:
            case THU:
            case FRI:
                System.out.println("today is " + day + " . work at office !!");
                break;
            case SAT:
            case SUN:
                System.out.println("today is " + day +  " work at home ! ");
                break;
            default:
                throw new RuntimeException("cannont proceess " + day);
        }
    }
}

enum Color{
    RED, GREEN, BLUE;
}



enum Weekday{
    SUN, MON, TUE, WED, THU, FRI, SAT;
}


class EnumTest{
    EnumTest(){

    }
}
