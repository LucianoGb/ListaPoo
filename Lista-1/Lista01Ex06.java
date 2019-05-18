public class Lista01Ex06 {
    public static void main(String[] args){
        double n1= 30, n2 =70, soma, dobro;
        System.out.println("Soma: "+ (n1 + n2 ));
        System.out.println("Subtração: "+ (n1 - n2 ));
        System.out.println("Multiplicação: "+ (n1 * n2 ));
        System.out.println("Divisão: "+ (n2 / n1 ));
        soma = n1 + n2;
        dobro = n2 * n2;
        if((soma >= dobro))
            System.out.println("A soma do primeiro com segundo é maior ou igual ao dobro do segundo");
        else
        System.out.println("O dobro do segundo valor é maior que a soma do primeiro com segundo");
        ;
    };
};
