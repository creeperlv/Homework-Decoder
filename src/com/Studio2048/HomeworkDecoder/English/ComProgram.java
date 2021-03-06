package com.Studio2048.HomeworkDecoder.English;

import java.awt.BorderLayout;

@SuppressWarnings("serial")
public class ComProgram extends JFrame {

	private JPanel contentPane;
	static ComProgram frame;
	public static JTextArea textArea_1 = new JTextArea();
	static JTextArea textArea = new JTextArea();
	
	static JCheckBox chckbxET = new JCheckBox("Enable Thread");
	
	static JSplitPane splitPane = new JSplitPane();
	
	// Composition
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					frame = new ComProgram();
					frame.setVisible(true);
				} catch (Exception e) {
					Objects.isException=true;
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

	@SuppressWarnings("deprecation")
	public ComProgram() {
		setIconImage(Toolkit
				.getDefaultToolkit()
				.getImage(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/"+Objects.Theme+"/IconECD.png")));
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			Objects.isException=true;
		}
		chckbxET = new JCheckBox("Enable Thread");
		chckbxET.setToolTipText("<html>\r\n<body>\r\n<p style = \" color:red \">\r\nIt may cause a low speed.");
		setTitle("Composition Decoder " + Objects.Versions[0] + " "
				+ Objects.status[0] + " Build:" + Objects.builds[0]
				+ " Author: 2048 Studio");
		if(Objects.isUsingPro==false)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 460);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 255));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		final JPanel panel_Menu = new JPanel();
		panel_Menu.hide();
		panel_Menu.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_Menu.setBackground(Color.WHITE);
		contentPane.add(panel_Menu, BorderLayout.WEST);
		panel_Menu.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblSettings = new JLabel("Settings");
		lblSettings.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 22));
		panel_Menu.add(lblSettings);
		
		chckbxET.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		chckbxET.setOpaque(false);
		panel_Menu.add(chckbxET);
//		
//		JButton btnBugReport = new JButton("Bug report");
//		btnBugReport.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				try {
//					Runtime.getRuntime().exec("explorer.exe \"https://www.github.com/creeperlv/Homework-Decoder\"");
//				} catch (IOException e1) {
//					e1.printStackTrace();
//				}
//			}
//		});
//		btnBugReport.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
//		panel_Menu.add(btnBugReport);
		
		final JLabel lblBugReport = new JLabel("Bug Report");
		lblBugReport.setVerticalTextPosition(SwingConstants.CENTER);
		lblBugReport.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBugReport.setIconTextGap(-30);
		lblBugReport.setIcon(new ImageIcon(ComProgram.class.getResource("/com/Studio2048/HomeworkDecoder/Res/"+Objects.Theme+"/Button.png")));
		lblBugReport.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblBugReport.setIcon(new ImageIcon(ComProgram.class.getResource("/com/Studio2048/HomeworkDecoder/Res/"+Objects.Theme+"/ButtonL.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblBugReport.setIcon(new ImageIcon(ComProgram.class.getResource("/com/Studio2048/HomeworkDecoder/Res/"+Objects.Theme+"/Button.png")));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				try {
					SimpleDateFormat df = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
					Robot Bug = new Robot();
					BufferedImage screen = Bug.createScreenCapture(frame
							.getBounds());
					Graphics g = screen.getGraphics();
					g.setColor(Color.GRAY);
					for(int i = 1;i<90;i=i+2)
					g.drawLine(1, i, 400, i);
					Properties props = System.getProperties();
					g.setFont(new Font("System", Font.PLAIN, 13));
					g.setColor(Color.ORANGE);
					g.drawString("Com Dec " + Objects.builds[0] + " "
							+ Objects.status[0] + " Part:" + Objects.Part[0]+" Key:Null", 12, 12);
					g.setColor(Color.red);
					g.drawString("Com Dec " + Objects.builds[0] + " "
							+ Objects.status[0] + " Part:" + Objects.Part[0]+" Key:Null", 13, 13);
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
					g.drawString("ProEdition:" + Objects.isUsingPro, 12,
							72);
					g.setColor(Color.red);
					g.drawString("ProEdition:" + Objects.isUsingPro, 13,
							73);
					g.setColor(Color.ORANGE);
					g.drawString("Exception:" + Objects.isException+" Detail:"+Objects.e.getMessage(), 12,
							84);
					g.setColor(Color.red);
					g.drawString("Exception:" + Objects.isException+" Detail:"+Objects.e.getMessage(), 13,
							85);
					g.setColor(Color.GRAY);
					for(int i = 1;i<16;i=i+2)
						g.drawLine((frame.getWidth()) - 155, (frame.getHeight()) - 37+i,(frame.getWidth()) - 155+ 125, (frame.getHeight()) - 37+i);
					g.setColor(Color.ORANGE);
					g.drawString("Vendor:2048 Studio",
							(int) (frame.getWidth()) - 150,
							(int) (frame.getHeight()) - 25);
					g.setColor(Color.red);
					g.drawString("Vendor:2048 Studio",
							(int) (frame.getWidth()) - 149,
							(int) (frame.getHeight()) - 24);
					ImageIO.write(screen, "png", new File("./Screenshot_"+df.format(new Date())+".png"));
					JOptionPane
							.showMessageDialog(
									null,
									"The Screenshot has been created at ./Screenshot_"+df.format(new Date())+".png",
									"Bug Report Image Creater",
									JOptionPane.WARNING_MESSAGE);
				} catch (Exception e1) {
					Objects.e=e1;
					Objects.isException=true;
					e1.printStackTrace();
				}
				try {
					Runtime.getRuntime().exec("explorer.exe \"https://www.github.com/creeperlv/Homework-Decoder/issues\"");
				} catch (IOException e1) {
					Objects.isException=true;
					e1.printStackTrace();
				}
			}
		});
		lblBugReport.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
		panel_Menu.add(lblBugReport);
		
		final JLabel lblDecode_1 = new JLabel("Decode");
		panel_Menu.add(lblDecode_1);
		lblDecode_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblDecode_1.setIcon(new ImageIcon(ComProgram.class.getResource("/com/Studio2048/HomeworkDecoder/Res/"+Objects.Theme+"/ButtonL.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblDecode_1.setIcon(new ImageIcon(ComProgram.class.getResource("/com/Studio2048/HomeworkDecoder/Res/"+Objects.Theme+"/Button.png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				decode();
			}
		});
		lblDecode_1.setVerticalTextPosition(SwingConstants.CENTER);
		lblDecode_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDecode_1.setIconTextGap(-30);
		lblDecode_1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 15));
		lblDecode_1.setIcon(new ImageIcon(ComProgram.class.getResource("/com/Studio2048/HomeworkDecoder/Res/"+Objects.Theme+"/Button.png")));
		
		JLabel label_4 = new JLabel("");
		panel_Menu.add(label_4);
		
		JLabel label_5 = new JLabel("");
		panel_Menu.add(label_5);
		
		JLabel label_6 = new JLabel("");
		panel_Menu.add(label_6);
		
		JLabel label_3 = new JLabel("");
		panel_Menu.add(label_3);
		
		JLabel label_7 = new JLabel("");
		panel_Menu.add(label_7);
		
		JLabel label_8 = new JLabel("");
		panel_Menu.add(label_8);

		JPanel panel = new JPanel();
		panel.setOpaque(false);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));

		splitPane.setOpaque(false);
		splitPane.setOneTouchExpandable(true);
		splitPane.setResizeWeight(0.5);
		panel.add(splitPane, BorderLayout.CENTER);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		splitPane.setLeftComponent(scrollPane);

		textArea.setForeground(new Color(255, 255, 255));
		textArea.setBackground(new Color(0, 153, 255));
		textArea.setTabSize(4);
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
		scrollPane.setViewportView(textArea);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(192,
				192, 192)));
		panel_2.setBackground(Color.WHITE);
		FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		flowLayout.setAlignment(FlowLayout.LEFT);
		scrollPane.setColumnHeaderView(panel_2);

		JLabel lblOriginalContent = new JLabel("Original Content:");
		panel_2.add(lblOriginalContent);
		lblOriginalContent.setFont(new Font("Microsoft YaHei UI", Font.PLAIN,
				15));

		final JLabel lblPaste = new JLabel("");
		lblPaste.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textArea.paste();
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblPaste.setIcon(new ImageIcon(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/"+Objects.Theme+"/PasteL.png")));
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				lblPaste.setIcon(new ImageIcon(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/"+Objects.Theme+"/Paste.png")));
			}
		});

		final JLabel label_2 = new JLabel("");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textArea.selectAll();
				frame.contentPane.updateUI();

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				label_2.setIcon(new ImageIcon(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/"+Objects.Theme+"/SelAllL.png")));
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				label_2.setIcon(new ImageIcon(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/"+Objects.Theme+"/SelAll.png")));
			}
		});
		label_2.setIcon(new ImageIcon(ComProgram.class
				.getResource("/com/Studio2048/HomeworkDecoder/Res/"+Objects.Theme+"/SelAll.png")));
		panel_2.add(label_2);
		lblPaste.setIcon(new ImageIcon(ComProgram.class
				.getResource("/com/Studio2048/HomeworkDecoder/Res/"+Objects.Theme+"/Paste.png")));
		panel_2.add(lblPaste);

		final JLabel lblDelete = new JLabel("");
		lblDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textArea.setText(null);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblDelete.setIcon(new ImageIcon(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/"+Objects.Theme+"/DelL.png")));
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				lblDelete.setIcon(new ImageIcon(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/"+Objects.Theme+"/Del.png")));
			}
		});
		lblDelete.setIcon(new ImageIcon(ComProgram.class
				.getResource("/com/Studio2048/HomeworkDecoder/Res/"+Objects.Theme+"/Del.png")));
		panel_2.add(lblDelete);

		textArea_1.setForeground(new Color(255, 255, 255));
		textArea_1.setBackground(new Color(0, 153, 255));

		final JLabel lblDecode = new JLabel("");
		lblDecode.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			decode();
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblDecode.setIcon(new ImageIcon(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/"+Objects.Theme+"/DecodeL.png")));
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				lblDecode.setIcon(new ImageIcon(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/"+Objects.Theme+"/Decode.png")));
			}
		});
		lblDecode
				.setIcon(new ImageIcon(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/"+Objects.Theme+"/Decode.png")));
		panel_2.add(lblDecode);

		JScrollPane scrollPane_1 = new JScrollPane();
		splitPane.setRightComponent(scrollPane_1);

		textArea_1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
		scrollPane_1.setViewportView(textArea_1);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		FlowLayout flowLayout_1 = (FlowLayout) panel_3.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		flowLayout_1.setHgap(0);
		flowLayout_1.setVgap(0);
		scrollPane_1.setColumnHeaderView(panel_3);

		JLabel lblOutputSource = new JLabel("Output Source:");
		panel_3.add(lblOutputSource);
		lblOutputSource.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 15));

		final JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textArea_1.selectAll();
				frame.contentPane.updateUI();

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				label.setIcon(new ImageIcon(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/"+Objects.Theme+"/SelAllL.png")));
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				label.setIcon(new ImageIcon(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/"+Objects.Theme+"/SelAll.png")));
			}
		});
		label.setIcon(new ImageIcon(ComProgram.class
				.getResource("/com/Studio2048/HomeworkDecoder/Res/"+Objects.Theme+"/SelAll.png")));
		panel_3.add(label);

		final JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textArea_1.copy();
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				label_1.setIcon(new ImageIcon(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/"+Objects.Theme+"/CopyL.png")));
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				label_1.setIcon(new ImageIcon(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/"+Objects.Theme+"/Copy.png")));
			}
		});
		label_1.setIcon(new ImageIcon(ComProgram.class
				.getResource("/com/Studio2048/HomeworkDecoder/Res/"+Objects.Theme+"/Copy.png")));
		panel_3.add(label_1);

		final JLabel lblDelete_1 = new JLabel("");
		lblDelete_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textArea_1.setText(null);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblDelete_1.setIcon(new ImageIcon(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/"+Objects.Theme+"/DelL.png")));
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				lblDelete_1.setIcon(new ImageIcon(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/"+Objects.Theme+"/Del.png")));
			}
		});
		lblDelete_1.setIcon(new ImageIcon(ComProgram.class
				.getResource("/com/Studio2048/HomeworkDecoder/Res/"+Objects.Theme+"/Del.png")));
		panel_3.add(lblDelete_1);

		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1, BorderLayout.SOUTH);

		final JButton btnDecode = new JButton("Decode");
		btnDecode.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnDecode.setIcon(new ImageIcon(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/"+Objects.Theme+"/Decode2L.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnDecode.setIcon(new ImageIcon(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/"+Objects.Theme+"/Decode2.png")));
			}
		});
		btnDecode.setBackground(new Color(0, 153, 255));
		btnDecode
				.setIcon(new ImageIcon(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/"+Objects.Theme+"/Decode2.png")));
		btnDecode.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 15));
		btnDecode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				decode();
			}
		});
		btnDecode
				.setToolTipText("<html>\r\n<body style=\"background-color:blue;color:white\">\r\n"
						+ "<p><font face=\"Microsoft YaHei UI\">Click this button<br/>The program will <br/>start to generate<br/> a VB script source<br/> for <b>Quick Macro");
		panel_1.add(btnDecode);

		JPanel panel_4 = new JPanel();
		panel_4.setOpaque(false);
		FlowLayout flowLayout_2 = (FlowLayout) panel_4.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_4.setBackground(Color.WHITE);
		contentPane.add(panel_4, BorderLayout.NORTH);
		
		final JLabel lblBunger = new JLabel("");
		lblBunger.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblBunger.setIcon(new ImageIcon(ComProgram.class.getResource("/com/Studio2048/HomeworkDecoder/Res/BungerL.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblBunger.setIcon(new ImageIcon(ComProgram.class.getResource("/com/Studio2048/HomeworkDecoder/Res/Bunger.png")));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(panel_Menu.isShowing()==false){
					panel_Menu.show();
				}else panel_Menu.hide();
				contentPane.updateUI();
			}
		});
		lblBunger.setIcon(new ImageIcon(ComProgram.class.getResource("/com/Studio2048/HomeworkDecoder/Res/Bunger.png")));
		panel_4.add(lblBunger);

		JLabel lblEnglishCompositionDecoder = new JLabel(
				"English Composition Decoder");
		lblEnglishCompositionDecoder.setForeground(Color.WHITE);
		panel_4.add(lblEnglishCompositionDecoder);
		lblEnglishCompositionDecoder.setFont(new Font("Microsoft YaHei UI",
				Font.PLAIN, 28));

		final JLabel lblInfo = new JLabel("");
		panel_4.add(lblInfo);
		lblInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Composition Decoder "
										+ Objects.status[0]
										+ "\r\nVersion:"
										+ Objects.Versions[0]
										+ "\r\nAuthor:2048 Studio\r\n******\r\n This program can encode your \r\nEnglish composition to a VB script \r\nsource of Quick Macro.",
								"Composition Decoder",
								JOptionPane.INFORMATION_MESSAGE);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblInfo.setIcon(new ImageIcon(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/"+Objects.Theme+"/InfoL.png")));
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				lblInfo.setIcon(new ImageIcon(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/"+Objects.Theme+"/Info.png")));
			}
		});
		lblInfo.setIcon(new ImageIcon(ComProgram.class
				.getResource("/com/Studio2048/HomeworkDecoder/Res/"+Objects.Theme+"/Info.png")));
	}
	public static void decode(){
		if(chckbxET.isSelected()==false){
		textArea_1.setText(Decoder.Decode(textArea.getText(),false));
		try {
			Robot robot = new Robot();
			System.out.println(splitPane.getMousePosition());
			robot.mouseMove((int) (frame.getX()
					+ splitPane.getBounds().getWidth()) - 30,
					(int) (frame.getY() + splitPane.getHeight() - 50));
			robot.mousePress(InputEvent.BUTTON1_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_MASK);
			System.gc();
		} catch (Exception e1) {
			Objects.isException=true;
			e1.printStackTrace();
		}
		}else{
			Thread t=new DECODING();
			t.start();
		}
	}
}
class DECODING extends Thread{
	public void run(){
		ComProgram.textArea_1.setText(Decoder.Decode(ComProgram.textArea.getText(),true));
		try {
			Robot robot = new Robot();
			System.out.println(ComProgram.splitPane.getMousePosition());
			robot.mouseMove((int) (ComProgram.frame.getX()
					+ ComProgram.splitPane.getBounds().getWidth()) - 300,
					(int) (ComProgram.frame.getY() + 100));
			robot.mousePress(InputEvent.BUTTON1_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_MASK);
			System.gc();
		} catch (Exception e1) {
			Objects.isException=true;
			e1.printStackTrace();
		}
	}
}
