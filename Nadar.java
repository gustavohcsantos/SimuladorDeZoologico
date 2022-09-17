package Entidades;

import Entidades.Interfaces.InterfaceDeAndar;
import javax.swing.JOptionPane;

public class Nadar implements InterfaceDeAndar{

    @Override
    public void andar() {
        JOptionPane.showMessageDialog(null, "Eu não ando, nado.");
    }
    
}
