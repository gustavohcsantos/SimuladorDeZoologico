
package Entidades;

import Entidades.Interfaces.InterfaceDeTomarBanho;
import javax.swing.JOptionPane;

public class TomarBanhoDeMangueira implements InterfaceDeTomarBanho{

    @Override
    public void tomarBanho(){
        JOptionPane.showMessageDialog(null, "Tomar banho de mangueira é tudo de bom! XUUUUÁÁÁÁÁÁ...");
    }
}
