package com.example.junior.contasapp.models;

import com.example.junior.contasapp.enums.TipoLancamento;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Lancamento {
    private String titulo;
    private String descricao;
    private Double valor;
    private Date dataLancamento;
    private int icone;
    private TipoLancamento tipoLancamento;
    private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    public Lancamento(String titulo, String descricao, Double valor, TipoLancamento tipoLancamento, String data, int icone) throws ParseException {
        this.titulo = titulo;
        this.descricao = descricao;
        this.valor = valor;
        this.tipoLancamento = tipoLancamento;
        this.icone = icone;
        dataLancamento = format.parse(data);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setTipoLancamento(TipoLancamento tipoLancamento) {
        this.tipoLancamento = tipoLancamento;
    }

    public TipoLancamento getTipoLancamento() {
        return tipoLancamento;
    }

    public String dataFormatada(){
        return format.format(dataLancamento);
    }

    public String valorFormatado(){
        NumberFormat decimalFormat = DecimalFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return decimalFormat.format(valor);
    }

    public int getIcone() {
        return icone;
    }

    public void setIcone(int icone) {
        this.icone = icone;
    }
}
