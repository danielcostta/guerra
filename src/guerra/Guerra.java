package guerra;

import guerra.Observer.UnidadeMedica;
import guerra.Strategy.ArmaBranca;
import guerra.Strategy.Combatente;
import guerra.Template.Basico;
import guerra.Template.PrimeirosSocorros;

public class Guerra {

    public static void main(String[] args) {
        
       // -------------- //
       System.out.println("------------------------------");
       Soldado combatente = new Combatente();
       combatente.setJeitoDeCombate(new ArmaBranca());
       combatente.combate();
       System.out.println("------------------------------");
       // -------------- // //STRATEGY//
       
       // -------------- //
       combatente.andar();
       combatente.pular();
       System.out.println("------------------------------");
       // -------------- // //STATE//
       
       // -------------- //
       combatente.addMedicos(new UnidadeMedica());
       combatente.setNome("Ninguem");
       System.out.println("------------------------------");
       // -------------- // //OBSERVER//
       
       // -------------- //
       PrimeirosSocorros ps = new Basico();
       ps.aplicarSocorro();
       System.out.println("------------------------------");
       // -------------- // //TEMPLATE//
       
    }
    
}
