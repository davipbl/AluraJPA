package br.com.alura.loja.modelo;

import javax.persistence.Entity;

@Entity
public class Informática extends Produto{

    private String marca;
    private Integer modelo;

    public Informática(String marca, Integer modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Informática() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getmMdelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }
}
