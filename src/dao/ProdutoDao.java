/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
    
    public List<Produtos> listarProdutos(){
        try{
            List<Produtos> lista = new ArrayList<Produtos>();
            String sql = "select * from produto";
            PreparedStatement stmt = conecta.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Produtos produto = new Produtos();
                produto.setId(rs.getInt("pro_id"));
                produto.setNome(rs.getString("pro_nome"));
                produto.setDescricao(rs.getString("pro_descricao"));
                produto.setPreco(rs.getDouble("pro_preco"));
                lista.add(produto);
            }
            return lista;
        }catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    }
}
