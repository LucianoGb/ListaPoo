
import javax.swing.*;

public class Lista02Ex06 {
    public static void main(String[] args){
        double preco, acressimo, valorVenda;
        preco = Double.parseDouble(JOptionPane.showInputDialog("Entre com o preço do produto :"));
        acressimo = Double.parseDouble(JOptionPane.showInputDialog("Entre com o acressimo em porcentagem :"));
        valorVenda =((acressimo / 100)* preco) + preco;
        JOptionPane.showMessageDialog(null,"Valor de venda do produto é :" + valorVenda);
    }
}
