package controlador;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.toedter.calendar.JDateChooser;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import modelo.Asignatura;
import modelo.Session;
import modelo.Utilidades;
import modelo.conexion;
import vista.frm_home;
import vista.frm_ingreso;
import vista.frm_reportes;

public class Metodos {

    int idSexo;
    int idMunicipio;
    int idProfesion;
    int idRol;
    int idSalon;
    int idDocente;
    int idHorario;
    int idAsignatura;

    public void establecerIdSexo(int idSexo) {
        this.idSexo = idSexo;
    }

    public void establecerIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public void establecerIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public void establecerIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public void establecerIdMunicipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public void establecerIdProfesion(int idProfesion) {
        this.idProfesion = idProfesion;
    }

    public void establecerIdRol(int idRol) {
        this.idRol = idRol;
    }

    public void establecerIdSalon(int idSalon) {
        this.idSalon = idSalon;
    }

    public void mostrarSexo(JComboBox cmb_sexo) {
        conexion objetoConexion = new conexion();
        String sql = "SELECT * FROM sexo";
        Statement st;
        try {
            st = objetoConexion.conectar().createStatement();
            ResultSet rs = st.executeQuery(sql);
            cmb_sexo.removeAllItems();
            while (rs.next()) {
                String nombreSexo = rs.getString("descripcion_sexo");
                this.establecerIdSexo(rs.getInt("id_sexo"));
                cmb_sexo.addItem(nombreSexo);
                cmb_sexo.putClientProperty(nombreSexo, idSexo);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar sexo: " + e.toString());
        } finally {
            objetoConexion.cerrarConexion();
        }
    }
public void mostrarHorario(JComboBox cmb_horarioasignacion, JTextField dia) {
    conexion objetoConexion = new conexion();
    String sql = "SELECT h.*, ds.nombre AS nombre_dia " +
                 "FROM horario h " +
                 "JOIN dia_semana ds ON h.id_semana = ds.id_dia";
    Statement st;
    try {
        st = objetoConexion.conectar().createStatement();
        ResultSet rs = st.executeQuery(sql);
        cmb_horarioasignacion.removeAllItems();
        while (rs.next()) {
            String nombreHorario = rs.getString("descripcion");
            String nombreDia = rs.getString("nombre_dia");
            this.establecerIdHorario(rs.getInt("id_horario"));
            cmb_horarioasignacion.addItem(nombreHorario);
            cmb_horarioasignacion.putClientProperty(nombreHorario, idHorario);
            
            // Opcional: puedes almacenar el día como propiedad también
            cmb_horarioasignacion.putClientProperty(nombreHorario + "_dia", nombreDia);
        }
        
        // Si quieres mostrar el día cuando se selecciona un horario
        cmb_horarioasignacion.addActionListener(e -> {
            String horarioSeleccionado = (String) cmb_horarioasignacion.getSelectedItem();
            String diaHorario = (String) cmb_horarioasignacion.getClientProperty(horarioSeleccionado + "_dia");
            dia.setText(diaHorario);
        });
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al mostrar horario: " + e.toString());
    } finally {
        objetoConexion.cerrarConexion();
    }
}
   /* public void mostrarHorario(JComboBox cmb_horarioasignacion, JTextField dia) {
        conexion objetoConexion = new conexion();
        String sql = "SELECT * FROM horario";
        Statement st;
        try {
            st = objetoConexion.conectar().createStatement();
            ResultSet rs = st.executeQuery(sql);
            cmb_horarioasignacion.removeAllItems();
            while (rs.next()) {
                String nombreHorario = rs.getString("descripcion");
                this.establecerIdHorario(rs.getInt("id_horario"));
                cmb_horarioasignacion.addItem(nombreHorario);
                cmb_horarioasignacion.putClientProperty(nombreHorario, idHorario);
            }
           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar horario: " + e.toString());
        } finally {
            objetoConexion.cerrarConexion();
        }
    }
*/
    /*public void mostrarHorario(JComboBox cmb_horarioasignacion) {
    conexion objetoConexion = new conexion();
    String sql = "SELECT * FROM horario";  // Asegúrate de que la tabla horario tenga las columnas necesarias
    Statement st;

    try {
        st = objetoConexion.conectar().createStatement();
        ResultSet rs = st.executeQuery(sql);
        cmb_horarioasignacion.removeAllItems();  // Limpiar el JComboBox

        while (rs.next()) {
            String nombreHorario = rs.getString("dia_semana");
            String horaInicio = rs.getString("hora_inicio");
            String horaFin = rs.getString("hora_fin");
            int idHorario = rs.getInt("id_horario");

            // Concatenar los valores para mostrar en el JComboBox
            String displayText = nombreHorario + " (" + horaInicio + " - " + horaFin + ")";
            
            // Asociar el id_horario con el item en el JComboBox usando setClientProperty
            cmb_horarioasignacion.addItem(displayText);
            cmb_horarioasignacion.putClientProperty(displayText, idHorario);  // Guardar el id_horario para el item
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al mostrar horario: " + e.toString());
    } finally {
        objetoConexion.cerrarConexion();
    }
}*/

    public void mostrarAsignatura(JComboBox cmb_asignaturaasignacion) {
        conexion objetoConexion = new conexion();
        String sql = "SELECT * FROM asignatura";
        Statement st;
        try {
            st = objetoConexion.conectar().createStatement();
            ResultSet rs = st.executeQuery(sql);
            cmb_asignaturaasignacion.removeAllItems();
            while (rs.next()) {
                String nombreAsignatura = rs.getString("descripcion");
                this.establecerIdAsignatura(rs.getInt("id_asignatura"));
                cmb_asignaturaasignacion.addItem(nombreAsignatura);
                cmb_asignaturaasignacion.putClientProperty(nombreAsignatura, idAsignatura);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar asignatura: " + e.toString());
        } finally {
            objetoConexion.cerrarConexion();
        }
    }

    public void mostrarDocente(JComboBox cmb_asignaciondocente) {
        conexion objetoConexion = new conexion();
        String sql = "SELECT * FROM docente";
        Statement st;
        try {
            st = objetoConexion.conectar().createStatement();
            ResultSet rs = st.executeQuery(sql);
            cmb_asignaciondocente.removeAllItems();
            while (rs.next()) {
                String nombreDocente = rs.getString("nombre");
                this.establecerIdDocente(rs.getInt("id_docente"));
                cmb_asignaciondocente.addItem(nombreDocente);
                cmb_asignaciondocente.putClientProperty(nombreDocente, idDocente);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar docente: " + e.toString());
        } finally {
            objetoConexion.cerrarConexion();
        }
    }

    public void mostrarMunicipio(JComboBox cmb_municipio) {
        conexion objetoConexion = new conexion();
        String sql = "SELECT * FROM municipio";
        Statement st;
        try {
            st = objetoConexion.conectar().createStatement();
            ResultSet rs = st.executeQuery(sql);
            cmb_municipio.removeAllItems();
            while (rs.next()) {
                String nombreMunicipio = rs.getString("descripcion_municipio");
                this.establecerIdMunicipio(rs.getInt("id_municipio"));
                cmb_municipio.addItem(nombreMunicipio); // Almacena el objeto Opcion
                cmb_municipio.putClientProperty(nombreMunicipio, idMunicipio);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar municipio: " + e.toString());
        } finally {
            objetoConexion.cerrarConexion();
        }
    }

    public void mostrarProfesion(JComboBox cmb_profesion) {
        conexion objetoConexion = new conexion();
        String sql = "SELECT * FROM profesion";
        Statement st;
        try {
            st = objetoConexion.conectar().createStatement();
            ResultSet rs = st.executeQuery(sql);
            cmb_profesion.removeAllItems();
            while (rs.next()) {

                String nombreProfesion = rs.getString("descripcion_profesion");
                this.establecerIdProfesion(rs.getInt("id_profesion"));
                cmb_profesion.addItem(nombreProfesion); // Almacena el objeto Opcion
                cmb_profesion.putClientProperty(nombreProfesion, idProfesion);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar profesion: " + e.toString());
        } finally {
            objetoConexion.cerrarConexion();
        }
    }

    public void mostrarRol(JComboBox cmb_rol) {
        conexion objetoConexion = new conexion();
        String sql = "SELECT * FROM rol";
        Statement st;
        try {
            st = objetoConexion.conectar().createStatement();
            ResultSet rs = st.executeQuery(sql);
            cmb_rol.removeAllItems();
            while (rs.next()) {

                String nombreRol = rs.getString("descripcion_rol");
                this.establecerIdRol(rs.getInt("id_rol"));
                cmb_rol.addItem(nombreRol); // Almacena el objeto Opcion
                cmb_rol.putClientProperty(nombreRol, idRol);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar rol: " + e.toString());
        } finally {
            objetoConexion.cerrarConexion();
        }
    }

    public void mostrarSalon(JComboBox cmb_salonhor) {
        conexion objetoConexion = new conexion();
        String sql = "SELECT * FROM salon";
        Statement st;
        try {
            st = objetoConexion.conectar().createStatement();
            ResultSet rs = st.executeQuery(sql);
            cmb_salonhor.removeAllItems();
            while (rs.next()) {

                String nombreProfesion = rs.getString("descripcion_salon");
                this.establecerIdProfesion(rs.getInt("id_salon"));
                cmb_salonhor.addItem(nombreProfesion); // Almacena el objeto Opcion
                cmb_salonhor.putClientProperty(nombreProfesion, idSalon);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar salón: " + e.toString());
        } finally {
            objetoConexion.cerrarConexion();
        }
    }

    public void fnt_guardarDocente(JTextField txt_docdoc, JTextField txt_nomdoc, JTextField txt_apellidoc,
            JDateChooser fnacimiento, JComboBox cmb_sexo, JComboBox cmb_profesion,
            JComboBox cmb_municipiodoc, JTextField txt_telefono) {

        conexion objetoConexion = new conexion();
        String consulta_guardar = "INSERT INTO docente (id_docente, nombre, apellido, fecha_nac, id_sexo, id_municipio, telefono, id_profesion) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = null;

        try {
            ps = objetoConexion.conectar().prepareStatement(consulta_guardar);

            ps.setInt(1, Integer.parseInt(txt_docdoc.getText()));
            ps.setString(2, txt_nomdoc.getText());
            ps.setString(3, txt_apellidoc.getText());

            Date fechaSeleccionada = fnacimiento.getDate();
            if (fechaSeleccionada != null) {
                java.sql.Date fechasql = new java.sql.Date(fechaSeleccionada.getTime());
                ps.setDate(4, fechasql);
            } else {
                ps.setNull(4, java.sql.Types.DATE); // Manejo del caso nulo
            }

            String selectedItem = cmb_sexo.getSelectedItem().toString();
            int opcSexo = 0;
            switch (selectedItem) {
                case "Masculino" ->
                    opcSexo = 11;
                case "Femenino" ->
                    opcSexo = 21;
            }
            ps.setInt(5, (opcSexo));

            String selectedItemMunicipio = cmb_municipiodoc.getSelectedItem().toString();
            int opcMunicipio = 0;
            switch (selectedItemMunicipio) {
                case "Carepa" ->
                    opcMunicipio = 1;
                case "Apartado" ->
                    opcMunicipio = 2;
                case "Chigorodo" ->
                    opcMunicipio = 3;
                case "Medellin" ->
                    opcMunicipio = 4;
                case "Bogota" ->
                    opcMunicipio = 5;
                case "Necocli" ->
                    opcMunicipio = 6;
                case "Monteria" ->
                    opcMunicipio = 7;
            }
            ps.setInt(6, (opcMunicipio));//municipio

            ps.setString(7, txt_telefono.getText());

            String selectedItemProfesion = cmb_profesion.getSelectedItem().toString();
            int opcProfesion = 0;
            switch (selectedItemProfesion) {
                case "Ingeniero" ->
                    opcProfesion = 101;
                case "Abogado" ->
                    opcProfesion = 102;
                case "Arquitecto" ->
                    opcProfesion = 103;
                case "Licenciado" ->
                    opcProfesion = 104;
                case "Contador" ->
                    opcProfesion = 105;
                case "Administrador" ->
                    opcProfesion = 106;
                case "Master" ->
                    opcProfesion = 107;
                case "Enfermero" ->
                    opcProfesion = 108;
                case "Desarrollador" ->
                    opcProfesion = 109;
            }
            ps.setInt(8, (opcProfesion));//profesion

            ps.executeUpdate(); // Cambiar a executeUpdate para operaciones DML
            JOptionPane.showMessageDialog(null, "Se guardó el docente correctamente");

        } catch (SQLException e) {
            JOptionPane.showInternalMessageDialog(null, "Error al guardar: " + e.getMessage());

        } finally {
            try {
                if (ps != null) {
                    ps.close(); // Cerrar el PreparedStatement
                }
                objetoConexion.cerrarConexion(); // Cerrar la conexión
            } catch (SQLException e) {
            }
        }
    }

    public void fnt_buscarDocente(JTextField txt_docdoc, JTextField txt_nomdoc, JTextField txt_apellidoc,
            JDateChooser fnacimiento, JComboBox cmb_sexo, JComboBox cmb_profesion,
            JComboBox cmb_municipiodoc, JTextField txt_telefono) {

        conexion objetoConexion = new conexion();
        String consulta_buscar = "SELECT nombre, apellido, fecha_nac, id_sexo, id_municipio, telefono, id_profesion FROM docente WHERE id_docente = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = objetoConexion.conectar().prepareStatement(consulta_buscar);
            ps.setInt(1, Integer.parseInt(txt_docdoc.getText()));
            rs = ps.executeQuery();
            if (rs.next()) {
                // Asignar los valores a los campos
                txt_nomdoc.setText(rs.getString("nombre"));
                txt_apellidoc.setText(rs.getString("apellido"));
                Date fechaNac = rs.getDate("fecha_nac");
                if (fechaNac != null) {
                    fnacimiento.setDate(fechaNac);
                }
                // Manejo de sexo
                int idSexo = rs.getInt("id_sexo");
                cmb_sexo.setSelectedItem(idSexo == 11 ? "Masculino" : "Femenino");
                // Manejo de municipio
                int idMunicipio = rs.getInt("id_municipio");
                switch (idMunicipio) {
                    case 1 ->
                        cmb_municipiodoc.setSelectedItem("Carepa");
                    case 2 ->
                        cmb_municipiodoc.setSelectedItem("Apartado");
                    case 3 ->
                        cmb_municipiodoc.setSelectedItem("Chigorodo");
                    case 4 ->
                        cmb_municipiodoc.setSelectedItem("Medellin");
                    case 5 ->
                        cmb_municipiodoc.setSelectedItem("Bogota");
                    case 6 ->
                        cmb_municipiodoc.setSelectedItem("Necocli");
                    case 7 ->
                        cmb_municipiodoc.setSelectedItem("Monteria");
                    default ->
                        cmb_municipiodoc.setSelectedItem("Seleccione");
                }
                txt_telefono.setText(rs.getString("telefono"));
                // Manejo de profesion
                int idProfesion = rs.getInt("id_profesion");
                switch (idProfesion) {
                    case 101 ->
                        cmb_profesion.setSelectedItem("Ingeniero");
                    case 102 ->
                        cmb_profesion.setSelectedItem("Abogado");
                    case 103 ->
                        cmb_profesion.setSelectedItem("Arquitecto");
                    case 104 ->
                        cmb_profesion.setSelectedItem("Licenciado");
                    case 105 ->
                        cmb_profesion.setSelectedItem("Contador");
                    case 106 ->
                        cmb_profesion.setSelectedItem("Administrador");
                    case 107 ->
                        cmb_profesion.setSelectedItem("Master");
                    case 108 ->
                        cmb_profesion.setSelectedItem("Enfermero");
                    case 109 ->
                        cmb_profesion.setSelectedItem("Desarrollador");
                    default ->
                        cmb_profesion.setSelectedItem("Seleccione");
                }

                JOptionPane.showMessageDialog(null, "Docente encontrado.");
            } else {
                JOptionPane.showMessageDialog(null, "Docente no encontrado.");
            }

        } catch (SQLException e) {
            JOptionPane.showInternalMessageDialog(null, "Error al buscar: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close(); // Cerrar el PreparedStatement
                }
                objetoConexion.cerrarConexion(); // Cerrar la conexión
            } catch (SQLException e) {
            }
        }
    }

    public void fnt_actualizarDocente(JTextField txt_docdoc, JTextField txt_nomdoc, JTextField txt_apellidoc,
            JDateChooser fnacimiento, JComboBox cmb_sexo, JComboBox cmb_profesion,
            JComboBox cmb_municipiodoc, JTextField txt_telefono) {

        conexion objetoConexion = new conexion();
        String consulta_actualizar = "UPDATE docente SET nombre = ?, apellido = ?, fecha_nac = ?, id_sexo = ?, id_municipio = ?, telefono = ?, id_profesion = ? WHERE id_docente = ?";
        PreparedStatement ps = null;

        try {
            ps = objetoConexion.conectar().prepareStatement(consulta_actualizar);

            // Asignar los nuevos valores
            ps.setString(1, txt_nomdoc.getText());
            ps.setString(2, txt_apellidoc.getText());

            Date fechaSeleccionada = fnacimiento.getDate();
            if (fechaSeleccionada != null) {
                java.sql.Date fechasql = new java.sql.Date(fechaSeleccionada.getTime());
                ps.setDate(3, fechasql);
            } else {
                ps.setNull(3, java.sql.Types.DATE); // Manejo del caso nulo
            }

            String selectedItem = cmb_sexo.getSelectedItem().toString();
            int opcSexo = (selectedItem.equals("Masculino")) ? 11 : 21;
            ps.setInt(4, opcSexo);

            String selectedItemMunicipio = cmb_municipiodoc.getSelectedItem().toString();
            int opcMunicipio = 0;
            opcMunicipio = switch (selectedItemMunicipio) {
                case "Carepa" ->
                    1;
                case "Apartado" ->
                    2;
                case "Chigorodo" ->
                    3;
                case "Medellin" ->
                    4;
                case "Bogota" ->
                    5;
                case "Necocli" ->
                    6;
                case "Monteria" ->
                    7;
                default ->
                    0;
            }; // Opcional: Manejo de un valor por defecto
            ps.setInt(5, opcMunicipio);

            ps.setString(6, txt_telefono.getText());

            String selectedItemProfesion = cmb_profesion.getSelectedItem().toString();
            int opcProfesion = 0;
            opcProfesion = switch (selectedItemProfesion) {
                case "Ingeniero" ->
                    101;
                case "Abogado" ->
                    102;
                case "Arquitecto" ->
                    103;
                case "Licenciado" ->
                    104;
                case "Contador" ->
                    105;
                case "Administrador" ->
                    106;
                case "Master" ->
                    107;
                case "Enfermero" ->
                    108;
                case "Desarrollador" ->
                    109;
                default ->
                    0;
            }; // Opcional: Manejo de un valor por defecto
            ps.setInt(7, opcProfesion);

            // Establecer el ID del docente que se va a actualizar
            ps.setInt(8, Integer.parseInt(txt_docdoc.getText()));

            int filasActualizadas = ps.executeUpdate();
            if (filasActualizadas > 0) {
                JOptionPane.showMessageDialog(null, "Datos del docente actualizados correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron cambios en el docente.");
            }

        } catch (SQLException e) {
            JOptionPane.showInternalMessageDialog(null, "Error al actualizar: " + e.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close(); // Cerrar el PreparedStatement
                }
                objetoConexion.cerrarConexion(); // Cerrar la conexión
            } catch (SQLException e) {
            }
        }
    }

    public void fnt_eliminarDocente(JTextField txt_docdoc) {
        conexion objetoConexion = new conexion();
        String consulta_eliminar = "DELETE FROM docente WHERE id_docente = ?";
        PreparedStatement ps = null;

        try {
            ps = objetoConexion.conectar().prepareStatement(consulta_eliminar);
            ps.setInt(1, Integer.parseInt(txt_docdoc.getText()));

            int filasEliminadas = ps.executeUpdate();
            if (filasEliminadas > 0) {
                JOptionPane.showMessageDialog(null, "Docente eliminado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún docente con ese documento.");
            }

        } catch (SQLException e) {
            JOptionPane.showInternalMessageDialog(null, "Error al eliminar: " + e.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close(); // Cerrar el PreparedStatement
                }
                objetoConexion.cerrarConexion(); // Cerrar la conexión
            } catch (SQLException e) {
            }
        }
    }

    public void fnt_guardarHorarioAsignatura(JComboBox<String> cmb_idHorario, JComboBox<String> cmb_idAsignatura, JComboBox<String> cmb_idDocente) {
        conexion objetoConexion = new conexion();
        String consulta_guardar = "INSERT INTO horario_asignatura (id_horario, id_asignatura, id_docente) VALUES (?, ?, ?)";
        PreparedStatement ps = null;

        try {
            ps = objetoConexion.conectar().prepareStatement(consulta_guardar);

            // Obtener los valores seleccionados de los ComboBox y sus respectivos IDs
            String selectedItemHorario = cmb_idHorario.getSelectedItem().toString();
            int idHorario = obtenerIdDesdeComboBox(cmb_idHorario, selectedItemHorario);

            String selectedItemAsignatura = cmb_idAsignatura.getSelectedItem().toString();
            int idAsignatura = obtenerIdDesdeComboBox(cmb_idAsignatura, selectedItemAsignatura);

            String selectedItemDocente = cmb_idDocente.getSelectedItem().toString();
            int idDocente = obtenerIdDesdeComboBox(cmb_idDocente, selectedItemDocente);

            ps.setInt(1, idHorario);
            ps.setInt(2, idAsignatura);
            ps.setInt(3, idDocente);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se guardó la asignación de horario correctamente");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar: " + e.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                objetoConexion.cerrarConexion();
            } catch (SQLException e) {
                // Manejo de la excepción
            }
        }
    }

    private int obtenerIdDesdeComboBox(JComboBox<String> comboBox, String selectedItem) {
        return (int) comboBox.getClientProperty(selectedItem);
    }
    
    public void fnt_iniciarSesion(JTextField txt_userlogin, JPasswordField txt_passlogin, JFrame loginFrame) {
    Connection conectar = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    // Validación de campos vacíos
    if (!validarCampos(txt_userlogin, txt_passlogin)) {
        return;
    }

    String var_userStr = txt_userlogin.getText();
    String var_passStr = new String(txt_passlogin.getPassword());

    try {
        // Establecer conexión
        conectar = new modelo.conexion().conectar();

        // Convertir la contraseña ingresada a MD5 antes de la comparación
        String var_passMD5 = Utilidades.convertirAMD5(var_passStr);  // Método para convertir a MD5

        // Consulta SQL
        String sql = "SELECT usuario.id_usuario, usuario.contrasenia, usuario.id_rol "
                    + "FROM usuario "
                    + "WHERE usuario.id_usuario = ? AND usuario.contrasenia = ?";

        pst = conectar.prepareStatement(sql);
        pst.setString(1, var_userStr);
        pst.setString(2, var_passMD5);  // Compara la contraseña en formato MD5

        rs = pst.executeQuery();

        if (rs.next()) {
            // Guardar el id_usuario en la clase Sesion
            String idUsuario = rs.getString("id_usuario");
            Session.setIdUsuario(idUsuario);

            String var_rolStr = rs.getString("id_rol");
            redirigirSegunRol(var_rolStr, loginFrame);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Usuario o contraseña incorrectos",
                    "Error de Autenticación",
                    JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null,
                "Error de conexión a la base de datos: " + e.getMessage(),
                "Error de Conexión",
                JOptionPane.ERROR_MESSAGE);
    } finally {
        cerrarRecursos(rs, pst, conectar);
    }
}

    /*public void fnt_iniciarSesion(JTextField txt_userlogin, JPasswordField txt_passlogin, JFrame loginFrame) {
    Connection conectar = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    // Validación de campos vacíos
    if (!validarCampos(txt_userlogin, txt_passlogin)) {
        return;
    }

    String var_userStr = txt_userlogin.getText();
    String var_passStr = new String(txt_passlogin.getPassword());

    try {
        // Establecer conexión
        conectar = new modelo.conexion().conectar();

        // Convertir la contraseña ingresada a MD5 antes de la comparación
        String var_passMD5 = Utilidades.convertirAMD5(var_passStr);  // Método para convertir a MD5

        // Consulta SQL (corregida con espacio después de Rol)
        String sql = "SELECT usuario.id_usuario, usuario.contrasenia, usuario.id_rol "
                    + "FROM usuario "
                    + "WHERE usuario.id_usuario = ? AND usuario.contrasenia = ?";

        pst = conectar.prepareStatement(sql);
        pst.setString(1, var_userStr);
        pst.setString(2, var_passMD5);  // Compara la contraseña en formato MD5

        rs = pst.executeQuery();

        if (rs.next()) {
            String var_rolStr = rs.getString("id_rol");
            redirigirSegunRol(var_rolStr, loginFrame);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Usuario o contraseña incorrectos",
                    "Error de Autenticación",
                    JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null,
                "Error de conexión a la base de datos: " + e.getMessage(),
                "Error de Conexión",
                JOptionPane.ERROR_MESSAGE);
    } finally {
        cerrarRecursos(rs, pst, conectar);
    }
}*/

    
    public void fnt_guardarUsuario(JTextField txt_docuser, JTextField txt_nomuser, JTextField txt_apellidouser,
            JDateChooser fnacimientouser, JComboBox cmb_sexouser, JComboBox cmb_roluser,
            JComboBox cmb_municipiouser, JTextField txt_telefonouser, JTextField txt_passuser) {

    conexion objetoConexion = new conexion();
    String consulta_guardar = "INSERT INTO usuario (id_usuario, nombre, apellido, fecha_nac, id_sexo, id_municipio, telefono, id_rol, contrasenia) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    PreparedStatement ps = null;

    try {
        ps = objetoConexion.conectar().prepareStatement(consulta_guardar);

        // Asignar los parámetros
        ps.setInt(1, Integer.parseInt(txt_docuser.getText()));
        ps.setString(2, txt_nomuser.getText());
        ps.setString(3, txt_apellidouser.getText());

        Date fechaSeleccionada = fnacimientouser.getDate();
        if (fechaSeleccionada != null) {
            java.sql.Date fechasql = new java.sql.Date(fechaSeleccionada.getTime());
            ps.setDate(4, fechasql);
        } else {
            ps.setNull(4, java.sql.Types.DATE); // Manejo del caso nulo
        }

        // Obtener y asignar el sexo
        String selectedItem = cmb_sexouser.getSelectedItem().toString();
        int opcSexo = 0;
        switch (selectedItem) {
            case "Masculino" -> opcSexo = 11;
            case "Femenino" -> opcSexo = 21;
        }
        ps.setInt(5, opcSexo);

        // Obtener y asignar el municipio
        String selectedItemMunicipio = cmb_municipiouser.getSelectedItem().toString();
        int opcMunicipio = 0;
        switch (selectedItemMunicipio) {
            case "Carepa" -> opcMunicipio = 1;
            case "Apartado" -> opcMunicipio = 2;
            case "Chigorodo" -> opcMunicipio = 3;
            case "Medellin" -> opcMunicipio = 4;
            case "Bogota" -> opcMunicipio = 5;
            case "Necocli" -> opcMunicipio = 6;
            case "Monteria" -> opcMunicipio = 7;
        }
        ps.setInt(6, opcMunicipio); // Municipio

        // Asignar teléfono
        ps.setString(7, txt_telefonouser.getText());

        // Obtener y asignar el rol
        String selectedItemRol = cmb_roluser.getSelectedItem().toString();
        int opcRol = 0;
        switch (selectedItemRol) {
            case "Vigilante" -> opcRol = 1;
            case "Administrador" -> opcRol = 2;
        }
        ps.setInt(8, opcRol); // Rol

        // **Conversión de la contraseña a MD5**
        String contraseña = txt_passuser.getText();
        String contraseñaMD5 = Utilidades.convertirAMD5(contraseña);  // Convertir a MD5 antes de guardar
        ps.setString(9, contraseñaMD5);  // Insertar la contraseña en formato MD5

        // Ejecutar la consulta
        ps.executeUpdate(); // Cambiar a executeUpdate para operaciones DML
        JOptionPane.showMessageDialog(null, "Se guardó el usuario correctamente");

    } catch (SQLException e) {
        JOptionPane.showInternalMessageDialog(null, "Error al guardar: " + e.getMessage());

    } finally {
        try {
            if (ps != null) {
                ps.close(); // Cerrar el PreparedStatement
            }
            objetoConexion.cerrarConexion(); // Cerrar la conexión
        } catch (SQLException e) {
            // Manejo de excepciones al cerrar
        }
    }
}


   /* public void fnt_guardarUsuario(JTextField txt_docuser, JTextField txt_nomuser, JTextField txt_apellidouser,
            JDateChooser fnacimientouser, JComboBox cmb_sexouser, JComboBox cmb_roluser,
            JComboBox cmb_municipiouser, JTextField txt_telefonouser, JTextField txt_passuser) {

        conexion objetoConexion = new conexion();
        String consulta_guardar = "INSERT INTO usuario (id_usuario, nombre, apellido, fecha_nac, id_sexo, id_municipio, telefono, id_rol, contrasenia) VALUES (?, ?, ?, ?, ?, ?, ?, ?,?)";
        PreparedStatement ps = null;

        try {
            ps = objetoConexion.conectar().prepareStatement(consulta_guardar);

            ps.setInt(1, Integer.parseInt(txt_docuser.getText()));
            ps.setString(2, txt_nomuser.getText());
            ps.setString(3, txt_apellidouser.getText());

            Date fechaSeleccionada = fnacimientouser.getDate();
            if (fechaSeleccionada != null) {
                java.sql.Date fechasql = new java.sql.Date(fechaSeleccionada.getTime());
                ps.setDate(4, fechasql);
            } else {
                ps.setNull(4, java.sql.Types.DATE); // Manejo del caso nulo
            }

            String selectedItem = cmb_sexouser.getSelectedItem().toString();
            int opcSexo = 0;
            switch (selectedItem) {
                case "Masculino" ->
                    opcSexo = 11;
                case "Femenino" ->
                    opcSexo = 21;
            }
            ps.setInt(5, (opcSexo));

            String selectedItemMunicipio = cmb_municipiouser.getSelectedItem().toString();
            int opcMunicipio = 0;
            switch (selectedItemMunicipio) {
                case "Carepa" ->
                    opcMunicipio = 1;
                case "Apartado" ->
                    opcMunicipio = 2;
                case "Chigorodo" ->
                    opcMunicipio = 3;
                case "Medellin" ->
                    opcMunicipio = 4;
                case "Bogota" ->
                    opcMunicipio = 5;
                case "Necocli" ->
                    opcMunicipio = 6;
                case "Monteria" ->
                    opcMunicipio = 7;
            }
            ps.setInt(6, (opcMunicipio));//municipio

            ps.setString(7, txt_telefonouser.getText());

            String selectedItemRol = cmb_roluser.getSelectedItem().toString();
            int opcRol = 0;
            switch (selectedItemRol) {
                case "Vigilante" ->
                    opcRol = 1;
                case "Administrador" ->
                    opcRol = 2;
            }
            ps.setInt(8, (opcRol));//profesion
            ps.setString(9, txt_passuser.getText());

            ps.executeUpdate(); // Cambiar a executeUpdate para operaciones DML
            JOptionPane.showMessageDialog(null, "Se guardó el usuario correctamente");

        } catch (SQLException e) {
            JOptionPane.showInternalMessageDialog(null, "Error al guardar: " + e.getMessage());

        } finally {
            try {
                if (ps != null) {
                    ps.close(); // Cerrar el PreparedStatement
                }
                objetoConexion.cerrarConexion(); // Cerrar la conexión
            } catch (SQLException e) {
            }
        }
    }*/

    public void fnt_buscarUsuario(JTextField txt_docuser, JTextField txt_nomuser, JTextField txt_apellidouser,
            JDateChooser fnacimientouser, JComboBox cmb_sexouser, JComboBox cmb_roluser,
            JComboBox cmb_municipiouser, JTextField txt_telefonouser, JTextField txt_passuser) {

        conexion objetoConexion = new conexion();

        String consulta_buscar = "SELECT nombre, apellido, fecha_nac, id_sexo, id_municipio, telefono, id_rol, contrasenia FROM usuario WHERE id_usuario = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = objetoConexion.conectar().prepareStatement(consulta_buscar);
            ps.setInt(1, Integer.parseInt(txt_docuser.getText()));
            rs = ps.executeQuery();
            if (rs.next()) {
                // Asignar los valores a los campos
                txt_nomuser.setText(rs.getString("nombre"));
                txt_apellidouser.setText(rs.getString("apellido"));
                Date fechaNac = rs.getDate("fecha_nac");
                if (fechaNac != null) {
                    fnacimientouser.setDate(fechaNac);
                }
                // Manejo de sexo
                int idSexo = rs.getInt("id_sexo");
                cmb_sexouser.setSelectedItem(idSexo == 11 ? "Masculino" : "Femenino");
                // Manejo de municipio
                int idMunicipio = rs.getInt("id_municipio");
                switch (idMunicipio) {
                    case 1 ->
                        cmb_municipiouser.setSelectedItem("Carepa");
                    case 2 ->
                        cmb_municipiouser.setSelectedItem("Apartado");
                    case 3 ->
                        cmb_municipiouser.setSelectedItem("Chigorodo");
                    case 4 ->
                        cmb_municipiouser.setSelectedItem("Medellin");
                    case 5 ->
                        cmb_municipiouser.setSelectedItem("Bogota");
                    case 6 ->
                        cmb_municipiouser.setSelectedItem("Necocli");
                    case 7 ->
                        cmb_municipiouser.setSelectedItem("Monteria");
                    default ->
                        cmb_municipiouser.setSelectedItem("Seleccione");
                }
                txt_telefonouser.setText(rs.getString("telefono"));
                // Manejo de profesion
                int idRol = rs.getInt("id_rol");
                switch (idRol) {
                    case 1 ->
                        cmb_roluser.setSelectedItem("Vigilante");
                    case 2 ->
                        cmb_roluser.setSelectedItem("Administrador");
                    default ->
                        cmb_roluser.setSelectedItem("Seleccione");
                }
                txt_passuser.setText(rs.getString("contrasenia"));

                JOptionPane.showMessageDialog(null, "Usuario encontrado.");
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
            }

        } catch (SQLException e) {
            JOptionPane.showInternalMessageDialog(null, "Error al buscar: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close(); // Cerrar el PreparedStatement
                }
                objetoConexion.cerrarConexion(); // Cerrar la conexión
            } catch (SQLException e) {
            }
        }
    }

    public void fnt_actualizarUsuario(JTextField txt_docuser, JTextField txt_nomuser, JTextField txt_apellidouser,
            JDateChooser fnacimientouser, JComboBox cmb_sexouser, JComboBox cmb_roluser,
            JComboBox cmb_municipiouser, JTextField txt_telefonouser, JTextField txt_passuser) {

    conexion objetoConexion = new conexion();
    String consulta_actualizar = "UPDATE usuario SET nombre = ?, apellido = ?, fecha_nac = ?, id_sexo = ?, id_municipio = ?, telefono = ?, id_rol = ?, contrasenia = ? WHERE id_usuario = ?";
    PreparedStatement ps = null;

    try {
        ps = objetoConexion.conectar().prepareStatement(consulta_actualizar);

        // Asignar los nuevos valores
        ps.setString(1, txt_nomuser.getText());
        ps.setString(2, txt_apellidouser.getText());

        Date fechaSeleccionada = fnacimientouser.getDate();
        if (fechaSeleccionada != null) {
            java.sql.Date fechasql = new java.sql.Date(fechaSeleccionada.getTime());
            ps.setDate(3, fechasql);
        } else {
            ps.setNull(3, java.sql.Types.DATE); // Manejo del caso nulo
        }

        String selectedItem = cmb_sexouser.getSelectedItem().toString();
        int opcSexo = (selectedItem.equals("Masculino")) ? 11 : 21;
        ps.setInt(4, opcSexo);

        String selectedItemMunicipio = cmb_municipiouser.getSelectedItem().toString();
        int opcMunicipio = 0;
        opcMunicipio = switch (selectedItemMunicipio) {
            case "Carepa" -> 1;
            case "Apartado" -> 2;
            case "Chigorodo" -> 3;
            case "Medellin" -> 4;
            case "Bogota" -> 5;
            case "Necocli" -> 6;
            case "Monteria" -> 7;
            default -> 0;
        };
        ps.setInt(5, opcMunicipio);

        ps.setString(6, txt_telefonouser.getText());

        String selectedItemRol = cmb_roluser.getSelectedItem().toString();
        int opcRol = 0;
        opcRol = switch (selectedItemRol) {
            case "Vigilante" -> 1;
            case "Administrador" -> 2;
            default -> 0;
        };
        ps.setInt(7, opcRol);

        // Convertir la nueva contraseña a MD5 antes de actualizar
        String contraseña = txt_passuser.getText();
        String contraseñaMD5 = Utilidades.convertirAMD5(contraseña);  // Convertir la contraseña a MD5
        ps.setString(8, contraseñaMD5);

        // Establecer el ID del usuario que se va a actualizar
        ps.setInt(9, Integer.parseInt(txt_docuser.getText()));

        // Ejecutar la actualización
        int filasActualizadas = ps.executeUpdate();
        if (filasActualizadas > 0) {
            JOptionPane.showMessageDialog(null, "Datos del usuario actualizados correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron cambios en el usuario.");
        }

    } catch (SQLException e) {
        JOptionPane.showInternalMessageDialog(null, "Error al actualizar: " + e.getMessage());
    } finally {
        try {
            if (ps != null) {
                ps.close(); // Cerrar el PreparedStatement
            }
            objetoConexion.cerrarConexion(); // Cerrar la conexión
        } catch (SQLException e) {
            // Manejo de excepción al cerrar la conexión
        }
    }
}

   /* public void fnt_actualizarUsuario(JTextField txt_docuser, JTextField txt_nomuser, JTextField txt_apellidouser,
            JDateChooser fnacimientouser, JComboBox cmb_sexouser, JComboBox cmb_roluser,
            JComboBox cmb_municipiouser, JTextField txt_telefonouser, JTextField txt_passuser) {

        conexion objetoConexion = new conexion();
        String consulta_actualizar = "UPDATE usuario SET nombre = ?, apellido = ?, fecha_nac = ?, id_sexo = ?, id_municipio = ?, telefono = ?, id_rol = ?, contrasenia = ? WHERE id_usuario = ?";
        PreparedStatement ps = null;

        try {
            ps = objetoConexion.conectar().prepareStatement(consulta_actualizar);

            // Asignar los nuevos valores
            ps.setString(1, txt_nomuser.getText());
            ps.setString(2, txt_apellidouser.getText());

            Date fechaSeleccionada = fnacimientouser.getDate();
            if (fechaSeleccionada != null) {
                java.sql.Date fechasql = new java.sql.Date(fechaSeleccionada.getTime());
                ps.setDate(3, fechasql);
            } else {
                ps.setNull(3, java.sql.Types.DATE); // Manejo del caso nulo
            }

            String selectedItem = cmb_sexouser.getSelectedItem().toString();
            int opcSexo = (selectedItem.equals("Masculino")) ? 11 : 21;
            ps.setInt(4, opcSexo);

            String selectedItemMunicipio = cmb_municipiouser.getSelectedItem().toString();
            int opcMunicipio = 0;
            opcMunicipio = switch (selectedItemMunicipio) {
                case "Carepa" ->
                    1;
                case "Apartado" ->
                    2;
                case "Chigorodo" ->
                    3;
                case "Medellin" ->
                    4;
                case "Bogota" ->
                    5;
                case "Necocli" ->
                    6;
                case "Monteria" ->
                    7;
                default ->
                    0;
            }; // Opcional: Manejo de un valor por defecto
            ps.setInt(5, opcMunicipio);

            ps.setString(6, txt_telefonouser.getText());

            String selectedItemRol = cmb_roluser.getSelectedItem().toString();
            int opcRol = 0;
            opcRol = switch (selectedItemRol) {
                case "Vigilante" ->
                    1;
                case "Administrador" ->
                    2;
                default ->
                    0;
            }; // Opcional: Manejo de un valor por defecto
            ps.setInt(7, opcRol);
            ps.setString(8, txt_passuser.getText());
            // Establecer el ID del usuario que se va a actualizar
            ps.setInt(9, Integer.parseInt(txt_docuser.getText()));

            int filasActualizadas = ps.executeUpdate();
            if (filasActualizadas > 0) {
                JOptionPane.showMessageDialog(null, "Datos del usuario actualizados correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron cambios en el usuario");
            }

        } catch (SQLException e) {
            JOptionPane.showInternalMessageDialog(null, "Error al actualizar: " + e.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close(); // Cerrar el PreparedStatement
                }
                objetoConexion.cerrarConexion(); // Cerrar la conexión
            } catch (SQLException e) {
            }
        }
    }*/

    public void fnt_eliminarUsuario(JTextField txt_docuser) {
        conexion objetoConexion = new conexion();
        String consulta_eliminar = "DELETE FROM usuario WHERE id_usuario = ?";
        PreparedStatement ps = null;
        try {
            ps = objetoConexion.conectar().prepareStatement(consulta_eliminar);
            ps.setInt(1, Integer.parseInt(txt_docuser.getText()));

            int filasEliminadas = ps.executeUpdate();
            if (filasEliminadas > 0) {
                JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún usuario con este documento.");
            }

        } catch (SQLException e) {
            JOptionPane.showInternalMessageDialog(null, "Error al eliminar: " + e.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close(); // Cerrar el PreparedStatement
                }
                objetoConexion.cerrarConexion(); // Cerrar la conexión
            } catch (SQLException e) {
            }
        }
    }

    public void fnt_guardarAsignatura(JTextField txt_id_asignatura, JTextField txt_descripcionasig, JTextField txt_codigoasignatura) {
        conexion objetoConexion = new conexion();
        String consulta_guardar = "INSERT INTO asignatura (id_asignatura, descripcion, codigo) VALUES (?, ?, ?)";
        PreparedStatement ps = null;
        try {
            ps = objetoConexion.conectar().prepareStatement(consulta_guardar);

            ps.setInt(1, Integer.parseInt(txt_id_asignatura.getText()));
            ps.setString(2, txt_descripcionasig.getText());
            ps.setString(3, txt_codigoasignatura.getText());
            ps.executeUpdate(); // Cambiar a executeUpdate para operaciones DML
            JOptionPane.showMessageDialog(null, "Se guardó la asignatura correctamente");

        } catch (SQLException e) {
            JOptionPane.showInternalMessageDialog(null, "Error al guardar: " + e.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close(); // Cerrar el PreparedStatement
                }
                objetoConexion.cerrarConexion(); // Cerrar la conexión
            } catch (SQLException e) {
            }
        }
    }

    public void fnt_buscarAsignatura(JTextField txt_id_asignatura, JTextField txt_descripcionasig, JTextField txt_codigoasignatura) {
        conexion objetoConexion = new conexion();

        String consulta_buscar = "SELECT descripcion, codigo FROM asignatura WHERE id_asignatura = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = objetoConexion.conectar().prepareStatement(consulta_buscar);
            ps.setInt(1, Integer.parseInt(txt_id_asignatura.getText()));
            rs = ps.executeQuery();
            if (rs.next()) {
                // Asignar los valores a los campos
                txt_descripcionasig.setText(rs.getString("descripcion"));
                txt_codigoasignatura.setText(rs.getString("codigo"));
                JOptionPane.showMessageDialog(null, "Asignatura encontrada");
            } else {
                JOptionPane.showMessageDialog(null, "Asignatura no encontrada");
            }
        } catch (SQLException e) {
            JOptionPane.showInternalMessageDialog(null, "Error al buscar: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close(); // Cerrar el PreparedStatement
                }
                objetoConexion.cerrarConexion(); // Cerrar la conexión
            } catch (SQLException e) {
            }
        }
    }

    public void fnt_actualizarAsignatura(JTextField txt_id_asignatura, JTextField txt_descripcionasig, JTextField txt_codigoasignatura) {
        conexion objetoConexion = new conexion();
        String consulta_buscar = "UPDATE asignatura SET descripcion = ?, codigo = ? WHERE id_asignatura = ?";
        PreparedStatement ps = null;
        try {
            ps = objetoConexion.conectar().prepareStatement(consulta_buscar);

            ps.setString(1, txt_descripcionasig.getText());
            ps.setString(2, txt_codigoasignatura.getText());

            ps.setInt(3, Integer.parseInt(txt_id_asignatura.getText()));

            int filasActualizadas = ps.executeUpdate();
            if (filasActualizadas > 0) {
                JOptionPane.showMessageDialog(null, "Datos de la asignatura actualizados correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron cambios en la asignatura");
            }
        } catch (SQLException e) {
            JOptionPane.showInternalMessageDialog(null, "Error al actualizar: " + e.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close(); // Cerrar el PreparedStatement
                }
                objetoConexion.cerrarConexion(); // Cerrar la conexión
            } catch (SQLException e) {
            }
        }
    }

    public void fnt_eliminarAsignatura(JTextField txt_id_asignatura) {
        conexion objetoConexion = new conexion();
        String consulta_eliminar = "DELETE FROM asignatura WHERE id_asignatura = ?";
        PreparedStatement ps = null;

        try {
            ps = objetoConexion.conectar().prepareStatement(consulta_eliminar);
            ps.setInt(1, Integer.parseInt(txt_id_asignatura.getText()));

            int filasEliminadas = ps.executeUpdate();
            if (filasEliminadas > 0) {
                JOptionPane.showMessageDialog(null, "Asignatura eliminada correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningúna Asignatura con este Id.");
            }
        } catch (SQLException e) {
            JOptionPane.showInternalMessageDialog(null, "Error al eliminar: " + e.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close(); // Cerrar el PreparedStatement
                }
                objetoConexion.cerrarConexion(); // Cerrar la conexión
            } catch (SQLException e) {
            }
        }
    }

    public void fnt_guardarSalon(JTextField txt_id_salon, JTextField txt_descripcionsalon) {
        conexion objetoConexion = new conexion();
        String consulta_guardar = "INSERT INTO salon (id_salon, descripcion_salon) VALUES (?, ?)";
        PreparedStatement ps = null;
        try {
            ps = objetoConexion.conectar().prepareStatement(consulta_guardar);

            ps.setInt(1, Integer.parseInt(txt_id_salon.getText()));
            ps.setString(2, txt_descripcionsalon.getText());
            ps.executeUpdate(); 
            JOptionPane.showMessageDialog(null, "Se guardó el Salón correctamente");

        } catch (SQLException e) {
            JOptionPane.showInternalMessageDialog(null, "Error al guardar: " + e.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close(); // Cerrar el PreparedStatement
                }
                objetoConexion.cerrarConexion(); // Cerrar la conexión
            } catch (SQLException e) {
            }
        }
    }
    
    public void fnt_buscarSalon(JTextField txt_id_salon, JTextField txt_descripcionsalon) {
        conexion objetoConexion = new conexion();

        String consulta_buscar = "SELECT descripcion_salon FROM salon WHERE id_salon = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = objetoConexion.conectar().prepareStatement(consulta_buscar);
            ps.setInt(1, Integer.parseInt(txt_id_salon.getText()));
            rs = ps.executeQuery();
            if (rs.next()) {
                // Asignar los valores a los campos
                txt_descripcionsalon.setText(rs.getString("descripcion_salon"));
                JOptionPane.showMessageDialog(null, "Salón encontrado");
            } else {
                JOptionPane.showMessageDialog(null, "Salón no encontrado");
            }
        } catch (SQLException e) {
            JOptionPane.showInternalMessageDialog(null, "Error al buscar: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close(); // Cerrar el PreparedStatement
                }
                objetoConexion.cerrarConexion(); // Cerrar la conexión
            } catch (SQLException e) {
            }
        }
    }
    
    public void fnt_actualizarSalon(JTextField txt_id_salon, JTextField txt_descripcionsalon) {
        conexion objetoConexion = new conexion();
        String consulta_buscar = "UPDATE salon SET descripcion_salon = ? WHERE id_salon = ?";
        PreparedStatement ps = null;
        try {
            ps = objetoConexion.conectar().prepareStatement(consulta_buscar);

            ps.setString(1, txt_descripcionsalon.getText());

            ps.setInt(2, Integer.parseInt(txt_id_salon.getText()));

            int filasActualizadas = ps.executeUpdate();
            if (filasActualizadas > 0) {
                JOptionPane.showMessageDialog(null, "Datos del Salón actualizados correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron cambios en el Salón");
            }
        } catch (SQLException e) {
            JOptionPane.showInternalMessageDialog(null, "Error al actualizar: " + e.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close(); // Cerrar el PreparedStatement
                }
                objetoConexion.cerrarConexion(); // Cerrar la conexión
            } catch (SQLException e) {
            }
        }
    }
    
    public void fnt_eliminarSalon(JTextField txt_id_salon) {
        conexion objetoConexion = new conexion();
        String consulta_eliminar = "DELETE FROM salon WHERE id_salon = ?";
        PreparedStatement ps = null;

        try {
            ps = objetoConexion.conectar().prepareStatement(consulta_eliminar);
            ps.setInt(1, Integer.parseInt(txt_id_salon.getText()));

            int filasEliminadas = ps.executeUpdate();
            if (filasEliminadas > 0) {
                JOptionPane.showMessageDialog(null, "Salón eliminado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún Salón con este Id.");
            }
        } catch (SQLException e) {
            JOptionPane.showInternalMessageDialog(null, "Error al eliminar: " + e.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close(); // Cerrar el PreparedStatement
                }
                objetoConexion.cerrarConexion(); // Cerrar la conexión
            } catch (SQLException e) {
            }
        }
    }
    
    public void fnt_limpiarCampossalon(JTextField txt_id_salon, JTextField txt_descripcionsalon) {
        txt_id_salon.setText("");
        txt_descripcionsalon.setText("");
        txt_id_salon.requestFocus();
    }
    
    private boolean validarCampos(JTextField user, JPasswordField pass) {
        if (user.getText().isEmpty() || pass.getPassword().length == 0) {
            JOptionPane.showMessageDialog(null,
                    "Por favor llenar todos los campos",
                    "Campos Vacíos",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    /*public void fnt_guardarHorario(JTextField txt_id_hor, JTextField txt_descripcionhor, JComboBox cmb_salonhor, JFormattedTextField txt_horainicio, JFormattedTextField txt_horafin) {
    conexion objetoConexion = new conexion();
    String consulta_guardar = "INSERT INTO horario (id_horario, dia_semana, hora_inicio, hora_fin, id_salon) VALUES (?, ?, ?, ?, ?)";
    PreparedStatement ps = null;
    
    try {
        ps = objetoConexion.conectar().prepareStatement(consulta_guardar);
        ps.setInt(1, Integer.parseInt(txt_id_hor.getText()));
        ps.setString(2, txt_descripcionhor.getText());
        
        // Para hora_inicio y hora_fin en formato de 24 horas
        java.sql.Time timeInicio = java.sql.Time.valueOf(txt_horainicio.getText());
        java.sql.Time timeFin = java.sql.Time.valueOf(txt_horafin.getText());
        
        ps.setTime(3, timeInicio);
        ps.setTime(4, timeFin);
        
        // Para el salón
        String selectedItem = cmb_salonhor.getSelectedItem().toString();
        int opcSalon = 0;
        switch (selectedItem) {
            case "P101" -> opcSalon = 101;
            case "P102" -> opcSalon = 102;
            case "P103" -> opcSalon = 103;
            case "P104" -> opcSalon = 104;
            case "B105" -> opcSalon = 105;
            case "B106" -> opcSalon = 106;
            case "B107" -> opcSalon = 107;
            case "C108" -> opcSalon = 108;
            default -> JOptionPane.showMessageDialog(null, "La selección no existe en la base de datos");
        }
        ps.setInt(5, opcSalon);
        
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Se guardó el horario correctamente");
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al guardar: " + e.getMessage());
    } finally {
        try {
            if (ps != null) ps.close();
            objetoConexion.cerrarConexion();
        } catch (SQLException e) {
            // Manejo de la excepción
        }
    }
}*/
   /* public boolean fnt_ValidadDisponibilidad(JComboBox cmb_salon, JComboBox cmb_dia, JFormattedTextField txt_hinicio, JFormattedTextField h_fin) {
        conexion objeto_conexion = new conexion();
        String query = "SELECT COUNT(*) FROM horario "
                + "WHERE id_salon = ? AND id_semana = ? AND "
                + "((hora_inicio < ? AND hora_fin > ?) OR "
                + "(hora_inicio < ? AND hora_fin > ?) OR "
                + "(hora_inicio >= ? AND hora_fin <= ?))";

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            java.util.Date parsedHoraInicio = sdf.parse(txt_hinicio.getText());
            java.util.Date parsedHoraFin = sdf.parse(h_fin.getText());

            java.sql.Time horaInicio = new java.sql.Time(parsedHoraInicio.getTime());
            java.sql.Time horaFin = new java.sql.Time(parsedHoraFin.getTime());

            PreparedStatement ps = objeto_conexion.conectar().prepareStatement(query);
            ps.setInt(1, fnt_consultaID("id_salon", "salon", "descripcion", (String) cmb_salon.getSelectedItem()));
            ps.setInt(2, fnt_consultaID("id_dia", "dia_semana", "nombre", (String) cmb_dia.getSelectedItem()));

            // These parameters check for different overlap scenarios
            ps.setTime(3, horaInicio);
            ps.setTime(4, horaInicio);
            ps.setTime(5, horaFin);
            ps.setTime(6, horaFin);
            ps.setTime(7, horaInicio);
            ps.setTime(8, horaFin);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);
                return count == 0; // Returns true if no conflicts
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al validar disponibilidad: " + e.getMessage());
        }
        return false;
    }*/
    
 public boolean fnt_ValidadDisponibilidad(JComboBox<String> cmb_salon, JComboBox<String> cmb_dia, JFormattedTextField txt_hinicio, JFormattedTextField h_fin) {
    conexion objeto_conexion = new conexion();
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
        // Validación de campos de entrada
        if (cmb_salon.getSelectedItem() == null || cmb_dia.getSelectedItem() == null
            || txt_hinicio.getText().isEmpty() || h_fin.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
            return false;
        }

        // Parsear las horas de inicio y fin
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        java.util.Date parsedHoraInicio = sdf.parse(txt_hinicio.getText());
        java.util.Date parsedHoraFin = sdf.parse(h_fin.getText());
        java.sql.Time horaInicio = new java.sql.Time(parsedHoraInicio.getTime());
        java.sql.Time horaFin = new java.sql.Time(parsedHoraFin.getTime());

        // Obtener el id del salón seleccionado
        int idSalon = fnt_consultaID("id_salon", "salon", "descripcion_salon", (String) cmb_salon.getSelectedItem());

        // Obtener el id del día seleccionado desde la tabla dia_semana
        int idDia = fnt_consultaID("id_dia", "dia_semana", "nombre", (String) cmb_dia.getSelectedItem());

        // Consulta SQL para verificar solapamiento de horarios
        String query = "SELECT COUNT(*) FROM horario " +
                     "WHERE id_salon = ? AND id_semana = ? AND (" +
                     "(hora_inicio < ? AND hora_fin > ?) OR " +   // Primer caso de solapamiento
                     "(hora_inicio < ? AND hora_fin > ?) OR " +   // Segundo caso de solapamiento
                     "(hora_inicio >= ? AND hora_fin <= ?))";    // Tercer caso de solapamiento

        // Preparar la consulta SQL con PreparedStatement
        ps = objeto_conexion.conectar().prepareStatement(query);
        ps.setInt(1, idSalon);    // ID del salón
        ps.setInt(2, idDia);      // ID del día de la semana
        ps.setTime(3, horaInicio);  // Hora de inicio del nuevo horario
        ps.setTime(4, horaInicio);  // Hora de inicio comparada con otros horarios
        ps.setTime(5, horaFin);     // Hora de fin del nuevo horario
        ps.setTime(6, horaFin);     // Hora de fin comparada con otros horarios
        ps.setTime(7, horaInicio);  // Hora de inicio comparada con el rango completo
        ps.setTime(8, horaFin);     // Hora de fin comparada con el rango completo

        // Ejecutar la consulta
        rs = ps.executeQuery();

        if (rs.next()) {
            int count = rs.getInt(1);
            if (count > 0) {
                // Si hay solapamiento, mostrar mensaje y no permitir guardar
                JOptionPane.showMessageDialog(null, "El salón ya está ocupado en este horario.");
                return false;
            }
        }

        // Si no hay solapamiento, se puede proceder
        return true;
    } catch (HeadlessException | SQLException | ParseException e) {
        // Manejo de excepciones
        JOptionPane.showMessageDialog(null, "Error al validar disponibilidad: " + e.getMessage());
        return false;
    } finally {
        // Asegurarse de cerrar todos los recursos
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            objeto_conexion.cerrarConexion();
        } catch (SQLException e) {
        }
    }
}

    public void fnt_guardarHorario(JTextField txt_id_hor, JTextField txt_descripcionhor, JComboBox cmb_salonhor, JFormattedTextField txt_horainicio, JFormattedTextField txt_horafin, JComboBox dia) {
        conexion objetoConexion = new conexion();
        String consulta_guardar = "INSERT INTO horario (id_horario, descripcion, hora_inicio, hora_fin, id_salon, id_semana) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = null;

        try {

            if (!fnt_ValidadDisponibilidad(cmb_salonhor, dia, txt_horainicio, txt_horafin)) {
                JOptionPane.showMessageDialog(null, "El salón ya está ocupado en este horario");
                return;
            } else {
                ps = objetoConexion.conectar().prepareStatement(consulta_guardar);
                ps.setInt(1, Integer.parseInt(txt_id_hor.getText()));
                ps.setString(2, txt_descripcionhor.getText());

                java.sql.Time timeInicio = java.sql.Time.valueOf(txt_horainicio.getText());
                java.sql.Time timeFin = java.sql.Time.valueOf(txt_horafin.getText());

                ps.setTime(3, timeInicio);
                ps.setTime(4, timeFin);

                // Para el salón
                String selectedItem = cmb_salonhor.getSelectedItem().toString();
                int opcSalon = 0;
                switch (selectedItem) {
                    case "P101" ->
                        opcSalon = 101;
                    case "P102" ->
                        opcSalon = 102;
                    case "P103" ->
                        opcSalon = 103;
                    case "P104" ->
                        opcSalon = 104;
                    case "B105" ->
                        opcSalon = 105;
                    case "B106" ->
                        opcSalon = 106;
                    case "B107" ->
                        opcSalon = 107;
                    case "C108" ->
                        opcSalon = 108;
                    default ->
                        JOptionPane.showMessageDialog(null, "La selección no existe en la base de datos");
                }
                ps.setInt(5, opcSalon);
                ps.setInt(6, fnt_consultaID("id_dia", "dia_semana", "nombre", (String) dia.getSelectedItem()));
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se guardó el horario correctamente");

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar: " + e.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                objetoConexion.cerrarConexion();
            } catch (SQLException e) {
                // Manejo de la excepción
            }
        }
    }

    public void fnt_eliminarHorario(JTextField txt_id_hor) {
        conexion objetoConexion = new conexion();
        String consulta_eliminar = "DELETE FROM horario WHERE id_horario = ?";
        PreparedStatement ps = null;

        try {
            ps = objetoConexion.conectar().prepareStatement(consulta_eliminar);
            ps.setInt(1, Integer.parseInt(txt_id_hor.getText()));

            int rowsDeleted = ps.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Se eliminó el horario correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el horario con ese ID");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar: " + e.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                objetoConexion.cerrarConexion();
            } catch (SQLException e) {
                // Manejo de la excepción
            }
        }
    }

    /*public void fnt_actualizarHorario(JTextField txt_id_hor, JTextField txt_descripcionhor, JComboBox cmb_salonhor, JFormattedTextField txt_horainicio, JFormattedTextField txt_horafin) {
        conexion objetoConexion = new conexion();
        String consulta_actualizar = "UPDATE horario SET descripcion = ?, hora_inicio = ?, hora_fin = ?, id_salon = ? WHERE id_horario = ?";
        PreparedStatement ps = null;

        try {
            ps = objetoConexion.conectar().prepareStatement(consulta_actualizar);
            ps.setString(1, txt_descripcionhor.getText());

            // Para hora_inicio y hora_fin
            Time timeInicio = Time.valueOf(txt_horainicio.getText());
            Time timeFin = Time.valueOf(txt_horafin.getText());

            ps.setTime(2, timeInicio);
            ps.setTime(3, timeFin);

            // Para el salón
            String selectedItem = cmb_salonhor.getSelectedItem().toString();
            int opcSalon = 0;
            switch (selectedItem) {
                case "P101" ->
                    opcSalon = 101;
                case "P102" ->
                    opcSalon = 102;
                case "P103" ->
                    opcSalon = 103;
                case "P104" ->
                    opcSalon = 104;
                case "B105" ->
                    opcSalon = 105;
                case "B106" ->
                    opcSalon = 106;
                case "B107" ->
                    opcSalon = 107;
                case "C108" ->
                    opcSalon = 108;
                default ->
                    JOptionPane.showMessageDialog(null, "La selección no existe en la base de datos");
            }
            ps.setInt(4, opcSalon);
            ps.setInt(5, Integer.parseInt(txt_id_hor.getText()));

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se actualizó el horario correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar: " + e.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                objetoConexion.cerrarConexion();
            } catch (SQLException e) {
            }
        }
    }*/
    
    public void fnt_actualizarHorario(JTextField txt_id_hor, JTextField txt_descripcionhor, JComboBox cmb_salonhor, JFormattedTextField txt_horainicio, JFormattedTextField txt_horafin, JComboBox cmb_dia) {
    conexion objetoConexion = new conexion();
    
    // Obtiene el ID del horario que se quiere actualizar
    int idHorario = Integer.parseInt(txt_id_hor.getText());
    String descripcion = txt_descripcionhor.getText();
    String horaInicio = txt_horainicio.getText();
    String horaFin = txt_horafin.getText();
    
    // Obtiene el id_salon correspondiente al salón seleccionado
    String salonSeleccionado = (String) cmb_salonhor.getSelectedItem();
    int idSalon = 0;
    switch (salonSeleccionado) {
        case "P101":
            idSalon = 101;
            break;
        case "P102":
            idSalon = 102;
            break;
        case "P103":
            idSalon = 103;
            break;
        case "P104":
            idSalon = 104;
            break;
        case "B105":
            idSalon = 105;
            break;
        case "B106":
            idSalon = 106;
            break;
        case "B107":
            idSalon = 107;
            break;
        case "C108":
            idSalon = 108;
            break;
        default:
            JOptionPane.showMessageDialog(null, "Seleccione un salón válido", "Error de selección", JOptionPane.ERROR_MESSAGE);
            return;
    }
    
    // Consulta SQL para actualizar el horario
    String consulta_actualizar = "UPDATE horario SET descripcion = ?, hora_inicio = ?, hora_fin = ?, id_salon = ?, id_semana=? WHERE id_horario = ?";
    PreparedStatement ps = null;
    
    try {
          if (!fnt_ValidadDisponibilidad(cmb_salonhor, cmb_dia, txt_horainicio, txt_horafin)) {
                JOptionPane.showMessageDialog(null, "El salón ya está ocupado en este horario");
            } else{
        ps = objetoConexion.conectar().prepareStatement(consulta_actualizar);
        
        // Establecer los parámetros en la consulta
        ps.setString(1, descripcion);  // Descripción
        ps.setString(2, horaInicio);  // Hora de inicio
        ps.setString(3, horaFin);     // Hora de fin
        ps.setInt(4, idSalon);        // ID del salón
        ps.setInt(5, fnt_consultaID("id_dia", "dia_semana", "nombre", (String)cmb_dia.getSelectedItem()));
        ps.setInt(6, idHorario);      // ID del horario
        
        // Ejecutar la actualización
        int filasAfectadas = ps.executeUpdate();
        
        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, "Horario actualizado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el horario para actualizar.", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }} catch (SQLException e) {
        // Manejo de errores de base de datos
        JOptionPane.showMessageDialog(null, "Error al actualizar el horario: " + e.getMessage(), "Error de base de datos", JOptionPane.ERROR_MESSAGE);
    } finally {
        // Cerrar recursos
        try {
            if (ps != null) {
                ps.close();
            }
            objetoConexion.cerrarConexion();
        } catch (SQLException e) {
            // No es necesario manejar errores aquí
        }
    }
}


   public void fnt_buscarHorario(JTextField txt_id_hor, JTextField txt_descripcionhor, JComboBox cmb_salonhor, JFormattedTextField txt_horainicio, JFormattedTextField txt_horafin,JComboBox cmb_dia) {
    conexion objetoConexion = new conexion();
    // Consulta SQL actualizada con la unión de las tablas 'horario' y 'dia_semana'
    String consulta_buscar = "SELECT h.id_horario, h.descripcion, h.hora_inicio, h.hora_fin, h.id_salon, h.id_semana, ds.nombre "
                            + "FROM horario h "
                            + "JOIN dia_semana ds ON h.id_semana = ds.id_dia "
                            + "WHERE h.id_horario = ?";
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
        ps = objetoConexion.conectar().prepareStatement(consulta_buscar);
        ps.setInt(1, Integer.parseInt(txt_id_hor.getText()));  // Establece el ID desde el campo de texto
        rs = ps.executeQuery();
        
        if (rs.next()) {
            // Recupera los valores del resultado de la consulta
            txt_descripcionhor.setText(rs.getString("descripcion"));
            
            // Formatea y establece la hora de inicio y fin
            Time timeInicio = rs.getTime("hora_inicio");
            SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
            txt_horainicio.setText(formatoHora.format(timeInicio));
            Time timeFin = rs.getTime("hora_fin");
            txt_horafin.setText(formatoHora.format(timeFin));
            
            // Mapea el id_salon a su descripción correspondiente directamente en el bloque
            int idSalon = rs.getInt("id_salon");
            String salonStr;
            switch (idSalon) {
                case 101:
                    salonStr = "P101";
                    break;
                case 102:
                    salonStr = "P102";
                    break;
                case 103:
                    salonStr = "P103";
                    break;
                case 104:
                    salonStr = "P104";
                    break;
                case 105:
                    salonStr = "B105";
                    break;
                case 106:
                    salonStr = "B106";
                    break;
                case 107:
                    salonStr = "B107";
                    break;
                case 108:
                    salonStr = "C108";
                    break;
                default:
                    salonStr = "Seleccione el salón";
                    break;
            }
            cmb_salonhor.setSelectedItem(salonStr);
            
            cmb_dia.setSelectedItem( rs.getString("nombre"));
            // Recupera el nombre del día de la semana desde la tabla 'dia_semana'
            String diaSemana = rs.getString("nombre");
            JOptionPane.showMessageDialog(null, "Horario encontrado exitosamente para " + diaSemana);
        } else {
            // Si no se encuentra el horario, muestra un mensaje de advertencia y limpia los campos
            JOptionPane.showMessageDialog(null, "No se encontró ningún horario con ese ID",
                                          "No encontrado", JOptionPane.WARNING_MESSAGE);
            limpiarCamposHorario(txt_id_hor, txt_descripcionhor, cmb_salonhor, txt_horainicio, txt_horafin);
        }
    } catch (NumberFormatException e) {
        // Si el formato del ID no es válido, muestra un mensaje de error
        JOptionPane.showMessageDialog(null, "El ID debe ser un número válido",
                                      "Error de formato", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException e) {
        // Maneja los errores de la base de datos
        JOptionPane.showMessageDialog(null, "Error al buscar: " + e.getMessage(),
                                      "Error de base de datos", JOptionPane.ERROR_MESSAGE);
    } finally {
        // Cierra los recursos de la base de datos
        try {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            objetoConexion.cerrarConexion();
        } catch (SQLException e) {
            // No es necesario manejar errores aquí
        }
    }
}


   /* public void fnt_pdfUsuario() throws FileNotFoundException {
        Document documento = new Document();
        try {
            // Mostrar un JFileChooser para que el usuario elija la ubicación y nombre del archivo
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Guardar Reporte");
            fileChooser.setSelectedFile(new File("Reporte_Usuarios.pdf"));

            // Filtrar solo archivos PDF
            fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.addChoosableFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Archivos PDF", "pdf"));

            int userSelection = fileChooser.showSaveDialog(null);

            // Si el usuario selecciona "Guardar"
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File archivo = fileChooser.getSelectedFile();

                // Si el archivo no tiene la extensión .pdf, agregarla
                if (!archivo.getAbsolutePath().endsWith(".pdf")) {
                    archivo = new File(archivo.getAbsolutePath() + ".pdf");
                }

                // Crear el escritor de PDF con la ruta seleccionada por el usuario
                PdfWriter.getInstance(documento, new FileOutputStream(archivo));
                documento.open();

                // Encabezado
                Paragraph encabezado = new Paragraph("Politécnico Colombiano Jaime Isaza Cadavid",
                        new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD));
                encabezado.setAlignment(Element.ALIGN_CENTER);
                documento.add(encabezado);

                // Logo de la institución
                Image logo = null;
                try {
                    logo = Image.getInstance("./Logo_Poli.png");
                } catch (BadElementException | IOException ex) {
                    Logger.getLogger(frm_reportes.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (logo != null) {
                    logo.scaleToFit(50, 50);
                    logo.setAlignment(Element.ALIGN_CENTER);
                    documento.add(logo);
                }
                documento.add(Chunk.NEWLINE);

                Paragraph encabezado1 = new Paragraph("Listado de Usuarios",
                        new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD));
                encabezado1.setAlignment(Element.ALIGN_CENTER);
                documento.add(encabezado1);
                documento.add(Chunk.NEWLINE);
                PdfPTable tabla = new PdfPTable(8);
                tabla.addCell("Documento");
                tabla.addCell("Nombre");
                tabla.addCell("Apellido");
                tabla.addCell("Fecha_Nacimiento");
                tabla.addCell("Sexo");
                tabla.addCell("Municipio");
                tabla.addCell("Telefono");
                tabla.addCell("Rol");
                try {
                    modelo.conexion conexion1 = new modelo.conexion();

                    // Realizamos la consulta con el JOIN para obtener la descripción del sexo, municipio y rol
                    PreparedStatement pst = conexion1.conectar().prepareStatement(
                            "SELECT u.id_usuario, u.nombre, u.apellido, u.fecha_nac, s.descripcion_sexo, m.descripcion_municipio, u.telefono, r.descripcion_rol"
                            + "FROM usuario u "
                            + "JOIN sexo s ON u.id_sexo = s.id_sexo "
                            + "JOIN municipio m ON u.id_municipio = m.id_municipio "
                            + "JOIN rol r ON u.id_rol = r.id_rol"
                    );

                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {
                        do {
                            tabla.addCell(rs.getString("id_usuario"));
                            tabla.addCell(rs.getString("nombre"));
                            tabla.addCell(rs.getString("apellido"));
                            tabla.addCell(rs.getString("fecha_nac"));
                            tabla.addCell(rs.getString("descripcion_sexo"));
                            tabla.addCell(rs.getString("descripcion_municipio"));
                            tabla.addCell(rs.getString("telefono"));
                            tabla.addCell(rs.getString("descripcion_rol"));
                        } while (rs.next());
                        documento.add(tabla);
                    }

                } catch (DocumentException | SQLException e) {
                }
                documento.close();
                JOptionPane.showMessageDialog(null, "Reporte Generado correctamente en: " + archivo.getAbsolutePath());
            }

        } catch (DocumentException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error al crear el archivo PDF.");
        }
    }*/
   
   public void fnt_pdfUsuario() throws FileNotFoundException {
    Document documento = new Document();
    try {
        // Mostrar un JFileChooser para que el usuario elija la ubicación y nombre del archivo
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar Reporte");
        fileChooser.setSelectedFile(new File("Reporte_Usuarios.pdf"));

        // Filtrar solo archivos PDF
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.addChoosableFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Archivos PDF", "pdf"));

        int userSelection = fileChooser.showSaveDialog(null);

        // Si el usuario selecciona "Guardar"
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();

            // Si el archivo no tiene la extensión .pdf, agregarla
            if (!archivo.getAbsolutePath().endsWith(".pdf")) {
                archivo = new File(archivo.getAbsolutePath() + ".pdf");
            }

            // Crear el escritor de PDF con la ruta seleccionada por el usuario
            PdfWriter.getInstance(documento, new FileOutputStream(archivo));
            documento.open();

            // Encabezado
            Paragraph encabezado = new Paragraph("Politécnico Colombiano Jaime Isaza Cadavid",
                    new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD));
            encabezado.setAlignment(Element.ALIGN_CENTER);
            documento.add(encabezado);

            // Logo de la institución
            Image logo = null;
            try {
                logo = Image.getInstance("./Logo_Poli.png");
            } catch (BadElementException | IOException ex) {
                Logger.getLogger(frm_reportes.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (logo != null) {
                logo.scaleToFit(50, 50);
                logo.setAlignment(Element.ALIGN_CENTER);
                documento.add(logo);
            }
            documento.add(Chunk.NEWLINE);

            Paragraph encabezado1 = new Paragraph("Listado de Usuarios",
                    new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD));
            encabezado1.setAlignment(Element.ALIGN_CENTER);
            documento.add(encabezado1);
            documento.add(Chunk.NEWLINE);
            
            PdfPTable tabla = new PdfPTable(8);
            tabla.addCell("Documento");
            tabla.addCell("Nombre");
            tabla.addCell("Apellido");
            tabla.addCell("Fecha_Nacimiento");
            tabla.addCell("Sexo");
            tabla.addCell("Municipio");
            tabla.addCell("Telefono");
            tabla.addCell("Rol");

            try {
                modelo.conexion conexion1 = new modelo.conexion();
                PreparedStatement pst = conexion1.conectar().prepareStatement(
                        "SELECT u.id_usuario, u.nombre, u.apellido, u.fecha_nac, s.descripcion_sexo, m.descripcion_municipio, u.telefono, r.descripcion_rol "
                        + "FROM usuario u "
                        + "JOIN sexo s ON u.id_sexo = s.id_sexo "
                        + "JOIN municipio m ON u.id_municipio = m.id_municipio "
                        + "JOIN rol r ON u.id_rol = r.id_rol"
                );
                ResultSet rs = pst.executeQuery();

                // Asegurarse de que hay registros
                while (rs.next()) {
                    tabla.addCell(rs.getString("id_usuario"));
                    tabla.addCell(rs.getString("nombre"));
                    tabla.addCell(rs.getString("apellido"));
                    tabla.addCell(rs.getString("fecha_nac"));
                    tabla.addCell(rs.getString("descripcion_sexo"));
                    tabla.addCell(rs.getString("descripcion_municipio"));
                    tabla.addCell(rs.getString("telefono"));
                    tabla.addCell(rs.getString("descripcion_rol"));
                }
                documento.add(tabla);

                // Cerrar el ResultSet y PreparedStatement
                rs.close();
                pst.close();
                conexion1.conectar().close();
            } catch (SQLException | DocumentException e) {
                JOptionPane.showMessageDialog(null, "Error al obtener datos o crear PDF: " + e.getMessage());
            }
            
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte Generado correctamente en: " + archivo.getAbsolutePath());
        }

    } catch (DocumentException | HeadlessException e) {
        JOptionPane.showMessageDialog(null, "Error al crear el archivo PDF: " + e.getMessage());
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error al leer el logo: " + e.getMessage());
    }
}


    public void fnt_pdfDocente() {
        Document documento = new Document();
        try {
            // Mostrar un JFileChooser para que el usuario elija la ubicación y nombre del archivo
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Guardar Reporte");
            fileChooser.setSelectedFile(new File("Reporte_Docente.pdf"));

            // Filtrar solo archivos PDF
            fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.addChoosableFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Archivos PDF", "pdf"));

            int userSelection = fileChooser.showSaveDialog(null);

            // Si el usuario selecciona "Guardar"
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File archivo = fileChooser.getSelectedFile();

                // Si el archivo no tiene la extensión .pdf, agregarla
                if (!archivo.getAbsolutePath().endsWith(".pdf")) {
                    archivo = new File(archivo.getAbsolutePath() + ".pdf");
                }

                // Crear el escritor de PDF con la ruta seleccionada por el usuario
                PdfWriter.getInstance(documento, new FileOutputStream(archivo));
                documento.open();

                // Encabezado
                Paragraph encabezado = new Paragraph("Politécnico Colombiano Jaime Isaza Cadavid",
                        new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD));
                encabezado.setAlignment(Element.ALIGN_CENTER);
                documento.add(encabezado);

                // Logo de la institución
                Image logo = null;
                try {
                    logo = Image.getInstance("./Logo_Poli.png");
                } catch (BadElementException | IOException ex) {
                    Logger.getLogger(frm_reportes.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (logo != null) {
                    logo.scaleToFit(50, 50);
                    logo.setAlignment(Element.ALIGN_CENTER);
                    documento.add(logo);
                }
                documento.add(Chunk.NEWLINE);

                Paragraph encabezado1 = new Paragraph("Listado de Docentes",
                        new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD));
                encabezado1.setAlignment(Element.ALIGN_CENTER);
                documento.add(encabezado1);
                documento.add(Chunk.NEWLINE);

                PdfPTable tabla = new PdfPTable(8);
                tabla.addCell("Documento");
                tabla.addCell("Nombre");
                tabla.addCell("Apellido");
                tabla.addCell("Fecha_Nacimiento");
                tabla.addCell("Sexo");
                tabla.addCell("Municipio");
                tabla.addCell("Telefono");
                tabla.addCell("Profesión");

                try {
                    modelo.conexion conexion1 = new modelo.conexion();
                    PreparedStatement pst = conexion1.conectar().prepareStatement(
                            "SELECT d.id_docente, d.nombre, d.apellido, d.fecha_nac, s.descripcion_sexo, m.descripcion_municipio, d.telefono, p.descripcion_profesion "
                            + "FROM docente d "
                            + "JOIN sexo s ON d.id_sexo = s.id_sexo "
                            + "JOIN municipio m ON d.id_municipio = m.id_municipio "
                            + "JOIN profesion p ON d.id_profesion = p.id_profesion"
                    );
                    ResultSet rs = pst.executeQuery();
                    if (rs.next()) {
                        do {
                            tabla.addCell(rs.getString("id_docente"));
                            tabla.addCell(rs.getString("nombre"));
                            tabla.addCell(rs.getString("apellido"));
                            tabla.addCell(rs.getString("fecha_nac"));
                            tabla.addCell(rs.getString("descripcion_sexo"));
                            tabla.addCell(rs.getString("descripcion_municipio"));
                            tabla.addCell(rs.getString("telefono"));
                            tabla.addCell(rs.getString("descripcion_profesion"));
                        } while (rs.next());
                        documento.add(tabla);
                    }
                } catch (DocumentException | SQLException e) {
                }
                documento.close();
                JOptionPane.showMessageDialog(null, "Reporte Generado correctamente en: " + archivo.getAbsolutePath());
            }

        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error al crear el archivo PDF.");
        }
    }

    public void fnt_pdfHorario() {
        Document documento = new Document();

        try {
            // Mostrar un JFileChooser para que el usuario elija la ubicación y nombre del archivo
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Guardar Reporte");
            fileChooser.setSelectedFile(new File("Reporte_Horario.pdf"));

            // Filtrar solo archivos PDF
            fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.addChoosableFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Archivos PDF", "pdf"));

            int userSelection = fileChooser.showSaveDialog(null);

            // Si el usuario selecciona "Guardar"
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File archivo = fileChooser.getSelectedFile();

                // Si el archivo no tiene la extensión .pdf, agregarla
                if (!archivo.getAbsolutePath().endsWith(".pdf")) {
                    archivo = new File(archivo.getAbsolutePath() + ".pdf");
                }

                // Crear el escritor de PDF con la ruta seleccionada por el usuario
                PdfWriter.getInstance(documento, new FileOutputStream(archivo));
                documento.open();

                // Encabezado
                Paragraph encabezado = new Paragraph("Politécnico Colombiano Jaime Isaza Cadavid",
                        new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD));
                encabezado.setAlignment(Element.ALIGN_CENTER);
                documento.add(encabezado);

                // Logo de la institución
                Image logo = null;
                try {
                    logo = Image.getInstance("./Logo_Poli.png");
                } catch (BadElementException | IOException ex) {
                    Logger.getLogger(frm_reportes.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (logo != null) {
                    logo.scaleToFit(50, 50);
                    logo.setAlignment(Element.ALIGN_CENTER);
                    documento.add(logo);
                }
                documento.add(Chunk.NEWLINE);

                // Título del reporte
                Paragraph encabezado1 = new Paragraph("Listado de Horarios",
                        new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD));
                encabezado1.setAlignment(Element.ALIGN_CENTER);
                documento.add(encabezado1);
                documento.add(Chunk.NEWLINE);

                // Crear la tabla con 5 columnas
                PdfPTable tabla = new PdfPTable(5);
                tabla.addCell("Id Horario");
                tabla.addCell("Descripción");
                tabla.addCell("Hora Inicio");
                tabla.addCell("Hora Fin");
                tabla.addCell("Salón");

                try {
                    modelo.conexion conexion1 = new modelo.conexion();
                    PreparedStatement pst = conexion1.conectar().prepareStatement(
                            "SELECT h.id_horario, h.descripcion, h.hora_inicio, h.hora_fin, s.descripcion_salon "
                            + "FROM horario h "
                            + "JOIN salon s ON h.id_salon = s.id_salon"
                    );
                    ResultSet rs = pst.executeQuery();
                    if (rs.next()) {
                        do {
                            String horaInicio = rs.getString("hora_inicio");
                            String horaFin = rs.getString("hora_fin");

                            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
                            String horaInicioFormateada = sdf.format(rs.getTime("hora_inicio"));
                            String horaFinFormateada = sdf.format(rs.getTime("hora_fin"));

                            tabla.addCell(rs.getString("id_horario"));
                            tabla.addCell(rs.getString("descripcion"));
                            tabla.addCell(horaInicioFormateada);
                            tabla.addCell(horaFinFormateada);
                            tabla.addCell(rs.getString("descripcion_salon"));
                        } while (rs.next());
                        documento.add(tabla);
                    }
                } catch (DocumentException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error al generar el reporte: " + e.getMessage());
                }
                documento.close();
                JOptionPane.showMessageDialog(null, "Reporte Generado correctamente en: " + archivo.getAbsolutePath());
            }

        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error al crear el documento: " + e.getMessage());
        }
    }

    public void fnt_pdfAsignatura() {
        Document documento = new Document();

        try {
            // Mostrar un JFileChooser para que el usuario elija la ubicación y nombre del archivo
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Guardar Reporte");
            fileChooser.setSelectedFile(new File("Reporte_Asignatura.pdf"));

            // Filtrar solo archivos PDF
            fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.addChoosableFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Archivos PDF", "pdf"));

            int userSelection = fileChooser.showSaveDialog(null);

            // Si el usuario selecciona "Guardar"
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File archivo = fileChooser.getSelectedFile();

                // Si el archivo no tiene la extensión .pdf, agregarla
                if (!archivo.getAbsolutePath().endsWith(".pdf")) {
                    archivo = new File(archivo.getAbsolutePath() + ".pdf");
                }

                // Crear el escritor de PDF con la ruta seleccionada por el usuario
                PdfWriter.getInstance(documento, new FileOutputStream(archivo));
                documento.open();

                // Encabezado
                Paragraph encabezado = new Paragraph("Politécnico Colombiano Jaime Isaza Cadavid",
                        new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD));
                encabezado.setAlignment(Element.ALIGN_CENTER);
                documento.add(encabezado);

                // Logo de la institución
                Image logo = null;
                try {
                    logo = Image.getInstance("./Logo_Poli.png");
                } catch (BadElementException | IOException ex) {
                    Logger.getLogger(frm_reportes.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (logo != null) {
                    logo.scaleToFit(50, 50);
                    logo.setAlignment(Element.ALIGN_CENTER);
                    documento.add(logo);
                }
                documento.add(Chunk.NEWLINE);

                // Título del reporte
                Paragraph encabezado1 = new Paragraph("Listado de Asignaturas",
                        new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD));
                encabezado1.setAlignment(Element.ALIGN_CENTER);
                documento.add(encabezado1);
                documento.add(Chunk.NEWLINE);

                // Crear la tabla con 3 columnas
                PdfPTable tabla = new PdfPTable(3);
                tabla.addCell("Id Asignatura");
                tabla.addCell("Descripción");
                tabla.addCell("Código");

                try {
                    modelo.conexion conexion1 = new modelo.conexion();
                    PreparedStatement pst = conexion1.conectar().prepareStatement(
                            "SELECT id_asignatura, descripcion, codigo FROM asignatura"
                    );
                    ResultSet rs = pst.executeQuery();
                    if (rs.next()) {
                        do {
                            tabla.addCell(rs.getString("id_asignatura"));
                            tabla.addCell(rs.getString("descripcion"));
                            tabla.addCell(rs.getString("codigo"));
                        } while (rs.next());
                        documento.add(tabla);
                    }
                } catch (DocumentException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error al generar el reporte: " + e.getMessage());
                }

                documento.close();
                JOptionPane.showMessageDialog(null, "Reporte Generado correctamente en: " + archivo.getAbsolutePath());
            }

        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error al crear el documento: " + e.getMessage());
        }
    }

    public void fnt_pdfIngresoDiario() {
        Document documento = new Document();
        try {
            // Mostrar un JFileChooser para que el usuario elija la ubicación y nombre del archivo
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Guardar Reporte");
            fileChooser.setSelectedFile(new File("Reporte_Ingreso_Diario.pdf"));

            // Filtrar solo archivos PDF
            fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.addChoosableFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Archivos PDF", "pdf"));

            int userSelection = fileChooser.showSaveDialog(null);

            // Si el usuario selecciona "Guardar"
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File archivo = fileChooser.getSelectedFile();

                // Si el archivo no tiene la extensión .pdf, agregarla
                if (!archivo.getAbsolutePath().endsWith(".pdf")) {
                    archivo = new File(archivo.getAbsolutePath() + ".pdf");
                }

                // Crear el escritor de PDF con la ruta seleccionada por el usuario
                PdfWriter.getInstance(documento, new FileOutputStream(archivo));
                documento.open();

                // Encabezado
                Paragraph encabezado = new Paragraph("Politécnico Colombiano Jaime Isaza Cadavid",
                        new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD));
                encabezado.setAlignment(Element.ALIGN_CENTER);
                documento.add(encabezado);

                // Logo de la institución
                Image logo = null;
                try {
                    logo = Image.getInstance("./Logo_Poli.png");
                } catch (BadElementException | IOException ex) {
                    Logger.getLogger(frm_reportes.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (logo != null) {
                    logo.scaleToFit(50, 50);
                    logo.setAlignment(Element.ALIGN_CENTER);
                    documento.add(logo);
                }
                documento.add(Chunk.NEWLINE);

                // Título del reporte
                Paragraph encabezado1 = new Paragraph("Listado de Ingresos Diarios de Docentes",
                        new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD));
                encabezado1.setAlignment(Element.ALIGN_CENTER);
                documento.add(encabezado1);
                documento.add(Chunk.NEWLINE);

                // Crear la tabla con 6 columnas
                PdfPTable tabla = new PdfPTable(6);
                tabla.addCell("Documento");
                tabla.addCell("Asignatura");
                tabla.addCell("Hora Entrada");
                tabla.addCell("Hora Salida");
                tabla.addCell("Observación");
                tabla.addCell("Fecha");

                try {
                    conexion conexion1 = new conexion();
                    PreparedStatement pst = conexion1.conectar().prepareStatement(
                            "SELECT d.id_docente, a.descripcion, r.fecha, r.hora_llegada, r.hora_salida, r.observacion "
                            + "FROM registro_docente r "
                            + "JOIN horario_asignatura ha ON r.id_hor_asi = ha.id_hor_asi "
                            + "JOIN asignatura a ON ha.id_asignatura = a.id_asignatura "
                            + "JOIN docente d ON ha.id_docente = d.id_docente");

                    ResultSet rs = pst.executeQuery();
                    while (rs.next()) {
                        tabla.addCell(rs.getString("id_docente")); // Documento del docente
                        tabla.addCell(rs.getString("descripcion")); // Asignatura
                        tabla.addCell(rs.getString("hora_llegada")); // Hora de entrada
                        tabla.addCell(rs.getString("hora_salida")); // Hora de salida
                        tabla.addCell(rs.getString("observacion")); // Observación
                        tabla.addCell(rs.getString("fecha")); // Fecha del ingreso
                    }
                    documento.add(tabla);
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error al obtener los registros: " + e.getMessage());
                }

                documento.close();
                JOptionPane.showMessageDialog(null, "Reporte Generado correctamente en: " + archivo.getAbsolutePath());
            }

        } catch (DocumentException | FileNotFoundException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error al generar el reporte: " + e.getMessage());
        }
    }

    public void fnt_buscar_docente_asinarH(JComboBox list, JComboBox cmb_docent, JComboBox cmb_area, JComboBox cmb_horar, int id) {
        conexion objeto_conexion = new conexion();
        String query = "select *from docente_asignar_busqueda where id_docente=" + id;
        String item = null;
        Statement st = null;
        ResultSet sr = null;
        try {
            list.setVisible(true);
            st = objeto_conexion.conectar().createStatement();
            sr = st.executeQuery(query);
            cmb_docent.setSelectedItem("");
            cmb_area.setSelectedItem("");
            cmb_horar.setSelectedItem("");
            while (sr.next()) {
                item = sr.getString("id_hor_asi");
                list.addItem(item);
            }
            if (item == null) {
                JOptionPane.showMessageDialog(null, "No se encuentra el docente", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
        } finally {
            objeto_conexion.cerrarConexion();
        }
    }

    public void fnt_seleccion_Horario(String list, JComboBox cmb_docent, JComboBox cmb_area, JComboBox cmb_horar) {
        conexion objeto_conexion = new conexion();
        String query = "select *from docente_asignar_busqueda where id_hor_asi=" + list;
        ResultSet rs = null;
        Statement st = null;
        try {
            st = objeto_conexion.conectar().createStatement();
            rs = st.executeQuery(query);
            rs.next();
            String docente = rs.getString("docente");
            String horario = rs.getString("horario");
            String asignatura = rs.getString("asignatura");

            cmb_docent.setSelectedItem(docente);
            cmb_area.setSelectedItem(asignatura);
            cmb_horar.setSelectedItem(horario);
        } catch (SQLException e) {
        }
    }

    public void fnt_limpiar_campos_Hor_asignado(JTextField id_user, JComboBox id_Hor_asig, JComboBox docente, JComboBox asignatura, JComboBox horario) {
        id_user.setText("");
        id_Hor_asig.removeAllItems();
        docente.setSelectedItem("");
        asignatura.setSelectedItem("");
        horario.setSelectedItem("");
    }

    public void fnt_Actualizar_Horario(JComboBox id_hor, JComboBox cmb_asignaturaasignacion, JComboBox cmb_horarioasignacion) {
        conexion objetoConexion = new conexion();
        String consulta_guardar = "UPDATE  horario_asignatura set id_horario= ?, id_asignatura= ? where id_hor_asi =" + id_hor.getSelectedItem().toString();
        PreparedStatement ps = null;
        try {
            ps = objetoConexion.conectar().prepareStatement(consulta_guardar);

            ps.setInt(1, fnt_consultaID("id_horario", "horario", "descripcion", cmb_horarioasignacion.getSelectedItem().toString()));
            ps.setInt(2, fnt_consultaID("id_asignatura", "asignatura", "descripcion", cmb_asignaturaasignacion.getSelectedItem().toString()));
            ps.executeUpdate();
            ps.close();
        } catch (HeadlessException | SQLException e) {
        } finally {
            objetoConexion.cerrarConexion();
        }
    }

    public void fnt_Eliminar_Horario_asignado(JComboBox id_hor_asi) {
        conexion objetoConexion = new conexion();
        String query = "Delete from horario_asignatura where id_hor_asi=" + id_hor_asi.getSelectedItem();
        PreparedStatement st = null;
        try {
            st = objetoConexion.conectar().prepareStatement(query);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Horario eliminado!");
            objetoConexion.cerrarConexion();
        } catch (HeadlessException | SQLException e) {
        } finally {
            objetoConexion.cerrarConexion();
        }
    }

    public void cargarAsignaturasDocente(JTextField idDocente, JComboBox comboAsignaturas) {
        conexion objetoConexion = new conexion();
        String sql = "SELECT ha.id_asignatura, a.descripcion "
                + "FROM horario_asignatura ha "
                + "JOIN asignatura a ON ha.id_asignatura = a.id_asignatura "
                + "WHERE ha.id_docente = ?";

        try {
            PreparedStatement ps = objetoConexion.conectar().prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(idDocente.getText()));
            ResultSet rs = ps.executeQuery();
            comboAsignaturas.removeAllItems();
            comboAsignaturas.addItem("Seleccione una asignatura");

            while (rs.next()) {
                // Obtener los datos del resultado
                int idAsignatura = rs.getInt("id_asignatura");
                String descripcion = rs.getString("descripcion");

                // Crear el objeto Asignatura (esto podría ser solo una cadena, pero lo hacemos con objeto)
                Asignatura asignatura = new Asignatura(idAsignatura, descripcion);

                // Agregar el objeto Asignatura al ComboBox
                comboAsignaturas.addItem(asignatura);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar asignaturas: " + e.getMessage());
        }
    }

    public void fnt_AsignarHorario(JComboBox cmb_asignaciondocente, JComboBox cmb_asignaturaasignacion, JComboBox cmb_horarioasignacion) {
        conexion objetoConexion = new conexion();
        String consulta_guardar = "INSERT INTO horario_asignatura (id_horario, id_asignatura, id_docente) VALUES (?, ?, ?)";
        PreparedStatement ps = null;
        try {
            ps = objetoConexion.conectar().prepareStatement(consulta_guardar);

            ps.setInt(1, fnt_consultaID("id_horario", "horario", "descripcion", cmb_horarioasignacion.getSelectedItem().toString()));
            ps.setInt(2, fnt_consultaID("id_asignatura", "asignatura", "descripcion", cmb_asignaturaasignacion.getSelectedItem().toString()));
            ps.setInt(3, fnt_consultaID("id_docente", "docente", "nombre", cmb_asignaciondocente.getSelectedItem().toString()));
            JOptionPane.showMessageDialog(null, "Se ha guardado Correctamente!");
            ps.executeUpdate();
            ps.close();
        } catch (HeadlessException | SQLException e) {
        } finally {
            objetoConexion.cerrarConexion();
        }
    }

    public int fnt_consultaID(String id_busqueda, String tabla, String nombre, String busqueda) {
        conexion objetoConexion = new conexion();
        String consulta = "select " + id_busqueda + " from " + tabla + " where " + nombre + "= '" + busqueda + "'";
        Statement st;
        int almacen = 0;
        try {
            st = objetoConexion.conectar().createStatement();
            try (ResultSet sr = st.executeQuery(consulta)) {
                if (sr.next()) {
                    almacen = sr.getInt(id_busqueda);
                }
            }
            st.close();
        } catch (SQLException e) {
        } finally {
            objetoConexion.cerrarConexion();
        }
        return almacen;
    }

    public void redirigirSegunRol(String rol, JFrame frm_login) {
        try {
            switch (rol.toLowerCase()) {
                case "1" -> {
                    //vigilante
                    frm_ingreso rd = new frm_ingreso();
                    rd.setVisible(true);
                    frm_login.dispose();
                }
                case "2" -> {
                    //administrador
                    frm_home ventanaHome = new frm_home();
                    ventanaHome.setVisible(true);
                    frm_login.dispose();
                }
                default ->
                    JOptionPane.showMessageDialog(null,
                            "Rol no reconocido",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null,
                    "Error al abrir ventana: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cerrarRecursos(ResultSet rs, PreparedStatement pst, Connection conn) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (pst != null) {
                pst.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
        }
    }

    public void fnt_limpiarCamposUser(JTextField txt_docuser, JTextField txt_nomdoc, JTextField txt_apellidoc, JDateChooser fnacimiento, JComboBox cmb_sexo,
            JComboBox cmb_profesion, JComboBox cmb_municipiodoc, JTextField txt_telefono, JTextField txt_passuser) {
        txt_docuser.setText("");
        txt_nomdoc.setText("");
        txt_apellidoc.setText("");
        txt_telefono.setText("");
        fnacimiento.setDate(null);
        cmb_sexo.setSelectedIndex(0);
        cmb_municipiodoc.setSelectedIndex(0);
        cmb_profesion.setSelectedIndex(0);
        txt_passuser.setText("");
        txt_docuser.requestFocus();
    }

    public void fnt_limpiarCamposDocente(JTextField txt_docdoc, JTextField txt_nomdoc, JTextField txt_apellidoc, JDateChooser fnacimiento, JComboBox cmb_sexo,
            JComboBox cmb_profesion, JComboBox cmb_municipiodoc, JTextField txt_telefono) {
        txt_docdoc.setText("");
        txt_nomdoc.setText("");
        txt_apellidoc.setText("");
        txt_telefono.setText("");
        fnacimiento.setDate(null);
        cmb_sexo.setSelectedIndex(0);
        cmb_municipiodoc.setSelectedIndex(0);
        cmb_profesion.setSelectedIndex(0);
        txt_docdoc.requestFocus();
    }

    public void fnt_limpiarCamposasignatura(JTextField txt_id_asignatura, JTextField txt_descripcionasig, JTextField txt_codigoasig) {
        txt_id_asignatura.setText("");
        txt_descripcionasig.setText("");
        txt_codigoasig.setText("");
        txt_id_asignatura.requestFocus();
    }

    public void limpiarCamposHorario(JTextField txt_id_hor, JTextField txt_descripcionhor, JComboBox cmb_salonhor, JFormattedTextField txt_horainicio, JFormattedTextField txt_horafin) {
        txt_id_hor.setText("");
        txt_descripcionhor.setText("");
        cmb_salonhor.setSelectedIndex(0);
        txt_horainicio.setValue(0);
        txt_horafin.setValue(0);
        txt_id_hor.requestFocus();
    }

    public Date fnt_fechaActual(JTextField txt_fecha) {
        try {
            Date fecha = new Date();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");  // nota: 'yyyy' en minúscula
            txt_fecha.setText(formatoFecha.format(fecha));
            txt_fecha.setEditable(false);  // opcional, para evitar que modifiquen la fecha
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al establecer la fecha: " + e.getMessage());
        }
        return null;

    }

    public void fnt_horaActual(JTextField txt_hora) {
        try {
            Date hora = new Date();
            SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
            txt_hora.setText(formatoHora.format(hora));
            txt_hora.setEditable(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al establecer la hora: " + e.getMessage());
        }
    }
    
    public void llenarTablaRegistros(JTable tabla) {
    DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
    if (modelo.getColumnCount() == 0) {
        modelo.addColumn("ID Registro");
        modelo.addColumn("Nombre Docente");
        modelo.addColumn("Nombre Asignatura");
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora Llegada");
        modelo.addColumn("Hora Salida");
        modelo.addColumn("Nombre Usuario");
        modelo.addColumn("Observación");
    }
    modelo.setRowCount(0);  // Limpiar los registros actuales de la tabla

    // Obtener la fecha actual en formato yyyy-MM-dd
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
    String fechaHoy = sdf.format(new java.util.Date());  // Fecha actual en formato adecuado para la consulta

    // Consulta SQL para traer solo los registros del día de hoy
    String query = "SELECT r.id_registro, d.nombre AS nombreDocente, a.descripcion AS nombreAsignatura, "
            + "r.fecha, r.hora_llegada, r.hora_salida, u.nombre AS nombreUsuario, r.observacion "
            + "FROM registro_docente r "
            + "JOIN horario_asignatura ha ON r.id_hor_asi = ha.id_hor_asi "
            + "JOIN docente d ON ha.id_docente = d.id_docente "
            + "JOIN asignatura a ON ha.id_asignatura = a.id_asignatura "
            + "JOIN usuario u ON r.id_usuario = u.id_usuario "
            + "WHERE r.fecha = ?";  // Filtrar por la fecha de hoy

    conexion objetoConexion = new conexion();
    try (Connection conn = objetoConexion.conectar(); PreparedStatement ps = conn.prepareStatement(query)) {
        // Establecer el parámetro para la fecha actual
        ps.setString(1, fechaHoy);

        // Ejecutar la consulta
        try (ResultSet rs = ps.executeQuery()) {
            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "No se encontraron registros para el día de hoy.");
                return;
            }
            do {
                Object[] fila = new Object[8];
                fila[0] = rs.getInt("id_registro");
                fila[1] = rs.getString("nombreDocente");
                fila[2] = rs.getString("nombreAsignatura");
                fila[3] = rs.getDate("fecha");
                fila[4] = rs.getString("hora_llegada");
                fila[5] = rs.getString("hora_salida");
                fila[6] = rs.getString("nombreUsuario");
                fila[7] = rs.getString("observacion");
                modelo.addRow(fila);
            } while (rs.next());
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al llenar la tabla: " + e.getMessage());
    }

    // Hacer la columna "Hora Salida" editable
    tabla.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(new JTextField()));

    // Detectar cambios en la tabla (especialmente en "Hora Salida")
    tabla.getModel().addTableModelListener(e -> {
        if (e.getType() == TableModelEvent.UPDATE) {
            int fila = e.getFirstRow();
            int columna = e.getColumn();
            if (columna == 5) {  // Verificamos si la columna editada es "Hora Salida" (columna 5)
                Object nuevoValor = tabla.getValueAt(fila, columna);
                int idRegistro = (int) tabla.getValueAt(fila, 0);  // Obtener el ID del registro

                // Actualizar el campo hora_salida en la base de datos
                try {
                    actualizarHoraSalida(idRegistro, (String) nuevoValor);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al actualizar la hora de salida: " + ex.getMessage());
                }
            }
        }
    });
}

// Método para actualizar la hora de salida en la base de datos
private void actualizarHoraSalida(int idRegistro, String nuevaHoraSalida) throws SQLException {
    String query = "UPDATE registro_docente SET hora_salida = ? WHERE id_registro = ?";
    
    try (Connection conn = new conexion().conectar(); 
         PreparedStatement ps = conn.prepareStatement(query)) {
        ps.setString(1, nuevaHoraSalida);  // Nueva hora de salida
        ps.setInt(2, idRegistro);  // ID del registro a actualizar
        ps.executeUpdate();
    }
}


    
    public void guardarCambios(JTable tabla) {
    DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
    boolean cambiosRealizados = false;  // Bandera para saber si hubo cambios
    
    // Recorrer todas las filas de la tabla y actualizar el campo hora_salida
    for (int i = 0; i < modelo.getRowCount(); i++) {
        int idRegistro = (int) modelo.getValueAt(i, 0);  // ID del registro
        Date fecha = (Date) modelo.getValueAt(i, 3);    // Fecha del registro
        String horaLlegada = (String) modelo.getValueAt(i, 4);  // Hora de llegada
        String horaSalida = (String) modelo.getValueAt(i, 5);  // Hora de salida editada
        String observacion = (String) modelo.getValueAt(i, 7);  // Observación
        
        // Verificar si el campo hora_salida fue editado
        if (horaSalida != null && !horaSalida.isEmpty()) {
            // Actualizar el campo hora_salida en la base de datos
            actualizarHoraSalida(idRegistro, fecha, horaSalida);
            cambiosRealizados = true;  // Marcar que hubo un cambio
        }
    }
    
    if (cambiosRealizados) {
        JOptionPane.showMessageDialog(null, "Los cambios han sido guardados exitosamente.");
    } else {
        JOptionPane.showMessageDialog(null, "No se realizaron cambios en las horas de salida.");
    }
}

    public void actualizarHoraSalida(int idRegistro, Date fecha, String horaSalida) {
    String query = "UPDATE registro_docente SET hora_salida = ? WHERE id_registro = ? AND fecha = ?";
    
    try (Connection conn = new conexion().conectar(); 
         PreparedStatement ps = conn.prepareStatement(query)) {
        
        // Convertir la hora de String a java.sql.Time
        if (horaSalida != null && !horaSalida.isEmpty()) {
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
            java.util.Date horaUtil = timeFormat.parse(horaSalida);  // Parsear la hora
            java.sql.Time horaSql = new java.sql.Time(horaUtil.getTime());  // Convertir a java.sql.Time
            ps.setTime(1, horaSql);  // Establecer hora_salida como tipo TIME
        } else {
            ps.setNull(1, java.sql.Types.TIME);  // Establecer hora_salida como NULL
        }

        ps.setInt(2, idRegistro);     // ID del registro
        ps.setDate(3, new java.sql.Date(fecha.getTime()));  // Fecha del registro
        
        ps.executeUpdate();
    } catch (SQLException | ParseException e) {
        JOptionPane.showMessageDialog(null, "Error al actualizar el registro: " + e.getMessage());
        // Para depuración
    }
}



    /*public static void guardarRegistro(String documento, String asignatura, String horaEntrada, String horaSalida, String idUsuario, String observacion, String fechaTexto) throws ParseException {
        conexion objetoConexion = new conexion();
        String queryDocenteId = "SELECT id_docente FROM docente WHERE id_docente = ?";
        String queryAsignaturaId = "SELECT ha.id_hor_asi FROM horario_asignatura ha "
                + "JOIN asignatura a ON ha.id_asignatura = a.id_asignatura "
                + "JOIN docente d ON ha.id_docente = d.id_docente "
                + "WHERE d.id_docente = ? AND a.descripcion = ?";
        String insertRegistroDocente = "INSERT INTO registro_docente (id_hor_asi, fecha, hora_llegada, hora_salida, id_usuario, observacion) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try {
            int idHorAsi = -1;
            try (PreparedStatement psAsignatura = objetoConexion.conectar().prepareStatement(queryAsignaturaId)) {
                psAsignatura.setString(1, documento);
                psAsignatura.setString(2, asignatura);
                ResultSet rsAsignatura = psAsignatura.executeQuery();

                if (rsAsignatura.next()) {
                    idHorAsi = rsAsignatura.getInt("id_hor_asi");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró la asignatura para este docente.");
                    return;
                }
            }
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date fechaUtil = sdf.parse(fechaTexto);
            java.sql.Date fechaSql = new java.sql.Date(fechaUtil.getTime());

            try (PreparedStatement psInsertar = objetoConexion.conectar().prepareStatement(insertRegistroDocente)) {
                psInsertar.setInt(1, idHorAsi);
                psInsertar.setDate(2, fechaSql);
                psInsertar.setString(3, horaEntrada);
                psInsertar.setString(4, horaSalida);
                psInsertar.setString(5, idUsuario);
                psInsertar.setString(6, observacion);
                psInsertar.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro guardado exitosamente.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el registro: " + e.getMessage());
        }
    }*/
    
    public static void guardarRegistro(String documento, String asignatura, String horaEntrada, String horaSalida, String observacion, String fechaTexto) throws ParseException {
    conexion objetoConexion = new conexion();
    String queryDocenteId = "SELECT id_docente FROM docente WHERE id_docente = ?";
    String queryAsignaturaId = "SELECT ha.id_hor_asi FROM horario_asignatura ha "
            + "JOIN asignatura a ON ha.id_asignatura = a.id_asignatura "
            + "JOIN docente d ON ha.id_docente = d.id_docente "
            + "WHERE d.id_docente = ? AND a.descripcion = ?";
    String insertRegistroDocente = "INSERT INTO registro_docente (id_hor_asi, fecha, hora_llegada, hora_salida, id_usuario, observacion) "
            + "VALUES (?, ?, ?, ?, ?, ?)";

    try {
        int idHorAsi = -1;
        try (PreparedStatement psAsignatura = objetoConexion.conectar().prepareStatement(queryAsignaturaId)) {
            psAsignatura.setString(1, documento);
            psAsignatura.setString(2, asignatura);
            ResultSet rsAsignatura = psAsignatura.executeQuery();

            if (rsAsignatura.next()) {
                idHorAsi = rsAsignatura.getInt("id_hor_asi");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la asignatura para este docente.");
                return;
            }
        }
        
        // Parsear la fecha
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date fechaUtil = sdf.parse(fechaTexto);
        java.sql.Date fechaSql = new java.sql.Date(fechaUtil.getTime());

        // Preparar el insert con el manejo de horaSalida
        try (PreparedStatement psInsertar = objetoConexion.conectar().prepareStatement(insertRegistroDocente)) {
            psInsertar.setInt(1, idHorAsi);
            psInsertar.setDate(2, fechaSql);
            psInsertar.setString(3, horaEntrada);

            // Verificar si horaSalida está vacía o es null
            if (horaSalida == null || horaSalida.isEmpty()) {
                psInsertar.setNull(4, java.sql.Types.TIME);  // Establecer hora_salida como NULL
            } else {
                psInsertar.setString(4, horaSalida);  // Insertar hora_salida si tiene valor
            }

            // Obtener el id_usuario de la sesión
            String idUsuario = Session.getIdUsuario();
            psInsertar.setString(5, idUsuario);  // Establecer el id_usuario automáticamente
            psInsertar.setString(6, observacion);

            psInsertar.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro guardado exitosamente.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al guardar el registro: " + e.getMessage());
    }
}


   /* public static void actualizarRegistroSalida(String documento, String asignatura, String horaSalida, String fechaTexto) throws ParseException {
    conexion objetoConexion = new conexion();
    
    // Consulta para obtener el ID de la asignatura y docente
    String queryAsignaturaId = "SELECT ha.id_hor_asi FROM horario_asignatura ha "
            + "JOIN asignatura a ON ha.id_asignatura = a.id_asignatura "
            + "JOIN docente d ON ha.id_docente = d.id_docente "
            + "WHERE d.id_docente = ? AND a.descripcion = ?";
    
    // Consulta de actualización solo para el campo hora_salida
    String updateHoraSalida = "UPDATE registro_docente SET hora_salida = ? "
            + "WHERE id_hor_asi = ? AND fecha = ?";
    
    try {
        int idHorAsi = -1;
        
        // Obtener el ID del horario de asignatura
        try (PreparedStatement psAsignatura = objetoConexion.conectar().prepareStatement(queryAsignaturaId)) {
            psAsignatura.setString(1, documento);    // Se pasa el documento
            psAsignatura.setString(2, asignatura);   // Se pasa la asignatura
            ResultSet rsAsignatura = psAsignatura.executeQuery();

            if (rsAsignatura.next()) {
                idHorAsi = rsAsignatura.getInt("id_hor_asi");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la asignatura para este docente.");
                return;
            }
        }

        // Parsear la fecha
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date fechaUtil = sdf.parse(fechaTexto);
        java.sql.Date fechaSql = new java.sql.Date(fechaUtil.getTime());

        // Preparar la actualización de hora_salida
        try (PreparedStatement psActualizar = objetoConexion.conectar().prepareStatement(updateHoraSalida)) {
            // Verificar si horaSalida está vacía o es null
            if (horaSalida == null || horaSalida.isEmpty()) {
                psActualizar.setNull(1, java.sql.Types.TIME);  // Establecer hora_salida como NULL
            } else {
                // Convertir la hora de String a java.sql.Time
                SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");  // Formato de hora: 24 horas, solo hora y minuto
                java.util.Date horaUtil = timeFormat.parse(horaSalida);  // Parsear la hora
                java.sql.Time horaSql = new java.sql.Time(horaUtil.getTime());  // Convertir a java.sql.Time
                psActualizar.setTime(1, horaSql);  // Establecer hora_salida como tipo TIME
            }

            // Establecer el id_hor_asi y la fecha para la actualización
            psActualizar.setInt(2, idHorAsi);  // Se pasa correctamente el ID de horario asignatura
            psActualizar.setDate(3, fechaSql); // Se pasa correctamente la fecha

            // Ejecutar la actualización
            int filasAfectadas = psActualizar.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Hora de salida actualizada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el registro para actualizar.");
            }
        }
    } catch (SQLException | ParseException e) {
        JOptionPane.showMessageDialog(null, "Error al actualizar la hora de salida: " + e.getMessage());
    }
    }*/
    
    public static void actualizarHoraSalida(String documento, String asignatura, String horaSalida, String fechaTexto) throws ParseException {
    conexion objetoConexion = new conexion();
    Connection conexion = null;
    
    String queryAsignaturaId = "SELECT ha.id_hor_asi FROM horario_asignatura ha "
            + "JOIN asignatura a ON ha.id_asignatura = a.id_asignatura "
            + "JOIN docente d ON ha.id_docente = d.id_docente "
            + "WHERE d.id_docente = ? AND a.descripcion = ?";
    
    String updateHoraSalida = "UPDATE registro_docente SET hora_salida = ? WHERE id_hor_asi = ? AND fecha = ?";
    
    try {
        conexion = objetoConexion.conectar();
        conexion.setAutoCommit(false);
        
        int idHorAsi = -1;
        
        // Obtener id_hor_asi
        try (PreparedStatement psAsignatura = conexion.prepareStatement(queryAsignaturaId)) {
            psAsignatura.setString(1, documento);
            psAsignatura.setString(2, asignatura);
            ResultSet rsAsignatura = psAsignatura.executeQuery();
            
            if (rsAsignatura.next()) {
                idHorAsi = rsAsignatura.getInt("id_hor_asi");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la asignatura para este docente.");
                return;
            }
        }
        
        // Parsear fecha
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date fechaUtil = sdf.parse(fechaTexto);
        java.sql.Date fechaSql = new java.sql.Date(fechaUtil.getTime());
        
        // Actualizar hora de salida
        try (PreparedStatement psActualizar = conexion.prepareStatement(updateHoraSalida)) {
            if (horaSalida == null || horaSalida.isEmpty()) {
                psActualizar.setNull(1, java.sql.Types.TIME);
            } else {
                SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
                java.util.Date horaUtil = timeFormat.parse(horaSalida);
                java.sql.Time horaSql = new java.sql.Time(horaUtil.getTime());
                psActualizar.setTime(1, horaSql);
            }
            
            psActualizar.setInt(2, idHorAsi);
            psActualizar.setDate(3, fechaSql);
            
            int filasAfectadas = psActualizar.executeUpdate();
            
            if (filasAfectadas > 0) {
                conexion.commit();
                JOptionPane.showMessageDialog(null, "Hora de salida actualizada exitosamente.");
            } else {
                conexion.rollback();
                JOptionPane.showMessageDialog(null, "No se encontró el registro para actualizar.");
            }
        }
    } catch (SQLException | ParseException e) {
        if (conexion != null) {
            try {
                conexion.rollback();
            } catch (SQLException ex) {
            }
        }
        JOptionPane.showMessageDialog(null, "Error al actualizar: " + e.getMessage());
        e.printStackTrace();
    } finally {
        if (conexion != null) {
            try {
                conexion.setAutoCommit(true);
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}


   public static void buscarDocentePorDocumento(String documento, JTextField txtNombreDocente, JComboBox<String> cbAsignaturas, JTextField txtHoraEntrada, JTextField txtHoraSalida) {

        conexion objetoConexion = new conexion();
        String queryDocente = "SELECT d.nombre, d.id_docente FROM docente d WHERE d.id_docente = ?";
        String queryAsignaturas = "SELECT a.descripcion "
                + "FROM horario_asignatura ha "
                + "JOIN asignatura a ON ha.id_asignatura = a.id_asignatura "
                + "JOIN docente d ON ha.id_docente = d.id_docente "
                + "WHERE d.id_docente = ?";
        try {
            try (PreparedStatement psDocente = objetoConexion.conectar().prepareStatement(queryDocente)) {
                psDocente.setString(1, documento);
                ResultSet rsDocente = psDocente.executeQuery();
                if (rsDocente.next()) {
                    String nombreDocente = rsDocente.getString("nombre");
                    txtNombreDocente.setText(nombreDocente);
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró un docente con ese documento.");
                    return;
                }
            }
            try (PreparedStatement psAsignaturas = objetoConexion.conectar().prepareStatement(queryAsignaturas)) {
                psAsignaturas.setString(1, documento);
                ResultSet rsAsignaturas = psAsignaturas.executeQuery();
                cbAsignaturas.removeAllItems();
                while (rsAsignaturas.next()) {
                    String asignatura = rsAsignaturas.getString("descripcion");
                    cbAsignaturas.addItem(asignatura);  // Agregar asignatura al ComboBox
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el docente: " + e.getMessage());
        }
   }

    public static void limpiarCamposRegistro(JTextField documentoField, JTextField asignaturaField, JTextField horaEntradaField, JTextField horaSalidaField, JTextField observacionArea, JComboBox cmb_asignatura, JTextField fechaField) {
        // Limpiar los campos de texto
        documentoField.setText("");
        asignaturaField.setText("");
        horaSalidaField.setText("");
        observacionArea.setText("");
        cmb_asignatura.setSelectedIndex(-1);
        documentoField.requestFocus();
    }

    public void rellenar_dia_sem(JComboBox dia) {
        conexion objeto_conexion = new conexion();
        String query = "select *from dia_semana";
        Statement st;
        dia.removeAllItems();
        try {
            st = objeto_conexion.conectar().createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                String almcen = rs.getString("nombre");
                dia.addItem(almcen);
            }
        } catch (SQLException e) {
        } finally {
            objeto_conexion.cerrarConexion();
        }
    }

}
