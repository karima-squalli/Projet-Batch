package projetbatch.io.write;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import java.util.ArrayList;

import org.junit.Test;
import projetbatch.dto.Commande;
import projetbatch.helper.CommandeHelper;

public class CsvWriterTest {
	
//	@InjectMocks
//	private CsvWriter csvWriterMock = new CsvWriter();
	private CsvWriter csvWriter = new CsvWriter();
	// Classe Helper
    private ArrayList<Commande> commandes = null;

	@Test
	public void writeFileTestBasic() throws Exception {
		// Initialisation des données du test
		//csvWriterMock 
		commandes = new ArrayList<>();
		commandes.add(CommandeHelper.getCommande());
		String filePath = "src/test/resources/outputTest.csv";
		
		// Méthode testée
		try {
			//doNothing().when(csvWriterMock).writeFile(filePath, commandes);
			csvWriter.writeFile(filePath, commandes);
		} catch (Exception e) {
			System.out.println(e);
			fail();
		}
		// Asserts
		//verify(csvWriterMock,times(1)).writeFile(filePath, commandes);
	}

	@Test
	public void writeFileTestThrowError() throws Exception {
		
		// Initialisation des données du test
		String filePath = "src/test/resources/outputTest.csv";
		//commandes.add(CommandeHelper.getCommande());
		
		
		// Méthode testée
		try {
			csvWriter.writeFile(filePath, commandes);
			fail();
		} catch (Exception e) {
			// Asserts
			assertNotNull(e);			
		}
	}
	
	
//	@Test 
//	public void writeFileTestBasicWithSpy() throws Exception {
//		//MockitoAnnotations.initMocks(csvWriterMock);
//		// Initialisation des données du test
//		//csvWriterMock
//		//CsvWriter csvWriter = ;
//		CsvWriter spyCsvWriter = spy(new CsvWriter());
//		commandes = new ArrayList<>();
//		commandes.add(CommandeHelper.getCommande());
//		String filePath = "src/test/resources/outputTest.csv";
//		
//		// Méthode testée
//		try {
//			doNothing().when(spyCsvWriter).writeFile(filePath, commandes);
//			//spyCsvWriter.writeFile(filePath, commandes);
//		} catch (Exception e) {
//			System.out.println(e);
//			fail();
//		}
//		// Asserts
//		verify(spyCsvWriter,times(1)).writeFile(filePath, commandes);
//	}
}
