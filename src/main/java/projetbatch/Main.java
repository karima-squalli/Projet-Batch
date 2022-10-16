package projetbatch;

import java.util.ArrayList;

import projetbatch.dto.Commande;
import projetbatch.io.read.Reader;
import projetbatch.io.write.Writer;

public class Main { 
	
	public static void main(String[] args) throws Exception {

		int readerCode = Integer.parseInt(args[0]);
		String readerFile = args[1];
		int writerCode = Integer.parseInt(args[2]);
		String writerFile = args[3];

		Reader r = Reader.getReader(readerCode);
		ArrayList<Commande> commandes = r.readFile(readerFile);
		Writer w = Writer.getWriter(writerCode);
		w.writeFile(writerFile, commandes);
	}
}
