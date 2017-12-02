
package upt.edu.mx.gui;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import upt.edu.mx.conexion.ConexionBdAzure;
import upt.edu.mx.controller.DireccionController;
import upt.edu.mx.controller.UsuariosController;
import upt.edu.mx.modelo.Usuario;

/**
 *
 * @author Jose Rene
 */
public class Run {

    public static void main(String[] args) throws ClassNotFoundException {
         JFLogin jflogin= new JFLogin();
         jflogin.setVisible(true);

        // Fuente de Datos
//        DefaultPieDataset data = new DefaultPieDataset();
//        data.setValue("C", 40);
//        data.setValue("Java", 45);
//        data.setValue("Python", 15);
// 
//        // Creando el Grafico
//        JFreeChart chart = ChartFactory.createPieChart(
//         "Ejemplo Rapido de Grafico en un ChartFrame", 
//         data, 
//         true, 
//         true, 
//         false);
// 
//        // Mostrar Grafico
//        ChartFrame frame = new ChartFrame("JFreeChart", chart);
//        frame.pack();
//        frame.setVisible(true);
    }
    }
