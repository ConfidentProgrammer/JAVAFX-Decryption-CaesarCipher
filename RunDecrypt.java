package decryption;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RunDecrypt extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        launch(args);
	}

	@Override
	public void start(Stage ps) throws Exception {
		// TODO Auto-generated method stub
		URL res = this.getClass().getResource("crack.fxml");
		Parent xmlScene = FXMLLoader.load(res);
		Scene myscene = new Scene(xmlScene);
		ps.setScene(myscene);
		ps.setTitle("Caesar Decryption");
		ps.show();
	}

}
