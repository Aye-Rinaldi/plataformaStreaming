package ar.com.xeven;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido{
    //atributos
    private List<Episodio> episodios = new ArrayList<>();

    //getters y setters
    public List<Episodio> getEpisodios() {
        return episodios;
    }

    public void setEpisodios(List<Episodio> episodios) {
        this.episodios = episodios;
    }


    //metodo para retornar un episodio
    public Episodio getEpisodio(int numero){
        return episodios.get(numero); //devuelve episodio segun el numero
    }
}
