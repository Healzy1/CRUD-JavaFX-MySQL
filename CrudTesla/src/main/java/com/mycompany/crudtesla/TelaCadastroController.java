package com.mycompany.crudtesla;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TelaCadastroController {

    @FXML
    public Button btn_voltar;
    @FXML
    public Button btn_registrar;
    @FXML
    public Button btn_novo;        
    
    @FXML
    public TextField fieldNomeCompleto;
    @FXML
    public TextField fieldEmail;
    @FXML
    public TextField fieldNomeUsuario;
    @FXML
    public TextField fieldSenha;
    @FXML
    public TextField fieldDataNascimento;
    @FXML
    public TextField fieldNumeroTelefone;
    @FXML
    public TextField fieldEndereco;
    @FXML
    public TextField fieldInformacoesCartao;

    @FXML
    public void btn_voltarAcao(ActionEvent event) throws IOException {
        App.setRoot("TelaInicial");
    }
    
    @FXML
    public void btn_registrarAcao(ActionEvent event) throws IOException {
        
        com.mycompany.crudtesla.model.Cliente cliente = new com.mycompany.crudtesla.model.Cliente(
        fieldNomeCompleto.getText(),
        fieldEmail.getText(),
        fieldNomeUsuario.getText(),
        fieldSenha.getText(),
        fieldDataNascimento.getText(),
        fieldNumeroTelefone.getText(),
        fieldEndereco.getText(),
        fieldInformacoesCartao.getText());
        
        com.mycompany.crudtesla.AppQuery query = new AppQuery();
        
        query.addCliente(cliente);
        limparCampos();
    }
    
    @FXML
    public void btn_novoAcao(ActionEvent event) throws IOException {
        App.setRoot("TelaInicial"); //FAZER A LOGICA DE APAGAR OQ TA NOS CAMPOS
    }
    
    public void limparCampos(){
        fieldNomeCompleto.setText("");
        fieldEmail.setText("");
        fieldNomeUsuario.setText("");
        fieldSenha.setText("");
        fieldDataNascimento.setText("");
        fieldNumeroTelefone.setText("");
        fieldEndereco.setText("");
        fieldInformacoesCartao.setText("");
    }
    
    public String getNomeCompleto() {
        return fieldNomeCompleto.getText();
    }
    
    public String getEmail() {
        return fieldEmail.getText();
    }
    
    public String getNomeUsuario() {
        return fieldNomeUsuario.getText();
    }
    
    public String getSenha() {
        return fieldSenha.getText();
    }
    
    public String getDataNascimento() {
        return fieldDataNascimento.getText();
    }
    
    public String getNumeroTelefone() {
        return fieldNumeroTelefone.getText();
    }
    
    public String getEndereco() {
        return fieldEndereco.getText();
    }
    
    public String getInformacoesCartao() {
        return fieldInformacoesCartao.getText();
    }

}