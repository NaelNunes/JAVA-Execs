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
            num /= 10;
        }
        
        System.out.println("Soma de todos os numeros: "+soma);
    }
    
    
    public static boolean validaDATA(int dia, int mes, int ano)
    {
        if((dia > 0 && dia < 32) && (mes > 0 && mes < 13) && ano > 0)
        {
            return true;
        } else {
            return false;
        }
    }
    
    public static void exec3()
    {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma data! ");
        System.out.println("Dia: ");
        int dia = leitor.nextInt();
        System.out.println("Mes: ");
        int mes = leitor.nextInt();
        System.out.println("Ano: ");
        int ano = leitor.nextInt();
        
        if(validaDATA(dia,mes,ano))
        {
            int contDias = 0;
            for(int i = 0; i < mes; i++)
            {
                switch (i){
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        contDias += 31;
                        break;
                    case 4: case 6: case 9: case 11:
                        contDias += 30;
                        break;
                    case 2:
                        contDias += (ano % 4 == 0) ? 29 : 28;
                        break;
                }
            }
            contDias += dia-1;
            System.out.println("Dias desde 1 de janeiro: "+contDias);
           
            
        } else {
            System.out.println("Data invalida!");
        }
        
    }

    public static void exec4() {
	    Scanner leitor = new Scanner(System.in);
	    double pi = 3.1415;
	    
	    System.out.println("Digite a letra correspondente");
	    System.out.println("a. Calcular a área de um Círculo");
	    System.out.println("b. Calcular a área de um Triângulo");
	    System.out.println("c. Calcular a área de um Quadrado");
	    System.out.println("d. Calcular a área de um Retângulo");
	    
	    String op = leitor.nextLine();
	    switch(op){
	        case "a":
	            System.out.println("Digite o raio: ");
	            double raio = leitor.nextDouble();
	            System.out.println("A area do circulo: "+pi*(raio*raio));
	            break;
	            
	        case "b":
	            System.out.println("Digite a base: ");
	            double base = leitor.nextDouble();
	            System.out.println("Digite a altura: ");
	            double altura = leitor.nextDouble();
	            System.out.println("A area do triangulo: "+base*altura/2);
	            break;
	            
	        case "c":
	            System.out.println("Digite um lado: ");
	            double lado = leitor.nextDouble();
	            System.out.println("Area do quadrado: "+lado*lado);
	            break;
	            
	        case "d":
	            System.out.println("Digite a base: ");
	            base = leitor.nextDouble();
	            System.out.println("Digite a altura: ");
	            altura = leitor.nextDouble();
	            System.out.println("Area do retangulo: "+base*altura);
	            break;
	        
	        default:
	            System.out.println("Erro!");
	            break;
	       
	    }
	    
	}
}
