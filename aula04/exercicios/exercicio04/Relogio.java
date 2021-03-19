package exercicios.exercicio04;

public class Relogio {
    // Atributos
    private int hora, minuto, segundo;
    // Construtor
    Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMin(minuto);
        setSeg(segundo);
    }
    // Metodos
    void getHour() {
        System.out.printf("Hora Atual: %2d:%2d:%2d\n", hora, minuto, segundo);
    }
    int setHora(int hora) {
        if ((hora >= 0 ) && (hora < 24)) {
            this.hora = hora;
        }
        return hora;
    }
    int setMin(int minuto) {
        if((minuto >=0 ) && (minuto < 60)) {
            this.minuto = minuto;
        }
        return minuto;
    }
    int setSeg(int segundo) {
        if (( segundo >=0 ) && (segundo < 60)) {
            this.segundo = segundo;
        }
        return segundo;
    }
}
