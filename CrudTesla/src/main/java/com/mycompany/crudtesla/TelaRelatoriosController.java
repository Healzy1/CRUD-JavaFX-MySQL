package com.mycompany.crudtesla;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class TelaRelatoriosController {

    @FXML
    public Button btn_visualizar1;

    @FXML
    public Button btn_visualizar2;
    
    @FXML
    public Button btn_voltar;

    @FXML
    void btn_voltarAcao(ActionEvent event) throws IOException {
        App.setRoot("TelaInicial");
    }
    
    @FXML
    void btn_visualizar1Acao(ActionEvent event) throws IOException {
        App.setRoot("TelaRelatorio1");
    }
    
    @FXML
    void btn_visualizar2Acao(ActionEvent event) throws IOException {
        App.setRoot("TelaRelatorio2");
    }

}
