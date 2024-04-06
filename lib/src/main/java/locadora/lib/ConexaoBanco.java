/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.lib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jrs
 */
public class ConexaoBanco {
        private static Connection conn;
    
    public static void initDB(String HOST, String PORTA, String BANCO, String USUARIO, String SENHA) {
        try {
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://" + HOST + ":" + PORTA + "/" + BANCO, USUARIO, SENHA);
        } catch (SQLException ex) {
            throw new RuntimeException("Não foi possivel estabelecer uma conexao com o Banco de Dados!", ex);
        }
    }

    public static Connection getConexao() {
        return conn;
    }
    
    
}
