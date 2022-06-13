package view;

import java.time.LocalDate;

import controller.CalcDescController;
import model.Pedido;

public class Principal {

	public static void main(String[] args) {
		Pedido p = new Pedido();
		p.setId(1);
		p.setTamanho(1);
		p.setValor(2000.00d);
		p.setDia(LocalDate.now().minusDays(1));
		
		CalcDescController cCont = new CalcDescController();
		p.setValor(cCont.calculaDesconto(p));
		
		System.out.println(p);
		
	}

}
