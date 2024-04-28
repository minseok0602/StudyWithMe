package app0602.cal.diary;

public class StringManager {
	public static String getZeroString(int n) {
		return (n < 10)? "0"+n : Integer.toString(n);
	}

}