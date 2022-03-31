package com.company;

public class Main {
    static String word;

   static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                word = "Monday";
                break;
            case 1:
                word = "Tuesday";
                break;
            case 2:
                word = "Wednesday";
                break;
            case 3:
                word = "Thursday";
                break;
            case 4:
                word = "Friday";
                break;
            case 5:
                word = "Saturday";
                break;
            case 6:
                word="Sunday";

        }
        System.out.println("The day is  "+word);
    }

    public static void main(String[] args) {
        // write your code here
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2000));
        int newScore = calculatesScore("Jayendra", 300);
        System.out.println("New Score is " + newScore);
        calculatesScore(75);
        System.out.println(calculatesScore(75));
        System.out.println(calFeetAndInchesToCentimeters(100));
        //  getDurationString(-3945);
        System.out.println(getDurationString(-3945));
        printDayOfTheWeek(2);



        //  System.err.println("Error");
    }

    static boolean isLeapYear(int year) {

        if (year < 0) {
            return false;
        } else {
            if (year >= 1 || year <= 9999) {
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            return true;
                        } else {
                            return false;
                        }
                    } else {
                        return true;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }


        }


    }

    public static int calculatesScore(String playerName, int score) {
        System.out.println("Player" + playerName + " scored" + score);
        return score * 1000;
    }

    public static int calculatesScore(int score) {
        System.out.println("Player Unknown" + " scored" + score);
        return score * 100;
    }

    static double calFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || (inches < 0 || inches > 12)) {
            return -1;
        } else {
            double cm = (feet * 12) * 2.54 + (inches * 2.54);
            return cm;

        }
    }

    static double calFeetAndInchesToCentimeters(double inches) {
        if (inches > 0) {
            int totalFeet = (int) inches / 12;
            double newInches = inches % 12;

            double x = calFeetAndInchesToCentimeters(totalFeet, newInches);//10    1
            return x;
        } else {
            return -1;

        }
    }

    static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid Value";
        } else {
            if (minutes > 0) {
                int hours = minutes / 60;
                int remainingMinute = minutes % 60;
                // int second=minutes%60;
                // seconds +=second;

                return hours + "h " + remainingMinute + "m " + seconds + "s";

            }
        }
        return null;
    }

    static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid Value";
        }
        int minutes = seconds / 60;
        int second = seconds % 60;
        getDurationString(minutes, second);
        return " ";
    }
}
