/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diccionario_java;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.ArrayList;
import java.util.Set;
import java.util.Map;
import java.util.Collections;
/**
 *
 * @author Hp
 */
public class Diccionario_java {

    /**
     * @param args the command line arguments
     */



    public static void main(String[] args) {
        
// 1. Crear un Dictionary para perro
                Dictionary<String, Object> perro = new Hashtable<>();

        // 2. Añadir nombre, color, raza, patas y edad al diccionario perro
                perro.put("nombre", "Balto");
                perro.put("color", "Blanco");
                perro.put("raza", "pitbul");
                perro.put("patas", 4);
                perro.put("edad", 5);

        // 3. Crear un Dictionary para estudiante y añadir las claves y valores correspondientes
              Dictionary<String, Object> estudiante = new Hashtable<>();
       
                 estudiante.put("nombre", "Keiner");
                 estudiante.put("apellido", "Sanchez");
                 estudiante.put("sexo", "Masculino");
                 estudiante.put("edad", 23);
                 estudiante.put("estado civil", "Soltero");
          
        ArrayList<String> habilidades = new ArrayList<>();
        
              habilidades.add("Base de datos");
              habilidades.add("natacion");
              estudiante.put("habilidades", habilidades);
              estudiante.put("pais", "colombia");
              estudiante.put("ciudad", "Cartagena");
              estudiante.put("dirección", "zaragocilla");

        // 4. Obtener la longitud del diccionario
                  System.out.println("la longitud del diccionario: " + estudiante.size());

        // 5. Obtener el valor de las habilidades y comprobar el tipo de datos
                  System.out.println("habilidades: " + estudiante.get("habilidades"));
                  System.out.println("tipo de datos de habilidades: " + (estudiante.get("habilidades") instanceof ArrayList));

        // 6. Modificar los valores de las aptitudes añadiendo una o dos aptitudes
                  habilidades.add("guitarra");
                  habilidades.add("piano");

        // 7. Obtener las claves del diccionario como una lista
                 ArrayList<String> claves = Collections.list(estudiante.keys());
                     System.out.println("las claves del diccionario de estudiante: " + claves);

        // 8. Obtener los valores del diccionario como una lista
               ArrayList<Object> valores = Collections.list(estudiante.elements());
                 System.out.println("valores del diccionario de estudiante: " + valores);
 
        // 9. Cambiar el diccionario a una lista de tuplas utilizando el método entrySet()
                 Set<Map.Entry<String, Object>> entrySet = ((Hashtable<String, Object>)estudiante).entrySet();
                   System.out.println("lista de tuplas: " + entrySet);

        // 10. Eliminar uno de los elementos del diccionario
               estudiante.remove("pais");
                  System.out.println("eliminar 'pais': " + estudiante);

        // 11. Borrar uno de los diccionarios
                 perro = new Hashtable<>(); 
                   System.out.println("Diccionario 'perro' borrado: " + perro);
    }
}



