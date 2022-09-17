
package Entidades;

import Entidades.Interfaces.InterfaceDeAlimentar;
import javax.swing.JOptionPane;

public class ComerSementes implements InterfaceDeAlimentar{

    @Override
    public void alimentar() {
        JOptionPane.showMessageDialog(null, "Me alimento de sementes");
    }
}
