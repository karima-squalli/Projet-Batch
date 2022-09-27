/**
 * 
 */
package projetbatch;

import static org.mockito.Mockito.mock;

import java.util.ArrayList;

import org.junit.Before;
import org.mockito.Mockito;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
//import org.mockito.Mockito.Annotations;

import projetbatch.dto.Client;
import projetbatch.io.read.Reader;
import projetbatch.io.write.Writer;

/**
 *  * Main Test
 * @author karima.squallihoussa
 *
 */
public class MainTest {

	// classes Mocker
	@Mock
	private Reader readerMck;
	@Mock
	private Writer writeMmock;
	// Classe Helper
    ArrayList<Client> clients = new ArrayList<>();
    
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testMainWithoutError() {
		int reader = 0;
	}
	
}