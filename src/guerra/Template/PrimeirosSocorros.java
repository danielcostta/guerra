package guerra.Template;

public abstract class PrimeirosSocorros {
    
    private void verificarBatimentos(){
        System.out.println("Verificando batimentos...");
    }
    
    private void verificarPulsacao(){
        System.out.println("Verificando pulsação...");
    }
    
    protected abstract void mover();
    
    public void aplicarSocorro(){
        verificarBatimentos();
        verificarPulsacao();
        mover();
    }
    
}
