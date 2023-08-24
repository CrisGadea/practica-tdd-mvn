package tama;

public class Tamagotchi {

    private Integer nivel;

    public Tamagotchi(Integer nivel){
        this.nivel = nivel;
    }

    public Tamagotchi(){
        this.nivel = 0;
    }

    public Integer getNivel(){
        return nivel;
    }

}
