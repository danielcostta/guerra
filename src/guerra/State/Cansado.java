package guerra.State;

public class Cansado implements Estado {

    @Override
    public void andar() {
        System.out.println("Andando lento");
    }

    @Override
    public void pular() {
        System.out.println("Andando lento");
    }
    
}
