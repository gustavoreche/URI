package URI;

public class SequenciaIJ1 {

	public static void main(String[] args) {
		
		int j = 60, i = 1;
		for (int cont = 0; cont <= 12; cont++){
			System.out.println("I=" + i + " J=" + j);
			i = i + 3;
			j = j - 5;
		}
	}
}