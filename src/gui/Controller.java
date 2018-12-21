package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import tools.IpValidator;
import tools.PortValidator;

public class Controller {

    @FXML
    Button insertIP, insertPort, tracker;
    @FXML
    TextField ip, port;


    @FXML
    public void setIP(){

        IpValidator validator = new IpValidator();

        if(validator.validate(ip.getText()) && ip.getText() != null){
            ip.setEditable(false);
            insertIP.setDisable(true);

            /*

            DODAC OBSLUGE GNIAZDA

             */
        }
        else
            ip.setText("0.0.0.0");
    }

    @FXML
    public void setPort(){

        PortValidator validator = new PortValidator();

        if(validator.validate(port.getText())){
            port.setEditable(false);
            insertPort.setDisable(true);

                        /*

            DODAC OBSLUGE GNIAZDA

             */
        }
        else{
            port.setText("+10000");
        }
    }

    @FXML
    public void addTracker(){

    }
}
