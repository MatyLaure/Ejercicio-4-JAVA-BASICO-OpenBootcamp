//clase hija

public class SmartWatch extends SmartDevice{
    int contPasos;
    double ritmoCardiaco;
    double presionArterial;
    boolean monitSueño;

    public SmartWatch(){

    }

    public SmartWatch(String fabricante, String informacion, boolean llamadas, boolean mensajes, int camPixeles, double cronometro, double reloj, int memoria, boolean alarma, boolean gps, int contPasos, double ritmoCardiaco, double presionArterial, boolean monitSueño) {
        super(fabricante, informacion, llamadas, mensajes, camPixeles, cronometro, reloj, memoria, alarma, gps);
        this.contPasos = contPasos;
        this.ritmoCardiaco = ritmoCardiaco;
        this.presionArterial = presionArterial;
        this.monitSueño = monitSueño;
    }

    public SmartWatch(int contPasos, double ritmoCardiaco, double presionArterial,
                      boolean monitSueño) {

        this.contPasos = contPasos;
        this.ritmoCardiaco = ritmoCardiaco;
        this.presionArterial = presionArterial;
        this.monitSueño = monitSueño;

    }

    public void contPasos(int quantity){
        this.contPasos += quantity;
    }

    public void ritmoCardiaco(double quantity){
        this.ritmoCardiaco += quantity;
    }

    public void presionArterial(double quantity){
        this.presionArterial += quantity;
    }
}