package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import networking.Connector;
import networking.Peer;
import tools.IpValidator;
import tools.PortValidator;

public class Controller {

    private Peer peer;
    private Connector connector;

    @FXML
    Button insertIP, insertPort, tracker;
    @FXML
    TextField ip, port;
    @FXML
    TextArea log;


    public Controller(){
        this.peer = new Peer();
        this.connector = new Connector(peer);
    }


    @FXML
    public void setIP(){

        IpValidator validator = new IpValidator();

        if(validator.validate(ip.getText()) && ip.getText() != null){
            ip.setEditable(false);
            insertIP.setDisable(true);

            peer.setHostname(ip.getText());
            log.appendText("Client's ip set to: " + ip.getText() + "\n");
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

            peer.setPort(Integer.parseInt(port.getText()));
            log.appendText("Client's port set to: " + port.getText() + "\n");
        }
        else{
            port.setText("+10000");
        }
    }

    @FXML
    public void addTracker()throws Exception{
        peer.setServerName("127.168.1.1");
        peer.setServerPort(10000);
        connector.connectPeerToServer();
    }

    @FXML
    public void check(){
        connector.checkConnection();
    }
}
