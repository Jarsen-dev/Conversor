package conversor;
import javax.swing.JOptionPane;

public class Convertor {
	public static void main(String[] args) {
		
		String menu = JOptionPane.showInputDialog(null,"Seleccione una opción de conversión","Menu",JOptionPane.PLAIN_MESSAGE,null,new Object[] { "Conversor de Moneda","Conversor de Temperatura","Conversor de Unidad de Medicion"}, "Selecciona").toString();
		
		String monedas = JOptionPane.showInputDialog(null,"Elige la moneda a la que deseas convertir tu dinero","Monedas",JOptionPane.PLAIN_MESSAGE,null,new Object[] { "De Pesos a Dólar","De Pesos a Euro","De Pesos a Libras", "De Pesos a Yen", "De Pesos a Won Coreano", "De Dólar a Pesos", "De Euro a Pesos", "De Libra a Pesos", "De Yen a Pesos", "De Won Coreano a Pesos"}, "Selecciona").toString();
		
		String input = JOptionPane.showInputDialog(null,"Ingresa la cantidad de dinero que deseas convertir:",JOptionPane.QUESTION_MESSAGE);
		double num = Double.parseDouble(input);
		
		if (num == 0) {
			JOptionPane.showMessageDialog(null,"Valor no válido", "Message", JOptionPane.ERROR_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null,"Tienes: $6.27 Dolares", "Message", JOptionPane.PLAIN_MESSAGE);
		}
	}
}
