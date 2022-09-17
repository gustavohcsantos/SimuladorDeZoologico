package Entidades;

import Entidades.Interfaces.InterfaceDeTomarBanho;
import javax.swing.JOptionPane;

public class TomarBanhoDeCachoeira implements InterfaceDeTomarBanho{

    @Override
    public void tomarBanho() {
        JOptionPane.showMessageDialog(null, "Tomando banho de cachoeira.");
    }

}
