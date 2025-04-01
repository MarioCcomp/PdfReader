import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.util.regex.*;


public class Main {
	public static void main(String[] args) {

		        Pattern patt = Pattern.compile("(\\d+)(\\s+)hora");
		        int horas = 0;
		        for(int i = 1; i <= 26; i++) {
		            File file = new File("C:\\Users\\nuno\\Documents\\certificados\\pdf (" + i + ").pdf"); // put the path of your pdfs here
		            try (PDDocument document = Loader.loadPDF(file)) {
		                PDFTextStripper pdfStripper = new PDFTextStripper();
		                pdfStripper.setStartPage(1);
		                pdfStripper.setEndPage(1);
		                String text = pdfStripper.getText(document);
		                Matcher match = patt.matcher(text);
		                while(match.find()) {
		                    horas += Integer.parseInt(match.group(1));
		                }

		            } catch (IOException e) {
		                e.printStackTrace();
		            }

		        }
		        System.out.println("Você tem " + horas + " horas complementares");

		    
		

	}
}
