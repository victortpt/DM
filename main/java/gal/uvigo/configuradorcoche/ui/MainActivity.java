package gal.uvigo.configuradorcoche.ui;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import gal.uvigo.configuradorcoche.R;
import gal.uvigo.configuradorcoche.core.Coche;

public class MainActivity extends AppCompatActivity {

    private Coche coche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.coche = new Coche();

        final Button BT_TIPO = this.findViewById(R.id.buttonTipo);

        BT_TIPO.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                MainActivity.this.cambiaTipo();
            }
        });

        this.muestraModelo();
    }

    private void cambiaTipo(){
        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setItems(
            new String[]{"Berlina", "Suv"},
            new DialogInterface.OnClickListener(){

                @Override
                public void onClick(DialogInterface dialog, int which) {
                    MainActivity.this.coche.setSuv((which == 1));
                    MainActivity.this.muestraModelo();
                }
            }
        );

        dlg.show();

    }

    private void muestraModelo(){
        final TextView LBL_MODELO =  this.findViewById(R.id.modelo);

        LBL_MODELO.setText(this.coche.toString());
    }
}
