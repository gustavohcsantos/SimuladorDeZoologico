package Entidades;

import Util.DataUtility;
import javax.swing.JOptionPane;

public class Leao extends Animal{
    
    public void imprimir() {
        JOptionPane.showMessageDialog(null,
                "Eu sou um Leão"
                + "\n\nNome: " + getNome()
                + "\nCor: " + getCor()
                + "\nDescrição: " + getDescricao()
                + "\nIdentificador: " + getIdentificador()
                + "\nSexo: " + getSexo()
                + "\nData de Nascimento: " + DataUtility.formatarDataComPadrao(getDataDeNascimento(), "dd/MM/yyyy")
                + "\nDomesticado: " /*+ respostaDomestico*/
                + "\nEu tenho " + calcularIdade(getDataDeNascimento())+ " ano(s)."
                + "\nEspécie: " + especie.getDescricao()
                + "\n\n---------- Meus comportamentos são: ----------");
        
        setComportamentoDeAlimentar(new ComerCarne());
        setComportamentoDeAndar(new AndarComQuatroPatas());
        setComportamentoDeTomarBanho(new TomarBanhoDeCachoeira());
        rugir();
        
        
        executarCompartamentos();
        
    }
}
