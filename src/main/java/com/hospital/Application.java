package com.hospital;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.hospital.DAO"})
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class);
//        UsuarioRepository repository = context.getBean(UsuarioRepository.class);
//       
////        Hospital  Hospital1; //Declaramos una variable del tipo de la clase
////        Hospital1 = new Hospital(1, "San Vicente de Paul", "Rionegro", 2506, 100, "publico"); //Aquí ya hemos creado un objeto de MiClase
////        // Guardar un conjunto de usuarios
//        
//        repository.save(new Hospital(1, "San Vicente de Paul", "Rionegro", "2007-12-02", 150, "publico"));
//        repository.save(new Hospital(2, "Universitario", "Medellin", "2015-23-11", 20, "publico"));
//        repository.save(new Hospital(3, "Clinica CES", "Medellin", "2017-06-12", 80, "privado"));
//        repository.save(new Hospital(4, "Clinica las Americas", "Medellin", "2010-10-14", 65, "privado"));
//        
//        // findAll heredado de la interface CrudRepository
//        Iterable<Hospital> todos = repository.findAll();
//        System.out.println("Listar todos los Usuarios:");
//        for (Hospital usr : todos) {
//            System.out.println("\t" + usr);
//        }
//        System.out.println();
//
////        // findByEdadLessThan devuelve todos los usuarios con edades menores a la indicada
////        Iterable<Hospital> NumMedicos = repository.findByNumMedicosLessThan(21);
////        System.out.println("Usuarios con edad menor a 21");
////        for (Hospital usr : edades) {
////            System.out.println("\t" + usr);
////	        }
////	        System.out.println();
//
//	        context.close();
	    }

}
