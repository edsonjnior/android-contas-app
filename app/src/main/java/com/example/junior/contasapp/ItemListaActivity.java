package com.example.junior.contasapp;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ItemListaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_lista);

        Intent intent = getIntent();

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(intent.getStringExtra(MainActivity.TITULO_ITEM));

        EditText descricaoTv = findViewById(R.id.descricao_edit_text);
        EditText tipoTv = findViewById(R.id.tipo_edit_text);
        EditText valorTv = findViewById(R.id.valor_edit_text);
        EditText dataTv = findViewById(R.id.data_edit_text);

        descricaoTv.setText(intent.getStringExtra(MainActivity.DESCRICAO_ITEM));
        tipoTv.setText(intent.getStringExtra(MainActivity.TIPO_ITEM));
        valorTv.setText(intent.getStringExtra(MainActivity.VALOR_ITEM));
        dataTv.setText(intent.getStringExtra(MainActivity.DATA_ITEM));
    }
}
