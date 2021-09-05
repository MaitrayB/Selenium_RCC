package Student_screens;

public interface Student_Locators {
	
	public interface Student_Menu{
		static String MENU_UPLOAD_PROFILE="//a[@id='uploadProfilePhoto']";
	}
	
	public interface Upload_Profile_Photo_Menu{
		static String UPLOAD_PROFILE_FIELD_XPATH="//input[@id='imageFile']";
		static String BTN_UPDATE_XPATH="//button[@id='uploadImage']";
		static String MSG_PROFILE_APPROVED_XPATH="//h4[text()='Profile Photo is Already Approved']";
		static String MSG_ADMIN_APPROVED_XPATH="//h4[contains(.,'approved by Admin')]";
	}
}

