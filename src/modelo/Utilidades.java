package modelo;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Utilidades {
    // Método para convertir una cadena (en este caso la contraseña) a MD5
    public static String convertirAMD5(String contraseña) {
        try {
            // Crear un objeto MessageDigest que usará el algoritmo MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

            // Convertir la contraseña en bytes y calcular el hash
            byte[] hashEnBytes = md.digest(contraseña.getBytes());

            // Convertir el byte[] a una cadena hexadecimal
            StringBuilder sb = new StringBuilder();
            for (byte b : hashEnBytes) {
                sb.append(String.format("%02x", b));
            }

            return sb.toString(); // Devuelve el hash en formato hexadecimal
        } catch (NoSuchAlgorithmException e) {
            // En caso de error al generar el hash, lanzar una excepción en tiempo de ejecución
            throw new RuntimeException("Error generando el hash MD5", e);
        }
    } 
}
