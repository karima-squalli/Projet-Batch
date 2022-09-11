package batchProject;

import java.util.ArrayList;

import batchProject.dto.Client;
import batchProject.io.read.Reader;
import batchProject.io.write.Writer;

public class Main { 
	
	public static void main(String[] args) throws Exception {

		int readerCode = Integer.parseInt(args[0]);
		String readerFile = args[1];
		int writerCode = Integer.parseInt(args[2]);
		String writerFile = args[3];

		Reader r = Reader.getReader(readerCode);
		ArrayList<Client> clients = r.readFile(readerFile);
		Writer w = Writer.getWriter(writerCode);
		w.writeFile(writerFile, clients);
	}
}
