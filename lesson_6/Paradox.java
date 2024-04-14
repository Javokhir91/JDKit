package ru.JDKitHW.lesson_6;

import java.util.*;

public class Paradox {

    // коробка который содержить три эелемента
    private static int user; // игрок
    private static int lead_V; // ведущий
    private static int boxSize = 3;
    private static Random random = new Random(); // рандомайзер для выбора элемента в коробке
    private static int boxPrize;
    private static int emptyBox = 0;

    public static void withReplaceSelect(int N) {
        int countWinUser3_1 = 0;
        int countLoseUser3_1 = 0;
        for (int j = 0; j < N; j++) {
            user = random.nextInt(1, boxSize + 1);
            boxPrize = random.nextInt(1, boxSize + 1);
            for (int i = 1; i < boxSize + 1; i++) {
                if (user != i && boxPrize != i) lead_V = i;
            }
            if (boxPrize == user) {
                countWinUser3_1++;
            } else {
                countLoseUser3_1++;
            }
        }

        System.out.println("User choice -> " + user);
        System.out.println("User open box");
        System.out.println("Lead open Box -> " + lead_V);
        System.out.println("box with Prize -> " + boxPrize);
        System.out.println("*".repeat(20));
        System.out.println("win -> " + countWinUser3_1);
        System.out.println("*".repeat(20));
        System.out.println("lose -> " + countLoseUser3_1);
        System.out.println("*".repeat(20));

    }

    ;

    public static void NotReplaceSelect(int N) {
        int countWinUser3_1 = 0;
        int countLoseUser3_1 = 0;
        for (int j = 0; j <= N; j++) {
            user = random.nextInt(1, boxSize + 1);
            boxPrize = random.nextInt(1, boxSize + 1);
            for (int i = 1; i < boxSize + 1; i++) {
                if (user != i && boxPrize != i)
                    lead_V = i;
            }
            for (int i = 1; i < boxSize + 1; i++) {
                if (i != user && i != lead_V) {
                    emptyBox = i;
                    break;
                }
            }

            user = emptyBox;
            if (boxPrize == user) {
                countWinUser3_1++;
            } else {
                countLoseUser3_1++;
            }
        }

        System.out.println("User choice -> " + user);
        System.out.println("User open box");
        System.out.println("Lead open Box -> " + lead_V);
        System.out.println("box with Prize -> " + boxPrize);
        System.out.println("*".repeat(20));
        System.out.println("win -> " + countWinUser3_1);
        System.out.println("*".repeat(20));
        System.out.println("lose -> " + countLoseUser3_1);
        System.out.println("*".repeat(20));
    }

    ;

}



