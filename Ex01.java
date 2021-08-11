import javax.swing.JOptionPane;

public class Ex01 {

    public static void main(String[] args) {

        String t = JOptionPane.showInputDialog(null, "Insira o seu nome: ");
        String nome = String.valueOf(t);

        String t2 = JOptionPane.showInputDialog(null, "Informe o seu salário bruto: ");
        double salario = Double.parseDouble(t2);

        double salLiq = 0;
        double INSS = 0;

        try {
            if (salario > 0 && salario <= 1100) {
                double i = 7.5;

                INSS = INSS + (salario * i) / 100;
                salLiq = salLiq + salario - INSS;
            } else if (salario > 1100 && salario <= 2203.48) {
                double i = 9;

                INSS = INSS + (salario * i) / 100;
                salLiq = salLiq + salario - INSS;
            } else if (salario > 2203.48 && salario <= 3305.22) {
                double i = 12;

                INSS = INSS + (salario * i) / 100;
                salLiq = salLiq + salario - INSS;
            } else if (salario > 3305.22 && salario <= 6433.57) {
                double i = 14;

                INSS = INSS + (salario * i) / 100;
                salLiq = salLiq + salario - INSS;
            } else {
                JOptionPane.showMessageDialog(null, "Valor Informado Inválido");
            }

            JOptionPane.showMessageDialog(null, "Nome: " + nome);
            JOptionPane.showMessageDialog(null, "Salário bruto: " + salario);
            JOptionPane.showMessageDialog(null, "INSS: " + INSS);
            JOptionPane.showMessageDialog(null, "Salário Líquido: " + salLiq);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro encontrado!: " + e.getMessage() + "\n Classe do Erro: " + e.getClass());
        }

    }
}