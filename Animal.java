
package Entidades;

import Entidades.Interfaces.InterfaceDeVoar;
import Entidades.Interfaces.InterfaceDeTomarBanho;
import Entidades.Interfaces.InterfaceDeAndar;
import Entidades.Interfaces.InterfaceDeEmitirSom;
import Entidades.Interfaces.InterfaceDeAlimentar;
import Util.DataUtility;
import java.util.Date;
import javax.swing.JOptionPane;
import lombok.*;

@Getter
@Setter

public abstract class Animal {
    private String nome;
    private String cor;
    private String descricao;
    private int identificador;
    private char sexo;
    private Date dataDeNascimento;
    Especie especie;
    
    private InterfaceDeAlimentar comportamentoDeAlimentar;
    private InterfaceDeAndar comportamentoDeAndar;
    private InterfaceDeVoar comportamentoDeVoar;
    private InterfaceDeEmitirSom comportamentoDeEmitirSom;
    private InterfaceDeTomarBanho comportamentoDeTomarBanho;
    
    public abstract void imprimir();
    
    public int calcularIdade(Date dataDeNascimento){
        
        return DataUtility.calcularIdade(dataDeNascimento);
    }
    
    public void emitirSomMiau() {
        JOptionPane.showMessageDialog(null, "Miauuuu...");
    }
    
    public void latir() {
        JOptionPane.showMessageDialog(null, "AU! AU! GRRR... AAAAAU!");
    }
    
    public void rugir() {
        JOptionPane.showMessageDialog(null, "GGGRRRRRRRR...");
    }
    
    public void executarCompartamentos(){
        comportamentoDeAlimentar.alimentar();
        comportamentoDeAndar.andar();
        comportamentoDeVoar.voar();
        comportamentoDeEmitirSom.emitirSom();
        comportamentoDeTomarBanho.tomarBanho();
    }
    
}
