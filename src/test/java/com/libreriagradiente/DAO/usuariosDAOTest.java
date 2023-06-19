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
    public void testVerificar() {
        System.out.println("verificar");
        String email = "oscarboris@outlook.cl";
        String pass = "oscar123";
        usuariosDAO instance = new usuariosDAO();
        usuarios us = new usuarios();
        us.setNombreU("Oscar Acuna Rivas");
        String expResult = us.getNombreU();
        usuarios usa = instance.verificar(email,pass);
        String result = usa.getNombreU();
        assertEquals(expResult, result);
        if(!expResult.equals(result)){
        fail("The test case is a prototype.");
    }}

    /**
     * Test of Registrar method, of class usuariosDAO.
     */
    @Test
    public void testRegistrar() {
        System.out.println("Registrar");
        usuarios us = new usuarios();
        us.setEmail("prueba@gmail.com");
        usuariosDAO instance = new usuariosDAO();
        String expResult = us.getEmail();
        usuarios usuR = instance.Registrar(us);
        String result = usuR.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!result.equals(expResult)){
        fail("The test case is a prototype.");
    }}

    /**
     * Test of crearPerfil method, of class usuariosDAO.
     */

    @Test
    public void testCrearPerfil2() {
        System.out.println("crearPerfil2");
        int id = 4;
        int expResult=id;
        usuariosDAO instance = new usuariosDAO();
        
        int result = instance.crearPerfil2(id);
        
        
        assertEquals(expResult, result);
        if(expResult!=result){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }}
    
}
