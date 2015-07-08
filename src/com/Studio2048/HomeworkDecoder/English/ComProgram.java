package com.Studio2048.HomeworkDecoder.English;

import java.awt.BorderLayout;

@SuppressWarnings("serial")
public class ComProgram extends JFrame {

	private JPanel contentPane;
	static ComProgram frame;

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
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

	public ComProgram() {
		setIconImage(Toolkit
				.getDefaultToolkit()
				.getImage(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/IconECD.png")));
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
		}
		setTitle("Composition Decoder " + Objects.Versions[0] + " "
				+ Objects.status[0] + " Build:" + Objects.builds[0]
				+ " Author: 2048 Studio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 460);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));

		final JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(0.5);
		panel.add(splitPane, BorderLayout.CENTER);

		final JScrollPane scrollPane = new JScrollPane();
		splitPane.setLeftComponent(scrollPane);

		final JTextArea textArea = new JTextArea();
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
		lblOriginalContent.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 15));

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
								.getResource("/com/Studio2048/HomeworkDecoder/Res/PasteL.png")));
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				lblPaste.setIcon(new ImageIcon(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/Paste.png")));
			}
		});
		lblPaste.setIcon(new ImageIcon(ComProgram.class
				.getResource("/com/Studio2048/HomeworkDecoder/Res/Paste.png")));
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
								.getResource("/com/Studio2048/HomeworkDecoder/Res/DelL.png")));
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				lblDelete.setIcon(new ImageIcon(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/Del.png")));
			}
		});
		lblDelete.setIcon(new ImageIcon(ComProgram.class
				.getResource("/com/Studio2048/HomeworkDecoder/Res/Del.png")));
		panel_2.add(lblDelete);

		final JTextArea textArea_1 = new JTextArea();

		final JLabel lblDecode = new JLabel("");
		lblDecode.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textArea_1.setText(Decoder.Decode(textArea.getText()));
				try {
					Robot robot = new Robot();
					System.out.println(splitPane.getMousePosition());
					robot.mouseMove((int) (frame.getX()
							+ splitPane.getBounds().getWidth() - 10),
							(int) (frame.getY() + splitPane.getHeight() - 50));
					robot.mousePress(InputEvent.BUTTON1_MASK);
					robot.mouseRelease(InputEvent.BUTTON1_MASK);
					System.gc();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblDecode.setIcon(new ImageIcon(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/DecodeL.png")));
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				lblDecode.setIcon(new ImageIcon(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/Decode.png")));
			}
		});
		lblDecode
				.setIcon(new ImageIcon(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/Decode.png")));
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
								.getResource("/com/Studio2048/HomeworkDecoder/Res/SelAllL.png")));
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				label.setIcon(new ImageIcon(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/SelAll.png")));
			}
		});
		label.setIcon(new ImageIcon(ComProgram.class
				.getResource("/com/Studio2048/HomeworkDecoder/Res/SelAll.png")));
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
								.getResource("/com/Studio2048/HomeworkDecoder/Res/CopyL.png")));
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				label_1.setIcon(new ImageIcon(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/Copy.png")));
			}
		});
		label_1.setIcon(new ImageIcon(ComProgram.class
				.getResource("/com/Studio2048/HomeworkDecoder/Res/Copy.png")));
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
								.getResource("/com/Studio2048/HomeworkDecoder/Res/DelL.png")));
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				lblDelete_1.setIcon(new ImageIcon(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/Del.png")));
			}
		});
		lblDelete_1.setIcon(new ImageIcon(ComProgram.class
				.getResource("/com/Studio2048/HomeworkDecoder/Res/Del.png")));
		panel_3.add(lblDelete_1);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1, BorderLayout.SOUTH);

		JButton btnDecode = new JButton("Decode");
		btnDecode.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 15));
		btnDecode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea_1.setText(Decoder.Decode(textArea.getText()));
				try {
					Robot robot = new Robot();
					System.out.println(splitPane.getMousePosition());
					robot.mouseMove((int) (frame.getX()
							+ splitPane.getBounds().getWidth() - 10),
							(int) (frame.getY() + splitPane.getHeight() - 50));
					robot.mousePress(InputEvent.BUTTON1_MASK);
					robot.mouseRelease(InputEvent.BUTTON1_MASK);
					System.gc();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnDecode
				.setToolTipText("<html>\r\n<body style=\"background-color:blue;color:white\">\r\n" +
						"<p><font face=\"Microsoft YaHei UI\">Click this button<br/>The program will <br/>start to generate<br/> a VB script source<br/> for <b>Quick Macro");
		panel_1.add(btnDecode);

		JPanel panel_4 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_4.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_4.setBackground(Color.WHITE);
		contentPane.add(panel_4, BorderLayout.NORTH);

		JLabel lblEnglishCompositionDecoder = new JLabel(
				"English Composition Decoder");
		panel_4.add(lblEnglishCompositionDecoder);
		lblEnglishCompositionDecoder.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 28));

		final JLabel lblInfo = new JLabel("");
		lblInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Composition Decoder "
						+ Objects.status[0] + "\r\nVersion:"
						+ Objects.Versions[0] + "\r\nAuthor:2048 Studio\r\n******\r\n This program can encode your \r\nEnglish composition to a VB script \r\nsource of Quick Macro.",
						"Composition Decoder", JOptionPane.INFORMATION_MESSAGE);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblInfo.setIcon(new ImageIcon(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/InfoL.png")));
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				lblInfo.setIcon(new ImageIcon(
						ComProgram.class
								.getResource("/com/Studio2048/HomeworkDecoder/Res/Info.png")));
			}
		});
		lblInfo.setIcon(new ImageIcon(ComProgram.class
				.getResource("/com/Studio2048/HomeworkDecoder/Res/Info.png")));
		panel_4.add(lblInfo);
	}

}
