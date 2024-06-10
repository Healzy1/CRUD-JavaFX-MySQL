package com.mycompany.crudtesla;

import java.sql.ResultSet;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class AppQuery {
    
    public Conexao c = new Conexao();
    
    public void addCliente(com.mycompany.crudtesla.model.Cliente cliente){
        try{
            c.getDBConn();
            java.sql.PreparedStatement ps = c.getCon().prepareStatement("insert into dados_identificacao( nome_completo, email, nome_usuario, senha, data_nascimento, numero_telefone, endereco, informacoes_cartao) values(?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, cliente.getNome_completo());
            ps.setString(2, cliente.getEmail());
            ps.setString(3, cliente.getNome_usuario());
            ps.setString(4, cliente.getSenha());
            ps.setString(5, cliente.getData_nascimento());
            ps.setString(6, cliente.getNumero_telefone());
            ps.setString(7, cliente.getEndereco());
            ps.setString(8, cliente.getInformacoes_cartao());
            ps.execute();
            ps.close();
            c.closeConnection();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public ObservableList<com.mycompany.crudtesla.model.Cliente> getClienteList(){
        ObservableList<com.mycompany.crudtesla.model.Cliente> clienteList = FXCollections.observableArrayList();
        try{
            String query = "select id_dados_identificacao, nome_completo, email, nome_usuario, senha, data_nascimento, numero_telefone, endereco, informacoes_cartao from dados_identificacao order by id_dados_identificacao asc";
            c.getDBConn();
            Statement st = c.getCon().createStatement();
            ResultSet rs = st.executeQuery(query);
            com.mycompany.crudtesla.model.Cliente s;
            while(rs.next()){
            s =  new com.mycompany.crudtesla.model.Cliente(rs.getInt("id_dados_identificacao"),
                rs.getString("nome_completo"), rs.getString("email"), rs.getString("nome_usuario"), 
                rs.getString("senha"), rs.getString("data_nascimento"), rs.getString("numero_telefone"), 
                rs.getString("endereco"), rs.getString("informacoes_cartao"));
            clienteList.add(s);
        }
            rs.close();
            st.close();
            c.closeConnection();
        }catch(Exception e){
            e.printStackTrace();
        }
        return clienteList;
        
    }
    
    public ObservableList<com.mycompany.crudtesla.model.Cliente> getClienteListRelatorio1(){
        ObservableList<com.mycompany.crudtesla.model.Cliente> clienteListRelatorio1 = FXCollections.observableArrayList();
        try{
            String query = "select id_dados_identificacao, nome_completo, email, nome_usuario, senha, data_nascimento, numero_telefone, endereco, informacoes_cartao from dados_identificacao WHERE endereco LIKE '%MT%' order by id_dados_identificacao asc";
            c.getDBConn();
            Statement st = c.getCon().createStatement();
            ResultSet rs = st.executeQuery(query);
            com.mycompany.crudtesla.model.Cliente s;
            while(rs.next()){
            s =  new com.mycompany.crudtesla.model.Cliente(rs.getInt("id_dados_identificacao"),
                rs.getString("nome_completo"), rs.getString("email"), rs.getString("nome_usuario"), 
                rs.getString("senha"), rs.getString("data_nascimento"), rs.getString("numero_telefone"), 
                rs.getString("endereco"), rs.getString("informacoes_cartao"));
            clienteListRelatorio1.add(s);
        }
            rs.close();
            st.close();
            c.closeConnection();
        }catch(Exception e){
            e.printStackTrace();
        }
        return clienteListRelatorio1;
        
    }
    
    public ObservableList<com.mycompany.crudtesla.model.Cliente> getClienteListRelatorio2(){
        ObservableList<com.mycompany.crudtesla.model.Cliente> clienteListRelatorio2 = FXCollections.observableArrayList();
        try{
            String query = "select id_dados_identificacao, nome_completo, email, nome_usuario, senha, data_nascimento, numero_telefone, endereco, informacoes_cartao from dados_identificacao WHERE email LIKE '%@gmail.com' order by id_dados_identificacao asc";
            c.getDBConn();
            Statement st = c.getCon().createStatement();
            ResultSet rs = st.executeQuery(query);
            com.mycompany.crudtesla.model.Cliente s;
            while(rs.next()){
            s =  new com.mycompany.crudtesla.model.Cliente(rs.getInt("id_dados_identificacao"),
                rs.getString("nome_completo"), rs.getString("email"), rs.getString("nome_usuario"), 
                rs.getString("senha"), rs.getString("data_nascimento"), rs.getString("numero_telefone"), 
                rs.getString("endereco"), rs.getString("informacoes_cartao"));
            clienteListRelatorio2.add(s);
        }
            rs.close();
            st.close();
            c.closeConnection();
        }catch(Exception e){
            e.printStackTrace();
        }
        return clienteListRelatorio2;
        
    }
    
    public void updateCliente(com.mycompany.crudtesla.model.Cliente cliente){
        try{
            c.getDBConn();
            java.sql.PreparedStatement ps = c.getCon().prepareStatement("UPDATE `dados_identificacao`\n" +
            "SET\n" +
            "`nome_completo` = ?,\n" +
            "`email` = ?,\n" +
            "`nome_usuario` = ?,\n" +
            "`senha` = ?,\n" +
            "`data_nascimento` = ?,\n" +
            "`numero_telefone` = ?,\n" +
            "`endereco` = ?,\n" +
            "`informacoes_cartao` = ?\n" +
            "WHERE `id_dados_identificacao` = ?");
            
            ps.setString(1, cliente.getNome_completo());
            ps.setString(2, cliente.getEmail());
            ps.setString(3, cliente.getNome_usuario());
            ps.setString(4, cliente.getSenha());
            ps.setString(5, cliente.getData_nascimento());
            ps.setString(6, cliente.getNumero_telefone());
            ps.setString(7, cliente.getEndereco());
            ps.setString(8, cliente.getInformacoes_cartao());
            ps.setInt(9, cliente.getId_dados_identificacao());
            ps.execute();
            ps.close();
            
            c.closeConnection();
            
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void deleteCliente(com.mycompany.crudtesla.model.Cliente cliente){
        try{
            c.getDBConn();
            java.sql.PreparedStatement ps = c.getCon().prepareStatement("DELETE FROM `dados_identificacao`\n" +
            "WHERE id_dados_identificacao = ?;");
                      
            ps.setInt(1, cliente.getId_dados_identificacao());
            ps.execute();
            ps.close();
            
            c.closeConnection();
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}
