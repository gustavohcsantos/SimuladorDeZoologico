package Entidades;

import Entidades.Interfaces.InterfaceDeVoar;
import javax.swing.JOptionPane;

public class VoarDeAsaDelta implements InterfaceDeVoar{

    @Override
    public void voar() {
        JOptionPane.showMessageDialog(null, "Voar de Asa Delta.");
    }

}
