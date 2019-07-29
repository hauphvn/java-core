package edu.hauphvn.fa;

import java.time.Duration;
import java.time.LocalTime;

public class stringperformance {
    public static void main(String[] args) {
        LocalTime localTimeStart = LocalTime.now();
        String link = "";
        for (int i = 0; i < 20000; i++) {
            link += i;
        }
        LocalTime localTimeEnd = LocalTime.now();
        System.out.println("String performance: "+ Duration.between(localTimeStart,localTimeEnd));

        System.out.println();
        localTimeStart = LocalTime.now();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 20000; i++) {
            stringBuilder.append(i);
        }
        localTimeEnd = LocalTime.now();
        System.out.println("StringBuider performance: "+Duration.between(localTimeStart,localTimeEnd));
    }
}
