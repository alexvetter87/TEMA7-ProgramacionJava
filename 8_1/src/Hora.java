import javax.sound.sampled.SourceDataLine;

public class Hora {
    protected int hora,minutos;
    Hora(int hora, int minutos){
        this.hora=0;
        this.minutos=0;
        if (!setHora(hora)){
            System.out.println("la hora es incorrecta");

        }
if (!setMinutos(minutos)){
    System.out.println("los minutos no son validos");
}
    }
    public void inc() {
        minutos++;
        if (minutos>59) {
            minutos=0;
            hora++;
            if (hora>23) {
                hora=0;
            }
        }
    }
    public boolean setMinutos(int minutos) {
        boolean correcto= false;
        if (minutos>=0 && minutos<60) {
            this.minutos = minutos;
            correcto=true;
        }
        return correcto;
    }
    public boolean setHora(int hora) {
        boolean correcto= false;
        if (hora>=0 && hora<24) {
            this.hora = hora;
            correcto=true;
        }
        return correcto;
    }
    public String toString() {
        String result;
        result=hora+":"+minutos;
        return result;
    }
}