/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import model.Produto;

/**
 *
 * @author gustavo_yuri
 */
public class GeneratorPDF {

    public static void gerarPdf(ArrayList<Produto> produtos) {
        //Criação do documento
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("C://Users/gustavo_yuri/Desktop/testePDF1.pdf"));
            document.open();
            //Adicionando um parágrafo no documento
            for (Produto produto : produtos) {
                document.add(new Paragraph("Nome: " + produto.getNome()));
                document.add(new Paragraph("Descricao: " + produto.getDescricao()));
                document.add(new Paragraph("Quantidade: " + Integer.toString(produto.getQuantidade())));
                document.add(new Paragraph("Valor: " + Double.toString(produto.getValor())));
                
                
                if (produto.getPromocao() != null) {
                    document.add(new Paragraph("ValorPromocional: " + Double.toString(produto.getPromocao().getValorPromocional()) + "\n"));
                }
            }
        } catch (DocumentException | IOException de) {
            System.err.println(de.getMessage());
        }
        document.close();
    }
}
