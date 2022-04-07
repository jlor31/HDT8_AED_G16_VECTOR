import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PruebaRetirar {

	@Test
	void testRetirar() {
		
		VectorHeap<Paciente> prueba = new VectorHeap<>();
		
		prueba.add(new Paciente("Nombre1", "sintoma1", "C"));
		prueba.add(new Paciente("Nombre2", "sintoma2", "A"));
		prueba.add(new Paciente("Nombre3", "sintoma3", "D"));
		
		
		Paciente resultado_prueba1 = prueba.remove();
		Paciente resultado_prueba2 = prueba.remove();
		Paciente resultado_prueba3 = prueba.remove();
		
		
		assertEquals("Nombre2", resultado_prueba1.nombre);  // Verificando que los pacientes se retiren en el orden correcto
		assertEquals("Nombre1", resultado_prueba2.nombre);
		assertEquals("Nombre3", resultado_prueba3.nombre);
	}

}
