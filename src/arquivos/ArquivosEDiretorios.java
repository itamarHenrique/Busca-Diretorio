package arquivos;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ArquivosEDiretorios {

	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Entre com o caminho do diretorio/arquivo: ");
		
		//Cria o objeto path com a entrada do usuario.
		Path path = Paths.get(teclado.nextLine());
		
		if(Files.exists(path)) { //Caso o caminho exista, gera uma saida com algumas informações sobre o caminho
			System.out.printf("%n%s Existe%n", path.getFileName());
			System.out.printf("É um diretorio: %s%n", Files.isDirectory(path) ? "Sim, é um diretorio" : "Não, não é um diretorio");
			System.out.printf("É absoluto: %s%n", path.isAbsolute());
			System.out.printf("Tamanho: %s%n", Files.size(path));
			System.out.printf("Diretorio: %s%n", path);
			System.out.printf("Diretorio absoluto: %s%n", path.isAbsolute());
		}
		
		else { //Caso não exista, gera uma saida informando que não existe
			System.out.printf("%s não existe%n", path);
		}
		
		

	}

}
