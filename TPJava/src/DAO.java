import java.io.IOException;
import java.nio.file.Files;
import java.util.LinkedList;
import java.util.List;
import java.nio.file.Paths;
public class DAO {
	public List<Cidade> carregarArquivos(String enderecoArquivo) {
        List<Cidade> cidades = new LinkedList<Cidade>();

        try {
            List<String> allLines = Files.readAllLines(Paths.get(enderecoArquivo));
    
            for (String line : allLines) {
                String[] s = line.split(";");
                cidades.add(new Cidade(new String[] {s[0],s[5],s[1],s[2]}));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cidades;
	}
}
