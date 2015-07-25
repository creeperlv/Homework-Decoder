package com.Studio2048.HomeworkDecoder.English;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Robot;
import java.awt.Toolkit;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import com.Studio2048.HomeworkDecoder.Objects;
import com.Studio2048.HomeworkDecoder.English.Composition.Decoder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.FlowLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.image.BufferedImage;
import java.awt.GridLayout;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.Properties;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class ComProgramPro extends JFrame {

	public JPanel contentPane;
	public static JPanel panel_2;
	public static JPanel panel_3;
	public static JPanel panel;
	public static JPanel panel_1;

	public static ImageIcon Working = new ImageIcon(
			ComProgramPro.class
					.getResource("/com/Studio2048/HomeworkDecoder/Res/"
							+ Objects.Theme + "/SelAllL.png"));

	public static ComProgramPro frame;

	public static JTextArea textArea;

	public static JSpinner spinner = new JSpinner();

	public static JLabel lblMessageBox = new JLabel("");
	public static JLabel lblDecode = new JLabel("Start");
	public static JLabel lblBugreport;
	public static JLabel lblAbout;
	public static JLabel lblExit;
	public static JLabel lblWorking = new JLabel("");

	public static boolean StopClicked = false;
	public static boolean isRunning = false;

	public static JScrollPane scrollPane;

	final static int SMALL_ICON_WIDTH = 16;
	final static int SMALL_ICON_HEIGHT = 16;
	final static int SMALL_ICON_RENDER_WIDTH = 10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Objects.isUsingPro = true;
					frame = new ComProgramPro();
					frame.setVisible(true);
				} catch (Exception e) {
					Objects.e = e;
					Objects.isException = true;
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ComProgramPro() {
//		setAlwaysOnTop(true);
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent arg0) {
				if (frame.getWidth() < 500) {
					frame.setSize(500, frame.getHeight());
				}
				if (frame.getHeight() < 400) {
					frame.setSize(frame.getWidth(), 400);
				}
				scrollPane.setBounds(32, 61, frame.getWidth() - 75,
						frame.getHeight() - 235);
				lblMessageBox.setBounds(32, frame.getHeight() - 55,
						frame.getWidth() - 75, 18);
				panel_2.setBounds(frame.getWidth() - 290,
						frame.getHeight() - 160, 250, 115);
				panel_3.setBounds(32, frame.getHeight() - 160, 200, 31);
				contentPane.updateUI();
			}
		});

		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			Objects.e = e;
			Objects.isException = true;
		}
		textArea = new JTextArea();
		ArrayList<Image> list = new ArrayList<Image>();
		list.add(Toolkit
				.getDefaultToolkit()
				.getImage(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/IconECD.png")));
		list.add(Toolkit
				.getDefaultToolkit()
				.getImage(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/IconECD_16.png")));

		setIconImages(list);
		// setIconImage(Toolkit
		// .getDefaultToolkit()
		// .getImage(
		// ComProgram.class
		// .getResource("/com/Studio2048/HomeworkDecoder/Res/IconECD.png")));
		setTitle("Composition Decoder Pro " + Objects.Versions[1] + " "
				+ Objects.status[1] + " Build:" + Objects.builds[1]
				+ " Author: 2048 Studio");
		// setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 550);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblEnglishCompositionDecoder = new JLabel(
				"English Composition Decoder Pro");
		lblEnglishCompositionDecoder.setForeground(Color.GRAY);
		lblEnglishCompositionDecoder.setFont(new Font("Microsoft YaHei UI",
				Font.PLAIN, 28));
		lblEnglishCompositionDecoder.setBounds(9, 12, 453, 37);
		panel.add(lblEnglishCompositionDecoder);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 61, 555, 321);
		panel.add(scrollPane);

		panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		panel_1.setBorder(new MatteBorder(0, 0, 1, 0,
				(Color) new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		scrollPane.setColumnHeaderView(panel_1);

		JLabel lblInputContent = new JLabel("Input Content:");
		lblInputContent.setForeground(Color.GRAY);
		lblInputContent.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
		panel_1.add(lblInputContent);

		final JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label.setIcon(new ImageIcon(ComProgramPro.class
						.getResource("/com/Studio2048/HomeworkDecoder/Res/"
								+ Objects.Theme + "/SelAllL.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				label.setIcon(new ImageIcon(ComProgramPro.class
						.getResource("/com/Studio2048/HomeworkDecoder/Res/"
								+ Objects.Theme + "/SelAll.png")));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				textArea.selectAll();
			}
		});
		label.setIcon(new ImageIcon(ComProgramPro.class
				.getResource("/com/Studio2048/HomeworkDecoder/Res/"
						+ Objects.Theme + "/SelAll.png")));
		panel_1.add(label);

		final JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label_1.setIcon(new ImageIcon(ComProgramPro.class
						.getResource("/com/Studio2048/HomeworkDecoder/Res/"
								+ Objects.Theme + "/PasteL.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				label_1.setIcon(new ImageIcon(ComProgramPro.class
						.getResource("/com/Studio2048/HomeworkDecoder/Res/"
								+ Objects.Theme + "/Paste.png")));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				textArea.paste();
			}
		});
		label_1.setIcon(new ImageIcon(ComProgramPro.class
				.getResource("/com/Studio2048/HomeworkDecoder/Res/"
						+ Objects.Theme + "/Paste.png")));
		panel_1.add(label_1);

		final JLabel label_2 = new JLabel("");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label_2.setIcon(new ImageIcon(ComProgramPro.class
						.getResource("/com/Studio2048/HomeworkDecoder/Res/"
								+ Objects.Theme + "/DelL.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				label_2.setIcon(new ImageIcon(ComProgramPro.class
						.getResource("/com/Studio2048/HomeworkDecoder/Res/"
								+ Objects.Theme + "/Del.png")));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				textArea.setText(null);
			}
		});
		label_2.setIcon(new ImageIcon(ComProgramPro.class
				.getResource("/com/Studio2048/HomeworkDecoder/Res/"
						+ Objects.Theme + "/Del.png")));
		panel_1.add(label_2);
		textArea.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		textArea.setForeground(Color.GRAY);

		textArea.setLineWrap(true);
		scrollPane.setViewportView(textArea);

		lblMessageBox.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
		lblMessageBox.setBounds(32, 493, 555, 18);
		panel.add(lblMessageBox);

		panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(342, 392, 245, 115);
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		lblDecode.setForeground(Color.BLACK);
		panel_2.add(lblDecode);

		lblDecode.setVerticalTextPosition(SwingConstants.CENTER);
		lblDecode.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDecode.setIconTextGap(-30);
		lblDecode.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 15));
		lblDecode.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if (isRunning == false)
					lblDecode.setIcon(new ImageIcon(ComProgramPro.class
							.getResource("/com/Studio2048/HomeworkDecoder/Res/"
									+ Objects.Theme + "/ButtonDB.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (isRunning == false)
					lblDecode.setIcon(new ImageIcon(ComProgramPro.class
							.getResource("/com/Studio2048/HomeworkDecoder/Res/"
									+ Objects.Theme + "/Button.png")));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				if (isRunning == false) {
					File f = new File("./Tip.jar");
					if (!((Integer) spinner.getValue() <= 1)) {
						try {
							Runtime.getRuntime()
									.exec("javaw -jar \""
											+ f.getCanonicalPath()
											+ "\" \"Composition Decoder Pro\" \"<html><body><p><font size=8>Get Ready!\" 1500 Ignore NULL false \"./Hide.js\" \"./No.js\"");
						} catch (Exception e1) {
							e1.printStackTrace();
						}
					}
					lblWorking.setIcon(Working);
					Thread t = new activing();
					t.start();
				}
			}
		});
		lblDecode.setIcon(new ImageIcon(ComProgramPro.class
				.getResource("/com/Studio2048/HomeworkDecoder/Res/"
						+ Objects.Theme + "/Button.png")));

		final JLabel lblStop = new JLabel("Stop");
		lblStop.setForeground(Color.BLACK);
		panel_2.add(lblStop);
		lblStop.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblStop.setIcon(new ImageIcon(ComProgramPro.class
						.getResource("/com/Studio2048/HomeworkDecoder/Res/"
								+ Objects.Theme + "/ButtonL.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblStop.setIcon(new ImageIcon(ComProgramPro.class
						.getResource("/com/Studio2048/HomeworkDecoder/Res/"
								+ Objects.Theme + "/Button.png")));
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				lblWorking.setIcon(null);
				StopClicked = true;
			}
		});
		lblStop.setIcon(new ImageIcon(ComProgramPro.class
				.getResource("/com/Studio2048/HomeworkDecoder/Res/"
						+ Objects.Theme + "/Button.png")));
		lblStop.setVerticalTextPosition(SwingConstants.CENTER);
		lblStop.setIconTextGap(-30);
		lblStop.setHorizontalTextPosition(SwingConstants.CENTER);
		lblStop.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 15));

		final JLabel lblDecoder = new JLabel("Decoder");
		lblDecoder.setForeground(Color.BLACK);
		panel_2.add(lblDecoder);
		lblDecoder.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblDecoder.setIcon(new ImageIcon(ComProgramPro.class
						.getResource("/com/Studio2048/HomeworkDecoder/Res/"
								+ Objects.Theme + "/ButtonL.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblDecoder.setIcon(new ImageIcon(ComProgramPro.class
						.getResource("/com/Studio2048/HomeworkDecoder/Res/"
								+ Objects.Theme + "/Button.png")));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				ComProgram.frame = new ComProgram();
				ComProgram.frame.setVisible(true);
			}
		});
		lblDecoder.setIcon(new ImageIcon(ComProgramPro.class
				.getResource("/com/Studio2048/HomeworkDecoder/Res/"
						+ Objects.Theme + "/Button.png")));
		lblDecoder.setVerticalTextPosition(SwingConstants.CENTER);
		lblDecoder.setIconTextGap(-30);
		lblDecoder.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDecoder.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 15));

		final JLabel lblAeroLight = new JLabel("Aero Light");
		lblAeroLight.setForeground(Color.BLACK);
		lblAeroLight.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblAeroLight.setIcon(new ImageIcon(ComProgramPro.class
						.getResource("/com/Studio2048/HomeworkDecoder/Res/"
								+ Objects.Theme + "/ButtonL.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblAeroLight.setIcon(new ImageIcon(ComProgramPro.class
						.getResource("/com/Studio2048/HomeworkDecoder/Res/"
								+ Objects.Theme + "/Button.png")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				if (Objects.Theme.equals("AeroGlass")) {
					lblAeroLight.setText("Dark");
					Objects.Theme = "Dark";
					contentPane.updateUI();
					panel.setBackground(Color.BLACK);
					textArea.setBackground(Color.BLACK);
					panel_1.setBackground(Color.BLACK);
					lblAbout.setForeground(Color.GRAY);
					lblExit.setForeground(Color.GRAY);
					lblDecode.setForeground(Color.GRAY);
					lblStop.setForeground(Color.GRAY);
					lblAeroLight.setForeground(Color.GRAY);
					lblDecoder.setForeground(Color.GRAY);
					lblBugreport.setForeground(Color.GRAY);
				} else if (Objects.Theme.equals("Dark")) {
					lblAeroLight.setText("Aero Light");
					Objects.Theme = "AeroLight";
					contentPane.updateUI();
					lblAbout.setForeground(Color.BLACK);
					lblExit.setForeground(Color.BLACK);
					lblDecode.setForeground(Color.BLACK);
					lblStop.setForeground(Color.BLACK);
					lblAeroLight.setForeground(Color.BLACK);
					lblDecoder.setForeground(Color.BLACK);
					lblBugreport.setForeground(Color.BLACK);
					panel.setBackground(Color.WHITE);
					panel_1.setBackground(Color.WHITE);
					textArea.setBackground(Color.WHITE);
				} else if (Objects.Theme.equals("AeroLight")) {
					lblAeroLight.setText("Aero Glass");
					Objects.Theme = "AeroGlass";
					contentPane.updateUI();
					panel.setBackground(Color.WHITE);
					panel_1.setBackground(Color.WHITE);
					textArea.setBackground(Color.WHITE);
				}
				label_2.setIcon(new ImageIcon(ComProgramPro.class
						.getResource("/com/Studio2048/HomeworkDecoder/Res/"
								+ Objects.Theme + "/Del.png")));
				label_1.setIcon(new ImageIcon(ComProgramPro.class
						.getResource("/com/Studio2048/HomeworkDecoder/Res/"
								+ Objects.Theme + "/Paste.png")));
				label.setIcon(new ImageIcon(ComProgramPro.class
						.getResource("/com/Studio2048/HomeworkDecoder/Res/"
								+ Objects.Theme + "/SelAll.png")));
				lblAbout.setIcon(new ImageIcon(ComProgramPro.class
						.getResource("/com/Studio2048/HomeworkDecoder/Res/"
								+ Objects.Theme + "/Button.png")));
				lblExit.setIcon(new ImageIcon(ComProgramPro.class
						.getResource("/com/Studio2048/HomeworkDecoder/Res/"
								+ Objects.Theme + "/Button.png")));
				lblDecode.setIcon(new ImageIcon(ComProgramPro.class
						.getResource("/com/Studio2048/HomeworkDecoder/Res/"
								+ Objects.Theme + "/Button.png")));
				lblStop.setIcon(new ImageIcon(ComProgramPro.class
						.getResource("/com/Studio2048/HomeworkDecoder/Res/"
								+ Objects.Theme + "/Button.png")));
				lblAeroLight.setIcon(new ImageIcon(ComProgramPro.class
						.getResource("/com/Studio2048/HomeworkDecoder/Res/"
								+ Objects.Theme + "/ButtonL.png")));
				lblDecoder.setIcon(new ImageIcon(ComProgramPro.class
						.getResource("/com/Studio2048/HomeworkDecoder/Res/"
								+ Objects.Theme + "/Button.png")));
				lblBugreport.setIcon(new ImageIcon(ComProgramPro.class
						.getResource("/com/Studio2048/HomeworkDecoder/Res/"
								+ Objects.Theme + "/Button.png")));
			}
		});
		lblAeroLight.setIcon(new ImageIcon(ComProgramPro.class
				.getResource("/com/Studio2048/HomeworkDecoder/Res/"
						+ Objects.Theme + "/Button.png")));
		lblAeroLight.setVerticalTextPosition(SwingConstants.CENTER);
		lblAeroLight.setIconTextGap(-30);
		lblAeroLight.setHorizontalTextPosition(SwingConstants.CENTER);
		lblAeroLight.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 15));
		panel_2.add(lblAeroLight);

		lblBugreport = new JLabel("Bug Report");
		lblBugreport.setForeground(Color.BLACK);
		panel_2.add(lblBugreport);
		lblBugreport.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblBugreport.setIcon(new ImageIcon(ComProgramPro.class
						.getResource("/com/Studio2048/HomeworkDecoder/Res/"
								+ Objects.Theme + "/ButtonL.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblBugreport.setIcon(new ImageIcon(ComProgramPro.class
						.getResource("/com/Studio2048/HomeworkDecoder/Res/"
								+ Objects.Theme + "/Button.png")));
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				lblBugreport.setIcon(new ImageIcon(ComProgramPro.class
						.getResource("/com/Studio2048/HomeworkDecoder/Res/"
								+ Objects.Theme + "/Button.png")));
				contentPane.updateUI();
				SimpleDateFormat df = new SimpleDateFormat(
						"yyyy_MM_dd_HH_mm_ss");
				String FileName = null;
				String FileName2 = null;
				try {
					Thread t = new Flashing();
					t.start();
					Robot Bug = new Robot();
					BufferedImage screen = Bug.createScreenCapture(frame
							.getBounds());
					Graphics g = screen.getGraphics();
					g.setColor(Color.GRAY);
					for (int i = 1; i < 100; i = i + 2)
						g.drawLine(1, i, 400, i);
					Properties props = System.getProperties();
					g.setFont(new Font("System", Font.PLAIN, 13));
					g.setColor(Color.ORANGE);
					g.drawString("Com Dec Pro " + Objects.builds[1] + " "
							+ Objects.status[1] + " Part:" + Objects.Part[1]
							+ " Key:" + Objects.Key, 12, 12);
					g.setColor(Color.red);
					g.drawString("Com Dec Pro " + Objects.builds[1] + " "
							+ Objects.status[1] + " Part:" + Objects.Part[1]
							+ " Key:" + Objects.Key, 13, 13);
					g.setColor(Color.ORANGE);
					g.drawString("System:" + props.getProperty("os.name") + " "
							+ props.getProperty("os.arch"), 12, 24);
					g.setColor(Color.red);
					g.drawString("System:" + props.getProperty("os.name") + " "
							+ props.getProperty("os.arch"), 13, 25);
					g.setColor(Color.ORANGE);
					g.drawString("Java(" + props.getProperty("java.vendor")
							+ "):" + props.getProperty("java.version")
							+ " JVM:" + props.getProperty("java.vm.version"),
							12, 36);
					g.setColor(Color.red);
					g.drawString("Java(" + props.getProperty("java.vendor")
							+ "):" + props.getProperty("java.version")
							+ " JVM:" + props.getProperty("java.vm.version"),
							13, 37);
					g.setColor(Color.ORANGE);
					g.drawString("User:" + props.getProperty("user.name"), 12,
							48);
					g.setColor(Color.red);
					g.drawString("User:" + props.getProperty("user.name"), 13,
							49);
					g.setColor(Color.ORANGE);
					g.drawString("Free Memory:"
							+ Runtime.getRuntime().freeMemory()
							+ "B TotalMemory:"
							+ Runtime.getRuntime().totalMemory() + "B", 12, 60);
					g.setColor(Color.red);
					g.drawString("Free Memory:"
							+ Runtime.getRuntime().freeMemory()
							+ "B TotalMemory:"
							+ Runtime.getRuntime().totalMemory() + "B", 13, 61);
					g.setColor(Color.ORANGE);
					g.drawString("ProEdition:" + Objects.isUsingPro, 12, 72);
					g.setColor(Color.red);
					g.drawString("ProEdition:" + Objects.isUsingPro, 13, 73);
					g.setColor(Color.ORANGE);
					g.drawString("Exception:" + Objects.isException
							+ " Detail:" + Objects.e.getMessage(), 12, 84);
					g.setColor(Color.red);
					g.drawString("Exception:" + Objects.isException
							+ " Detail:" + Objects.e.getMessage(), 13, 85);
					g.setColor(Color.ORANGE);
					g.drawString("Theme:" + Objects.Theme, 12, 96);
					g.setColor(Color.red);
					g.drawString("Theme:" + Objects.Theme, 13, 97);
					g.setColor(Color.GRAY);
					System.setProperty("Vendor", "2048 Studio");
					for (int i = 1; i < 16; i = i + 2)
						g.drawLine((frame.getWidth()) - 155,
								(frame.getHeight()) - 37 + i,
								(frame.getWidth()) - 155 + 125,
								(frame.getHeight()) - 37 + i);
					g.setColor(Color.ORANGE);
					g.drawString("Vendor:" + props.getProperty("Vendor"),
							(int) (frame.getWidth()) - 150,
							(int) (frame.getHeight()) - 25);
					g.setColor(Color.red);
					g.drawString("Vendor:" + props.getProperty("Vendor"),
							(int) (frame.getWidth()) - 149,
							(int) (frame.getHeight()) - 24);

					FileName="./Pro_Screenshot_"
							+ df.format(new Date()) + ".png";
					ImageIO.write(screen, "png", new File(FileName));

					BufferedImage image = new BufferedImage(1000, 800, 1);
					Graphics G = image.getGraphics();
					G.setColor(Color.LIGHT_GRAY);
					G.fillRect(0, 0, 1000, 800);
					G.setColor(Color.WHITE);
					for (int i = 0; i < 800; i = i + 2) {
						G.drawLine(0, i, 1000, i);
					}
					G.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 40));
					for (int i = 0; i < 800; i = i + 44) {
						G.drawString("2048 Studio", 0, i);
					}
					for (int i = 0; i < 800; i = i + 44) {
						G.drawString("2048 Studio", 250, i);
					}
					for (int i = 0; i < 800; i = i + 44) {
						G.drawString("2048 Studio", 500, i);
					}
					for (int i = 0; i < 800; i = i + 44) {
						G.drawString("2048 Studio", 750, i);
					}
					G.setFont(new Font("Simsum", Font.PLAIN, 12));
					G.setColor(Color.RED);
					String Frame = frame.toString();
					String Panel = panel.toString();
					String TextArea = textArea.toString();
					String ObjectsI = Objects.class.toString() + " HashCode:"
							+ Objects.class.hashCode();
					String DecoderI = Decoder.class.toString() + " HashCode:"
							+ Decoder.class.hashCode();
					String CPP = ComProgramPro.class.toString() + " HashCode:"
							+ ComProgramPro.class.hashCode() + " Frame(s):"
							+ ComProgramPro.getFrames().toString();
					int LastTextY = 0;
					// String JAR="Hash code:"+new
					// File("./ComProgramPro.jar").hashCode();
					G.drawString("Frame:" + Frame.substring(0, 100), 15, 15);
					G.drawString("\t\t" + Frame.substring(100, 200), 50, 30);
					G.drawString("Panel:" + Panel.substring(0, 100), 15, 45);
					G.drawString("\t\t" + Panel.substring(100, Panel.length()),
							50, 60);
					G.drawString("TextArea:" + TextArea.substring(0, 100), 15,
							75);
					G.drawString("\t\t" + TextArea.substring(100, 200), 60, 90);
					G.drawString("\t\t" + TextArea.substring(200, 300), 60, 105);
					G.drawString("\t\t" + TextArea.substring(300, 400), 60, 120);
					G.drawString("\t\t" + TextArea.substring(400, 500), 60, 135);
					G.drawString("\t\t" + TextArea.substring(500, 600), 60, 150);
					G.drawString(
							"\t\t" + TextArea.substring(600, TextArea.length()),
							60, 165);
					G.setColor(Color.BLUE);
					G.drawString("Classes", 1, 180);
					G.drawLine(50, 175, 900, 175);
					G.setColor(Color.BLACK);
					G.drawString("Objects.Class:", 14, 194);
					G.setColor(Color.BLUE);
					G.drawString("Objects.Class:", 15, 195);
					G.setColor(Color.RED);
					G.drawString(ObjectsI, 100, 195);
					G.setColor(Color.BLACK);
					G.drawString("ComProgramPro.Class:", 14, 209);
					G.setColor(Color.BLUE);
					G.drawString("ComProgramPro.Class:", 15, 210);
					G.setColor(Color.RED);
					G.drawString(CPP, 150, 210);
					G.setColor(Color.BLACK);
					G.drawString("Decoder.Class:", 14, 224);
					G.setColor(Color.BLUE);
					G.drawString("Decoder.Class:", 15, 225);
					G.setColor(Color.RED);
					G.drawString(DecoderI, 100, 225);
					G.drawString("JAR", 1, 240);
					G.drawLine(50, 235, 900, 235);
					G.setColor(Color.BLACK);
					G.drawString("JAR:", 14, 254);
					G.setColor(Color.BLUE);
					G.drawString("JAR:", 15, 255);
					G.setColor(Color.RED);
					// G.drawString(JAR,50,255);
					G.setColor(Color.GREEN);
					G.drawString("APIs", 1, 270);
					G.drawLine(50, 265, 900, 265);
					G.setColor(Color.BLACK);
					G.drawString("Decoder", 14, 284);
					G.setColor(Color.BLUE);
					G.drawString("Decoder", 15, 285);
					Method[] DC = Decoder.class.getDeclaredMethods();
					for (int i = 0; i < DC.length; i++) {
						G.setColor(Color.BLUE);
						G.drawString(DC[i].getName() + "()", 30, 300 + i * 15);
					}
					G.setColor(Color.BLACK);
					G.drawString("System Info", 1, 300 + DC.length * 15);
					G.drawLine(75, 295 + DC.length * 15, 900,
							295 + DC.length * 15);
					G.drawString(
							"Threads:" + Thread.getAllStackTraces().size(), 15,
							315 + DC.length * 15);
					Map<Thread, StackTraceElement[]> Threads = Thread
							.getAllStackTraces();
					for (int i = 0; i < Threads.size(); i++) {
						G.drawString(Threads.values().toArray()[i] + "", 30,
								LastTextY = 330 + DC.length * 15 + i * 15);
					}
					G.drawString("System Print Stream:" + System.out.toString()
							+ " checkError:" + System.out.checkError(), 15,
							LastTextY += 15);
					G.drawString("System InPut Stream:" + System.in.toString()
							+ " Available:" + System.in.available(), 15,
							LastTextY += 15);
					G.drawString("System Error Stream:" + System.err.toString()
							+ " checkError:" + System.err.checkError(), 15,
							LastTextY += 15);
					FileName2="./Pro_Screenshot_"
							+ df.format(new Date()) + "_2.png";
					ImageIO.write(image, "png", new File(FileName2));
					// JOptionPane.showMessageDialog(null,
					// "The Screenshot has been created at ./Pro_Screenshot_"
					// + df.format(new Date()) + ".png",
					// "Bug Report Image Creater",
					// JOptionPane.WARNING_MESSAGE);
				} catch (Exception e) {
					Objects.e = e;
					Objects.isException = true;
					e.printStackTrace();
				}
				try {
					File JS=new File("./ErrorD.js");
					BufferedWriter bw=new BufferedWriter(new FileWriter(JS));
					bw.write("com.Studio2048.Tip.Tip.explode(\"<html><body><p><font size=4 color=\\\"white\\\">" +
							"<html><body><p>The images has been created at"+FileName+" and "+FileName2+"! Would you upload them?\",\"Of Course\",\"./URL.js\");");
					bw.flush();
					bw.close();
					File f = new File("./Tip.jar");
					Runtime.getRuntime()
							.exec("javaw -jar \""
									+ f.getCanonicalPath()
									+ "\" \"<html><body><p><font size=5>Composition Decoder Pro Bug Reporter\" \"<html><body><p><font size=5 color=\\\"white\\\">The images has been created ! Would you upload them?\" 0 "
									+ "\"Details\" Ignore true \"./ErrorD.js\" \"./Hide.js\"");

					// Runtime.getRuntime()
					// .exec("explorer.exe \"https://www.github.com/creeperlv/Homework-Decoder/issues\"");
				} catch (Exception e1) {
					Objects.e = e1;
					Objects.isException = true;
					e1.printStackTrace();
				}
			}
		});
		lblBugreport.setIcon(new ImageIcon(ComProgramPro.class
				.getResource("/com/Studio2048/HomeworkDecoder/Res/"
						+ Objects.Theme + "/Button.png")));
		lblBugreport.setVerticalTextPosition(SwingConstants.CENTER);
		lblBugreport.setIconTextGap(-30);
		lblBugreport.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBugreport.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 15));

		lblAbout = new JLabel("About");
		lblAbout.setForeground(Color.BLACK);
		panel_2.add(lblAbout);
		lblAbout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblAbout.setIcon(new ImageIcon(ComProgramPro.class
						.getResource("/com/Studio2048/HomeworkDecoder/Res/"
								+ Objects.Theme + "/ButtonL.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblAbout.setIcon(new ImageIcon(ComProgramPro.class
						.getResource("/com/Studio2048/HomeworkDecoder/Res/"
								+ Objects.Theme + "/Button.png")));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"<html><body><p><font face=\"Microsoft YaHei UI\" size=6><center>Composition Decoder Pro "
										+ Objects.status[1]
										+ "</p><p><font face=\"Microsoft YaHei UI\" size=3><center>Version:"
										+ Objects.Versions[1]
										+ "</p><p><font face=\"Microsoft YaHei UI\" size=3><center>Build:"
										+ Objects.builds[1]
										+ "</p><p><font face=\"Microsoft YaHei UI\" size=3><center>Author:2048 Studio</p>"
										+ "</p><p><font face=\"Microsoft YaHei UI\" size=3><center>http://www.github.com/creeperlv/Homework-Decoder</p>"
										+ "</p><p><font face=\"Microsoft YaHei UI\" size=3><center>Copyright(C)2013-2015 2048Studio</p>"
										+ "</p><p><font face=\"Microsoft YaHei UI\" size=3><center>All rights reserved.</p>"
										+ "<p><br/><font face=\"Microsoft YaHei UI\" size=3><center>This program can automatic control the "
										+ "Keybroad to input text you want to input.",
								"Composition Decoder Pro",
								JOptionPane.PLAIN_MESSAGE,
								new ImageIcon(
										ComProgramPro.class
												.getResource("/com/Studio2048/HomeworkDecoder/Res/Studio2048.png")));
			}
		});
		lblAbout.setIcon(new ImageIcon(ComProgramPro.class
				.getResource("/com/Studio2048/HomeworkDecoder/Res/"
						+ Objects.Theme + "/Button.png")));
		lblAbout.setVerticalTextPosition(SwingConstants.CENTER);
		lblAbout.setIconTextGap(-30);
		lblAbout.setHorizontalTextPosition(SwingConstants.CENTER);
		lblAbout.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 15));

		lblExit = new JLabel("Exit");
		lblExit.setForeground(Color.BLACK);
		panel_2.add(lblExit);
		lblExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblExit.setIcon(new ImageIcon(ComProgramPro.class
						.getResource("/com/Studio2048/HomeworkDecoder/Res/"
								+ Objects.Theme + "/ButtonL.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblExit.setIcon(new ImageIcon(ComProgramPro.class
						.getResource("/com/Studio2048/HomeworkDecoder/Res/"
								+ Objects.Theme + "/Button.png")));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				System.exit(0);
			}
		});
		lblExit.setIcon(new ImageIcon(ComProgramPro.class
				.getResource("/com/Studio2048/HomeworkDecoder/Res/"
						+ Objects.Theme + "/Button.png")));
		lblExit.setVerticalTextPosition(SwingConstants.CENTER);
		lblExit.setIconTextGap(-30);
		lblExit.setHorizontalTextPosition(SwingConstants.CENTER);
		lblExit.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 15));

		panel_3 = new JPanel();
		panel_3.setOpaque(false);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(32, 392, 200, 31);
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));

		JLabel lblDelay = new JLabel("Delay");
		lblDelay.setForeground(Color.GRAY);
		panel_3.add(lblDelay, BorderLayout.WEST);
		lblDelay.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));

		JLabel lblSec = new JLabel("Sec.");
		lblSec.setForeground(Color.GRAY);
		panel_3.add(lblSec, BorderLayout.EAST);
		lblSec.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));

		spinner = new JSpinner();
		spinner.setOpaque(false);
		spinner.setForeground(Color.GRAY);
		spinner.setBackground(Color.BLACK);
		panel_3.add(spinner, BorderLayout.CENTER);

		spinner.setModel(new SpinnerNumberModel(3, 0, 100, 1));
		Working = new ImageIcon(
				ComProgramPro.class
						.getResource("/com/Studio2048/HomeworkDecoder/Res/"
								+ Objects.Theme + "/SelAllL.png"));
		// lblWorking.setIcon(Working);
		lblWorking.setBounds(466, 12, 37, 37);
		panel.add(lblWorking);

		JButton btnTestJs = new JButton("TEST");
		btnTestJs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Common.request(Common.PART_FULL_CTRL, 0);
				// Common.request(Common.PART_FILE, 0);
				// Common.request(Common.PART_FRAME_CONTROL, 0);
				// Common.request(Common.PART_NETWORK, 0);
				// System.out.println(Objects.Requests.get(0));
				File f = new File("./Tip.jar");
				try {
					Runtime.getRuntime()
							.exec("javaw -jar \""
									+ f.getCanonicalPath()
									+ "\" Testing \"<html><body><p><font size=7>Work Complete!\" 4000 Ignore NULL false \"./Hide.js\" \"./No.js\"");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnTestJs.setBounds(494, 25, 93, 23);
		// panel.add(btnTestJs);

		File f = new File("./Tip.jar");
		try {
			Runtime.getRuntime()
					.exec("javaw -jar \""
							+ f.getCanonicalPath()
							+ "\" \"Composition Decoder Pro\""
							+ " \"<html><body><p><font size=4 color=\"white\">This is a free trial version, you can use it for free,but we do not take any responsibility if it breaks your computer."
							+ "\" 0 Detail Dismiss true \"./Detail.js\" \"./Hide.js\"");
		} catch (Exception e) {
			e.printStackTrace();
		}

		Thread t = new Working();
		t.start();
	}

	class activing extends Thread {
		public void run() {
			ComProgramPro.isRunning = true;
			try {
				StopClicked = false;
				Robot r = new Robot();
				String content = ComProgramPro.textArea.getText();
				ComProgramPro.lblDecode
						.setIcon(new ImageIcon(
								ComProgramPro.class
										.getResource("/com/Studio2048/HomeworkDecoder/Res/"
												+ Objects.Theme
												+ "/ButtonG.png")));
				ComProgramPro.frame.contentPane.updateUI();
				r.delay((Integer) ComProgramPro.spinner.getValue() * 1000);
				ComProgramPro.lblDecode
						.setIcon(new ImageIcon(
								ComProgramPro.class
										.getResource("/com/Studio2048/HomeworkDecoder/Res/"
												+ Objects.Theme
												+ "/ButtonB.png")));
				ComProgramPro.frame.contentPane.updateUI();
				for (int i = 0; i < content.length(); i++) {
					if (StopClicked == true) {
						lblWorking.setIcon(null);
						isRunning = false;
						StopClicked = false;
						File f = new File("./Tip.jar");
						try {
							Runtime.getRuntime()
									.exec("javaw -jar \""
											+ f.getCanonicalPath()
											+ "\" \"Composition Decoder Pro\" \"Typing terminated!\" 3000 Ignore NULL true \"./Hide.js\" \"./No.js\"");
						} catch (Exception e) {
							e.printStackTrace();
						}
						ComProgramPro.lblDecode
								.setIcon(new ImageIcon(
										ComProgramPro.class
												.getResource("/com/Studio2048/HomeworkDecoder/Res/"
														+ Objects.Theme
														+ "/ButtonR.png")));
						ComProgramPro.lblMessageBox
								.setText("<html><body><p style=\"color:red\">Typing terminated!");
						ComProgramPro.frame.contentPane.updateUI();
						try {
							sleep(3000);
							ComProgramPro.lblMessageBox.setText(null);
						} catch (InterruptedException e) {
							Objects.e = e;
							Objects.isException = true;
						}
						ComProgramPro.lblDecode
								.setIcon(new ImageIcon(
										ComProgramPro.class
												.getResource("/com/Studio2048/HomeworkDecoder/Res/"
														+ Objects.Theme
														+ "/Button.png")));
						ComProgramPro.lblMessageBox.setText("");
						return;
					}
					String Str = content.substring(i, i + 1);
					char c = Str.toCharArray()[0];
					if (Str.equals("\"")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
						Decoder.KeyPress(Decoder.ActionKey('\''), r);
						sleep(0, 1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
					} else if (Str.equals("(")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
						Decoder.KeyPress(Decoder.ActionKey('9'), r);
						sleep(0, 1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
					} else if (Str.equals("\\")) {
						Decoder.KeyPress(Decoder.ActionKey('\\'), r);
						sleep(0, 1);
					} else if (Str.equals(")")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
						Decoder.KeyPress(Decoder.ActionKey('0'), r);
						sleep(0, 1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
					} else if (Str.equals("\"")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
						Decoder.KeyPress(Decoder.ActionKey('\''), r);
						sleep(0, 1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
					} else if (Str.equals("{")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
						Decoder.KeyPress(Decoder.ActionKey('['), r);
						sleep(0, 1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
					} else if (Str.equals("}")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
						Decoder.KeyPress(Decoder.ActionKey(']'), r);
						sleep(0, 1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
					} else if (Str.equals("<")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
						Decoder.KeyPress(Decoder.ActionKey(','), r);
						sleep(0, 1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
					} else if (Str.equals(">")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
						Decoder.KeyPress(Decoder.ActionKey('.'), r);
						sleep(0, 1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
					} else if (Str.equals("!")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
						Decoder.KeyPress(Decoder.ActionKey('1'), r);
						sleep(0, 1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
					} else if (Str.equals("$")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
						Decoder.KeyPress(Decoder.ActionKey('4'), r);
						sleep(0, 1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
					} else if (Str.equals("@")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
						Decoder.KeyPress(Decoder.ActionKey('2'), r);
						sleep(0, 1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
					} else if (Str.equals("%")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
						Decoder.KeyPress(Decoder.ActionKey('5'), r);
						sleep(0, 1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
					} else if (Str.equals("&")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
						Decoder.KeyPress(Decoder.ActionKey('7'), r);
						sleep(0, 1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
					} else if (Str.equals("?")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
						Decoder.KeyPress(Decoder.ActionKey('/'), r);
						sleep(0, 1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
					} else if (Str.equals(":")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
						Decoder.KeyPress(Decoder.ActionKey(';'), r);
						sleep(0, 1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
					} else if (Str.equals("*")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
						Decoder.KeyPress(Decoder.ActionKey('8'), r);
						sleep(0, 1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
					} else if (Str.equals("	")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
						Decoder.KeyPress(Decoder.ActionKey('	'), r);
						sleep(0, 1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
					} else if (Str.equals("+")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
						Decoder.KeyPress(Decoder.ActionKey('='), r);
						sleep(0, 1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
					} else if (Str.equals("\t")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
						Decoder.KeyPress(Decoder.ActionKey('	'), r);
						sleep(0, 1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
					} else if (Str.equals("_")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
						Decoder.KeyPress(Decoder.ActionKey('-'), r);
						sleep(0, 1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0, 1);
					} else if (Str.equals("\n")) {
						Decoder.KeyPress(KeyEvent.VK_ENTER, r);
						sleep(0, 1);
					} else if (!Str.toLowerCase().equals(Str)) {
						c = Str.toLowerCase().toCharArray()[0];
						Decoder.KeyPress(KeyEvent.VK_CAPS_LOCK, r);
						sleep(0, 1);
						Decoder.KeyPress(Decoder.ActionKey(c), r);
						sleep(0, 1);
						Decoder.KeyPress(KeyEvent.VK_CAPS_LOCK, r);
						sleep(0, 1);
					} else {
						Decoder.KeyPress(Decoder.ActionKey(c), r);
						sleep(0, 1);
					}
				}
				lblWorking.setIcon(null);
				File f = new File("./Tip.jar");
				try {
					Runtime.getRuntime()
							.exec("javaw -jar \""
									+ f.getCanonicalPath()
									+ "\" \"Composition Decoder Pro\" \"<html><body><p><font size=7>Work Complete!\" 1500 Ignore NULL false \"./Hide.js\" \"./No.js\"");
				} catch (Exception e) {
					e.printStackTrace();
				}
				ComProgramPro.lblMessageBox
						.setText("<html><body><p style=\"color:GRAY\">Complete!");
				for (int i = 0; i < 3; i++) {
					ComProgramPro.lblDecode
							.setIcon(new ImageIcon(
									ComProgramPro.class
											.getResource("/com/Studio2048/HomeworkDecoder/Res/"
													+ Objects.Theme
													+ "/ButtonY.png")));
					ComProgramPro.frame.contentPane.updateUI();
					sleep(500);
					ComProgramPro.lblDecode
							.setIcon(new ImageIcon(
									ComProgramPro.class
											.getResource("/com/Studio2048/HomeworkDecoder/Res/"
													+ Objects.Theme
													+ "/Button.png")));
					sleep(500);
					ComProgramPro.frame.contentPane.updateUI();
				}
				ComProgramPro.lblMessageBox.setText("");
			} catch (Exception e1) {
				try {
					BufferedWriter bw = new BufferedWriter(new FileWriter(
							new File("./Errors.js")));
					bw.write("com.Studio2048.Tip.Tip.explode(\"<html><body><p><font size=4 color=\\\"white\\\">Error happens:"
							+ e1.getMessage()
							+ "\",\"Ignore\",\"./Hide.js\");");
					bw.flush();
					bw.close();
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				File f = new File("./Tip.jar");
				try {
					Runtime.getRuntime()
							.exec("javaw -jar \""
									+ f.getCanonicalPath()
									+ "\" \"Composition Decoder Pro\""
									+ " \"<html><body><p><font size=6 color=\"white\">Error happens!"
									+ "\" 0 Detail Ignore true \"./Errors.js\" \"./Hide.js\"");
				} catch (Exception e) {
					e.printStackTrace();
				}
				Objects.e = e1;
				Objects.isException = true;
				ComProgramPro.lblDecode
						.setIcon(new ImageIcon(
								ComProgramPro.class
										.getResource("/com/Studio2048/HomeworkDecoder/Res/"
												+ Objects.Theme
												+ "/ButtonR.png")));
				ComProgramPro.lblMessageBox
						.setText("<html><body><p style=\"color:red\">Error happens:"
								+ e1.getMessage());
				ComProgramPro.frame.contentPane.updateUI();
				try {
					sleep(3000);
					ComProgramPro.lblDecode
							.setIcon(new ImageIcon(
									ComProgramPro.class
											.getResource("/com/Studio2048/HomeworkDecoder/Res/"
													+ Objects.Theme
													+ "/Button.png")));
					ComProgramPro.lblMessageBox.setText(null);
				} catch (InterruptedException e) {
					Objects.e = e;
					Objects.isException = true;
				}

				lblWorking.setIcon(null);
				e1.printStackTrace();
			}
			ComProgramPro.isRunning = false;
		}
	}

	class Flashing extends Thread {
		@SuppressWarnings("deprecation")
		public void run() {
			try {
				panel.hide();
				contentPane.updateUI();
				sleep(400);
				panel.show();
				contentPane.updateUI();
			} catch (Exception e) {
				Objects.e = e;
				e.printStackTrace();
			}
		}
	}

	class Working extends Thread {
		public void run() {
			try {
				int i = 1;
				while (true) {
					sleep(100);
					Working.setImage((Toolkit.getDefaultToolkit().getImage(ComProgramPro.class
							.getResource("/com/Studio2048/HomeworkDecoder/Res/"
									+ Objects.Theme + "/Working/" + i + ".png"))));
					frame.contentPane.updateUI();
					i++;
					if (i == 14) {
						i = 1;
					}
				}
			} catch (Exception e) {
				Objects.isException = true;
				Objects.e = e;
				e.printStackTrace();
			}
		}
	}
}
