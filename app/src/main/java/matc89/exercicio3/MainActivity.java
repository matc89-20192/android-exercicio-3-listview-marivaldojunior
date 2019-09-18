package matc89.exercicio3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.TextAppearanceSpan;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button buttonAdicionar;
    Button buttonRemover;
    EditText editDescricao;
    EditText editPrioridade;
    TextView textPrioridade;
    TextView textDescricao;
    TextView textNovaTarefa;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonAdicionar = (Button)findViewById(R.id.buttonAdicionar);
        buttonRemover = (Button)findViewById(R.id.buttonRemover);
        editPrioridade = (EditText)findViewById(R.id.editPrioridade);
        editDescricao = (EditText)findViewById(R.id.editDescricao);
        
    }
}
