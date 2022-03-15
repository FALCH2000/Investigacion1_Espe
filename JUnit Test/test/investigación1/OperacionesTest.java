/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package investigación1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author valen
 */
public class OperacionesTest {

     
    @org.junit.Test
    public void testSuma() {
        System.out.println("Suma");
        int a = 7;
        int b = 3;
        int esperado = 10; // 7 + 3 = 10
        int resultado = Operaciones.suma(a, b);
        assertEquals(esperado, resultado);
        
    }
 
    @org.junit.Test
    public void testResta() {
        System.out.println("Resta");
        int a = 15;
        int b = 10;
        int esperado = 5; // 15 - 10 = 5
        int resultado = Operaciones.resta(a, b);
        assertEquals(esperado, resultado);
    }
    
    @org.junit.Test
    public void testMultipliacion() {
        System.out.println("Multiplicacion");        
        int a = 2;
        int b = 3;
        int esperado = 6; // 2 * 3 = 6
        int resultado = Operaciones.multiplicacion(a, b);
        assertEquals(esperado, resultado);
    }
    
    @org.junit.Test
    public void testDivision() {
        System.out.println("Division");
        int a = 12;
        int b = 3;
        int esperado = 4; // 12 / 3 = 4
        int resultado = Operaciones.division(a, b);
        assertEquals(esperado, resultado);
    }
    
}
