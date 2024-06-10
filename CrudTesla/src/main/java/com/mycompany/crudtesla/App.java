package com.mycompany.crudtesla;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import java.io.IOException;

public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("TelaInicial"));
        
        stage.setTitle("Starlink CRUD"); //nome do app
        
        Image icon = new Image("images/Starlink_logo.svg.png"); // icone do app
        stage.getIcons().add(icon);
    
        stage.setScene(scene);
        
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
    
    public static void main(String[] args) {
        launch();
      /*Testar a conexao do banco de dados, comente o launch e descomente esse abaixo
        Conexao db = new Conexao();
      db.getDBConn();
        System.out.println("Status da conexao: " +db.getCon());*/
    }

}