package JavaStudy;
/**
 * Java基本学習のためのクラス
 * @author t-oda
 */
public class JavaStudyBasic {

    /**
     * メインメソッド
     * ここから学習用のクラスを呼び出す
     * @param args the command line arguments
     */

	public static void main(String[] args) {

    	//HelloWorld HelloWorld = new HelloWorld();
    	//HelloWorld.helloWorld();
		Capter01 Capter01 = new Capter01();

		//正常系
		Capter01.getTypeOfDayWithSwitchStatement("Monday");
		Capter01.getTypeOfDayWithSwitchStatement("Sunday");
		Capter01.getTypeOfDayWithSwitchStatement("Wednesday");

		//異常系(例外送出)
		//Capter01.getTypeOfDayWithSwitchStatement("hogehoge");

    }
}

