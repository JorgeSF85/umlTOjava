import java.net.URL;
import java.sql.Date;
import java.sql.Time;

public class Peliculas1 {
	
	public class Pelicula{
		

		private String titulo;
		private Date año;
		private String sinopsis;
		public Genero pelicula;
		private String pais;
		

		public java.util.Collection actor = new java.util.TreeSet();
		public java.util.Collection director = new java.util.TreeSet();
		public java.util.Collection productor = new java.util.TreeSet();
		public java.util.Collection guionista = new java.util.TreeSet();
	}	
	
	public class Persona{
		private String nombre;
		private String apellidos;
		private Date fechaNacimineto;
		private String nacionalidad;
	}
	
	public enum Genero {
		drama,
		comedia,
		acción,
		romance,
		aventura,
  terror,
		sci_fi;
	}
	
	public class Trailer{
		private URL url;
		private Time duración;
		public Persona editor;
	}
}
