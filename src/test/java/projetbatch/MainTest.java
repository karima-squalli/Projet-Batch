package projetbatch;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import projetbatch.dto.Commande;
import projetbatch.helper.CommandeHelper;
import projetbatch.io.read.Reader;
import projetbatch.io.write.Writer;

/**
 *  * Main Test
 * @author karima.squallihoussa
 *
 */
public class MainTest {

	// Classe à tester
	@InjectMocks
	private Main main;

	// Classes à mocker
	@Mock
	private Reader readerMock;
	@Mock
	private Writer writerMock;
	
	// Classe Helper
    private ArrayList<Commande> commandes = new ArrayList<>();
    
    // Variables utiles
    String[] args = { "0", "input.csv", "0", "output.csv" };
    
	@Before
	public void setup() {
		//MockitoAnnotations.initMocks(this);
	}
	
//	@Test
//	public void testMainWithoutError() throws Exception {
//		
//		Reader r = Reader.getReader(0);
//		Writer w = Writer.getWriter(0);
//		ArrayList<Commande> commandes = new ArrayList<>();
//		commandes.add(CommandeHelper.getCommande());
//		
//		when(readerMock.getReader(0)).thenReturn(r);
//		when(r.readFile("input.csv")).thenReturn(commandes);
//		when(writerMock.getWriter(0)).thenReturn(w);
//		doNothing().when(w).writeFile("input.csv", commandes);
//		
//		try {
//			main.main(args);
//			
//			assertNotNull(w);
//			
//			verify(readerMock, times(1)).getReader(0);
//			verify(readerMock, times(1)).readFile("input.csv");
//			verify(writerMock, times(1)).getWriter(0);
//			verify(writerMock, times(1)).writeFile("input.csv", commandes);;
//		} catch (Exception e) {
//			System.out.println(e);
//			fail();
//		}
//	}
//	
//	@Test
//	public void testMainWithError() throws Exception {
//		
//		Reader r = Reader.getReader(0);
//		Writer w = Writer.getWriter(0);
//		ArrayList<Commande> commandes = new ArrayList<>();
//		commandes.add(CommandeHelper.getCommande());
//		Exception expt = new Exception();
//		
//		doThrow(expt).when(readerMock).getReader(0);
//		when(r.readFile("input.csv")).thenReturn(commandes);
//		when(writerMock.getWriter(0)).thenReturn(w);
//		doNothing().when(w).writeFile("input.csv", commandes);
//		
//		try {
//			main.main(args);
//			fail();
//		} catch (Exception e) {
//			assertNull(w);
//			verify(readerMock, times(1)).getReader(0);
//			verify(readerMock, times(0)).readFile("input.csv");
//			verify(writerMock, times(0)).getWriter(0);
//			verify(writerMock, times(0)).writeFile("input.csv", commandes);
//		}
//	}
	
}