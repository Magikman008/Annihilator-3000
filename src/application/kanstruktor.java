package application;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class kanstruktor{

	@FXML
	private Text a;
	@FXML
	private TextField inp;
	@FXML
	private TextField res;
	@FXML
	private Button to8;
	@FXML
	private Button to16;
	@FXML
	private Button X;
	@FXML
	public void initialize() {
		
		to8.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
	        @Override
	        public void handle(MouseEvent mouseEvent) {
	        	String i = inp.getText();
	        	int i_ = Integer.valueOf(i);
	            res.setText(Integer.toOctalString(i_));
	        }
	    });
		to16.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
	        @Override
	        public void handle(MouseEvent mouseEvent) {
	        	String i = inp.getText();
	        	int i_ = Integer.valueOf(i);
	            res.setText(Integer.toHexString(i_));
	        }
	    });
		X.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
	        @Override
	        public void handle(MouseEvent mouseEvent) {
	        	a.setText("Андрей пытается сделать нормальное оформление системных кнопок, но у него не получается, так что пока Alt + F4 Ɛ>");
	        }
	    });
	
	}

}
