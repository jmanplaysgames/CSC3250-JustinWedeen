package labs.lab01;

public class GradeCalculator {

    public static double average(int[] scores) {
        int total = 0;

        for(int score : scores) {
            total += score;
        }
        return (double) total/scores.length;
    }

    public static int highest(int[] scores) {
        int largest = 0;

        for(int score : scores){
            if(largest < score){
                largest = score;
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int[] scores = {85, 90, 72, 96, 88};

        System.out.println("Average: " + average(scores));
        System.out.println("Highest: " + highest(scores));
    }
}