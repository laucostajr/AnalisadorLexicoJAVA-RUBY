package AnalisadorRB;
import java.io.File;

public class Gerador {

	public static void main(String[] args) {
		
		String path = "src/AnalisadorRB/";
		String arquivo = path + "linguagem.lex";
		
		File file = new File(arquivo);
		jflex.Main.generate(file);
	}

}
