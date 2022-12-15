// clase hija


public class SmartPhone extends SmartDevice{
    int camFrontal;
    int memExterna;
    boolean juegos;
    boolean lectorHuella;

    public SmartPhone(){

    }

    public SmartPhone(String fabricante, String informacion, boolean llamadas, boolean mensajes, int camPixeles, double cronometro, double reloj, int memoria, boolean alarma, boolean gps, int camFrontal, int memExterna, boolean juegos, boolean lectorHuella) {
        super(fabricante, informacion, llamadas, mensajes, camPixeles, cronometro, reloj, memoria, alarma, gps);
        this.camFrontal = camFrontal;
        this.memExterna = memExterna;
        this.juegos = juegos;
        this.lectorHuella = lectorHuella;
    }

    public SmartPhone(int camFrontal, int memExterna, boolean juegos, boolean lectorHuella) {

        this.camFrontal = camFrontal;
        this.memExterna = memExterna;
        this.juegos = juegos;
        this.lectorHuella = lectorHuella;
    }

    public void memExterna(int quantity)
    {
        this.memExterna += quantity;
        while (memExterna<=128){
        if (memExterna>0);
        else if (memExterna<=128);
        }

    }
}
