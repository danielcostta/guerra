package guerra.Frente;

import guerra.UnidadeMedica.UnidadeMedica;
import guerra.JeitoDeCombate.ArmaBranca;

public class Guerra {

    public static void main(String[] args) {
       
       Soldado combatente = new Combatente(); 
        
       // -------------- //
       System.out.println("------------------------------");
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
       combatente.setNome("Daniel");
       System.out.println("------------------------------");
       // -------------- // //OBSERVER//
       
       // -------------- //
       combatente.aplicarSocorro();
       System.out.println("------------------------------");
       // -------------- // //TEMPLATE//
       
    }
    
}
