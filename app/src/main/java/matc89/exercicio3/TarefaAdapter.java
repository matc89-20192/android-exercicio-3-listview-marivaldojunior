package matc89.exercicio3;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by ime on 18/09/2019.
 */
public class TarefaAdapter extends ArrayAdapter<Tarefa> {
    public TarefaAdapter(Context context, List<Tarefa> tarefas){
        super(context,0,tarefas);
    }

    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        View view = null;

        return view;
    }
}
