package TH6_XAYDUNGLOPFAN;

public class Main  {
    public static void main(String[] args) {
        int SLOW = 1;
        int MEDIUM = 2;
        int FAST = 3;

        Fan toshiba = new Fan();
        toshiba.setSpeed(FAST);
        toshiba.setColor("red");
        toshiba.setRadius(10d);
        toshiba.setOnOff(true);
        System.out.println(toshiba.fanInfo()+"\n");


        Fan asanzo = new Fan();
        asanzo.setSpeed(SLOW);
        asanzo.setColor("Green");
        asanzo.setRadius(5d);
        asanzo.setOnOff(false);
        System.out.println(asanzo.fanInfo());
    }


}