import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AinaAvrilia_Update {
	private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/mahasiswa";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "";


	public static void main(String[] args) {
		try {
			updateRecord();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void updateRecord() throws SQLException {
			Connection connection = null;
			Statement statement = null;
		int recordCount = 0;
			String updateTableQuery = "UPDATE daftarmhs SET nama_mhs = 'Keisya Athazia' WHERE id = '11123'";
		try {
			connection = getDatabaseConnection();
			statement = connection.createStatement();
			System.out.println(updateTableQuery);
			statement.executeUpdate(updateTableQuery);
			recordCount = statement.getUpdateCount();
			System.out.println(recordCount + " record telah berhasil diupdate pada tabel daftar mahasiswa!");
			}
		catch(SQLException e) {
			System.out.println(e.getMessage());
			}
		finally {
			if (connection != null) {
			connection.close();
				}
			if (statement != null) {
			statement.close();
			}
		}
	}
		public static Connection getDatabaseConnection() {
			Connection connection = null;
		try {
			Class.forName(DB_DRIVER);
			}
		catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
			}
		try {
			connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
		return connection;
			}
		catch(SQLException e) {
			System.out.println(e.getMessage());
			}
		return connection;
			}

	}


