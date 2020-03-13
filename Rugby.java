import java.sql.Date;

public class RugbySeisNaciones {
	
	public class Torneo{
		private Date año;
		public void ganador() {
		}
		
		public void clasificacion() {			
		}
		
		public Jornada jornada;
	}	
	
	public class Jornada{
		private Date fecha;
		public Partido partido;
	}
	
	public class Partido{
		private int puntosLocal;
		private int puntosVisitante;
		private int bonusLocal;
		private int bonusVisitante;
		
		public void resultado(){
		}
	
		public Equipo visitante;
		public Equipo local;
		public Arbitro arbitra;
	}
	
	public class Estadio{
		private String nombre;
		private int capacidad;
		private String ciudad;
	}
	
	public class Equipo{
		private Pais nombre;
		public Jugador jugadores;
		public Entrenador entrena;
	}
	
	public class Entrenador extends Persona{
	}
	
	public class Arbitro extends Persona{
	}
	
	public class Jugador extends Persona{
		private Posicion posicion;
		
		public java.util.Collection capitán = new java.util.TreeSet();
	}
	
	public class Persona{
		private String nombre;
		private Date fechaNacimiento;
		
	}
	
	public enum Pais{
		Escocia,
		Francia,
		Gales,
		Inglaterra,
		Irlanda,
		Italia;
	}
	
	public enum Posicion{
		Pilier,
		Talonador,
		Segunda_línea,
		Tercera_línea,
		Medio_melé,
		Apertura,
		Centro,
		Ala,
		Zaguero;
	}
}
