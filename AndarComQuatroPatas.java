package Entidades;

import Entidades.Interfaces.InterfaceDeAndar;
import javax.swing.JOptionPane;

public class AndarComQuatroPatas implements InterfaceDeAndar{

    @Override
    public void andar() {
        JOptionPane.showMessageDialog(null, "Ando com 4 patas (às vezes com 3).");
    }
}