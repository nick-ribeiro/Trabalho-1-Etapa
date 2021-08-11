import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex02 {

    public static void main(String[] args) {

        String t = JOptionPane.showInputDialog(null, "Informe o valor da diária: ");
        Float valD = Float.parseFloat(t);

        String t2 = JOptionPane.showInputDialog(null, "Informe a data de locação: ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar dataLoc = Calendar.getInstance();

        String t3 = JOptionPane.showInputDialog(null, "Informe a data de devolução: ");
        Calendar dataDev = Calendar.getInstance();

        sdf.setLenient(false);
        try {

            dataLoc.setTime(sdf.parse(t2));
            dataDev.setTime(sdf.parse(t3));

            long miliSegundosPorDia = 24 * 60 * 60 * 1000;
            long Dif = dataDev.getTimeInMillis() - dataLoc.getTimeInMillis();
            long dDif = Dif / miliSegundosPorDia;
            float valT = valD * dDif;

            JOptionPane.showMessageDialog(null, "Valor da diária: " + valD);
            JOptionPane.showMessageDialog(null, "Data de Locação: " + sdf.format(dataLoc.getTime()));
            JOptionPane.showMessageDialog(null, "Data de Devolução: " + sdf.format(dataDev.getTime()));
            JOptionPane.showMessageDialog(null, "Dias de locação: " + dDif);
            JOptionPane.showMessageDialog(null, "Valor total da locação: " + valT);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro encontrado!: " + e.getMessage() + "\n Classe do Erro: " + e.getClass());
        }

    }
}