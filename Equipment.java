
public class Equipment {
	// Class variables
	private String eqType;
	private String desc;
	private String modelNo;
	private String year;
	private String serialNo;
	private String arrivalDate;
	private String warrantyExp;
	private String manufacturer;
	private String location;
	private String weight;
	private String height;
	private String width;
	private String length;
	
	public Equipment(String eqType, String desc, String modelNo, String year, String serialNo, String arrivalDate, String warrantyExp, String manufacturer, String location, String weight, String width, String height, String length) {
		this.eqType = eqType;
		this.desc = desc;
		this.modelNo = modelNo;
		this.year = year;
		this.serialNo = serialNo;
		this.arrivalDate = arrivalDate;
		this.warrantyExp = warrantyExp;
		this.manufacturer = manufacturer;
		this.location = location;
		this.weight = weight;
		this.width = width;
		this.height = height;
		this.length = length;
	}
	
	public String getEquipSerial() {
		return this.serialNo;
	}
}
