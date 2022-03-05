import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args){

    try (Scanner sc = new Scanner(System.in)){
    int a, b;
    int res=0;
    
    System.out.println("Inserte el primer número: ");
    a = sc.nextInt();

    System.out.println("\nInserte el operador para el tipo de operación (+, -, *, /): ");
    char op = sc.next().charAt(0);

    System.out.println("\nInserte el segundo número: ");
    b = sc.nextInt();

    switch(op){

        case '+':
        System.out.println("\nEl resultado es "r+es);
        break;

        case '-':
        res = a-b;
        break;

        case '*':
        res = a*b;
        break;

        case '/':
        res = a/b;
        break;

        default:
        System.out.println("\nNo se ingresó un operador válido");
        break;
    }
}
}
}