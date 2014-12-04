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
import java.util.Date;
import model.Produto;
import model.Vendaefetuada;
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

    public static void gerarRelatorioDeProdutosMaisVendidos(ArrayList<Vendaefetuada> vendaefetuada) {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(PRODUTOS_MAIS_VENDIDOS));
            document.open();
            Paragraph paragraph = new Paragraph("PInTur - Relatório de Itens Mais Vendidos");
            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);
            
            for (Vendaefetuada vendaefetuada1 : vendaefetuada) {               
                paragraph = new Paragraph("Nome: " + vendaefetuada1.getProduto().getNome());
                paragraph.setAlignment(Element.ALIGN_LEFT);
                document.add(paragraph);                
                paragraph = new Paragraph("Quantidade vendida: " + vendaefetuada1.getQuantidadeVendida());
                paragraph.setAlignment(Element.ALIGN_LEFT);
                document.add(paragraph);                
                document.add(new Paragraph(" "));
                document.add(new LineSeparator());              
            }
            document.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void gerarCupomFiscalPDF(ArrayList<Produto> produtos, ArrayList<Integer> quantidadeDoProduto) {
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
                paragraph = new Paragraph("Quantidade: " + Integer.toString(quantidadeDoProduto.get(produtos.indexOf(produto))));
                paragraph.setAlignment(Element.ALIGN_LEFT);
                document.add(paragraph);
                paragraph = new Paragraph("Valor: " + Double.toString(produto.getValor()));
                paragraph.setAlignment(Element.ALIGN_LEFT);
                document.add(paragraph);
                document.add(new Paragraph(" "));
                document.add(new LineSeparator());
                paragraph = new Paragraph("Data de venda: " + new Date());
                paragraph.setAlignment(Element.ALIGN_LEFT);
                paragraph.add(paragraph);
                //TODO Forma de pagamento
//                paragraph = new Paragraph("Forma de pagamento: " + )
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
