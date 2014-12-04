/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
import java.io.FileOutputStream;
import java.util.ArrayList;
import model.Produto;
import view.buychart.CarrinhoDeCompras;

/**
 *
 * @author gustavo_yuri
 */
public class GeneratorPDF {

    //UTILIZAR PARA SAÍDA DO CUMPOM FISCAL
    private static String CUPOM_FISCAL = "CupomFiscal.pdf";
    //UTILIZAR PARA SAÍDA DO RELATÓRIO DE PRODUTOS MAIS VENDIDOS
    private static String PRODUTOS_MAIS_VENDIDOS = "RelatórioDeProdutosMaisVendidos.pdf";
    //Este método gera um cupom fiscal a partir do carrinho de compras

    public static void gerarRelatorioDeProdutosMaisVendidos(Produto produto) {
        
    }

    public static void gerarCupomFiscalPDF(ArrayList<Produto> produtos) {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(CUPOM_FISCAL));
            document.open();
            Paragraph paragraph = new Paragraph("PInTur - Cupom Fiscal");
            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);

            for (Produto produto : produtos) {
                paragraph = new Paragraph("Nome: " + produto.getNome());
                paragraph.setAlignment(Element.ALIGN_LEFT);
                document.add(paragraph);
                paragraph = new Paragraph("Descricao: " + produto.getDescricao());
                paragraph.setAlignment(Element.ALIGN_LEFT);
                document.add(paragraph);
                paragraph = new Paragraph("Quantidade: " + Integer.toString(produto.getQuantidade()));
                paragraph.setAlignment(Element.ALIGN_LEFT);
                document.add(paragraph);
                paragraph = new Paragraph("Valor: " + Double.toString(produto.getValor()));
                paragraph.setAlignment(Element.ALIGN_LEFT);
                document.add(paragraph);
                document.add(new Paragraph(" "));
                document.add(new LineSeparator());
                if (produto.getPromocao() != null) {
                    paragraph = new Paragraph("Valor promocional: " + produto.getPromocao().getValorPromocional());
                    paragraph.setAlignment(Element.ALIGN_LEFT);
                    document.add(paragraph);
                    document.add(new Paragraph(" "));
                    document.add(new LineSeparator());
                }

            }
            //TODO revisar
            paragraph = new Paragraph("Valor total da compra: " + CarrinhoDeCompras.getValorTotalDaCompra());
            paragraph.setAlignment(Element.ALIGN_BOTTOM);
            paragraph.setAlignment(Element.ALIGN_RIGHT);
            document.add(paragraph);
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
