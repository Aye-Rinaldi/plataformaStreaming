package ar.com.xeven;

public interface Medio {
    //implemento metodos por default
    default void subirVolumen(){

    }
    default void bajarVolumne(){

    }
    default void pausar(){

    }
    default void detener(){

    }
    void reproducir(); //a este metodo lo tengo que implementar porq necesito el atributo duracion


}
