package com.example.junior.contasapp.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.junior.contasapp.ItemListaActivity;
import com.example.junior.contasapp.MainActivity;
import com.example.junior.contasapp.R;
import com.example.junior.contasapp.models.Lancamento;
import com.example.junior.contasapp.viewholders.ViewHolderLancamento;

import java.util.ArrayList;
import java.util.List;

public class LancamentoListAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private List<Lancamento> lancamentos;
    private ArrayList<Lancamento> lista;

    public LancamentoListAdapter(Context context, List<Lancamento> lancamentos) {
        this.context = context;
        this.lancamentos = lancamentos;
        layoutInflater = LayoutInflater.from(context);
        lista = new ArrayList<>();
        lista.addAll(lancamentos);
    }

    @Override
    public int getCount() {
        return lancamentos.size();
    }

    @Override
    public Object getItem(int position) {
        return lancamentos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        ViewHolderLancamento viewHolder;
        if(view == null){
            viewHolder = new ViewHolderLancamento();
            view = layoutInflater.inflate(R.layout.linha, null);

            viewHolder.setTextViewTitulo((TextView) view.findViewById(R.id.tituloLinha));
            viewHolder.setTextViewDescricao((TextView) view.findViewById(R.id.descricaoLinha));
            viewHolder.setTextViewValor((TextView) view.findViewById(R.id.valorLinha));
            viewHolder.setTextViewData((TextView) view.findViewById(R.id.dataLinha));
            viewHolder.setIcone((ImageView) view.findViewById(R.id.iconeLinha));

            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolderLancamento) view.getTag();
        }

        viewHolder.getTextViewTitulo().setText(lancamentos.get(position).getTitulo());
        viewHolder.getTextViewDescricao().setText(lancamentos.get(position).getDescricao());
        viewHolder.getTextViewValor().setText(lancamentos.get(position).valorFormatado());
        viewHolder.getTextViewData().setText(lancamentos.get(position).dataFormatada());
        viewHolder.getIcone().setImageResource(lancamentos.get(position).getIcone());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ItemListaActivity.class);
                intent.putExtra(MainActivity.TITULO_ITEM, lancamentos.get(position).getTitulo());
                intent.putExtra(MainActivity.DESCRICAO_ITEM, lancamentos.get(position).getDescricao());
                intent.putExtra(MainActivity.TIPO_ITEM, lancamentos.get(position).getTipoLancamento().getDescricao());
                intent.putExtra(MainActivity.VALOR_ITEM, lancamentos.get(position).valorFormatado());
                intent.putExtra(MainActivity.DATA_ITEM, lancamentos.get(position).dataFormatada());

                context.startActivity(intent);
            }
        });

        return view;
    }
}
