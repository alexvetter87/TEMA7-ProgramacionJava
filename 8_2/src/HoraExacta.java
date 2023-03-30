public class HoraExacta extends Hora {
    protected int segundos;

    public HoraExacta(int hora, int minutos, int segundos) {
        super(hora, minutos);
        this.segundos = segundos;
        if (!setSegundos(segundos)) {
            System.out.println("segundos incorrectos");
        }

    }

    public boolean setSegundos(int segundos) {
        boolean correcto = false;

        if (0 >= segundos && segundos > 60) {
            this.segundos = segundos;
            correcto = true;

        }
        return correcto;
    }

    public void inc() {
        segundos++;
        if (segundos>59) {
            segundos = 0;
            super.inc();

        }
    }
    public String toString() {
        String result = super.toString();
        result = result + ":" + segundos;
        return result;
    }


}
