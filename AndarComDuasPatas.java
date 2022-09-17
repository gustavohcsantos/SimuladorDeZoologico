package Entidades;

import Entidades.Interfaces.InterfaceDeAndar;
import javax.swing.JOptionPane;

public class AndarComDuasPatas implements InterfaceDeAndar{

    @Override
    public void andar() {
        JOptionPane.showMessageDialog(null, "Andar com 2 patas.");
    }
    
}
