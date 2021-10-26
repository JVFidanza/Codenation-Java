package br.com;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Fibonacci {
    public static List<Integer> fibonacci() {
        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
        int nextNum = 0;
        while(nextNum < 350) {
            nextNum = fibonacci.get(fibonacci.size() - 1) + fibonacci.get(fibonacci.size() - 2);
            fibonacci.add(nextNum);
        }
        return fibonacci;
    }
    public static Boolean isFibonacci(Integer a) {
        boolean bool = false;
        for (Integer fibNumber : fibonacci()) {
            if(Objects.equals(a, fibNumber)){
                bool = true;
                break;
            }
        }
        return bool;
    }
    public static void main(String[] args){
        System.out.println(isFibonacci(377));
    }
}
