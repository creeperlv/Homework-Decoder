package com.Studio2048.HomeworkDecoder.English;

import java.awt.BorderLayout;

@SuppressWarnings("serial")
public class ComProgramPro extends JFrame {

	public JPanel contentPane;

	public static JLabel lblDecode = new JLabel("Start");
	public static ComProgramPro frame;
	public static JTextArea textArea = new JTextArea();
	public static JSpinner spinner = new JSpinner();
	public static boolean isRunning=false;
	public static JLabel lblMessageBox = new JLabel("");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Objects.isUsingPro=true;
					frame = new ComProgramPro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ComProgramPro() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
		}
		
		setIconImage(Toolkit
				.getDefaultToolkit()
				.getImage(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/IconECD.png")));
		
		spinner = new JSpinner();
		setTitle("Composition Decoder Pro " + Objects.Versions[1] + " "
				+ Objects.status[1] + " Build:" + Objects.builds[1]
				+ " Author: 2048 Studio");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 550);
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblEnglishCompositionDecoder = new JLabel("English Composition Decoder Pro");
		lblEnglishCompositionDecoder.setForeground(Color.BLACK);
		lblEnglishCompositionDecoder.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 28));
		lblEnglishCompositionDecoder.setBounds(9, 12, 453, 37);
		panel.add(lblEnglishCompositionDecoder);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 61, 507, 321);
		panel.add(scrollPane);

		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		panel_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		scrollPane.setColumnHeaderView(panel_1);
		
		JLabel lblInputContent = new JLabel("Input Content:");
		lblInputContent.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
		panel_1.add(lblInputContent);
		
		final JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label.setIcon(new ImageIcon(ComProgramPro.class.getResource("/com/Studio2048/HomeworkDecoder/Res/SelAllL.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				label.setIcon(new ImageIcon(ComProgramPro.class.getResource("/com/Studio2048/HomeworkDecoder/Res/SelAll.png")));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				textArea.selectAll();
			}
		});
		label.setIcon(new ImageIcon(ComProgramPro.class.getResource("/com/Studio2048/HomeworkDecoder/Res/SelAll.png")));
		panel_1.add(label);
		
		final JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label_1.setIcon(new ImageIcon(ComProgramPro.class.getResource("/com/Studio2048/HomeworkDecoder/Res/PasteL.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				label_1.setIcon(new ImageIcon(ComProgramPro.class.getResource("/com/Studio2048/HomeworkDecoder/Res/Paste.png")));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				textArea.paste();
			}
		});
		label_1.setIcon(new ImageIcon(ComProgramPro.class.getResource("/com/Studio2048/HomeworkDecoder/Res/Paste.png")));
		panel_1.add(label_1);
		
		final JLabel label_2 = new JLabel("");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label_2.setIcon(new ImageIcon(ComProgramPro.class.getResource("/com/Studio2048/HomeworkDecoder/Res/DelL.png")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				label_2.setIcon(new ImageIcon(ComProgramPro.class.getResource("/com/Studio2048/HomeworkDecoder/Res/Del.png")));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				textArea.setText(null);
			}
		});
		label_2.setIcon(new ImageIcon(ComProgramPro.class.getResource("/com/Studio2048/HomeworkDecoder/Res/Del.png")));
		panel_1.add(label_2);

		textArea.setLineWrap(true);
		scrollPane.setViewportView(textArea);

		lblDecode.setVerticalTextPosition(SwingConstants.CENTER);
		lblDecode.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDecode.setIconTextGap(-30);
		lblDecode.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		lblDecode.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(isRunning==false)
				lblDecode.setIcon(new ImageIcon(
						ComProgramPro.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/ButtonL-G.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if(isRunning==false)
				lblDecode.setIcon(new ImageIcon(
						ComProgramPro.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/Button.png")));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				if(isRunning==false){
					Thread t =new activing();
					t.start();
				}
			}
		});
		lblDecode
				.setIcon(new ImageIcon(
						ComProgramPro.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/Button.png")));
		lblDecode.setBounds(293, 404, 123, 27);
		panel.add(lblDecode);

		final JLabel lblDecoder = new JLabel("Decoder");
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
		lblDecoder.setBounds(293, 432, 123, 27);
		panel.add(lblDecoder);

		final JLabel lblStop = new JLabel("Stop");
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
		});
		lblStop.setIcon(new ImageIcon(ComProgramPro.class
				.getResource("/com/Studio2048/HomeworkDecoder/Res/Button.png")));
		lblStop.setVerticalTextPosition(SwingConstants.CENTER);
		lblStop.setIconTextGap(-30);
		lblStop.setHorizontalTextPosition(SwingConstants.CENTER);
		lblStop.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		lblStop.setBounds(416, 404, 123, 27);
		panel.add(lblStop);

		final JLabel lblBugreport = new JLabel("Bug Report");
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
		});
		lblBugreport
				.setIcon(new ImageIcon(
						ComProgramPro.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/Button.png")));
		lblBugreport.setVerticalTextPosition(SwingConstants.CENTER);
		lblBugreport.setIconTextGap(-30);
		lblBugreport.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBugreport.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		lblBugreport.setBounds(416, 432, 123, 27);
		panel.add(lblBugreport);

		JLabel lblDelay = new JLabel("Delay");
		lblDelay.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
		lblDelay.setBounds(32, 419, 43, 15);
		panel.add(lblDelay);

		spinner.setModel(new SpinnerNumberModel(3, 0, 100, 1));
		spinner.setBounds(72, 416, 79, 22);
		panel.add(spinner);

		JLabel lblSec = new JLabel("Sec.");
		lblSec.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
		lblSec.setBounds(169, 416, 30, 15);
		panel.add(lblSec);

		final JLabel lblExit = new JLabel("Exit");
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
		lblExit.setBounds(293, 460, 123, 27);
		panel.add(lblExit);
		
		final JLabel lblAbout = new JLabel("About");
		lblAbout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblAbout.setIcon(new ImageIcon(ComProgramPro.class.getResource("/com/Studio2048/HomeworkDecoder/Res/ButtonL.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblAbout.setIcon(new ImageIcon(ComProgramPro.class.getResource("/com/Studio2048/HomeworkDecoder/Res/Button.png")));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				JOptionPane
				.showMessageDialog(
						null,
						"Composition Decoder Pro "
								+ Objects.status[1]
								+ "\r\nVersion:"
								+ Objects.Versions[1]
								+ "\r\nAuthor:2048 Studio\r\n******\r\n This program auto control the \r\nKeybroad to input text you want to \r\ninput.",
						"Composition Decoder",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		lblAbout.setIcon(new ImageIcon(ComProgramPro.class.getResource("/com/Studio2048/HomeworkDecoder/Res/Button.png")));
		lblAbout.setVerticalTextPosition(SwingConstants.CENTER);
		lblAbout.setIconTextGap(-30);
		lblAbout.setHorizontalTextPosition(SwingConstants.CENTER);
		lblAbout.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		lblAbout.setBounds(416, 460, 123, 27);
		panel.add(lblAbout);
		
		lblMessageBox.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		lblMessageBox.setBounds(9, 491, 239, 18);
		panel.add(lblMessageBox);
	}
	class activing extends Thread{
		public void run(){
			ComProgramPro.isRunning=true;
			try {
				Robot r = new Robot();
				String content= ComProgramPro.textArea.getText();
				ComProgramPro.lblDecode.setIcon(new ImageIcon(
						ComProgramPro.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/ButtonG.png")));
				ComProgramPro.frame.contentPane.updateUI();
				r.delay((Integer) ComProgramPro.spinner.getValue() * 1000);
				ComProgramPro.lblDecode.setIcon(new ImageIcon(
						ComProgramPro.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/ButtonB.png")));
				ComProgramPro.frame.contentPane.updateUI();
				for (int i = 0; i < content.length(); i++) {
					String Str = content.substring(i, i + 1);
					char c = Str.toCharArray()[0];
					if (Str.equals("\"")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
						Decoder.KeyPress(Decoder.ActionKey('\''), r);
						sleep(0,1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
					} else if (Str.equals("(")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
						Decoder.KeyPress(Decoder.ActionKey('9'), r);
						sleep(0,1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
					} else if (Str.equals("\\")) {
						Decoder.KeyPress(Decoder.ActionKey('\\'), r);
						sleep(0,1);
					} else if (Str.equals(")")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
						Decoder.KeyPress(Decoder.ActionKey('0'), r);
						sleep(0,1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
					}  else if (Str.equals("\"")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
						Decoder.KeyPress(Decoder.ActionKey('\''), r);
						sleep(0,1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
					} else if (Str.equals("{")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
						Decoder.KeyPress(Decoder.ActionKey('['), r);
						sleep(0,1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
					} else if (Str.equals("}")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
						Decoder.KeyPress(Decoder.ActionKey(']'), r);
						sleep(0,1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
					} else if (Str.equals("<")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
						Decoder.KeyPress(Decoder.ActionKey(','), r);
						sleep(0,1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
					} else if (Str.equals(">")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
						Decoder.KeyPress(Decoder.ActionKey('.'), r);
						sleep(0,1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
					} else if (Str.equals("!")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
						Decoder.KeyPress(Decoder.ActionKey('1'), r);
						sleep(0,1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
					} else if (Str.equals("$")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
						Decoder.KeyPress(Decoder.ActionKey('4'), r);
						sleep(0,1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
					} else if (Str.equals("@")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
						Decoder.KeyPress(Decoder.ActionKey('2'), r);
						sleep(0,1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
					} else if (Str.equals("%")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
						Decoder.KeyPress(Decoder.ActionKey('5'), r);
						sleep(0,1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
					} else if (Str.equals("&")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
						Decoder.KeyPress(Decoder.ActionKey('7'), r);
						sleep(0,1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
					} else if (Str.equals("?")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
						Decoder.KeyPress(Decoder.ActionKey('/'), r);
						sleep(0,1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
					} else if (Str.equals(":")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
						Decoder.KeyPress(Decoder.ActionKey(';'), r);
						sleep(0,1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
					} else if (Str.equals("*")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
						Decoder.KeyPress(Decoder.ActionKey('8'), r);
						sleep(0,1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
					} else if (Str.equals("	")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
						Decoder.KeyPress(Decoder.ActionKey('	'), r);
						sleep(0,1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
					} else if (Str.equals("+")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
						Decoder.KeyPress(Decoder.ActionKey('='), r);
						sleep(0,1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
					} else if (Str.equals("\t")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
						Decoder.KeyPress(Decoder.ActionKey('	'), r);
						sleep(0,1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
					} else if (Str.equals("_")) {
						Decoder.KeyDown(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
						Decoder.KeyPress(Decoder.ActionKey('-'), r);
						sleep(0,1);
						Decoder.KeyUp(KeyEvent.VK_SHIFT, r);
						sleep(0,1);
					} else if (Str.equals("\n")) {
						Decoder.KeyPress(KeyEvent.VK_ENTER, r);
						sleep(0,1);
					} else if (!Str.toLowerCase().equals(Str)) {
						c = Str.toLowerCase().toCharArray()[0];
						Decoder.KeyPress(KeyEvent.VK_CAPS_LOCK, r);
						sleep(0,1);
						Decoder.KeyPress(Decoder.ActionKey(c), r);
						sleep(0,1);
						Decoder.KeyPress(KeyEvent.VK_CAPS_LOCK, r);
						sleep(0,1);
					} else{
						Decoder.KeyPress(Decoder.ActionKey(c), r);
						sleep(0,1);
					}
				}
				ComProgramPro.lblDecode.setIcon(new ImageIcon(
						ComProgramPro.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/Button.png")));
				ComProgramPro.frame.contentPane.updateUI();
			} catch (Exception e1) {
				ComProgramPro.lblDecode.setIcon(new ImageIcon(
						ComProgramPro.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/ButtonR.png")));
				ComProgramPro.lblMessageBox.setText("<html><body><p style=\"color:red\">Error happens:"+e1.getMessage());
				ComProgramPro.frame.contentPane.updateUI();
				try {
					sleep(3000);
					ComProgramPro.lblMessageBox.setText(null);
				} catch (InterruptedException e) {
				}
				e1.printStackTrace();
			}
			ComProgramPro.isRunning=false;
		}
	}
}
