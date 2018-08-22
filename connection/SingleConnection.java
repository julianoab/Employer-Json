package connection;

import java.sql.Connection;
import java.sql.DriverManager;

/*Responsavel por fazer a conex�o com o banco de dados*/
public class SingleConnection {
	
	// autoReconnect se a conex�o cair vai conectar automaticamente
	private static String banco = "jdbc:postgresql://localhost:5432/curso-jsp?autoReconnect=true";
	private static String password = "admin";
	private static String user = "postgres";
	private static Connection connection = null;
	
	// Caso de o erro de Filter
	//private static Connection connection = SingleConnection.getConnection();
	// garantiar que a conex�o ao banco de dados esteja ativa
	static {
		conectar();
	}
	// Construtor
	public SingleConnection() {
		conectar();
	}
	
	// metodo para conex�o ao banco
	private static void conectar() {
		try {
			// if conexao for igual nula far� a conexao se n�o retornar� a conex�o
			if(connection == null){
				Class.forName("org.postgresql.Driver");
				connection = DriverManager.getConnection(banco, user, password); 
				// n�o quero que a trasa��o comita automaticamente
				connection.setAutoCommit(false);
			}
			
		} catch (Exception e) {
			throw new RuntimeException("Erro ao conectar oa banco de dados");
		}
	}
	
	//metodo que retorna a conex�o
	public static Connection getConnection(){
		return connection;
	}
		
}
