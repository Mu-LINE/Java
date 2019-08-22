import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class JankenMethod {
	JankenData hand = new JankenData();
	
	// CPUに手札を与える
	public void PutOutCPUHand(){
		Random r = new Random();
		String cpuHand = hand.getJanken()[r.nextInt(3)];
	}
	
	// ルール説明
	public void PlayRule() {
		System.out.println("じゃんけんを開始します。");
		System.out.println("じゃーんけーん...");
		System.out.println("数値を入力してください。");
		System.out.println("グー：0 , チョキ：1 , パー：2");
	}
	
	
	// プレイヤーの手札選択
	public void PutOutPlayerHand() {
		try {
			Scanner scanner = new Scanner(System.in);
			while(true) {
				int selectNumber = scanner.nextInt();
				switch(selectNumber) {
					case 0:
					case 1:
					case 2:
						break;
					default:
						System.out.println("絶対に勝てる必殺技はありません。");
						System.out.println("もう一度入力してください。");
						continue;
				}
				String playerHand = hand.getJanken()[selectNumber];
				break;
			}
		}catch(InputMismatchException a) {
			a.printStackTrace();
		}
	}
	
	// 勝敗の判定
	public void Result() {
	}
	
	// テンポ調整
	public void StopTime() {
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
