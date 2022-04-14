package threaded;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List allNums = new ArrayList<ArrayList>();

        for (int i = 1; i <= 10000; i++) {
            allNums.add(i);
        }

        List<List<Integer>> arrs = new ArrayList<>();
        arrs.add(allNums.subList(0,2499));
        arrs.add(allNums.subList(2500,4999));
        arrs.add(allNums.subList(5000,7499));
        arrs.add(allNums.subList(7500,9999));

        NumberSeparator num1 = new NumberSeparator();
        num1.setAllNum(arrs.get(0));
        NumberSeparator num2 = new NumberSeparator();
        num2.setAllNum(arrs.get(1));
        NumberSeparator num3 = new NumberSeparator();
        num3.setAllNum(arrs.get(2));
        NumberSeparator num4 = new NumberSeparator();
        num4.setAllNum(arrs.get(3));

        Thread t1 = new Thread(num1);
        Thread t2 = new Thread(num2);
        Thread t3 = new Thread(num3);
        Thread t4 = new Thread(num4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}

class NumberSeparator implements Runnable {
    ArrayList<Integer> odd;
    ArrayList<Integer> even;
    List<Integer> allNum;

    public NumberSeparator() {
        odd = new ArrayList<>();
        even = new ArrayList<>();
        allNum = new ArrayList<>();
    }

    public void run() {
        for(int x:allNum){
            if (isEven(x))
                even.add(x);
            else
                odd.add(x);
        }
    }

    boolean isEven(int i){
        return i%2==0;
    }

    public void setAllNum(List<Integer> allNum) {
        this.allNum = allNum;
    }

    public ArrayList<Integer> getEven() {
        return even;
    }

    public ArrayList<Integer> getOdd() {
        return odd;
    }
}