package com.mycompany.crudtesla;

import com.mycompany.crudtesla.model.Cliente;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class TelaRelatorio2Controller implements Initializable {
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    mostrarClientes();
    }

    @FXML
    public Button btn_voltar;
    
    @FXML
    public TableView<Cliente> tableView;
    @FXML
    public TableColumn<Cliente, Integer> colId;
    @FXML
    public TableColumn<Cliente, String> colNomeCompleto;
    @FXML
    public TableColumn<Cliente, String> colEmail;
    @FXML
    public TableColumn<Cliente, String> colUsuario;
    @FXML
    public TableColumn<Cliente, String> colSenha;
    @FXML
    public TableColumn<Cliente, String> colDataNascimento;
    @FXML
    public TableColumn<Cliente, String> colNumeroTelefone;
    @FXML
    public TableColumn<Cliente, String> colInformacoesCartao;
    @FXML
    public TableColumn<Cliente, String> colEndereco;
    
    @FXML
    void btn_voltarAcao(ActionEvent event) throws IOException {
        App.setRoot("TelaRelatorios");
    }
    
    public Cliente cliente;
    
    @FXML
    public void mostrarClientes(){
        com.mycompany.crudtesla.AppQuery query = new com.mycompany.crudtesla.AppQuery();
        ObservableList<Cliente> list = query.getClienteListRelatorio2();
        colId.setCellValueFactory(new PropertyValueFactory<Cliente, Integer>("id_dados_identificacao"));
        colNomeCompleto.setCellValueFactory(new PropertyValueFactory<Cliente, String>("nome_completo"));
        colEmail.setCellValueFactory(new PropertyValueFactory<Cliente, String>("email"));
        colUsuario.setCellValueFactory(new PropertyValueFactory<Cliente, String>("nome_usuario"));
        colSenha.setCellValueFactory(new PropertyValueFactory<Cliente, String>("senha"));
        colDataNascimento.setCellValueFactory(new PropertyValueFactory<Cliente, String>("data_nascimento"));
        colNumeroTelefone.setCellValueFactory(new PropertyValueFactory<Cliente, String>("numero_telefone"));
        colEndereco.setCellValueFactory(new PropertyValueFactory<Cliente, String>("endereco"));
        colInformacoesCartao.setCellValueFactory(new PropertyValueFactory<Cliente, String>("informacoes_cartao"));
        tableView.setItems(list);
    }

}