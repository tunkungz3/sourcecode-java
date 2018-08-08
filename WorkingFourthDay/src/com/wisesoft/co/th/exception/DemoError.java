package com.wisesoft.co.th.exception;

public class DemoError {
    // Handle error
    // Proactive is mean Check before make.
    public double processProactive(int input) {
        // Fail Fast
        if (input == 0) {
            return -1;
        }
        return 10 / input;
    }

    // Reactive is mean Make before Check.
    public double processReactive(int input) {
        try {
            return 10 / input;
        } catch (ArithmeticException e) {
        } catch (Exception e) {
        }
        return -1;
    }

    public static void main(String[] args) {
        DemoError demo = new DemoError();
        double proactive = demo.processProactive(0);
        double reactive = demo.processReactive(0);
        
        System.out.println(
                String.format(
                        "proactive : %.2f"
                        + "\nreactive : %6.2f", 
                        proactive
                        ,reactive
                        ));
    }

}
