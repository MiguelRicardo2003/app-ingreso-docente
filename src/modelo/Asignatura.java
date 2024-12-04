
package modelo;

public class Asignatura {
   private final int id; private final String nombre; public Asignatura(int id, String nombre) { this.id = id; this.nombre = nombre; } public int getId() { return id; } @Override public String toString() { return nombre; }
}
