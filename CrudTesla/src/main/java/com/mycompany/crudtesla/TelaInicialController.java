package com.mycompany.crudtesla;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class TelaInicialController {
    
    @FXML
    public Button btn_cadastrar;
    @FXML
    public Button btn_consultar;
    @FXML
    public Button btn_relatorios;

    @FXML
    public void btn_cadastrarAcao(ActionEvent event) throws IOException {
        App.setRoot("TelaCadastro");
    }

    @FXML
    public void btn_consultarAcao(ActionEvent event) throws IOException{
        App.setRoot("TelaConsulta");
    }

    @FXML
    public void btn_relatoriosAcao(ActionEvent event) throws IOException{
        App.setRoot("TelaRelatorios");
    }
    
}
