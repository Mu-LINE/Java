
public class JankenMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		JankenMethod play = new JankenMethod();
		
		// 起動前処理
			// CPUの手札を決定
			play.PutOutCPUHand();
		
		// 起動後処理
			// ルールの説明
			play.PlayRule();
			
			// 出す手札を入力
			play.PutOutPlayerHand();
		
		// 勝敗判定処理
	}

}
