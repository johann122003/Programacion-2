import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Principal {
    public static void main(String[] args) throws IOException {
        Universidad uni1 = new Universidad("null","null", "null");
        Estudiante estu= new Estudiante("null","null","null","null");
        Materia mat = new Materia(null, null,null);
        Notas not= new Notas(0, 0, 0);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion;
do {
    String var1, var2, var3;
    //universidad
    var1 = JOptionPane.showInputDialog(null, "Nombre de la Universidad:");
    uni1.setNombreU(var1);
    var2 = JOptionPane.showInputDialog(null, "Codigo:");
    uni1.setCodigoU(var2);
    var3 = JOptionPane.showInputDialog(null, "Direccion:");
    uni1.setDireccionU(var3);
    // Estudiante
    String var4, var5, var6, var7;
    var4 = JOptionPane.showInputDialog(null, "Nombre Estudiante:");
    estu.setNombreE(var4);
    var5 = JOptionPane.showInputDialog(null, "Codigo Estudiante:");
    estu.setCodigoE(var5);
    var6 = JOptionPane.showInputDialog(null, "Carrera:");
    estu.setCarreraE(var6);
    var7 = JOptionPane.showInputDialog(null, "Semestre:");
    estu.setSemstreE(var7);
    // Materia
    String var8, var9, var10;
    var8 = JOptionPane.showInputDialog(null, "Materia 1:");
    mat.setM1(var8);
    var9 = JOptionPane.showInputDialog(null, "Materia 2:");
    mat.setM1(var9);
    var10 = JOptionPane.showInputDialog(null, "Materia 3:");
    mat.setM1(var10);
    // Notas
    Double var11, var12, var13;
    var11 = Double.valueOf(JOptionPane.showInputDialog(null, "Promedio de " + var8));
    not.setPgr1(var11);
    var12 = Double.valueOf(JOptionPane.showInputDialog(null, "Promedio de " + var9));
    not.setPgr2(var12);
    var13 = Double.valueOf(JOptionPane.showInputDialog(null, "Promedio de " + var10));
    not.setPgr3(var13);


    System.out.println("Universidad " + " Estudiante " + "         Materia " + "            Notas" + "\n"
            + var1 + "          " + var4 + "           " + var8 + "               " + var11 + "\n"
            + var2 + "          " + var5 + "           " + var9 + "               " + var11 + "\n"
            + var3 + "          " + var6 + "           " + var10 + "              " + var11 + "\n"
            + "               " + var7 + "\n");

    opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseas ingresar mas? digita 1 para si"));


}while (opcion == 1);
    }
}
