package com.mycompany.crudtesla;

import com.mycompany.crudtesla.model.Cliente;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class TelaConsultaController implements Initializable {
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    mostrarClientes();
    btn_atualizarcadastro.setDisable(true);
    btn_excluircadastro.setDisable(true);
    fieldConsultar.textProperty().addListener((ObservableList, oldValue, newValue)->{
        /*System.out.println("Field Consultar Changed: " + newValue);  testando se tá pegando o teclado */
        buscarDado(newValue);
    });
}

    @FXML
    public TextField fieldConsultar;
    @FXML
    public Button btn_consultar;
    @FXML
    public Button btn_voltar;
    @FXML
    public Button btn_atualizarcadastro;
    @FXML
    public Button btn_excluircadastro;
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
    public void btn_consultarAcao(ActionEvent event) throws IOException {
        
    }

    @FXML
    public void btn_voltarAcao(ActionEvent event) throws IOException {
        App.setRoot("TelaInicial");
    }
    @FXML
    private void btn_atualizarcadastroAcao (ActionEvent event) throws IOException {
        try{
            com.mycompany.crudtesla.AppQuery query = new com.mycompany.crudtesla.AppQuery();
            com.mycompany.crudtesla.model.Cliente cliente = new com.mycompany.crudtesla.model.Cliente(this.cliente.getId_dados_identificacao(),
            fieldNomeCompleto.getText(), fieldEmail.getText(), fieldNomeUsuario.getText(), fieldSenha.getText(), fieldDataNascimento.getText(),
            fieldNumeroTelefone.getText(), fieldEndereco.getText(), fieldInformacoesCartao.getText());
            query.updateCliente(cliente);
            mostrarClientes();
            btn_atualizarcadastro.setDisable(true);
            btn_excluircadastro.setDisable(true);
            limparCampos();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    @FXML
    public void btn_excluircadastroAcao (ActionEvent event) throws IOException {
        try{
            com.mycompany.crudtesla.AppQuery query = new com.mycompany.crudtesla.AppQuery();
            com.mycompany.crudtesla.model.Cliente cliente = new com.mycompany.crudtesla.model.Cliente(this.cliente.getId_dados_identificacao(),
            fieldNomeCompleto.getText(), fieldEmail.getText(), fieldNomeUsuario.getText(), fieldSenha.getText(), fieldDataNascimento.getText(),
            fieldNumeroTelefone.getText(), fieldEndereco.getText(), fieldInformacoesCartao.getText());
            query.deleteCliente(cliente);
            mostrarClientes();
            btn_atualizarcadastro.setDisable(true);
            btn_excluircadastro.setDisable(true);
            limparCampos();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    
    public Cliente cliente;
    
    @FXML
    public void mostrarClientes(){
        com.mycompany.crudtesla.AppQuery query = new com.mycompany.crudtesla.AppQuery();
        ObservableList<Cliente> list = query.getClienteList();
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
    
    @FXML
    public void mouseClickedTable(MouseEvent e){
        try{
            Cliente cliente = tableView.getSelectionModel().getSelectedItem();
            cliente = new Cliente(cliente.getId_dados_identificacao(), cliente.getNome_completo(), cliente.getEmail(),
            cliente.getNome_usuario(), cliente.getSenha(), cliente.getData_nascimento(), cliente.getNumero_telefone(),
            cliente.getEndereco(), cliente.getInformacoes_cartao());
            this.cliente = cliente;
            
            fieldNomeCompleto.setText(cliente.getNome_completo());
            fieldEmail.setText(cliente.getEmail());
            fieldNomeUsuario.setText(cliente.getNome_usuario());
            fieldSenha.setText(cliente.getSenha());
            fieldDataNascimento.setText(cliente.getData_nascimento());
            fieldNumeroTelefone.setText(cliente.getNumero_telefone());
            fieldEndereco.setText(cliente.getEndereco());
            fieldInformacoesCartao.setText(cliente.getInformacoes_cartao());
            
            btn_atualizarcadastro.setDisable(false);
            btn_excluircadastro.setDisable(false);
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
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
    
    public void buscarDado(String buscaNome) {
    ObservableList<Cliente> buscarDado = FXCollections.observableArrayList();
    com.mycompany.crudtesla.AppQuery query = new com.mycompany.crudtesla.AppQuery();
    ObservableList<Cliente> list = query.getClienteList();
    
    if (buscaNome != null && !buscaNome.trim().isEmpty()) {
        buscaNome = buscaNome.toLowerCase();
        for (Cliente cliente : list) {
            if (cliente.getNome_completo().toLowerCase().contains(buscaNome)
                    || cliente.getEmail().toLowerCase().contains(buscaNome)
                    || cliente.getNome_usuario().toLowerCase().contains(buscaNome)
                    || cliente.getSenha().toLowerCase().contains(buscaNome)
                    || cliente.getData_nascimento().toLowerCase().contains(buscaNome)
                    || cliente.getNumero_telefone().toLowerCase().contains(buscaNome)
                    || cliente.getEndereco().toLowerCase().contains(buscaNome)
                    || cliente.getInformacoes_cartao().toLowerCase().contains(buscaNome)) {
                buscarDado.add(cliente);
            }
        }
    } else {
        buscarDado.addAll(list);
    }
    
    tableView.setItems(buscarDado);
}
    
}
