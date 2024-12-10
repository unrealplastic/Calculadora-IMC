import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.println("Este é um programa que calcula seu IMC");

        System.out.println("Qual seu peso?");
        double peso = ler.nextDouble();

        System.out.println("Qual sua altura?");
        double altura = ler.nextDouble();
        
        double imc = peso/(altura*altura);
        System.out.printf("Seu IMC é de %.2f\n", imc);
        
        if (imc<17){
            System.out.println("Você está muito abaixo do peso");
        }
        
        if (imc==17 && imc<=18.49){
            System.out.println("Você está abaixo do peso");
        }

        if (imc>=18.5 && imc<=24.99){
            System.out.println("você está com um peso normal");
        }

        if (imc>=25 && imc<=29.99){
            System.out.println("Você está um pouco acima do peso");
        }

        if (imc>=30 && imc<=34.99){
            System.out.println("Você pode ser portador de Obesidade I");
        }

        if (imc>=35 && imc<=39.99){
            System.out.println("Você pode ser portador de Obesidade II");
        }

        if (imc>40){
            System.out.println("Você pode ser portador de Obesidade III");
        }

        System.out.println("EM CASO DE DÚVIDAS, PROCURE UM MÉDICO!");




        ler.close();
    }
}
