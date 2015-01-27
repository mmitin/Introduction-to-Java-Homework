import java.io.FileOutputStream;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class _9_DeckOfCards {

	public static void main (String[] args) {
		try {
			Document pdfDoc = new Document();
			PdfWriter.getInstance(pdfDoc, new FileOutputStream("DeckOfCards"));                      
			pdfDoc.open();
			
			 PdfPTable table = new PdfPTable(4);
             table.setWidthPercentage(100);
             table.getDefaultCell().setFixedHeight(55);
             
             BaseFont baseFont = BaseFont.createFont("arial.ttf", BaseFont.IDENTITY_H, true);
             Font fontBlack = new Font(baseFont, 50f, 0, BaseColor.BLACK);
             Font fontRed = new Font(baseFont, 50f, 0, BaseColor.RED);
             
             String cardFace = "";
             char cardSuit = ' ';
            
             for (int i = 2; i <= 14; i++) {
                     switch (i) {
                     case 10: cardFace = "10"; break;
                     case 11: cardFace = " J"; break;
                     case 12: cardFace = " Q"; break;
                     case 13: cardFace = " K"; break;
                     case 14: cardFace = " A"; break;
                     default: cardFace = " " + i; break;
                     }
                     for (int j = 1; j <= 4; j++) {
                             switch (j) {
                             case 1: cardSuit = '♠'; table.addCell(new Paragraph(cardFace + cardSuit + " ", fontBlack)); break;
                             case 2: cardSuit = '♥'; table.addCell(new Paragraph(cardFace + cardSuit + " ", fontRed)); break;
                             case 3: cardSuit = '♦'; table.addCell(new Paragraph(cardFace + cardSuit + " ", fontRed)); break;
                             case 4: cardSuit = '♣'; table.addCell(new Paragraph(cardFace + cardSuit + " ", fontBlack)); break;
                             }
                     }
             }
             pdfDoc.add(table);
             pdfDoc.close();                      
     }
     catch (Exception e) {
             e.printStackTrace();
     }
}
}                