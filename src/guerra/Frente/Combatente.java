package guerra.Frente;

import guerra.Frente.Soldado;
import guerra.JeitoDeCombate.ArmaDeFogo;

public class Combatente extends Soldado {
    
    public Combatente() {
        super(new ArmaDeFogo());
    }

    @Override
    protected void mover() {
        System.out.println("Não move...");
    }
    
}
