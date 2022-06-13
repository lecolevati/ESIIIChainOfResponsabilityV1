package model;

import java.time.LocalDate;

public class Pedido {

	private int id;
	private double valor;
	private int tamanho;
	private LocalDate dia;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public LocalDate getDia() {
		return dia;
	}
	public void setDia(LocalDate dia) {
		this.dia = dia;
	}
	@Override
	public String toString() {
		return "Pedido [id=" + id + ", valor=" + valor + ", tamanho=" + tamanho + ", dia=" + dia + "]";
	}

}
