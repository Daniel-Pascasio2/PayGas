package com.example.paygas.ui;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;
import com.example.paygas.R;

public class Consejos extends ListActivity {
    String[] consejos ={"consejo: Aceite", "consejo: Frenos", "consejo: Luces para todo terreno",
            "consejo: Filtro de aire", "consejo: Parabrisas"};
    String[] todoconsejo = {"Revisar frecuentemente los niveles de aceite",
            "cuidar los frenos al maximo", "recuerda que es necesario tener luces para todo terreno en especial en epoca de lluvia ",
                "El filtro de aire debe ser acorde a tu vehiculo, y siempre debe permanecer sin obstrucciones para no tener inconvenientes con el motor",
            "Use limpiaparabrisas que aclaren y no oscurezcan, con el paso del tiempo pueden convertirse una pesadilla para los ojos por interferir con la vision"};

    Integer[] imagenes ={
            R.drawable.aceite, R.drawable.frenos, R.drawable.luces, R.drawable.filtro, R.drawable.parabrisas
    };
  @Override
    protected void onCreate(Bundle savedInstanceState){
      super.onCreate(savedInstanceState);
      ArrayAdapterConsejos adapterConsejos = new ArrayAdapterConsejos(this, consejos, todoconsejo, imagenes);
      setListAdapter(adapterConsejos);
  }
  @Override
    public void onListItemClick(ListView l, View v, int post, long id){
      Toast.makeText(this, String.valueOf(post), Toast.LENGTH_LONG).show();
  }
}
