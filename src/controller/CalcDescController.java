package controller;

import model.Pedido;

public class CalcDescController {

	public double calculaDesconto(Pedido pedido) {
		double descDia = 0.05d;
		double descValor = 0.10d;
		double descTamanho = 0.08d;
		double descTotal = 0.00d;
		
		if (pedido.getTamanho() > 10 && pedido.getValor() > 1000.00 && pedido.getDia().getDayOfWeek().getValue() == 3) {
			descTotal = 1.00 - descTamanho;
			pedido.setValor(pedido.getValor() * descTotal);
			descTotal = 1.00 - descValor;
			pedido.setValor(pedido.getValor() * descTotal);
			descTotal = 1.00 - descDia;
			pedido.setValor(pedido.getValor() * descTotal);
		} else if (pedido.getTamanho() > 10 && pedido.getValor() > 1000.00) {
			descTotal = 1.00 - descTamanho;
			pedido.setValor(pedido.getValor() * descTotal);
			descTotal = 1.00 - descValor;
			pedido.setValor(pedido.getValor() * descTotal);
		} else if (pedido.getValor() > 1000.00 && pedido.getDia().getDayOfWeek().getValue() == 3) {
			descTotal = 1.00 - descValor;
			pedido.setValor(pedido.getValor() * descTotal);
			descTotal = 1.00 - descDia;
			pedido.setValor(pedido.getValor() * descTotal);
		} else if (pedido.getTamanho() > 10 && pedido.getDia().getDayOfWeek().getValue() == 3) {
			descTotal = 1.00 - descTamanho;
			pedido.setValor(pedido.getValor() * descTotal);
			descTotal = 1.00 - descDia;
			pedido.setValor(pedido.getValor() * descTotal);
		} else if (pedido.getValor() > 1000.00) {
			descTotal = 1.00 - descValor;
			pedido.setValor(pedido.getValor() * descTotal);
		} else if (pedido.getTamanho() > 10) {
			descTotal = 1.00 - descTamanho;
			pedido.setValor(pedido.getValor() * descTotal);
		} else if (pedido.getDia().getDayOfWeek().getValue() == 3) {
			descTotal = 1.00 - descDia;
			pedido.setValor(pedido.getValor() * descTotal);
		} else {
			descTotal = 1.00;
		}

		return pedido.getValor();
	}

}
