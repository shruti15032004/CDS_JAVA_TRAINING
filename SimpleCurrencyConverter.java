import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCurrencyConverter extends JFrame {
     JComboBox<String> currencyOptions;
    JTextField amountField;
    JLabel resultLabel;

    // Exchange rates
     double USD_TO_INR = 83.72;
     double INR_TO_USD = 1 / USD_TO_INR;

    public SimpleCurrencyConverter() {
        setTitle("Currency Converter");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        add(panel);

        currencyOptions = new JComboBox<>(new String[]{"USD to INR", "INR to USD"});
        amountField = new JTextField(10);
        JButton convertButton = new JButton("Convert");
        resultLabel = new JLabel("Converted Amount: ");

        panel.add(currencyOptions);
        panel.add(new JLabel("Amount:"));
        panel.add(amountField);
        panel.add(convertButton);
        panel.add(resultLabel);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertCurrency();
            }
        });
    }

    private void convertCurrency() {
        String option = (String) currencyOptions.getSelectedItem();
        double amount = Double.parseDouble(amountField.getText());
        double convertedAmount = 0.0;

        switch (option) {
            case "USD to INR":
                convertedAmount = amount * USD_TO_INR;
                break;
            case "INR to USD":
                convertedAmount = amount * INR_TO_USD;
                break;
        }

        resultLabel.setText(String.format("Converted Amount: %.3f", convertedAmount));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SimpleCurrencyConverter converter = new SimpleCurrencyConverter();
                converter.setVisible(true);
            }
        });
    }
}

