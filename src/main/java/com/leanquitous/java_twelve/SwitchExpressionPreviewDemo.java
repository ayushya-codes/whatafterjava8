package com.leanquitous.java_twelve;

import java.time.DayOfWeek;

/**
 * Basically two kinds of case statement exists now
 * 1. is represented using an arrow ->
 * 2. is represented using a colon :
 * <p>
 * Both can't be used together either type is used as of now for this piece of code JDK 21 is being used!
 * "yield" keyword can be used with any of the above case type!
 */
public class SwitchExpressionPreviewDemo {

    public static void traditionalSwitchStatementDemo(String day) {
        switch (DayOfWeek.valueOf(day)) {
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
                System.out.println(6);
                break;
            case TUESDAY:
                System.out.println(7);
                break;
            case THURSDAY:
            case SATURDAY:
                System.out.println((int) Math.pow(2, 3));
                break;
            case WEDNESDAY:
                int three = 1 + 2;
                System.out.println(three * three);
                break;
        }
    }

    public static void main(String[] args) {
        traditionalSwitchStatementDemo("MONDAY");
        traditionalSwitchStatementDemo("WEDNESDAY");

        newSwitchStatementWithArrow("MONDAY");
        newSwitchStatementWithArrow("WEDNESDAY");

        newSwitchStatementWithYieldKeyword("MONDAY");
        newSwitchStatementWithYieldKeyword("WEDNESDAY");
    }


    public static void newSwitchStatementWithArrow(String day) {
        switch (DayOfWeek.valueOf(day)) {
            case MONDAY, FRIDAY, SUNDAY -> System.out.println(6 + "New Switch case block with arrow");
            case TUESDAY -> System.out.println(7 + "New Switch case block with arrow");
            case THURSDAY, SATURDAY -> System.out.println((int) Math.pow(2, 3) + "New Switch case block with arrow");
            case WEDNESDAY -> {
                int three = 1 + 2;
                System.out.println(three * three + "New Switch case block with arrow");
            }
        }
    }

    /**
     * Note -> and : combination doesn't work with yeild!
     *
     * @param day
     */
    public static void newSwitchStatementWithYieldKeyword(String day) {
        String value = switch (DayOfWeek.valueOf(day)) {
            case MONDAY:
            case FRIDAY:
            case SUNDAY: {
                yield "New Switch case block with yield and :";
            }
            case TUESDAY: {
                yield (7 + "New Switch case block with yield and :");
            }
            case THURSDAY, SATURDAY:
                yield ((int) Math.pow(2, 3) + "New Switch case block with yield and :");
            case WEDNESDAY: {
                int three = 1 + 2;
                yield (three * three + "New Switch case block with yield and :");
            }
        };
        // This is what it prints the value returned from the switch block!
        System.out.println(value);
    }
}
