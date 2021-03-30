package ar.com.xeven;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    //atributos
    private List<Contenido> favoritos = new ArrayList<>();
    private List<Contenido> recomendaciones = new ArrayList<>();
    private List<Contenido> catalogo = new ArrayList<>();
    private List<Medio> continuarViendo = new ArrayList<>();

    //constructor
    public Usuario(List<Contenido> catalogo){
        this.catalogo = catalogo;

        Medio medio;
        Contenido contenido = catalogo.get(0); //al catalogo le pido el primer cnntenido que tenga
        if (contenido.isPelicula()){
            medio = (Medio) contenido;
        } else {
            Serie s = (Serie) contenido;
            medio = (Medio) s.getEpisodio(0);
        }
        medio.reproducir();

    }
}
