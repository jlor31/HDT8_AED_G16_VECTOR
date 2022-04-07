import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PruebaAgregar {

	@Test
	public void testAgregar() {
		VectorHeap<Paciente> prueba = new VectorHeap<>();
		
		prueba.add(new Paciente("Nombre1", "sintoma1", "C"));
		prueba.add(new Paciente("Nombre2", "sintoma2", "A"));
		prueba.add(new Paciente("Nombre3", "sintoma3", "D"));
		
		int size_prueba = prueba.size();		//Verificando que se este agregando la cantidad correcto de pacientes
		Paciente resultado_prueba = prueba.remove();
		
		assertEquals(3, size_prueba);
		assertEquals("Nombre2", resultado_prueba.nombre);  //Verificando que los pacientes se hayan agregado en el orden correcto
		
	}

}
