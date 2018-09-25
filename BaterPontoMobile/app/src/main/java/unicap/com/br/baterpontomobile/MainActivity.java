package unicap.com.br.baterpontomobile;

import android.content.Intent;
import android.net.http.HttpResponseCache;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.gson.Gson;

import org.json.JSONObject;

import java.util.concurrent.ExecutionException;

import unicap.com.br.baterpontomobile.model.Residente;
import unicap.com.br.baterpontomobile.util.OkHttp;


public class MainActivity extends AppCompatActivity{
    private EditText editTextMatricula;
    private EditText editTextPassword;
    private Button btnLogar;
    private Residente residente = new Residente();
    private OkHttp okHttp = new OkHttp();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextMatricula = (EditText) findViewById(R.id.txtMatricula);
        editTextPassword = (EditText) findViewById(R.id.txtSenha);
        btnLogar = (Button) findViewById(R.id.btnLogar);

    }

    public void onClick(View view) {
        btnLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    residente.setMatricula(editTextMatricula.getText().toString());
                    residente.setSenha(editTextPassword.getText().toString());
                    okHttp.postHttpResponse(residente);
                    Intent intent = new Intent(getApplicationContext(), ActivityResidente.class);
                    startActivity(intent);
                }catch  (Exception e) {
                    e.printStackTrace();
                }

            }
        });
    }
}

