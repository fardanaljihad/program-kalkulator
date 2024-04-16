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

    public static boolean validateInput(int operand1, int operand2, char operator) 
    {
        boolean isValid = true;

        if (operator != '+' && operator != '-' && operator != '*' && operator != '/') 
        { 
            System.out.println("Error: Operator tidak valid.");
            isValid = false;
        }
        else if (operand2 == 0 && operator == '/') 
        {
            System.out.println("Error: Pembagi tidak boleh nol.");
            isValid = false;
        }
        else if (operand1 < -32768 || operand1 > 32767 || operand2 < -32768 || operand2 > 32767) 
        { 
            System.out.println("Error: Operand harus dalam rentang -32,768 hingga 32,767.");
            isValid = false;
        }

        return isValid;
    }

    public static int calculate(int operand1, int operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
            default:
                return 0;
        }
    }
    
}
