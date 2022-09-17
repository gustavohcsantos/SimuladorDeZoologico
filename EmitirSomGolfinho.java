
package Entidades;

import Entidades.Interfaces.InterfaceDeEmitirSom;
import javax.swing.JOptionPane;

public class EmitirSomGolfinho implements InterfaceDeEmitirSom{

    @Override
    public void emitirSom(){
        JOptionPane.showMessageDialog(null, "CRICRICRIEEEEEEEG!");
    }
}
