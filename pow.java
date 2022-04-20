import java.util.Scanner;

public class pow {
    public static void main(String[] args){

        Scanner valores = new Scanner(System.in);
        System.out.println("Digite o Valor Inicial(a1): ");
        int vInicial = valores.nextInt();
        System.out.println("Digite o Número de Termos(n): ");
        int vTermo = valores.nextInt();
        System.out.println("Digite uma Razão(q) maior ou igual a 2: ");
        int vRazao = valores.nextInt();
        valores.close();
        if (vRazao < 2){
            System.out.println("Insira uma razão maior que 2!");
        }
        int contador = 1;
        while (vTermo > contador){
            int Qn = vRazao * vRazao;
            contador = contador+1;
        }

        int resultado = (vInicial * (Math.pow(vRazao, vTermo) -1) / (vRazao -1);
        System.out.println("Resultado final é: " + resultado);
    }
}