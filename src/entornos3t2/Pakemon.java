/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entornos3t2;

/**
 * Clase utilizada para establecer la mecánica interna del juego con sus
 * atributos y métodos
 * 
 * @author Fernando Esteban Pelayo
 * @version 1.0
 * @see "https://github.com/PacoIESJM/ExamDistancia.git"
 */
public class Pakemon {

    private String nombreJugador; //nombre del jugador, se pide al crear el juego
    private boolean juegoPasado; //indica si se ha pasado el juego o aún no
    private int pakemonCapturados; //indica los pakemon que tiene el jugador en su poder
    private int pakeballs; //disponibles para capturar pakemons

    /**
     * Constructor principal de la clase Pakemon
     * 
     * @param nombreIn Nombre que se establece al jugador
     */
    public Pakemon(String nombreIn) {
        if (nombreIn.equals("")) {
            this.nombreJugador = "Vago/a";
        } else {
            this.nombreJugador = nombreIn;
        }
        this.juegoPasado = false;
        this.pakemonCapturados = 0;
    }

    /**
     * Método para captura de Pakemon
     * @param nombrePakemon Nombre del pakemon
     * @return boolean
     */
    public boolean capturarPakemon(String nombrePakemon) {
        if (this.pakeballs == 0) {
            System.out.println("No se puede capturar");
            return false;
        } else if (nombrePakemon.equals("Mew")) {
            System.out.println("Casi imposible, majo");
            return false;
        } else {
            System.out.println("¡Capturado!");
            this.pakeballs--;
            return true;

        }
    }

    /**
     * Método para incrementar el número de Pakeballs
     */
    public void cogerPakeball() {
        this.pakeballs++;
        System.out.println("Se ha encontrado una Pakeball");
    }

    /**
     *Dice la clave final
     * 
     * @param claveFin Clave final
     * @return string
     */
    public String decirClaveFinal(int claveFin) {
        if (claveFin == 1223424345) {
            return "¡Has ganado!";
        } else {
            return "¡Chicos, hay que estudiar más!";
        }
    }

    /**
     * Getter del nombre del jugador
     * 
     * @return nombreJugador nombre del jugador
     */
    public String getNombreJugador() {
        return nombreJugador;
    }

    /**
     * Setter del nombre del jugador
     * @param nombreJugador nombre del jugador
     */
    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    /**
     * Confirma si el juego está pasado
     * 
     * @return juegoPasado Confirmación del juego completado
     */
    public boolean isJuegoPasado() {
        return juegoPasado;
    }

    /**
     * Setter del juego completado
     * 
     * @param juegoPasado Si el juego se ha pasado
     */
    public void setJuegoPasado(boolean juegoPasado) {
        this.juegoPasado = juegoPasado;
    }

    /**
     * Getter pakemos capturados
     * 
     * @return pakemonCapturados Número de pakemons capturados
     */
    public int getPakemonCapturados() {
        return pakemonCapturados;
    }

    /**
     * Setter pakemons capturados
     * @param pakemonCapturados Número de pakemons capturados
     */
    public void setPakemonCapturados(int pakemonCapturados) {
        this.pakemonCapturados = pakemonCapturados;
    }

    /**
     * Getter de pakeballs
     * 
     * @return pakeballs Número de pakeballs
     */
    public int getPakeballs() {
        return pakeballs;
    }

    /**
     * Setter de pakeballs
     * 
     * @param pakeballs Número de pakeballs
     */
    public void setPakeballs(int pakeballs) {
        this.pakeballs = pakeballs;
    }

}
