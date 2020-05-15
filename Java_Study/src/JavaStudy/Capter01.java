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

}
