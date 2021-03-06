package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class StartScreen
{
    private boolean newgame;

    public void newGame(ActionEvent e) throws Exception
    {
        newgame=true;
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("Input.fxml"));
        loader.setController(new Input(newgame));
        Main.root=loader.load();
        Main.stage.setScene(new Scene(Main.root));
    }
    public void loadGame(ActionEvent e) throws Exception
    {
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("Input.fxml"));
        loader.setController(new Input(newgame));
        Main.root=loader.load();
        Main.stage.setScene(new Scene(Main.root));
    }
}
