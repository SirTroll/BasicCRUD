package com.example.basiccrud;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AdapterItemList extends BaseAdapter {

    private List<Aluno> alunos;
    private Activity activity;

    public AdapterItemList(Activity activity, List<Aluno> alunos){
        this.activity = activity;
        this.alunos = alunos;
    }

    @Override
    public int getCount() {
        return alunos.size();
    }

    @Override
    public Object getItem(int i) {
        return alunos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return alunos.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = activity.getLayoutInflater().inflate(R.layout.item_listview, viewGroup, false);
        TextView nome = v.findViewById(R.id.lista_item_nome);
        TextView cpf = v.findViewById(R.id.lista_item_cpf);
        TextView telefone = v.findViewById(R.id.lista_item_telefone);
        TextView email = v.findViewById(R.id.lista_item_email);

        Aluno a = alunos.get(i);

        nome.setText(a.getNome());
        cpf.setText(a.getCpf());
        telefone.setText(a.getTelefone());
        email.setText(a.getEmail());

        return v;
    }
}
