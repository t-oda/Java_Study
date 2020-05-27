package JavaStudy;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Java基本学習のためのクラス
 * @author t-oda
 */
public class JavaStudyBasic {

    /**
     * メインメソッド
     * ここから学習用のクラスを呼び出す
     * @param args the command line arguments
     * @throws IOException
     * @throws FileNotFoundException
     */

	public static void main(String[] args) throws IOException {

    	//HelloWorld HelloWorld = new HelloWorld();
    	//HelloWorld.helloWorld();
		Capter01 Capter01 = new Capter01();

		//正常系
		Capter01.getTypeOfDayWithSwitchStatement("Monday");
		Capter01.getTypeOfDayWithSwitchStatement("Sunday");
		Capter01.getTypeOfDayWithSwitchStatement("Wednesday");
		//異常系(例外送出)
		//Capter01.getTypeOfDayWithSwitchStatement("hogehoge");

		//10進数、8進数、16進数、2進数出力
		//全て出力は26になる
		Capter01.printLiteralInt(26);
		//Capter01.printLiteralInt(032);
		//Capter01.printLiteralInt(0x1a);
		//Capter01.printLiteralInt(0b11010);
		//コンパイルエラー
		//Capter01.printLiteralInt(0b12010);

		//Float型リテラル出力
		//アンダースコアを使用したパターン
		Capter01.printLiteralFloat(3.1415F);
		//コンパイルエラー
		//Capter01.printLiteralFloat(3._1415F);
		//Capter01.printLiteralFloat(3_.1415F);

		//long型リテラル出力
		//アンダースコアを使用したパターン
		Capter01.printLiteralLong(999_999_999L);
		//コンパイルエラー
		//Capter01.printLiteralLong(999_999_999_L);

		//int型リテラル出力
		//アンダースコアを使用したパターン
		Capter01.printLiteralInt(5_2);
		//Capter01.printLiteralInt(5____________2);
		//Capter01.printLiteralInt(0x5_2);
		//Capter01.printLiteralInt(0_52);
		//コンパイルエラー
		//Capter01.printLiteralInt(_52);
		//Capter01.printLiteralInt(52_);
		//Capter01.printLiteralInt(0_x52);
		//Capter01.printLiteralInt(0x_52);

		//enumの出力
		Capter01.Cards();

		Chapter08 Chapter08 = new Chapter08();
		Chapter08.createFile();
		Chapter08.inoutFile();

    }
}

