public class Multiplos {
    public static void main(String[] args){
        int k = 1000;
        int soma = 0;
        while(k>0){
            if(k%3 == 0 || k%5 == 0){
                soma = soma+k;
            }
            k = k-1;
            }
            System.out.println("O valor é:" + soma);
    }
}