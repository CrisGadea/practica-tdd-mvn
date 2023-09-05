package tama;

public class Tamagotchi {

    private Integer nivel;

    private String estado;

    // TODO: Refactor
    private final Integer TIEMPO_EN_MINS = 90;

    public Tamagotchi(Integer nivel){
        this.nivel = nivel;
        estado = "hambriento";
    }

    public Tamagotchi(){
        this.nivel = 0;
        estado = "hambriento";
    }

    public Integer getNivel(){
        return nivel;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public String getEstado(){
        return estado;
    }


    // Metodos de la aplicacion

    public void comer(){
        if (estado.equals("hambriento")){
            setEstado("contento");
        } else if (estado.equals("contento")){
            nivel++;
        } else if (estado.equals("aburrido") && TIEMPO_EN_MINS > 80){
            setEstado("contento");
        }
    }

}
