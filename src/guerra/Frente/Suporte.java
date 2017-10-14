package guerra.Frente;

import guerra.Frente.Soldado;
import guerra.JeitoDeCombate.ArmaDeFogo;

public class Suporte extends Soldado {

    public Suporte() {
        super(new ArmaDeFogo());
    }

    @Override
    protected void mover() {
        System.out.println("Movendo...");
    }
    
}
