package mx.com.serviciosinformaticosintegrales.audiolibros;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gridView = (GridView)findViewById(R.id.gridview);
        Aplicacion app = (Aplicacion) getApplication();
        gridView.setAdapter(app.getAdaptador());
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int posicion, long id) {
                Toast.makeText(MainActivity.this,"Selecionado el elemento: " + posicion, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
