import java.util.Scanner;

public class condicionais {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois números para compararmos:");
        int num1 = sc.nextInt();
        int num2 =sc.nextInt();

        if(num1 > num2){

            System.out.println("O número " + num1 + " é o maior dos dois números");

        }else if(num2 > num1){

            System.out.println("O número " + num2 + " é o maior dos dois números");

        } else if (num1 == num2) {

            System.out.println("Os dois números são iguais");

        }else{

            System.out.println("Opção inválida");
        }


    }
}
