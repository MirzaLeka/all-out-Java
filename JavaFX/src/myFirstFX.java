
//import com.sun.xml.internal.ws.org.objectweb.asm.Label;

import javafx.application.*;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.*;

public class myFirstFX extends Application {

	String x = "47";

	public static void main(String[] args) {
		launch(args);
		
	}
	


@Override
public void start(Stage stage) throws Exception {
Label title = new Label(x);



VBox root = new VBox();
root.getChildren().add(title);


Scene scene = new Scene(root, 640, 480);
stage.setScene(scene);

stage.show();

}

}
