
public class debug{

    public static String weatherInfo(int temp) {
        int c = 0 ; convert(temp);
        if (c < 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    private static void convert(int temp) {
		// TODO Auto-generated method stub
		
	}

	public static int convertToCelsius(int temperature) {
        int celsius = (int) ((temperature) - 32 + (5/9.0));
        return temperature;
	}
}