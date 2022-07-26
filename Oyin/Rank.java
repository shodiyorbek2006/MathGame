package Oyin;

import java.util.Comparator;

public class Rank implements Math, Comparator<Rank> {
    String name;
    double ball;
    double res;

    public Rank() {
    }

    public Rank(String name, double ball) {
        this.name = name;
        this.ball = ball;

    }

    @Override
    public void answers(int a, int b, int c) {
        switch (c) {
            case 0 -> {
                res = a + b;
                System.out.print(a + " + " + b + " = ");
            }
            case 1 -> {
                res = a - b;
                System.out.print(a + " - " + b + " = ");
            }
            case 2 -> {
                res = a * b;
                System.out.print(a + " * " + b + " = ");
            }
            case 3 -> {
                res = (double) a / b;
                System.out.print(a + " : " + b + " = ");
            }
        }
    }

    @Override
    public int compare(Rank o1, Rank o2) {
        if (o1.ball == o2.ball)
        return 0;
        else if (o1.ball > o2.ball)
            return 1;
        else
            return -1;
    }
}

