package ff;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import javax.swing.*;

import com.sun.pdfview.*;

public class Principal extends JFrame {
	
	PagePanel panelpdf;
	JFileChooser selector;
	PDFFile pdffile;
	int indice=0;
	
	public Principal(){
            //Establecemos el tamaño del jframe
            this.setSize(500,500); 
            this.setResizable(true); 
            this.setVisible(true); 
            this.setLocationRelativeTo(null);
		panelpdf=new PagePanel();
		JMenuBar barra=new JMenuBar();
		JMenu archivo=new JMenu("GUIA DE USUARIO");
		JMenuItem ver=new JMenuItem("Mostrar guia");
                String ruta = "C:\\Users\\Jose Rene\\Documents\\NetBeansProjects\\Sistema_domotica\\src\\upt\\edu\\mx\\docs\\GuiaUso_Sistema_Domotica.pdf";
                File doc = new File(ruta);
		ver.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				indice=0;
//				selector=new JFileChooser();
//				int op=selector.showOpenDialog(Principal.this);
//				if(op==JFileChooser.APPROVE_OPTION){
					try{
//					File file = selector.getSelectedFile();
			        RandomAccessFile raf = new RandomAccessFile(doc, "r");
			        FileChannel channel = raf.getChannel();
			        ByteBuffer buf = channel.map(FileChannel.MapMode.READ_ONLY,0, channel.size());
			        pdffile = new PDFFile(buf);
			        PDFPage page = pdffile.getPage(indice);
			        panelpdf.showPage(page);
			        repaint();
					}catch(IOException ioe){
						JOptionPane.showMessageDialog(null, "Error al abrir el archivo");
					}
//				}
			}
		});
		JPanel pabajo=new JPanel();
		JButton bsiguiente=new JButton("Siguiente");
		bsiguiente.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				indice++;
				PDFPage page = pdffile.getPage(indice);
			    panelpdf.showPage(page);
			}
			
		});
		JButton banterior=new JButton("Anterior");
		banterior.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				indice--;
				PDFPage page = pdffile.getPage(indice);
			    panelpdf.showPage(page);
			}
			
		});
		pabajo.add(banterior);
		pabajo.add(bsiguiente);
		archivo.add(ver);
		barra.add(archivo);
		setJMenuBar(barra);
		add(panelpdf);
		add(pabajo,BorderLayout.SOUTH);
	}
	public static void main(String arg[]){
		Principal p=new Principal();
		p.setDefaultCloseOperation(EXIT_ON_CLOSE);
		p.setVisible(true);
		p.setBounds(0, 0, 500, 500);
		p.setLocationRelativeTo(null);
	}

}
