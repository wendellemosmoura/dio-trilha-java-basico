public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "Wendel " + "Lemos";
        
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
        
        // operadores unários
        int numero = 5;
        numero = - numero;
        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero);

        // incremento e decremento
        numero++;
        System.out.println(numero);

        numero--;
        System.out.println(numero);

        boolean variavel = true;
        System.out.println(variavel);

        variavel = !variavel;
        System.out.println(variavel);

        // operadore ternário
        int a, b;

        a = 5;
        b = 6;
        String resultado = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado);

        // operadores relacionais
        int numero1 = 1;
        int numero2 = 2;
        String nome1 = "Wendel";
        String nome2 = new String("Wendel");

        boolean simNao = numero1 == numero2;
        System.out.println("numero1 é igual a nunmero2? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numero1 é diferente de nunmero2? " + simNao);


        simNao = numero1 > numero2;
        System.out.println("numero1 é maior que nunmero2? " + simNao);

        System.out.println(nome1.equals(nome2));

        // operadores lógicos
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }

    }
}
