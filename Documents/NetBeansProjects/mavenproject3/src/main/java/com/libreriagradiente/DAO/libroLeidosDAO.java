/*


 */
package com.libreriagradiente.DAO;

/**
 *
 * @author Oscar
 */
public class libroLeidosDAO extends libroDAO {
    // Asumiendo que la tabla de la base de datos es "librosLeidos"
    @Override
    public String getTableName() {
        return "librosLeidos";
    }
}