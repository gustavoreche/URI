package URI;

public class SequenciaIJ2 {

	public static void main(String[] args) {
		
		int i = 1;
		for (int cont = 0; cont < 5; cont++){
			int j = 7;
			for (int contAux = 0; contAux < 3; contAux++){
				System.out.println("I=" + i + " J=" + j);
				j = j - 1;
			}
			i = i + 2;
		}
	}
}