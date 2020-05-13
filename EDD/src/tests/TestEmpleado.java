package tests;

import static org.junit.Assert.*;


import org.junit.Test;

import syspagos.Empleado;
import syspagos.Prima;
import excepciones.*;

public class TestEmpleado 
{
	//establecerNumeroEmpleado()--------------------------------------------------------------------------------------
	@Test 
	public void establecerNumeroDeEmpleadoCorrecto() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerNumeroEmpleado("4");
        } catch (NumeroEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals(4,e.getNumeroEmpleado());
	}
	@Test 
	public void establecerNumeroDeEmpleadoIncorrectoMayor3Digitos() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerNumeroEmpleado("5000");
        } catch (NumeroEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals(5000,e.getNumeroEmpleado());
	}
	@Test 
	public void establecerNumeroDeEmpleadoIncorrecto000() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerNumeroEmpleado("000");
        } catch (NumeroEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals(000,e.getNumeroEmpleado());
	}
	@Test 
	public void establecerNumeroDeEmpleadoIncorrectoNegativo() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerNumeroEmpleado("-45");
        } catch (NumeroEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals(-45,e.getNumeroEmpleado());
	}
	@Test 
	public void establecerNumeroDeEmpleadoIncorrectoNoNumero() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerNumeroEmpleado("hola");
        } catch (NumeroEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals("hola",e.getNumeroEmpleado());
	}
	@Test 
	public void establecerNumeroDeEmpleadoIncorrectoNoCadena() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerNumeroEmpleado(null);
        } catch (NumeroEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals(null,e.getNumeroEmpleado());
	}
	
	//estableceNombreEmpleado()------------------------------------------------------------------------------------------
	
	@Test 
	public void estableceNombreDeEmpleadoCorrecto() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.estableceNombreEmpleado("Jorgemanitas");
        } catch (NombreEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals("Jorgemanitas",e.getNombreEmpleado());
	}
	
	@Test 
	public void estableceNombreDeEmpleadoIncorrectoMenor10Caracteres() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.estableceNombreEmpleado("manuel");
        } catch (NombreEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals("manuel",e.getNombreEmpleado());
	}
	@Test 
	public void estableceNombreDeEmpleadoIncorrectoVacio() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.estableceNombreEmpleado(null);
        } catch (NombreEmpleadoException ex) 
        {
        	fail();
        }
        assertEquals(null,e.getNombreEmpleado());
	}
	//estableceMesesTrabajo-----------------------------------------------------------------------------------------
	
	@Test 
	public void estableceMesesTrabajoCorrecto() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.estableceMesesTrabajo("500");
        } catch (MesesTrabajoException ex) 
        {
        	fail();
        }
        assertEquals("500",e.getMesesTrabajo());
	}
	
	@Test 
	public void estableceMesesTrabajoIncorrecto000() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.estableceMesesTrabajo("000");
        } catch (MesesTrabajoException ex) 
        {
        	fail();
        }
        assertEquals("000",e.getMesesTrabajo());
	}
	
	@Test 
	public void estableceMesesTrabajoIncorrectoMas3Digitos() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.estableceMesesTrabajo("1001");
        } catch (MesesTrabajoException ex) 
        {
        	fail();
        }
        assertEquals("1001",e.getMesesTrabajo());
	}
	@Test 
	public void estableceMesesTrabajoIncorrectoMenos3Digitos() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.estableceMesesTrabajo("1");
        } catch (MesesTrabajoException ex) 
        {
        	fail();
        }
        assertEquals("1",e.getMesesTrabajo());
	}
	
	@Test 
	public void estableceMesesTrabajoIncorrectoNegativo() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.estableceMesesTrabajo("-1");
        } catch (MesesTrabajoException ex) 
        {
        	fail();
        }
        assertEquals("-1",e.getMesesTrabajo());
	}
	
	@Test 
	public void estableceMesesTrabajoIncorrectoNoNumero() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.estableceMesesTrabajo("a");
        } catch (MesesTrabajoException ex) 
        {
        	fail();
        }
        assertEquals("a",e.getMesesTrabajo());
	}
	@Test 
	public void estableceMesesTrabajoIncorrectoVacio() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.estableceMesesTrabajo(null);
        } catch (MesesTrabajoException ex) 
        {
        	fail();
        }
        assertEquals(null,e.getMesesTrabajo());
	}

//establecerSerDirectivo-----------------------------------------------------------------------------------------------------

	@Test 
	public void establecerSerDirectivoCorrecto1() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerSerDirectivo("+");
        } catch (CargoException ex) 
        {
        	fail();
        }
        assertEquals(true,e.getDirectivo());
	}
	@Test 
	public void establecerSerDirectivoCorrecto2() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerSerDirectivo("-");
        } catch (CargoException ex) 
        {
        	fail();
        }
        assertEquals(false,e.getDirectivo());
	}
	@Test 
	public void establecerSerDirectivoIncorrectoDistinto() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerSerDirectivo("a");
        } catch (CargoException ex) 
        {
        	fail();
        }
        assertEquals("a",e.getDirectivo());
	}
	
	@Test 
	public void establecerSerDirectivoIncorrectoMasDe1Caracter() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerSerDirectivo("alo");
        } catch (CargoException ex) 
        {
        	fail();
        }
        assertEquals("alo",e.getDirectivo());
	}
	@Test 
	public void establecerSerDirectivoIncorrectoVacia() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.establecerSerDirectivo(null);
        } catch (CargoException ex) 
        {
        	fail();
        }
        assertEquals(null,e.getDirectivo());
	}
//calcularPrima()-------------------------------------------------------------------------------------------------

	@Test 
	public void calcularPrimaCorrectoP1() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.calcularPrima("333","ManuelGranado","450","+");
        } catch (Exception ex) 
        {
        	fail();
        }
        assertEquals(Prima.P1,e.getPrima());
	}
	
	@Test 
	public void calcularPrimaCorrectoP2() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.calcularPrima("333","ManuelGranado","450","-");
        } catch (Exception ex) 
        {
        	fail();
        }
        assertEquals(Prima.P2,e.getPrima());
	}
	
	@Test 
	public void calcularPrimaCorrectoP3() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.calcularPrima("333","ManuelGranado","011","+");
        } catch (Exception ex) 
        {
        	fail();
        }
        assertEquals(Prima.P3,e.getPrima());
	}
	@Test 
	public void calcularPrimaCorrectoP4() 
	{
		Empleado e = new Empleado();
        try 
        {
            e.calcularPrima("333","ManuelGranado","011","-");
        } catch (Exception ex) 
        {
        	fail();
        }
        assertEquals(Prima.P4,e.getPrima());
	}
	


}
