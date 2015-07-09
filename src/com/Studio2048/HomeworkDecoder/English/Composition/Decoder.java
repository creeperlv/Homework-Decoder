package com.Studio2048.HomeworkDecoder.English.Composition;

import java.awt.EventQueue;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import com.Studio2048.HomeworkDecoder.English.ComProgram;

public class Decoder {
	/**
	 * 
	 * @author Creeper Lv
	 * @param c
	 * @return
	 * @throws Exception
	 */
	public static int ActionKey(char c) throws Exception {
		// Robot a =new Robot();
		switch (c) {
		case 'a':
			return KeyEvent.VK_A;
		case 'b':
			return KeyEvent.VK_B;
		case 'c':
			return KeyEvent.VK_C;
		case 'd':
			return KeyEvent.VK_D;
		case 'e':
			return KeyEvent.VK_E;
		case 'f':
			return KeyEvent.VK_F;
		case 'g':
			return KeyEvent.VK_G;
		case 'h':
			return KeyEvent.VK_H;
		case 'i':
			return KeyEvent.VK_I;
		case 'j':
			return KeyEvent.VK_J;
		case 'k':
			return KeyEvent.VK_K;
		case 'l':
			return KeyEvent.VK_L;
		case 'm':
			return KeyEvent.VK_M;
		case 'n':
			return KeyEvent.VK_N;
		case 'o':
			return KeyEvent.VK_O;
		case 'p':
			return KeyEvent.VK_P;
		case 'q':
			return KeyEvent.VK_Q;
		case 'r':
			return KeyEvent.VK_R;
		case 's':
			return KeyEvent.VK_S;
		case 't':
			return KeyEvent.VK_T;
		case 'u':
			return KeyEvent.VK_U;
		case 'v':
			return KeyEvent.VK_V;
		case 'w':
			return KeyEvent.VK_W;
		case 'x':
			return KeyEvent.VK_X;
		case 'y':
			return KeyEvent.VK_Y;
		case 'z':
			return KeyEvent.VK_Z;
		case '0':
			return KeyEvent.VK_0;
		case '1':
			return KeyEvent.VK_1;
		case '2':
			return KeyEvent.VK_2;
		case '3':
			return KeyEvent.VK_3;
		case '4':
			return KeyEvent.VK_4;
		case '5':
			return KeyEvent.VK_5;
		case '6':
			return KeyEvent.VK_6;
		case '7':
			return KeyEvent.VK_7;
		case '8':
			return KeyEvent.VK_8;
		case '9':
			return KeyEvent.VK_9;
		case ',':
			return KeyEvent.VK_COMMA;
		case '.':
			return KeyEvent.VK_PERIOD;
		case ' ':
			return KeyEvent.VK_SPACE;
		case '/':
			return KeyEvent.VK_SLASH;
		case '\\':
			return KeyEvent.VK_BACK_SLASH;
		case '=':
			return KeyEvent.VK_EQUALS;
		case ';':
			return KeyEvent.VK_SEMICOLON;
		case '[':
			return KeyEvent.VK_OPEN_BRACKET;
		case ']':
			return KeyEvent.VK_CLOSE_BRACKET;
		case '-':
			return KeyEvent.VK_MINUS;
		case '\'':
			return KeyEvent.VK_QUOTE;
		case '	':
			return KeyEvent.VK_TAB;
		}
		throw new Exception("No Character Equls " + c + "!");
	}
	
	/**
	 * @author Creeper Lv
	 * @param KeyCode
	 * @param r
	 */
	public static void KeyPress(final int KeyCode, final Robot r) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				r.keyPress(KeyCode);
				r.keyRelease(KeyCode);
			}
		});
	}

	/**
	 * @author Creeper Lv
	 * @param KeyCode
	 * @param r
	 */
	public static void KeyDown(final int KeyCode, final Robot r) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				r.keyPress(KeyCode);
			}
		});
	}

	/**
	 * @author Creeper Lv
	 * @param KeyCode
	 * @param r
	 */
	public static void KeyUp(final int KeyCode, final Robot r) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				r.keyRelease(KeyCode);
			}
		});
	}

	/**
	 * @author Creeper Lv
	 * @param KeyCode
	 * @param r
	 */
	public static String Decode(String content, boolean isThread) {
		String S = "";
		for (int i = 0; i < content.length(); i++) {
			String Str = content.substring(i, i + 1);
			if (Str.equals(" ")) {
				S += "KeyPress \"Space\", 1\r\n";
			} else if (Str.equals("\"")) {
				S += "KeyDown \"Shift\", 1\r\n";
				S += "KeyPress \"\'\", 1\r\n";
				S += "KeyUp \"Shift\", 1\r\n";
			} else if (Str.equals("(")) {
				S += "KeyDown \"Shift\", 1\r\n";
				S += "KeyPress \"9\", 1\r\n";
				S += "KeyUp \"Shift\", 1\r\n";
			} else if (Str.equals(")")) {
				S += "KeyDown \"Shift\", 1\r\n";
				S += "KeyPress \"0\", 1\r\n";
				S += "KeyUp \"Shift\", 1\r\n";
			} else if (Str.equals("{")) {
				S += "KeyDown \"Shift\", 1\r\n";
				S += "KeyPress \"[\", 1\r\n";
				S += "KeyUp \"Shift\", 1\r\n";
			} else if (Str.equals("}")) {
				S += "KeyDown \"Shift\", 1\r\n";
				S += "KeyPress \"]\", 1\r\n";
				S += "KeyUp \"Shift\", 1\r\n";
			} else if (Str.equals("<")) {
				S += "KeyDown \"Shift\", 1\r\n";
				S += "KeyPress \",\", 1\r\n";
				S += "KeyUp \"Shift\", 1\r\n";
			} else if (Str.equals(">")) {
				S += "KeyDown \"Shift\", 1\r\n";
				S += "KeyPress \".\", 1\r\n";
				S += "KeyUp \"Shift\", 1\r\n";
			} else if (Str.equals("!")) {
				S += "KeyDown \"Shift\", 1\r\n";
				S += "KeyPress \"1\", 1\r\n";
				S += "KeyUp \"Shift\", 1\r\n";
			} else if (Str.equals("$")) {
				S += "KeyDown \"Shift\", 1\r\n";
				S += "KeyPress \"4\", 1\r\n";
				S += "KeyUp \"Shift\", 1\r\n";
			} else if (Str.equals("@")) {
				S += "KeyDown \"Shift\", 1\r\n";
				S += "KeyPress \"2\", 1\r\n";
				S += "KeyUp \"Shift\", 1\r\n";
			} else if (Str.equals("%")) {
				S += "KeyDown \"Shift\", 1\r\n";
				S += "KeyPress \"5\", 1\r\n";
				S += "KeyUp \"Shift\", 1\r\n";
			} else if (Str.equals("&")) {
				S += "KeyDown \"Shift\", 1\r\n";
				S += "KeyPress \"7\", 1\r\n";
				S += "KeyUp \"Shift\", 1\r\n";
			} else if (Str.equals("?")) {
				S += "KeyDown \"Shift\", 1\r\n";
				S += "KeyPress \"/\", 1\r\n";
				S += "KeyUp \"Shift\", 1\r\n";
			} else if (Str.equals(":")) {
				S += "KeyDown \"Shift\", 1\r\n";
				S += "KeyPress \";\", 1\r\n";
				S += "KeyUp \"Shift\", 1\r\n";
			} else if (Str.equals("*")) {
				S += "KeyDown \"Shift\", 1\r\n";
				S += "KeyPress \"8\", 1\r\n";
				S += "KeyUp \"Shift\", 1\r\n";
			} else if (Str.equals("	")) {
				S += "KeyDown \"Shift\", 1\r\n";
				S += "KeyPress \"Tab\", 1\r\n";
				S += "KeyUp \"Shift\", 1\r\n";
			} else if (Str.equals("+")) {
				S += "KeyDown \"Shift\", 1\r\n";
				S += "KeyPress \"=\", 1\r\n";
				S += "KeyUp \"Shift\", 1\r\n";
			} else if (Str.equals("\t")) {
				S += "KeyDown \"Shift\", 1\r\n";
				S += "KeyPress \"Tab\", 1\r\n";
				S += "KeyUp \"Shift\", 1\r\n";
			} else if (Str.equals("_")) {
				S += "KeyDown \"Shift\", 1\r\n";
				S += "KeyPress \"-\", 1\r\n";
				S += "KeyUp \"Shift\", 1\r\n";
			} else if (Str.equals("\n")) {
				S += "KeyPress \"Enter\", 1\r\n";
			} else if (!Str.toLowerCase().equals(Str)) {
				S += "KeyPress \"CapsLock\", 1\r\n";
				S += "KeyPress \"" + Str.toUpperCase() + "\", 1\r\n";
				S += "KeyPress \"CapsLock\", 1\r\n";
			} else
				S += "KeyPress \"" + Str.toUpperCase() + "\", 1\r\n";
			if (isThread == true) {
				ComProgram.textArea_1.setText(S);
			}
		}
		return S;
	}
}
