package mx.netsquare.holamundo;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class app extends AppCompatActivity {

    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);

        editText = (EditText)findViewById(R.id.editText);
        button = (Button)findViewById(R.id.button);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                    if(editText.getText().length() != 0)
                        button.setEnabled(true);
                    else
                        button.setEnabled(false);
                Log.d("button","Estado de boton modificado");
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   Toast.makeText(getApplicationContext(),"Hola Mundo by "+editText.getText(), Toast.LENGTH_SHORT).show();
                Snackbar.make(v
                        ,"Hola Mundo by "+editText.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
