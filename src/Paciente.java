
public class Paciente implements Comparable<Paciente>{

	public String nombre;
	public String sintoma;
	public String codigo;
	
	
	
	public int compareTo(Paciente p) {
		
		return this.codigo.compareTo(p.codigo);
	}

	
	public Paciente(String nombre, String sintoma, String codigo ) {
		
		this.nombre = nombre;
		this.sintoma = sintoma;
		this.codigo = codigo;
		
		
	}

	
}
