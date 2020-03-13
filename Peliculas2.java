import java.net.URL;
import java.sql.Date;
import java.sql.Time;

public class Peliculas2 {
	
	public class Pelicula{
		private String titulo;
		private Date año;
		private String sinopsis;
		public Genero pelicula;
		private String pais;
	}	
	
	public class actor extends Persona{
	}
	
	public class director extends Persona{
	}
	
	public class productor extends Persona{
	}
	
	public class guionista extends Persona{
	}
	
	public class editor extends Persona{
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
		terror,
		romance,
		aventura,
		sci_fi;
	}
	
	public class Trailer{
		private URL url;
		private Time duración;
	}
}

