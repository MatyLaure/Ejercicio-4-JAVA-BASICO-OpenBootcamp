public class Main {
    public static void main(String[] args) {

        SmartDevice samsung = new SmartDevice("Samsung", "Llamadas mensajes y aplicaciones todo en samsung", true, true, 0, 0d, 0d, 0, true, true);

        System.out.println(samsung.fabricante);
        System.out.println(samsung.informacion);
        System.out.println(samsung.llamadas);
        System.out.println(samsung.mensajes);
        System.out.println(samsung.alarma);
        System.out.println(samsung.gps);
        System.out.println("");


        SmartPhone samsungS20 = new SmartPhone("Samsung S20", "Llamadas memsajes y aplicaciones todo en Samsung S20", true, true, 60, 0d, 0d, 0, true, true, 32, 0, true, true);

        System.out.println(samsungS20.fabricante);
        System.out.println(samsungS20.informacion);
        System.out.println(samsungS20.llamadas);
        System.out.println(samsungS20.mensajes);
        System.out.println(samsungS20.camPixeles + "mpx");
        System.out.println(samsungS20.memoria);
        System.out.println(samsungS20.alarma);
        System.out.println(samsungS20.gps);
        System.out.println(samsungS20.camFrontal + "mpx");
        System.out.println(samsungS20.memExterna);
        samsungS20.memExterna(64);
        System.out.println(samsungS20.memExterna + "gb");
        samsungS20.memExterna(64);
        System.out.println(samsungS20.memExterna + "gb");
        System.out.println(samsungS20.juegos);
        System.out.println(samsungS20.lectorHuella);
        System.out.println("");

        SmartWatch samsungWatch = new SmartWatch("Samsung Watch", "Llamadas memsajes y aplicaciones todo en Samsung Watch", true, true, 13, 0d, 0d, 32, true, true, 0, 0d, 0d, true);

        System.out.println(samsungWatch.fabricante);
        System.out.println(samsungWatch.informacion);
        System.out.println(samsungWatch.llamadas);
        System.out.println(samsungWatch.mensajes);
        System.out.println(samsungWatch.camPixeles + "mpx");
        System.out.println(samsungWatch.memoria);
        System.out.println(samsungWatch.alarma);
        System.out.println(samsungWatch.gps);
        System.out.println(samsungWatch.monitSueño);
        System.out.println("");
        System.out.println("Fin del ejercicio 4 JAVA BASICO");
    }

}