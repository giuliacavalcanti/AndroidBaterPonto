package unicap.com.br.baterpontomobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.EditText;

import unicap.com.br.baterpontomobile.model.Residente;

public class ActivityResidente extends AppCompatActivity {
        private EditText editTextMatricula;
        private EditText editTextPassword;
       @Override
       protected void onCreate(Bundle savedInstanceState) {
           super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            editTextMatricula = (EditText) findViewById(R.id.txtMatricula);
            editTextPassword = (EditText) findViewById(R.id.txtSenha);


       /* if(HttpResponseCache.isNotFound()) {
            Toast.makeText(getApplicationContext(), "Usuario nao encontrado!", Toast.LENGTH_SHORT);
        }
        else if(HttpResponseCache.getBody())
        Toast.makeText(getApplicationContext(),"Você entrou!", Toast.LENGTH_SHORT);
    */
        }

//        @Override
//        public boolean onOptionsItemSelected(MenuItem item) {
//            int id = item.getItemId();
//            Class<Object> r = Object.class;
//            switch(id){
//                case R.id.btnLogar:
//            }
//
//            return super.onOptionsItemSelected(item);
//        }

}
