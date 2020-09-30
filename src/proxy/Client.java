package proxy;

public class Client {
	public static void main(String[] args) {
		// proxy patternを使う場合
		{
			Printable p = new PrinterProxy("Alice");
			System.out.println("名前は現在" + p.getName() + "です");
			p.setName("Bob");
			System.out.println("名前は現在" + p.getName() + "です");
			p.print("hello");

			// 上記ソースの出力
			// 名前は現在Aliceです
			// 名前は現在Bobです
			// Printerのインスタンス(Bob)を作成中.....finish
			// === Bob===
			// hello
		}
		
		//proxy patternを使わない場合
		{
			Printable p = new Printer("Alice");
			System.out.println("名前は現在" + p.getName() + "です");
			p.setName("Bob");
			System.out.println("名前は現在" + p.getName() + "です");
			p.print("hello");
			
			//上記ソースの出力
			//Printerのインスタンス(Alice)を作成中.....finish
			//名前は現在Aliceです
			//名前は現在Bobです
			//=== Bob===
			//hello			
		}

	}

}
