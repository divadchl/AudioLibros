package mx.com.serviciosinformaticosintegrales.audiolibros;


import android.content.Context;
import android.content.SharedPreferences;

public class Saldo {
    private static Saldo INSTANCIA = new Saldo();
    private Context contexto;
    private int saldo = -1;

    private Saldo(){
    }

    public static Saldo getInstancia(){
        return INSTANCIA;
    }

    public void inicializa(Context contexto){
        this.contexto = contexto;
        SharedPreferences pref = contexto.getSharedPreferences("pref", Context.MODE_PRIVATE);
        int saldo = pref.getInt("saldo_inicial", -1);
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    /*
        Para utilizar la clase

        Saldo saldo = Saldo.getInstance();
        saldo.inicializa(contexto);
        int n = saldo.getSaldo();

     */
}
