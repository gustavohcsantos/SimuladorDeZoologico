
package Entidades;

import Entidades.Interfaces.InterfaceDeEmitirSom;
import javax.swing.JOptionPane;

public class EmitirSomCavalo implements InterfaceDeEmitirSom{

    @Override
    public void emitirSom(){
        JOptionPane.showMessageDialog(null, "Sente o naipe: IIIIEEHEHEHEHEEEE!");
    }
}
