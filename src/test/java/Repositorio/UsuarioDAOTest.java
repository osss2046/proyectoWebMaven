/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Repositorio;

import com.libreriagradiente.DAO.usuariosDAO;
import java.util.HashMap;
import java.util.List;
import com.libreriagradiente.modelo.usuarios;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Karina Paste
 */
public class UsuarioDAOTest {
    
    public UsuarioDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getObtenerUsuario method, of class UsuarioDAO.
     */
    @Test //PARA PROBAR QUE EL RESULTADO ESPERADO SEA NULL
    public void testGetObtenerUsuarioNull() {
        System.out.println("En método testGetObtenerUsuarioNull verificando que el rut sea Nulo...");
        String mail = "1111";
        usuariosDAO instance = new usuariosDAO();
        usuarios expResult = null;  //se debe ajustar la variable expResult según las expectativas reales de lo que se espera del método, en este caso se espera que el resultado sea nulo
        usuarios result = instance.obtenerUsuario(mail);
        //si el resultado no es null, la prueba fallará y se presenta un mensaje indicado la discrepancia entre el resultado esperado y el resultado real.
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype."); //este metodo se debe borrar ya que lo crea por defecto
    }
    
        /**
     * Test of getObtenerUsuario method, of class UsuarioDAO.
     */


    /**
     * Test of esUsuario method, of class UsuarioDAO.
     */

    
    /**
     * Test of esUsuario method, of class UsuarioDAO.
     */
    @Test //PARA PROBAR QUE EL RESULTADO ESPERADO NO SEA NULL
    public void testEsUsuarioNotNull() {
        System.out.println("esUsuario");
        String correo = "karina.pasten@gmail.com";
        String pass ="1234";
        usuariosDAO instance = new usuariosDAO();
        usuarios result = instance.verificar(correo,pass);
        assertNotNull(result);
    }    




}
