import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la cantidad");
        int cant = sc.nextInt();
        int a=0;
        int b=1;
        int c=0;
        for (int i=0; i<cant; i++ ){
            System.out.println("la serie numero "+(i+1)+" es: ");
            System.out.println(a);
            System.out.println("el resultado al cubo es: "+ (int)Math.pow(a,3));
            c=a+b;
            a=b;
            b=c;
        } 
    }
}

