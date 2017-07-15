package URI;

public class SequenciaIJ3 {

	public static void main(String[] args) {
		
		int j = 7;
		int i = 1;
		for (int cont = 0; cont < 5; cont++){
			for (int contAux = 0; contAux < 3; contAux++){
				System.out.println("I=" + i + " J=" + j);
				j = j - 1;
			}
			j = j + 5;
			i = i + 2;
		}
	}
}