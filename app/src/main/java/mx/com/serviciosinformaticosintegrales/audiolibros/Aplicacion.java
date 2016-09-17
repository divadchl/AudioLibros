package mx.com.serviciosinformaticosintegrales.audiolibros;

import android.app.Application;

import java.util.Vector;

/**
 * Created by DACALO on 09/09/2016.
 */
public class Aplicacion extends Application{

    private Vector<Libro> vectorLibros;
    private AdaptadorLibros adaptador;

    @Override
    public void onCreate() {
        vectorLibros = Libro.ejemploLibros();
        adaptador = new AdaptadoLibros (this, vectorLibros);
    }

    public AdaptadorLibros getAdaptador(){
        return adaptador;
    }

    public Vector<Libro> getVectorLibro(){
        return vectorLibros;
    }
}
