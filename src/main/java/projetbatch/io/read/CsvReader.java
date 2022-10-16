package projetbatch.io.read;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import projetbatch.dto.Commande;
import projetbatch.utils.Utils;

class CsvReader implements Reader {

	public static final int ID = 0;
	public static final int NOM = 1;
	public static final int PRENOM = 2;
	public static final int DATE = 3;
	public static final int PRODUIT = 4;
	public static final int MONTANT = 5;
	public static final int STATUT = 6;

	/**
	 * readFile reads a csv file and extracts commandes information from it
	 * @param filePath - the csv file path
	 * @return commandes - the array list of commandes generated from the csv file
	 */
	@Override
	public ArrayList<Commande> readFile(String filePath) throws Exception {

		ArrayList<Commande> commandes = new ArrayList<>();

		CSVParser csvParser = new CSVParserBuilder().withSeparator(';').build(); // custom separator
		try(CSVReader reader = new CSVReaderBuilder(
				new FileReader(filePath))
				.withCSVParser(csvParser)   // custom CSV parser
				.withSkipLines(1)           // skip the first line, header info
				.build()){
			List<String[]> nextRecord = reader.readAll();
			for (String[] cell : nextRecord) {
				commandes.add(new Commande(Integer.parseInt(cell[ID]), cell[NOM], cell[PRENOM], Utils.convertStringToDate(cell[DATE]), cell[PRODUIT],
						Utils.convertDoubleWithComaToDoubleWithDot(cell[MONTANT]), cell[STATUT]));
			}
		}
		return commandes;
	}
}

