package taller2;

import javax.swing.JOptionPane;

public class PimerPunto {

	public void calcularArea() {
		double base, altura, area;
		JOptionPane.showMessageDialog(null, "Calcular area");
		base=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del triangulo: "));
		altura=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del triangulo: "));
		area=0.5*(base*altura);
		JOptionPane.showMessageDialog(null,"El area del triangulo es: "+area);
	}
}
