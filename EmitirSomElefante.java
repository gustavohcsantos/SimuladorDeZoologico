
package Entidades;

import Entidades.Interfaces.InterfaceDeEmitirSom;
import javax.swing.JOptionPane;

public class EmitirSomElefante implements InterfaceDeEmitirSom{

    @Override
    public void emitirSom(){
        JOptionPane.showMessageDialog(null, "VROOOOOOOOOOOON!!");
    }
}
