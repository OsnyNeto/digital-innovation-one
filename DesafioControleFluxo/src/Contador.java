import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        //Chamando a classe Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int numero1 = sc.nextInt();
        
        System.out.println("Digite o segundo parâmetro");
        int numero2 = sc.nextInt();
        try {
            contar(numero1,numero2);

            
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroUm>parametroDois){
            throw new ParametrosInvalidosException();
        }

		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
        for(int i=0; i<contagem;i++){
            System.out.println("Número - "+(i+1));
        }
	}

    
}
