import java.awt.*;

public class Lista01Ex05 {
    public static void main(String[] args){
        int n, n2;
        n = 30;
        n2 = 40;
        Integer resto = n % n2;
        if(resto == null) {
            System.out.println("Nulo");
        }else{
            System.out.println("Não nulo :"+ resto);
        }

    }
}
