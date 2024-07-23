import java.sql.*;
import java.util.Scanner;

public class ExampleJdbc {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","mysql");
            PreparedStatement statement=connection.prepareStatement("insert into testErrorCode values(?,?,?)");
            Scanner scanner=new Scanner(System.in);
            int studentId= scanner.nextInt();
            scanner.nextLine();
            String department=scanner.nextLine();
            String studentName=scanner.nextLine();
            statement.setInt(1,studentId);
            statement.setString(2,department);
            statement.setString(3,studentName);
            statement.executeUpdate();
//            Statement statement=connection.createStatement();
//            statement.executeUpdate("insert into testErrorCode (studentId,studentName) values(5,'gihdsg')");
            statement.close();
            connection.close();
        }
        catch(ClassNotFoundException classNotFoundException){
            classNotFoundException.getMessage();
        }
        catch (SQLException sqlException){
//            System.out.println(sqlException.getMessage());
//            1062: Indicates an attempt to insert a duplicate entry into a column with a unique constraint, such as a primary key or a unique index.
//            1048: Occurs when trying to insert NULL into a column that has been defined as not allowing null values.
//            1451: Happens when there's an attempt to delete or update a row that is currently referenced by a foreign key in another table, thus violating referential integrity.
//            1452: Arises when an insert or update operation fails because it would result in a violation of a foreign key constraint.
//            1216: Similar to 1452, indicating a failure to insert or update a child row due to a foreign key constraint.
//            1217: Similar to 1451, indicating a failure to delete or update a parent row that is referenced by a foreign key in another table.
//            1364: Occurs when an insert operation omits a column that does not have a default value and is not defined as nullable, thus violating the table's schema definition.
//            1406: Triggered when an attempt is made to insert or update a row with data that exceeds the column's maximum allowed length.
            if(sqlException.getErrorCode()==1062) System.out.println("Student Id already available.");
            else if(sqlException.getErrorCode()==1048) System.out.println("Department should not empty");
            else if(sqlException.getErrorCode()==1406) System.out.println("Student name is maximum length");
            else if(sqlException.getErrorCode()==1451) System.out.println(1451);
            else if(sqlException.getErrorCode()==1452) System.out.println(1452);
            else if(sqlException.getErrorCode()==1216) System.out.println(1216);
            else if(sqlException.getErrorCode()==1217) System.out.println(1217);
            else if(sqlException.getErrorCode()==1364) System.out.println(1364);
            else System.out.println(sqlException.getMessage());
        }
    }
}
