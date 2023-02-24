package taller2;

/*Un autobús lleva 45 personas. El colegio solo utilizará el autobús si puede llenarlo del todo. El resto de personas irá en
furgonetas. Escriba un programa que registre el número de personas que se han apuntado para ir de viaje. Haga que el
programa muestre el número necesario de autobuses y, después, el número total de personas que tendrá que viajar en
furgonetas.*/
import javax.swing.JOptionPane;

public class TercerPunto {

	public void colegio() {
		int numPersonas, personasRestantes;
		JOptionPane.showMessageDialog(null,"Autobuses");
		numPersonas=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de personas apuntadas para el viaje"));
		if (numPersonas<45) {
			JOptionPane.showMessageDialog(null,"La cantidad de persona apuntadas en el viaje no es suficiente para contratar el autobus");
		}else{
			if (numPersonas==45) {
				JOptionPane.showMessageDialog(null,"El colegio debe contratar un autobus");
		    }else {
		    	if (numPersonas>45) {
		    		personasRestantes=numPersonas-45;
		    		JOptionPane.showMessageDialog(null,"el colegio debe contratar el bus y "+personasRestantes+" deben ir en furgonetas");
		    	}
		    }
		
		}
	}
}
