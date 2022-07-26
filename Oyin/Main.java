package Oyin;

import java.util.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        Random random = new Random();
        List<Rank> mathList = new ArrayList<>();
        Rank rank = new Rank();
        String name;
        double answer;
        int r = 0;
        int w = 0;
        System.out.println("---- Math Game ----");
        while (true) {
            System.out.println("[1] Start game");
            System.out.println("[2] Rating");
            System.out.println("[3] List of player");
            System.out.println("=");
            int m = scanner.nextInt();
            switch (m) {
                case 1 -> {
                    System.out.print("Name: ");
                    scanner = new Scanner(in);
                    name = scanner.next();
                    boolean isHave = false;
                    for (int i = 0; i < mathList.size(); i++) {
                        if (name.equals(mathList.get(i).name)) {
                            isHave = true;
                            break;
                        }
                    }
                    if (isHave) {
                        System.out.println("Bunday ism oldin kiritilgan ");
                    } else {

                        for (int i = 0; i < 3; i++) {
                            int a = random.nextInt(10);
                            int b = random.nextInt(10);
                            int c = random.nextInt(4);
                            rank.answers(a, b, c);
                            scanner = new Scanner(in);
                            answer = scanner.nextDouble();
                            if (answer == rank.res) {
                                r++;
                            } else {
                                w++;
                            }
                        }
                        rank.ball = r;
                        mathList.add(new Rank(name, r));
                        r = 0;
                    }
                }
                case 2 -> {
                    for (Rank d : mathList) {
                        System.out.println(d.name + " " + d.ball);
                    }
                }
                case 3 -> {
                    mathList.sort(new Rank());
                    for (Rank d : mathList) {
                        System.out.println(d.name + " " + d.ball);
                    }
                }
                default -> System.out.println("error");
            }
        }
    }
}