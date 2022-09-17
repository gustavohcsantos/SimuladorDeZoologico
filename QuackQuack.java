package Entidades;

import Entidades.Interfaces.InterfaceDeEmitirSom;
import javax.swing.JOptionPane;

public class QuackQuack implements InterfaceDeEmitirSom{

    @Override
    public void emitirSom() {
        JOptionPane.showMessageDialog(null, "Quack! Quack!");
    }
    
}
