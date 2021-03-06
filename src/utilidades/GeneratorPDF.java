/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import model.Produto;
import model.Vendaefetuada;
import view.buychart.CarrinhoDeCompras;

/**
 *
 * @author gustavo_yuri
 */
public class GeneratorPDF {

    public static void gerarCupomFiscalPDF(ArrayList<Produto> produtos, ArrayList<Integer> quantidadeDoProduto) {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\Sandro\\Desktop\\cuzinho.pdf"));
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

            //Abre o documento (Mudar destino quando colocado em outro PC
            if (Desktop.isDesktopSupported()) {
                try {
                    File myFile = new File("C:\\Users\\Sandro\\Desktop\\cuzinho.pdf");
                    Desktop.getDesktop().open(myFile);
                } catch (IOException ex) {
                    System.out.println("Deu ruim");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void gerarRelatoriodeProdutosMaisVendidos(ArrayList<Vendaefetuada> vendasefetuadas, Date dataInicial, Date dataFinal) {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\Sandro\\Desktop\\cuzinho.pdf"));
            document.open();
            Paragraph paragraph = new Paragraph("PInTur - Relatórios");
            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);
            paragraph = new Paragraph(" ");
            document.add(paragraph);
            //Constroi a tabela
            //seta o número de colunas
            PdfPTable table = new PdfPTable(3);
            PdfPCell header = new PdfPCell(new Paragraph("Relatório de produtos mais vendidos"));
            header.setColspan(3);
            header.setBackgroundColor(BaseColor.GRAY);
            table.addCell(header);
            table.addCell("Nome");
            table.addCell("Quantidade vendida");
            table.addCell("Data de Venda");
            
            for (Vendaefetuada vendaefetuada : vendasefetuadas) {
                //TODO Pegar apenas itens com datas entre dataInicial e dataFinal
                
                System.out.println(dataInicial);
                Calendar calendarioVendaEfetuada = Calendar.getInstance();
                calendarioVendaEfetuada.setTime(vendaefetuada.getVenda().getData());
                System.out.println(calendarioVendaEfetuada.getTime());
                if (calendarioVendaEfetuada.getTime().equals(dataInicial) || vendaefetuada.getVenda().getData() == dataFinal|| vendaefetuada.getVenda().getData().after(dataInicial) && vendaefetuada.getVenda().getData().before(dataFinal)) {
                    table.addCell(vendaefetuada.getProduto().getNome());
                    table.addCell(Integer.toString(vendaefetuada.getQuantidadeVendida()));    
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    table.addCell(sdf.format(vendaefetuada.getVenda().getData()));
                }
            }
            document.add(table);
            document.close();
            abrePDF();
            

        } catch (Exception e) {
            System.out.println(e.getCause());
        }
    }
    
    private static void abrePDF(){        
            //Abre o documento (Mudar destino quando colocado em outro PC
            if (Desktop.isDesktopSupported()) {
                try {
                    File myFile = new File("C:\\Users\\Sandro\\Desktop\\cuzinho.pdf");
                    Desktop.getDesktop().open(myFile);
                } catch (IOException ex) {
                    System.out.println("Deu ruim");
                }
            }
    }
    //Este método gera um cupom fiscal a partir do carrinho de compras
//    public static void gerarRelatorioDeProdutosMaisVendidos(ArrayList<Vendaefetuada> vendaefetuada) {
//        try {
//            Document document = new Document();
//            PdfWriter.getInstance(document, new FileOutputStream(PRODUTOS_MAIS_VENDIDOS));
//            document.open();
//            Paragraph paragraph = new Paragraph("PInTur - Relatório de Itens Mais Vendidos");
//            paragraph.setAlignment(Element.ALIGN_CENTER);
//            document.add(paragraph);
//            
//            for (Vendaefetuada vendaefetuada1 : vendaefetuada) {               
//                paragraph = new Paragraph("Nome: " + vendaefetuada1.getProduto().getNome());
//                paragraph.setAlignment(Element.ALIGN_LEFT);
//                document.add(paragraph);                
//                paragraph = new Paragraph("Quantidade vendida: " + vendaefetuada1.getQuantidadeVendida());
//                paragraph.setAlignment(Element.ALIGN_LEFT);
//                document.add(paragraph);                
//                document.add(new Paragraph(" "));
//                document.add(new LineSeparator());              
//            }
//            document.close();
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
}
