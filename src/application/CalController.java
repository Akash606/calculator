package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalController {
	@FXML
	private Label result;
	private float number;
	private boolean flag=true;
	private String operator="";
	
	@FXML
	public void processNumber(ActionEvent event) {
		if(flag) {
			result.setText("");
			flag=false;
		}
		String  value=((Button)event.getSource()).getText();
		result.setText(result.getText()+ value);
	}
	@FXML
	public void processOprator(ActionEvent event) {
		String op=((Button)event.getSource()).getText();
		if(!op.equals("=")) {
			if(!operator.isEmpty()) {
				return;
			}else {
				operator=op;
				number=Long.parseLong(result.getText());
				result.setText("");
			}
		}else {
			if(operator.isEmpty())
				return;
			float numb2=Long.parseLong(result.getText());
			CalModel mode=new CalModel();
			float re=  mode.getresult(number, numb2, operator);
			result.setText(String.valueOf(re));
			operator="";
			flag=true;
		}
	}
	

}
