/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import jdbc.ConectionFactory;
import model.Produtos;

/**
 *
 * @author Luis
 */
public class ProdutoDao {
    private Connection conecta;

    public ProdutoDao() {
        this.conecta = new ConectionFactory().Conecta();
    }
    
    public void cadastrarProduto(Produtos obj){
        try{
            String sql = "insert into produto(pro_nome, pro_descricao, pro_preco) values(?, ?, ?)";
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getDescricao());
            stmt.setDouble(3, obj.getPreco());
            
            stmt.execute();
            
            stmt.close();
        }catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    }
}
