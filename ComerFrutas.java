
package Entidades;

import Entidades.Interfaces.InterfaceDeAlimentar;
import javax.swing.JOptionPane;

public class ComerFrutas implements InterfaceDeAlimentar{

    @Override
    public void alimentar() {
        JOptionPane.showMessageDialog(null, "Me alimento de frutas");
    }
}
