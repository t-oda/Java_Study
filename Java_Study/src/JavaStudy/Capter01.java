package JavaStudy;
/**
 * OCJP-Goldの1章
 * Switch文の結果を出力するためのクラス
 * @author t-oda
 */
public class Capter01 {

    /**
     * 曜日を基に週初め、週中、週終わり、週末を判定するメソッド
     * @param dayOfWeekArg 曜日
     */
	public void getTypeOfDayWithSwitchStatement(String dayOfWeekArg) {
		String typeOfDay;

		switch (dayOfWeekArg) {
        case "Monday":
            typeOfDay = "Start of work week";
            break;
        case "Tuesday":
        case "Wednesday":
        case "Thursday":
            typeOfDay = "Midweek";
            break;
        case "Friday":
            typeOfDay = "End of work week";
            break;
        case "Saturday":
        case "Sunday":
            typeOfDay = "Weekend";
            break;
        default:
            throw new IllegalArgumentException("Invalid day of the week: " + dayOfWeekArg);
		}
		System.out.println(typeOfDay);
	}

    /**
     * int型の10進数、8進数、16進数、2進数を出力するメソッド
     * @param valLiteralInt 数値
     */
	public void printLiteralInt(int valLiteralInt) {
		System.out.println("val1:" + valLiteralInt);
	}

    /**
     * 浮動小数リテラルを出力するメソッド
     * @param valLiteralFloat 数値
     */
	public void printLiteralFloat(float valLiteralFloat) {
		System.out.println("val2:" + valLiteralFloat);
	}

    /**
     * long型の数値を出力するメソッド
     * @param valLiteralLong 数値
     */
	public void printLiteralLong(long valLiteralLong) {
		System.out.println("val3:" + valLiteralLong);
	}

	//列挙型enumクラスのサンプル
	enum Card1 { SPADES , CLUBS , DIAMONDS , HEARTS }

    /**
     * enumクラスから抽出した値を判定するメソッド
     * @param なし
     */
	public void Cards() {
		Card1 card = Card1.SPADES;
		switch(card) {
		case SPADES:
		case CLUBS:
			 System.out.println("black");
			 break;
		case DIAMONDS:
		case HEARTS:
			System.out.println("red");
			break;
		}
	}
}
