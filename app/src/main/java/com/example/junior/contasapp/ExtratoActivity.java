package com.example.junior.contasapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class ExtratoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extrato);

        Intent intent = getIntent();


        TextView textViewReceitas = findViewById(R.id.text_view_valor_receitas);
        TextView textViewDespesas = findViewById(R.id.text_view_valor_despesas);
        TextView textViewSaldo = findViewById(R.id.text_view_valor_saldo);

        double doubleValReceitas = intent.getDoubleExtra(MainActivity.EXTRATO_RECEITAS, 0);
        double doubleValDespesas = intent.getDoubleExtra(MainActivity.EXTRATO_DESPESAS, 0);
        double doubleValSaldo = intent.getDoubleExtra(MainActivity.EXTRATO_SALDO, 0);

        NumberFormat f = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        if (f instanceof DecimalFormat) {
            ((DecimalFormat) f).setDecimalSeparatorAlwaysShown(true);
        }


        textViewDespesas.setText(f.format(doubleValDespesas));
        textViewReceitas.setText(f.format(doubleValReceitas));
        textViewSaldo.setText(f.format(doubleValSaldo));
    }
}
