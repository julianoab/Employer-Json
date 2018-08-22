package connection;

import java.sql.Connection;
import java.sql.DriverManager;

/*Responsavel por fazer a conexão com o banco de dados*/
public class SingleConnection {
	
	// autoReconnect se a conexão cair vai conectar automaticamente
	private static String banco = "jdbc:postgresql://localhost:5432/curso-jsp?autoReconnect=true";
	private static String password = "admin";
	private static String user = "postgres";
	private static Connection connection = null;
	
	// Caso de o erro de Filter
	//private static Connection connection = SingleConnection.getConnection();
	// garantiar que a conexão ao banco de dados esteja ativa
	static {
		conectar();
	}
	// Construtor
	public SingleConnection() {
		conectar();
	}
	
	// metodo para conexão ao banco
	private static void conectar() {
		try {
			// if conexao for igual nula fará a conexao se não retornará a conexão
			if(connection == null){
				Class.forName("org.postgresql.Driver");
				connection = DriverManager.getConnection(banco, user, password); 
				// não quero que a trasação comita automaticamente
				connection.setAutoCommit(false);
			}
			
		} catch (Exception e) {
			throw new RuntimeException("Erro ao conectar oa banco de dados");
		}
	}
	
	//metodo que retorna a conexão
	public static Connection getConnection(){
		return connection;
	}
		
}
