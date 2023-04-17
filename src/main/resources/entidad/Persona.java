package entidad;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import jakarta.persistence.GenerationType;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {

@Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 private String documento;
 private String apellido;
 private String correo;
 private String genero;
 private Date fechanacimiento;
 private String telono;
 private String direccion;
 private double peso;
 private double altura;
 
 @Transient 
 private double imc;

		
	
	
	
	

}
