package WholeWorthsGroceryFXML;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private Label breadLabel;

    @FXML
    private TextField breadQtyText;

    @FXML
    private TextField breadSubtotalText;

    @FXML
    private Button calculateButton;

    @FXML
    private Label eggsLabel;

    @FXML
    private TextField eggsQtyText;

    @FXML
    private TextField eggsSubtotalText;

    @FXML
    private Label milkLabel;

    @FXML
    private TextField milkQtyText;

    @FXML
    private TextField milkSubtotalText;

    @FXML
    private Label qtyLabel;

    @FXML
    private Label subTotalLabel;

    @FXML
    private Label titleLabel;

    @FXML
    private Label totalLabel;

    @FXML
    private TextField totalText;

    @FXML
    void handleButtonAction(ActionEvent event) {
        try {
            int eggsAmount = Integer.valueOf(eggsQtyText.getText());
            double eggsPrice = ((eggsAmount / 12) * 5.00) + ((eggsAmount % 12) * 0.50);
            eggsSubtotalText.setText("$" + eggsPrice);

            int milkAmount = Integer.valueOf(milkQtyText.getText());
            double milkPrice = ((milkAmount / 3) * 7.00) + ((milkAmount % 3) * 2.50);
            milkSubtotalText.setText("$" + milkPrice);

            int breadAmount = Integer.valueOf(breadQtyText.getText());
            double breadPrice = ((breadAmount / 2) * 6.00) + ((breadAmount % 2) * 3.50);
            breadSubtotalText.setText("$" + breadPrice);

            double totalPrice = (eggsPrice + milkPrice + breadPrice);
            totalText.setText("$" + totalPrice);
        } catch (NumberFormatException e) {
            System.out.println("Enter the quantity of the products");
        }
    }

}
