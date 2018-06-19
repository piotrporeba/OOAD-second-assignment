package abstractFactory;

public class Colour {
    private String name;
    private String hexValue;
    private String rgbValue;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getHexValue() {
		return hexValue;
	}


	public void setHexValue(String hexValue) {
		this.hexValue = hexValue;
	}


	public String getRgbValue() {
		return rgbValue;
	}


	public void setRgbValue(String rgbValue) {
		this.rgbValue = rgbValue;
	}



	public Colour(String name, String hexValue, String rgbValue) {
		this.name = name;
		this.hexValue = hexValue;
		this.rgbValue = rgbValue;

	}



}

