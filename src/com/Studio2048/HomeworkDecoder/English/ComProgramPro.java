package com.Studio2048.HomeworkDecoder.English;

import java.awt.BorderLayout;

@SuppressWarnings("serial")
public class ComProgramPro extends JFrame {

	public JPanel contentPane;
	public static JPanel panel_2;
	public static JPanel panel_3;
	public static JPanel panel;

	public static ComProgramPro frame;

	public static JTextArea textArea = new JTextArea();

	public static JSpinner spinner = new JSpinner();

	public static JLabel lblMessageBox = new JLabel("");
	public static JLabel lblDecode = new JLabel("Start");

	public static boolean StopClicked = false;
	public static boolean isRunning = false;

	public static JScrollPane scrollPane;

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
						frame.getHeight() - 160, 245, 83);
				panel_3.setBounds(32, frame.getHeight() - 160, 200, 31);
				contentPane.updateUI();
			}
		});

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			Objects.e = e;
			Objects.isException = true;
		}

		setIconImage(Toolkit
				.getDefaultToolkit()
				.getImage(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/IconECD.png")));
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
		lblEnglishCompositionDecoder.setForeground(Color.BLACK);
		lblEnglishCompositionDecoder.setFont(new Font("Microsoft YaHei UI",
				Font.PLAIN, 28));
		lblEnglishCompositionDecoder.setBounds(9, 12, 453, 37);
		panel.add(lblEnglishCompositionDecoder);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 61, 555, 321);
		panel.add(scrollPane);

		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		panel_1.setBorder(new MatteBorder(0, 0, 1, 0,
				(Color) new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		scrollPane.setColumnHeaderView(panel_1);

		JLabel lblInputContent = new JLabel("Input Content:");
		lblInputContent.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
		panel_1.add(lblInputContent);

		final JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label.setIcon(new ImageIcon(
						ComProgramPro.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/SelAllL.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				label.setIcon(new ImageIcon(
						ComProgramPro.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/SelAll.png")));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				textArea.selectAll();
			}
		});
		label.setIcon(new ImageIcon(ComProgramPro.class
				.getResource("/com/Studio2048/HomeworkDecoder/Res/SelAll.png")));
		panel_1.add(label);

		final JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label_1.setIcon(new ImageIcon(
						ComProgramPro.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/PasteL.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				label_1.setIcon(new ImageIcon(
						ComProgramPro.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/Paste.png")));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				textArea.paste();
			}
		});
		label_1.setIcon(new ImageIcon(ComProgramPro.class
				.getResource("/com/Studio2048/HomeworkDecoder/Res/Paste.png")));
		panel_1.add(label_1);

		final JLabel label_2 = new JLabel("");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label_2.setIcon(new ImageIcon(
						ComProgramPro.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/DelL.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				label_2.setIcon(new ImageIcon(
						ComProgramPro.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/Del.png")));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				textArea.setText(null);
			}
		});
		label_2.setIcon(new ImageIcon(ComProgramPro.class
				.getResource("/com/Studio2048/HomeworkDecoder/Res/Del.png")));
		panel_1.add(label_2);

		textArea.setLineWrap(true);
		scrollPane.setViewportView(textArea);

		lblMessageBox.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		lblMessageBox.setBounds(32, 493, 555, 18);
		panel.add(lblMessageBox);

		panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(342, 392, 245, 83);
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		panel_2.add(lblDecode);

		lblDecode.setVerticalTextPosition(SwingConstants.CENTER);
		lblDecode.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDecode.setIconTextGap(-30);
		lblDecode.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		lblDecode.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if (isRunning == false)
					lblDecode.setIcon(new ImageIcon(
							ComProgramPro.class
									.getResource("/com/Studio2048/HomeworkDecoder/Res/ButtonDB.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (isRunning == false)
					lblDecode.setIcon(new ImageIcon(
							ComProgramPro.class
									.getResource("/com/Studio2048/HomeworkDecoder/Res/Button.png")));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				if (isRunning == false) {
					Thread t = new activing();
					t.start();
				}
			}
		});
		lblDecode
				.setIcon(new ImageIcon(
						ComProgramPro.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/Button.png")));

		final JLabel lblStop = new JLabel("Stop");
		panel_2.add(lblStop);
		lblStop.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblStop.setIcon(new ImageIcon(
						ComProgramPro.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/ButtonL.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblStop.setIcon(new ImageIcon(
						ComProgramPro.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/Button.png")));
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				StopClicked = true;
			}
		});
		lblStop.setIcon(new ImageIcon(ComProgramPro.class
				.getResource("/com/Studio2048/HomeworkDecoder/Res/Button.png")));
		lblStop.setVerticalTextPosition(SwingConstants.CENTER);
		lblStop.setIconTextGap(-30);
		lblStop.setHorizontalTextPosition(SwingConstants.CENTER);
		lblStop.setFont(new Font("微软雅黑", Font.PLAIN, 15));

		final JLabel lblDecoder = new JLabel("Decoder");
		panel_2.add(lblDecoder);
		lblDecoder.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblDecoder.setIcon(new ImageIcon(
						ComProgramPro.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/ButtonL.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblDecoder.setIcon(new ImageIcon(
						ComProgramPro.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/Button.png")));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				ComProgram.frame = new ComProgram();
				ComProgram.frame.setVisible(true);
			}
		});
		lblDecoder
				.setIcon(new ImageIcon(
						ComProgramPro.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/Button.png")));
		lblDecoder.setVerticalTextPosition(SwingConstants.CENTER);
		lblDecoder.setIconTextGap(-30);
		lblDecoder.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDecoder.setFont(new Font("微软雅黑", Font.PLAIN, 15));

		final JLabel lblBugreport = new JLabel("Bug Report");
		panel_2.add(lblBugreport);
		lblBugreport.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblBugreport.setIcon(new ImageIcon(
						ComProgramPro.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/ButtonL.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblBugreport.setIcon(new ImageIcon(
						ComProgramPro.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/Button.png")));
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				try {
					Thread t = new Flashing();
					t.start();
					SimpleDateFormat df = new SimpleDateFormat(
							"yyyy_MM_dd_HH_mm_ss");
					Robot Bug = new Robot();
					BufferedImage screen = Bug.createScreenCapture(frame
							.getBounds());
					Graphics g = screen.getGraphics();
					g.setColor(Color.GRAY);
					for (int i = 1; i < 90; i = i + 2)
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
					g.setColor(Color.GRAY);
					for (int i = 1; i < 16; i = i + 2)
						g.drawLine((frame.getWidth()) - 155,
								(frame.getHeight()) - 37 + i,
								(frame.getWidth()) - 155 + 125,
								(frame.getHeight()) - 37 + i);
					g.setColor(Color.ORANGE);
					g.drawString("Vendor:2048 Studio",
							(int) (frame.getWidth()) - 150,
							(int) (frame.getHeight()) - 25);
					g.setColor(Color.red);
					g.drawString("Vendor:2048 Studio",
							(int) (frame.getWidth()) - 149,
							(int) (frame.getHeight()) - 24);
					ImageIO.write(screen, "png", new File("./Pro_Screenshot_"
							+ df.format(new Date()) + ".png"));
					JOptionPane.showMessageDialog(null,
							"The Screenshot has been created at ./Pro_Screenshot_"
									+ df.format(new Date()) + ".png",
							"Bug Report Image Creater",
							JOptionPane.WARNING_MESSAGE);
				} catch (Exception e) {
					Objects.e = e;
					Objects.isException = true;
					Objects.e = e;
					e.printStackTrace();
				}
				try {
					Runtime.getRuntime()
							.exec("explorer.exe \"https://www.github.com/creeperlv/Homework-Decoder/issues\"");
				} catch (IOException e1) {
					Objects.e = e1;
					Objects.isException = true;
					e1.printStackTrace();
				}
			}
		});
		lblBugreport
				.setIcon(new ImageIcon(
						ComProgramPro.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/Button.png")));
		lblBugreport.setVerticalTextPosition(SwingConstants.CENTER);
		lblBugreport.setIconTextGap(-30);
		lblBugreport.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBugreport.setFont(new Font("微软雅黑", Font.PLAIN, 15));

		final JLabel lblAbout = new JLabel("About");
		panel_2.add(lblAbout);
		lblAbout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblAbout.setIcon(new ImageIcon(
						ComProgramPro.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/ButtonL.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblAbout.setIcon(new ImageIcon(
						ComProgramPro.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/Button.png")));
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
				.getResource("/com/Studio2048/HomeworkDecoder/Res/Button.png")));
		lblAbout.setVerticalTextPosition(SwingConstants.CENTER);
		lblAbout.setIconTextGap(-30);
		lblAbout.setHorizontalTextPosition(SwingConstants.CENTER);
		lblAbout.setFont(new Font("微软雅黑", Font.PLAIN, 15));

		final JLabel lblExit = new JLabel("Exit");
		panel_2.add(lblExit);
		lblExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblExit.setIcon(new ImageIcon(
						ComProgramPro.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/ButtonL.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblExit.setIcon(new ImageIcon(
						ComProgramPro.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/Button.png")));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				System.exit(0);
			}
		});
		lblExit.setIcon(new ImageIcon(ComProgramPro.class
				.getResource("/com/Studio2048/HomeworkDecoder/Res/Button.png")));
		lblExit.setVerticalTextPosition(SwingConstants.CENTER);
		lblExit.setIconTextGap(-30);
		lblExit.setHorizontalTextPosition(SwingConstants.CENTER);
		lblExit.setFont(new Font("微软雅黑", Font.PLAIN, 15));

		panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(32, 392, 200, 31);
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));

		JLabel lblDelay = new JLabel("Delay");
		panel_3.add(lblDelay, BorderLayout.WEST);
		lblDelay.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));

		JLabel lblSec = new JLabel("Sec.");
		panel_3.add(lblSec, BorderLayout.EAST);
		lblSec.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));

		spinner = new JSpinner();
		panel_3.add(spinner, BorderLayout.CENTER);

		spinner.setModel(new SpinnerNumberModel(3, 0, 100, 1));
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
										.getResource("/com/Studio2048/HomeworkDecoder/Res/ButtonG.png")));
				ComProgramPro.frame.contentPane.updateUI();
				r.delay((Integer) ComProgramPro.spinner.getValue() * 1000);
				ComProgramPro.lblDecode
						.setIcon(new ImageIcon(
								ComProgramPro.class
										.getResource("/com/Studio2048/HomeworkDecoder/Res/ButtonB.png")));
				ComProgramPro.frame.contentPane.updateUI();
				for (int i = 0; i < content.length(); i++) {
					if (StopClicked == true) {
						isRunning = false;
						StopClicked = false;
						ComProgramPro.lblDecode
								.setIcon(new ImageIcon(
										ComProgramPro.class
												.getResource("/com/Studio2048/HomeworkDecoder/Res/ButtonR.png")));
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
												.getResource("/com/Studio2048/HomeworkDecoder/Res/Button.png")));
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
				ComProgramPro.lblMessageBox
						.setText("<html><body><p style=\"color:orange\">Complete!");
				for (int i = 0; i < 3; i++) {
					ComProgramPro.lblDecode
							.setIcon(new ImageIcon(
									ComProgramPro.class
											.getResource("/com/Studio2048/HomeworkDecoder/Res/ButtonY.png")));
					ComProgramPro.frame.contentPane.updateUI();
					sleep(500);
					ComProgramPro.lblDecode
							.setIcon(new ImageIcon(
									ComProgramPro.class
											.getResource("/com/Studio2048/HomeworkDecoder/Res/Button.png")));
					sleep(500);
					ComProgramPro.frame.contentPane.updateUI();
				}
				ComProgramPro.lblMessageBox.setText("");
			} catch (Exception e1) {
				Objects.e = e1;
				Objects.isException = true;
				ComProgramPro.lblDecode
						.setIcon(new ImageIcon(
								ComProgramPro.class
										.getResource("/com/Studio2048/HomeworkDecoder/Res/ButtonR.png")));
				ComProgramPro.lblMessageBox
						.setText("<html><body><p style=\"color:red\">Error happens:"
								+ e1.getMessage());
				ComProgramPro.frame.contentPane.updateUI();
				try {
					sleep(3000);
					ComProgramPro.lblDecode
							.setIcon(new ImageIcon(
									ComProgramPro.class
											.getResource("/com/Studio2048/HomeworkDecoder/Res/Button.png")));
					ComProgramPro.lblMessageBox.setText(null);
				} catch (InterruptedException e) {
					Objects.e = e;
					Objects.isException = true;
				}
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
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
