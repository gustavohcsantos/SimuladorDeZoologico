package Entidades;

import Entidades.Interfaces.InterfaceDeVoar;
import javax.swing.JOptionPane;

public class VoarComDuasAsas implements InterfaceDeVoar{

    @Override
    public void voar() {
        JOptionPane.showMessageDialog(null, "Voar com duas asas.");
    }
    
}
