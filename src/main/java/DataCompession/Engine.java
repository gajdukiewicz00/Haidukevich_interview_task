package src.main.java.DataCompession;

import java.util.ArrayList;

public class Engine {
    public static ArrayList<Long> changes1 = new ArrayList<>(100000);
    public static ArrayList<Long> changes2 = new ArrayList<>(100000);
    public static ArrayList<Long> main(){

        int i = 0;
        long j = 0;
        long temp = 0L;
        int x = 0;


        do {
            long unixTime = System.currentTimeMillis() / 1000L;
            if (unixTime != temp){
                temp = unixTime;
                long random_int = (long) Math.floor(Math.random()*(2)+0);
                System.out.println(unixTime +" "+ random_int);
                long cnt = (long) (Math.random()*(1000l-500l+1l)+500l);
                try {
                    Thread.sleep(cnt);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (j != random_int || i == 0){
                    changes1.add(x, random_int);
                    changes2.add(x, unixTime);
                    j = random_int;
                    x++;
                }
                i ++;
            }

        }while (i <10);
        System.out.println("===========");
        for(int y = 0; y<changes2.size(); y++) {
            Long value = Long.valueOf(Math.toIntExact(changes2.get(y)));
            Integer value2 = Math.toIntExact(changes1.get(y));
            System.out.println(value + " " + value2);
        }
    return changes2;}
}