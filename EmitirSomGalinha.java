
package Entidades;

import Entidades.Interfaces.InterfaceDeEmitirSom;
import javax.swing.JOptionPane;

public class EmitirSomGalinha implements InterfaceDeEmitirSom{

    @Override
    public void emitirSom(){
        JOptionPane.showMessageDialog(null, "KÓKÓRIIIIIKÓÓÓ!!");
    }
}
