package org.poojag;
public class pizza_hut{
	private Object jTextField1;
	//Takes input from TextFields
	int orderno
	= Integer.parseInt(
			jTextField1.getText());
	private Object jTextField2;
	String custname
	= jTextField2.getText();
	int qty
	= Integer.parseInt(
			jTextField3.getText());
	double rate = 0;

	//Pizza Type conditions
	if (jRadioButton1.isSelected()) {
		rate = 200;
	}
	else if (jRadioButton2.isSelected()) {
		rate = 300;
	}
	else if (jRadioButton3.isSelected()) {
		rate = 150;
	}
	//Displays rate of selected pizza
	//type in TextField
	jTextField4.setText(
			"" + rate);

	double topamt = 0;

	//Pizza toppings conditions
	if (jCheckBox1.isSelected()) {
		topamt = 60;
	}
	if (jCheckBox2.isSelected()) {
		topamt = topamt + 30;
	}
	if (jCheckBox3.isSelected()) {
		topamt = topamt + 40;
	}
	if (jCheckBox4.isSelected()) {
		topamt = topamt + 50;
	}
	//Displays total amount of
	//selected pizza toppings in TextField
	jTextField6.setText(
			""
					+ topamt);

	//Total amount is calculated
	double totalpayable
	= (rate * qty) + topamt;
	jTextField5.setText("" + totalpayable);

	//Displays order details
	jTextArea1
	.setText(
			"Hello, your Order Id is: " + orderno
			+ "\nName: " + custname
			+ "\nAMOUNT PAYABLE IS: " + totalpayable);
}
