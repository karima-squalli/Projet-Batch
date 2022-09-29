package projetbatch.io.read;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Test;

import projetbatch.dto.Commande;

public class CsvReaderTest {
	
	@Test
	public void readFileTestBasic() throws Exception {
		
		// Initialisation des données du test
		ArrayList<Commande> result = null;
		String filePath = "src/test/resources/input.csv";
		CsvReader csvReader = new CsvReader();
		
		// Méthode testée
		try {
			result = csvReader.readFile(filePath);
		} catch (Exception e) {
			fail();
		}
		
		// Asserts
		assertNotNull(result);
	}

	@Test
	public void readFileTestThrowError() throws Exception {
		
		// Initialisation des données du test
		ArrayList<Commande> result = null;
		String filePath = "src/test/resources/input1.csv";
		CsvReader csvReader = new CsvReader();
		
		// Méthode testée
		try {
			result = csvReader.readFile(filePath);
			fail();
		} catch (Exception e) {
			// Asserts
			assertNotNull(e);			
		}
		
	}

}
