import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Ex03 {

    public static void main(String[] args) {

        String t = JOptionPane.showInputDialog(null, "Informe uma data: ");
        LocalDate dataIns = LocalDate.now();
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {

            dataIns = LocalDate.parse(t, sdf);
            LocalDate ndataIns = dataIns.plusDays(7);
            LocalDate n2dataIns = ndataIns.plusDays(7);
            LocalDate n3dataIns = n2dataIns.plusDays(7);
            LocalDate n4dataIns = n3dataIns.plusDays(7);
            LocalDate n5dataIns = n4dataIns.plusDays(7);

            JOptionPane.showMessageDialog(null, "Data informada: " + dataIns);
            JOptionPane.showMessageDialog(null, "Data de pagamento: " + ndataIns);
            JOptionPane.showMessageDialog(null, "Data de pagamento: " + n2dataIns);
            JOptionPane.showMessageDialog(null, "Data de pagamento: " + n3dataIns);
            JOptionPane.showMessageDialog(null, "Data de pagamento: " + n4dataIns);
            JOptionPane.showMessageDialog(null, "Data de pagamento: " + n5dataIns);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro encontrado!: " + e.getMessage() + "\n Classe do Erro: " + e.getClass());
        }
    }
}