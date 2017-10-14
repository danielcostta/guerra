package guerra.Frente;

import guerra.EstadoSoldado.Estado;
import guerra.EstadoSoldado.Normal;
import guerra.UnidadeMedica.UnidadeMedica;
import guerra.JeitoDeCombate.JeitoDeCombate;
import java.util.ArrayList;
import java.util.List;

public abstract class Soldado {
    
    private JeitoDeCombate jeitodecombate;
    
    private Estado estado;
    
    public Soldado(JeitoDeCombate combate){
        this.jeitodecombate = combate;
        this.estado = new Normal();
    }
    
    public void combate(){
        jeitodecombate.combate();
    }
    
    public void setJeitoDeCombate(JeitoDeCombate jeitodecombate){
        this.jeitodecombate = jeitodecombate;
    }
    
    public void setEstado(Estado estado){
        this.estado = estado;
    }
    
    public void andar(){
        estado.andar();
    }
    
    public void pular(){
        estado.pular();
    }
    
    private List <UnidadeMedica> medicos = new ArrayList<>();
    
    private String nome;
    
    public void setNome(String nome){
        this.nome = nome;
        notificarTodos();
    }
    
    private void notificarTodos(){
        for(UnidadeMedica u: medicos){
            u.informa();
        }
    }
    
    public void addMedicos(UnidadeMedica novoMedico){
        this.medicos.add(novoMedico);
    }
    
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
