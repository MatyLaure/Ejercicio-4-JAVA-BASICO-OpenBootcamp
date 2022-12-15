public class SmartDevice {

        String fabricante;
        String informacion;
        boolean llamadas;
        boolean mensajes;
        int camPixeles;
        double cronometro;
        double reloj;
        int memoria;
        boolean alarma;
        boolean gps;


        public SmartDevice(){

        }

        public SmartDevice(String fabricante, String informacion, boolean llamadas, boolean mensajes,
                           int camPixeles, double cronometro, double reloj, int memoria, boolean alarma,
                           boolean gps) {

                this.fabricante = fabricante;
                this.informacion = informacion;
                this.llamadas = llamadas;
                this.mensajes = mensajes;
                this.camPixeles = camPixeles;
                this.cronometro = cronometro;
                this.reloj = reloj;
                this.memoria = memoria;
                this.alarma = alarma;
                this.gps = gps;
        }

        public void camPixeles(int quantity){
                this.camPixeles += quantity;
        }

        public void cronometro(double quantity){
                this.cronometro += quantity;
        }

        public void reloj(double quantity){
                this.reloj += quantity;
        }

        public void memoria(int quantity)
        {
                if (quantity>0);
                else if (quantity<257);
                this.memoria += quantity;
        }
}
