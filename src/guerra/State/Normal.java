package guerra.State;

public class Normal implements Estado {

    @Override
    public void andar() {
        System.out.println("Andando normal");
    }

    @Override
    public void pular() {
        System.out.println("Pulando normal");
    }
    
}
