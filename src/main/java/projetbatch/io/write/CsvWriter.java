package projetbatch.io.write;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

import projetbatch.dto.Commande;
import projetbatch.utils.Utils;

public class CsvWriter implements Writer {

	/**
	 * writeFile writes in a csv file some commandes information (id and status)
	 * @param filePath - the csv file path
	 * @param commandes - the array list of commandes 
	 * return void
	 */
	@Override
	public void writeFile(String filePath, ArrayList<Commande> commandes) {
		
	    try {
	        FileWriter outputfile = new FileWriter(filePath);
	  
	        CSVWriter writer = new CSVWriter(outputfile, ';',
	                                         CSVWriter.NO_QUOTE_CHARACTER,
	                                         CSVWriter.DEFAULT_ESCAPE_CHARACTER,
	                                         CSVWriter.DEFAULT_LINE_END);
	  
	        List<String[]> data = new ArrayList<String[]>();
	        
	        for (Commande commande: commandes) {
	        	data.add(new String[] { String.valueOf(commande.getId()), commande.getStatut(), Utils.convertDateToString(commande.getDate()) });
			}
	        writer.writeAll(data);
	        writer.close();
	    }
	    catch (IOException e) {
	        e.printStackTrace();
	    }
	}

}
