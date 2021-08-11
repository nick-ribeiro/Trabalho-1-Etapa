import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Ex04 {

    public static void main(String[] args) {

        String t = JOptionPane.showInputDialog(null, "Informe o valor de compra: ");
        Float preco = Float.parseFloat(t);

        String t2 = JOptionPane.showInputDialog(null, "Informe a quantidade de parcelas: ");
        int quant = Integer.parseInt(t2);

        Float parcelas[] = new Float[quant];
        LocalDate datas[] = new LocalDate[quant];

        LocalDate dataH = LocalDate.now();
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {

            dataH = LocalDate.parse("11/08/2021", sdf);
            int i;
            int aux = 0;

            for (i = 0; i < quant; i++) {
                aux += 30;
                datas[i] = dataH.plusDays(aux);
            }

            for (i = 0; i < quant; i++) {
                parcelas[i] = preco / quant;
            }

            for (i = 0; i < 5; i++) {
                JOptionPane.showMessageDialog(null,
                        "Valor da Parcela: " + parcelas[i] + " Data do " + (i + 1) + "° vencimento: " + datas[i]);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro encontrado!: " + e.getMessage() + "\n Classe do Erro: " + e.getClass());
        }
    }

}
