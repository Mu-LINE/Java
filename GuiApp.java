import javax.swing.JFrame; // ウィンドウ機能
import javax.swing.JButton;
import java.awt.Container;
import java.awt.BorderLayout;

class GuiApp {
  public static void main(String[] args){
    JFrame frame = new JFrame("ウィンドウの表示");
    frame.setBounds(100, 100, 400, 300); //ウィンドウサイズ
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 閉じたらプログラム終了

    JButton button = new JButton("ボタンの表示");


    frame.getContentPane().add(button, BorderLayout.NORTH);
    frame.setVisible(true);
  }
}
