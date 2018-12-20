package com.example.junior.contasapp.viewholders;

import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolderLancamento {
    private TextView textViewTitulo;
    private TextView textViewDescricao;
    private TextView textViewValor;
    private TextView textViewData;
    private ImageView icone;

    public ViewHolderLancamento() {
    }

    public ViewHolderLancamento(TextView textViewTitulo, TextView textViewDescricao, TextView textViewValor, TextView textViewData, ImageView icone) {
        this.textViewTitulo = textViewTitulo;
        this.textViewDescricao = textViewDescricao;
        this.textViewValor = textViewValor;
        this.textViewData = textViewData;
        this.icone = icone;
    }

    public TextView getTextViewTitulo() {
        return textViewTitulo;
    }

    public void setTextViewTitulo(TextView textViewTitulo) {
        this.textViewTitulo = textViewTitulo;
    }

    public TextView getTextViewDescricao() {
        return textViewDescricao;
    }

    public void setTextViewDescricao(TextView textViewDescricao) {
        this.textViewDescricao = textViewDescricao;
    }

    public TextView getTextViewValor() {
        return textViewValor;
    }

    public void setTextViewValor(TextView textViewValor) {
        this.textViewValor = textViewValor;
    }

    public TextView getTextViewData() {
        return textViewData;
    }

    public void setTextViewData(TextView textViewData) {
        this.textViewData = textViewData;
    }

    public ImageView getIcone() {
        return icone;
    }

    public void setIcone(ImageView icone) {
        this.icone = icone;
    }
}
