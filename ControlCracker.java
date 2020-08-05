package decryption;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ControlCracker {
	
	//adding the ids of textareas encrpyt and decrypt
	@FXML TextArea encrypt, decrypt;
	@FXML TextField key; 
	//adding button
	@FXML Button submit;
     public void decrypt(ActionEvent e) {
    	 
    	 //Accepting the message
    	 String msg = encrypt.getText(); 
    	
    	 //declaring needed data members
    	 String first = "abcdefghijklmnopqrstuvwxyz";
    	 char[] realMessage = msg.toCharArray();
    	 int[] n = new int[msg.length()];
    	 char[] alphabets = new char[52];
    	 int countChar = 0;
    	 String result = "";
    	 //adding the alphabets
    	 for(char c : first.toCharArray()) {
   		  alphabets[countChar] = c;
   		  countChar++;
    	 }
    	 countChar = 26;
    	 for(char c : first.toCharArray()) {
      		  alphabets[countChar] = c;
      		  countChar++;
       	 }
    	 
    	 //linking the alphabets to message
    	 for(int i = 0 ; i<msg.length() ; ++i) {
    		 for(int j = 0 ; j<26 ; ++j) {
    			 if(alphabets[j] == realMessage[i]) {
    				 n[i] = j;
    			 }
    		 }
    	 }
    	 //doing real bruteforcing
    	 if(Integer.parseInt(key.getText()) == 0) {
    		 for(int i = 0 ; i<26 ; ++i) {
                 result += Integer.toString(i+1)+") ";
      		 for(int j = 0 ; j<msg.length() ; ++j) {
      			 result += String.valueOf((alphabets[n[j]+i]));
      		 }
      		result+="\n";
      	 }
      	 decrypt.setText(result);
      	 	 
    	 }else if(Integer.parseInt(key.getText()) != 0) {
    		 for(int i = 0 ; i<msg.length() ; ++i) {
    			 result+=String.valueOf(alphabets[n[i] - Integer.parseInt(key.getText()) + 26 ]);
    		 }
          	 decrypt.setText(result);

    	 }
    	
    	 
    	 
    	 
     }
     
}
