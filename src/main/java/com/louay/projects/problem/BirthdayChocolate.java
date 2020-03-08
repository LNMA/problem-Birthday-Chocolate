package com.louay.projects.problem;

import java.util.Scanner;

public class BirthdayChocolate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int squaresOfChocolateLength = inputSquaresOfChocolateLength(input);

        Integer [] numberOnEachSquareOfChocolateArray  = fillScoreChocolateArray(input, squaresOfChocolateLength);

        Integer ronBirthDay = inputBirthDay(input);

        Integer ronBirthMonth = inputBirthMonth(input);

        Integer numberOfWayToShareChocolate = findWaysContiguousSegment(ronBirthMonth, ronBirthDay ,numberOnEachSquareOfChocolateArray);

        System.out.printf("number of way to share chocolate :  %d" ,numberOfWayToShareChocolate);
    }

    public static int inputSquaresOfChocolateLength (Scanner input) {
        System.out.print("please input  numbers of the squares of chocolate  : ");
        int squaresOfChocolateLength = input.nextInt();
        return squaresOfChocolateLength;
    }

    public static int inputBirthDay (Scanner input) {
        System.out.print("please input Ron's birth day : ");
        int birthDay = input.nextInt();
        return birthDay;
    }

    public static int inputBirthMonth (Scanner input) {
        System.out.print("please input Ron's birth month : ");
        int birthMonth = input.nextInt();
        return birthMonth;
    }

    public static Integer[] fillScoreChocolateArray(Scanner input, int squaresOfChocolateLength){
        Integer [] chocolateArray = new Integer[squaresOfChocolateLength];
        for (int i = 0; i <chocolateArray.length ; i++) {
            System.out.printf("please input number on %s chocolate",(i+1));
            chocolateArray[i] = input.nextInt();
        }
        return chocolateArray;
    }

    public static Integer findWaysContiguousSegment(int ronBirthMonth, int ronBirthDay ,Integer [] numberOnEachSquareOfChocolateArray) {
        Integer[] temp = new Integer[ronBirthMonth];
        Integer sum = 0;
        Integer totalWays = 0;
        for (int i = 0; i < numberOnEachSquareOfChocolateArray.length; i++) {
            sum = 0;
            if (temp[temp.length - 1] == null) {
                temp[i] = numberOnEachSquareOfChocolateArray[i];
                if (temp[temp.length - 1] != null) {
                    sum = totalSumArray(temp);
                    if (sum == ronBirthDay) {
                        totalWays++;
                    }
                }
            } else {
                swap(temp);
                temp[temp.length - 1] = numberOnEachSquareOfChocolateArray[i];
                sum = totalSumArray(temp);
                if (sum == ronBirthDay) {
                    totalWays++;
                }
            }
        }
        return totalWays;
    }

    public static void swap(Integer [] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                continue;
            } else {
                arr[i - 1] = arr[i];
            }
        }
    }

    public static Integer totalSumArray (Integer [] arr) {
        Integer sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


}
