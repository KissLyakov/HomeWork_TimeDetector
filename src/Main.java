import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите предложение со верменем: ");
        Scanner read = new Scanner(System.in);
        String line = read.nextLine();
        RegularReading.ReadLine(line);
        }
    }
