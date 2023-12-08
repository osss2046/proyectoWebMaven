/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.libreriagradiente.DAO;

import com.libreriagradiente.modelo.perfil;
import com.libreriagradiente.modelo.rol;
import com.libreriagradiente.modelo.usuarios;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Oscar
 */
public class usuariosDAOTest {
    
    public usuariosDAOTest() {
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
     * Test of verificar method, of class usuariosDAO.
     */


    @Test
    public void testCrearPerfil2() {
        int id = 4;
        int expResult=4;
        
        int result = 4;
        
        
        assertEquals(expResult, result);
        if(expResult!=result){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }}
    
}
