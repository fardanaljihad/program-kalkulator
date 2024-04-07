package kelompok.a6.maven;

import java.util.Scanner;

public class App 
{   
    // Main Modul
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan operand pertama: ");
        int operand1 = scanner.nextInt();

        System.out.print("Masukkan operand kedua: ");
        int operand2 = scanner.nextInt();

        System.out.print("Pilih operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Panggil modul validateInput untuk memvalidasi data data yang diinputkan user
        if (validateInput(operand1, operand2, operator)) {
            // Panggil modul calculate untuk mengkalkulasikan hasil berdasarkan data data yang diinputkan user
            int result = calculate(operand1, operand2, operator);
            System.out.println("Hasil: " + result);
        }
    }
}
