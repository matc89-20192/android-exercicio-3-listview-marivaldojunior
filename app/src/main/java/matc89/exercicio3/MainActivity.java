package matc89.exercicio3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.TextAppearanceSpan;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button buttonAdicionar;
    private Button buttonRemover;
    private EditText editDescricao;
    private EditText editPrioridade;
    private TextView textPrioridade;
    private TextView textDescricao;
    private TextView textNovaTarefa;
    private ListView listView;
    private TarefaAdapter tarefaAdapter;
    //private ArrayAdapter<Tarefa> listAdapter;
    private List<Tarefa> tarefas = new ArrayList<Tarefa>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonAdicionar = (Button)findViewById(R.id.buttonAdicionar);
        buttonRemover = (Button)findViewById(R.id.buttonRemover);
        editPrioridade = (EditText)findViewById(R.id.editPrioridade);
        editDescricao = (EditText)findViewById(R.id.editDescricao);

        listView = (ListView)findViewById(R.id.listView);
        tarefaAdapter = new TarefaAdapter(this,tarefas);
        // criar subclasse de ArrayAdapter;
        listView.setAdapter(tarefaAdapter);
    }
}
