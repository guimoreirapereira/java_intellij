package br.com.model;

import java.util.Objects;

public class Carro {
    private String marca;
    private String placa;
    private String modelo;

    public Carro() {
    }

    public Carro(String marca, String placa, String modelo) {
        this.marca = marca;
        this.placa = placa;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(marca, carro.marca) && Objects.equals(placa, carro.placa) && Objects.equals(modelo, carro.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, placa, modelo);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca=" + marca +
                ", placa=" + placa +
                ", modelo=" + modelo +
                '}';
    }
}
