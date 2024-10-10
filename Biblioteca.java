public class Biblioteca{
  public static void main (String args[]){
       String[] librosHistoria = {"Historia minima de México", "Historia secreta de los mongoles", "Roma: una historia cultural"};
        
        String[] librosTerror = {"Terror en la biblioteca", "El resplandor"};
       
        String[] librosProgramacion = {"Aprender a programar en C", "Curso de programación Java",};
        String[] categories = {"Terror", "Historia", "Programación", "Salir"};

        ImageIcon imagenBienvenida = new ImageIcon("imagenes/bienvenida.gif");
        ImageIcon imagenBiblioteca = new ImageIcon("imagenes/Biblioteca.jpeg");

      JOptionPane.showMessageDialog(null,
                "<html>"
                        + "<h1 style='color:orange;'>Bienvenidos a la Biblioteca</h1>"
                        + "<p><b><font size='5' color='black'>Miembros del grupo:</font></b></p>"
                        + "<ul style='margin-left:15px;'>"
                        + "<li><i><font size='4' color='gray'>Name</font></i></li>"
                        + "<li><i><font size='4' color='gray'>Alexis Name</font></i></li>"
                        + "</ul>"
                        + "</html>",
                "Bienvenidos a la biblioteca",
                JOptionPane.INFORMATION_MESSAGE,
                imagenBienvenida);
}
}
