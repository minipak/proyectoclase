package Proyecto;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;

public class Sala {
	//variables
	
	//marco y JFrame
	public static JFrame sala1=new JFrame("sala 1");
	public static JFrame sala2=new JFrame("sala 2");
	public static JPanel jp1[][]= new JPanel[10][10];
	public static JPanel jp2[][]= new JPanel[9][8];
	public JPanel jp99=new JPanel();//ultimo
	//Scrollbar
	
	public static JScrollBar sb10 = new JScrollBar();
	public static JScrollBar sb11 = new JScrollBar();
//	sb1[0] = new JScrollBar();
//	sb1[1] = new JScrollBar();
//	public static JScrollBar sb2[] = new JScrollBar[2];
	public static int x1 = sb10.getValue();
	public static int y1 = sb11.getValue();
//	public static int x2 = sb20.getValue();
//	public static int y2 = sb21.getValue();
	//botones
	public JButton jb[]=new JButton[8];
	public static JComboBox combo[]=new JComboBox[2];
	public String[] num={"1","2","3","4","5"};
	public String[] sesion={"Sesion mañana", "Sesion tarde"};
	public JTextArea tit[]=new JTextArea[2];
	public ImageIcon img1=new ImageIcon("peli1.jpg");
	
	public Sala(){
		
		////////dibujo sala 1
		for(int f=0;f<8;f++){
			for(int c=0;c<7;c++){
				jp1[f][c]=new JPanel();
				jp1[f][c].setBounds(50+(50*c),50+(50*f),49,49);
				sala1.add(jp1[f][c]);
			}
		}
		for(int f=1;f<8;f++){
			for(int c=0;c<1;c++){
				jp1[f][c].setBackground(Color.green);
				sala1.add(jp1[f][c]);
			}
		}
		for(int f=0;f<8;f++){
			for(int c=1;c<5;c++){
				jp1[f][c].setBackground(Color.green);
				sala1.add(jp1[f][c]);
			}
		}
		for(int f=0;f<6;f++){
			for(int c=5;c<6;c++){
				jp1[f][c].setBackground(Color.green);
				sala1.add(jp1[f][c]);
			}
		}
		for(int f=0;f<3;f++){
			for(int c=6;c<7;c++){
				jp1[f][c].setBackground(Color.green);
				sala1.add(jp1[f][c]);
			}
		}
		
		
		
	
		//titulo
		jp1[0][7]=new JPanel();
		jp1[0][7].setBounds(420,50,119,49);
		tit[0]=new JTextArea();
		tit[0].setText("Triple 9");
		jp1[0][7].add(tit[0]);
		sala1.add(jp1[0][7]);
		//fin titulo
		//imagen
		jp1[1][7]=new JPanel();
		jp1[1][7].setBounds(420,90,138,149);
		JLabel imgp1=new JLabel(img1);
		jp1[1][7].add(imgp1);
		sala1.add(jp1[1][7]);
		//fin imagen
		//botones
		for(int f=4;f<8;f++){
			for(int c=7;c<8;c++){
				jp1[f][c]=new JPanel();
				jp1[f][c].setBounds(420+(120*(c-7)),50+(50*f),119,49);
				sala1.add(jp1[f][c]);
			}
		}
		
		jb[0]=new JButton("Reservar");
		jb[1]=new JButton("Aceptar");
		jb[2]=new JButton("Denegar");
		combo[0]=new JComboBox(num);
		
		combo[1]=new JComboBox(sesion);
		jb[3]=new JButton("Siguiente");
		jb[4]=new JButton("Guardar");
		jb[5]=new JButton("Cargar");
		
		jb[6]=new JButton("EnCurso");
		
		jb[7]=new JButton("Salir");
		
		
		
		
		for(int i=0;i<3;i++){
			jp1[4+i][7].add(jb[i]);
			
		}
		//jb[0].addActionListener(esc);
		//jb[0].setActionCommand("a");
		jp1[7][7].add(combo[0]);
		
		for(int f=8;f<10;f++){
			for(int c=0;c<4;c++){
				jp1[f][c]=new JPanel();
				jp1[f][c].setBounds(50+(125*(c)),60+(50*f),120,49);
				sala1.add(jp1[f][c]);
				
			}
		}
		
		jp1[8][0].add(combo[1]);
		
		
		for(int i=3;i<6;i++){
			jp1[8][i-2].add(jb[i]);
		}
		jp1[9][0].add(jb[6]);
		jp1[9][3].add(jb[7]);
		//fin botones
		//inicio JScrollbar
		sb10.setOrientation(0);
		sb10.setValues(0,0,0,6);
		sb10.setBounds(50, 20, 350, 20);
		//sb10.addAdjustmentListener(esc);
		sala1.add(sb10);
		
		sb11.setOrientation(1);
		sb11.setValues(0,0,0,7);
		sb11.setBounds(20, 50, 20, 400);
		//sb11.addAdjustmentListener(esc);
		sala1.add(sb11);
		//fin JScrollBar
		sala1.add(jp99);
		sala1.setSize(750,750);
		sala1.setLocationRelativeTo(null);
		sala1.setVisible(true);
		////////fin dibujo sala 1
		
		////////dibujo sala 2
//		for(int f=2;f<9;f++){
//			for(int c=0;c<1;c++){
//				jp2[f][c].setBackground(Color.BLUE);
//				sala2.add(jp2[f][c]);
//			}
//		}
//		for(int f=0;f<9;f++){
//			for(int c=1;c<4;c++){
//				jp2[f][c].setBackground(Color.BLUE);
//				sala2.add(jp2[f][c]);
//			}
//		}
//		for(int f=0;f<6;f++){
//			for(int c=4;c<5;c++){
//				jp2[f][c].setBackground(Color.BLUE);
//				sala2.add(jp2[f][c]);
//			}
//		}
//		for(int f=0;f<4;f++){
//			for(int c=5;c<6;c++){
//				jp2[f][c].setBackground(Color.BLUE);
//				sala2.add(jp2[f][c]);
//			}
//		}
//		
//		sala2.add(jp99);
//		sala2.setSize(750,750);
//		sala2.setLocationRelativeTo(null);
//		sala2.setVisible(true);
		////////fin dibujo sala 2
		
	}

	
	public static void main(String[] args) {
		new Sala();
	}

}
