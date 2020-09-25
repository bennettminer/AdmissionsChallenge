import java.util.Scanner;

public class Admissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What was your SAT?");
        int sat = scanner.nextInt();

        System.out.println("What was your Percentile Class Rank? (just numbers)");
        int percentile = scanner.nextInt();

        System.out.println("How many awards have you recieved?");
        int awards = scanner.nextInt();

        System.out.println("What state are you from?");
        String state = scanner.nextLine();

        System.out.println("What is your last name?");
        String lastname = scanner.nextLine();

        if (sat >= 1500){
            if(percentile >= 95){
                if (awards >= 10){

                }
                else if (awards >= 8 && awards <= 9){

                }
                else if (awards >= 3 && awards <= 7){

                }
                else {
                    System.out.println("Sorry, you will not be accepted at Padjen University, because you don't have enough awards.");
                }
            }
            else if(percentile > 85 && percentile <= 90){
                if (awards >= 10){

                }
                else if (awards >= 8 && awards <= 9){

                }
                else if (awards >= 3 && awards <= 7){

                }
                else {
                    System.out.println("Sorry, you will not be accepted at Padjen University, because you don't have enough awards.");
                }
            }
            else if(percentile == 85){
                if (awards >= 10){

                }
                else if (awards >= 8 && awards <= 9){

                }
                else if (awards >= 3 && awards <= 7){

                }
                else {
                    System.out.println("Sorry, you will not be accepted at Padjen University, because you don't have enough awards.");
                }
            }
            else{
                System.out.println("Sorry, you will not be accepted at Padjen University, because your Percentile is too low.");
            }
        }


        else if (sat >= 1400 && sat <= 1499){
            if(percentile >= 95){
                if (awards >= 10){

                }
                else if (awards >= 8 && awards <= 9){

                }
                else if (awards >= 3 && awards <= 7){

                }
                else {
                    System.out.println("Sorry, you will not be accepted at Padjen University, because you don't have enough awards.");
                }
            }
            else if(percentile > 85 && percentile <= 90){
                if (awards >= 10){

                }
                else if (awards >= 8 && awards <= 9){

                }
                else if (awards >= 3 && awards <= 7){

                }
                else {
                    System.out.println("Sorry, you will not be accepted at Padjen University, because you don't have enough awards.");
                }
            }
            else if(percentile == 85){
                if (awards >= 10){

                }
                else if (awards >= 8 && awards <= 9){

                }
                else if (awards >= 3 && awards <= 7){

                }
                else {
                    System.out.println("Sorry, you will not be accepted at Padjen University, because you don't have enough awards.");
                }
            }
            else{
                System.out.println("Sorry, you will not be accepted at Padjen University, because your Percentile is too low.");
            }
        }


        else if (sat >= 1200 && sat <= 1399){
            if(percentile >= 95){
                if (awards >= 10){

                }
                else if (awards >= 8 && awards <= 9){

                }
                else if (awards >= 3 && awards <= 7){

                }
                else {
                    System.out.println("Sorry, you will not be accepted at Padjen University, because you don't have enough awards.");
                }
            }
            else if(percentile > 85 && percentile <= 90){
                if (awards >= 10){

                }
                else if (awards >= 8 && awards <= 9){

                }
                else if (awards >= 3 && awards <= 7){

                }
                else {
                    System.out.println("Sorry, you will not be accepted at Padjen University, because you don't have enough awards.");
                }
            }
            else if(percentile == 85){
                if (awards >= 10){

                }
                else if (awards >= 8 && awards <= 9){

                }
                else if (awards >= 3 && awards <= 7){

                }
                else {
                    System.out.println("Sorry, you will not be accepted at Padjen University, because you don't have enough awards.");
                }
            }
            else{
                System.out.println("Sorry, you will not be accepted at Padjen University, because your Percentile is too low.");
            }
        }
        else{
            System.out.println("Sorry, you will not be accepted at Padjen University, because your SAT scores are too low.");
        }
    }
}