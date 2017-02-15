package pong;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pong {

	private JFrame frame;
	private Timer timer;
	private int x;
	private int y;
	private int xv = 1;
	private int yv = 1;
	private int ypadle;
	private int ypadle1;
	private int height;
	private int width;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pong window = new Pong();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pong() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		width = frame.getWidth();
		height = frame.getHeight();
		
		JLabel lblBoll = new JLabel();
		lblBoll.setBounds((width / 2 - 25), (height / 2 - 25), 50, 50);
		frame.getContentPane().add(lblBoll);
		
		JPanel padle = new JPanel();
		padle.setBounds(25, (height / 2), 20, (int)(height * 0.2));
		frame.getContentPane().add(padle);
		
		JPanel padle1 = new JPanel();
		padle1.setBounds((width - 25), (int)(height / 2 - (height * 0.1)), 20, (int)(height * 0.2));
		frame.getContentPane().add(padle1);
		
		x = lblBoll.getX();
		y = lblBoll.getY();
		
		
		timer = new Timer(10, new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				x += xv;
				y += yv;
				
			}
		});
	}
}
