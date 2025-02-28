import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        exec1();
    }
    
    public static void exec1()
    {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus: ");
        double graus = leitor.nextDouble();

        double fahrenheit = graus * 1.8 + 32;
        double kelvin = graus + 273.15;
        double rankine = kelvin * (9.0/5.0);
        System.out.println("A temperatura em fahrenheit e: "+String.format("%.2f",fahrenheit)+", em kelvin e: "+String.format("%.2f",kelvin)+" e em rankine e: "+ String.format("%.2f",rankine));
    }
    
    public static void exec2()
    {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        long num = leitor.nextLong();
        long soma = 0;
        
        while(num > 0)
        {
            soma += num%10;
        }
        
        
        
    }
}
