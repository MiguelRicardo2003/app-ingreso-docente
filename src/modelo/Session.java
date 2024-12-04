package modelo;

public class Session {
    private static String idUsuario;

    // Método para guardar el id del usuario cuando inicia sesión
    public static void setIdUsuario(String idUsuario) {
        Session.idUsuario = idUsuario;
    }
    public static String getIdUsuario() {
        return idUsuario;
    }
}
