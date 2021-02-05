package cn.hale.com;

/**
 * @author HaleLv
 * @date 2021-02-05
 **/
public class processOrder {
//    默认访问修饰符-不适用任何关键字
    boolean processOrder(){
        return true;
    }
//    私有访问修饰符-private
    private String format;
//    使 其它类能够操作该变量
    public String getFormt(){
        return this.format;
    }
    public void setFormat(String format){
        this.format = format;
    }
//   公有访问修饰符 -public
    public static void main(String[] args){
        System.out.println();
    }
//    受保护的访问修饰符 - protected
class AudioPlay {
        protected void openSpeaker(Speak sp){
            System.out.println("protected ");
        }
}

class StreamAutoPlayer extends AudioPlay {
        protected void openSpeaker(Speak sp){
            System.out.println("procted ");
        }
}

}
