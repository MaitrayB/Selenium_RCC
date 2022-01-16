package Admin_BranchManagement_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Admin_screens.Locators.Menus;
import Admin_screens.Locators.StudentPhotoApprovalLocators;
import Student_screens.Student_Locators;
import Student_screens.Student_Locators.Student_Menu;
import Student_screens.Student_Locators.Upload_Profile_Photo_Menu;
import coaching_center_base.BaseClass;
import coaching_center_base.FrameworkMethods;

public class studentPhotoApprovalPage extends BaseClass implements Menus,Student_Menu,StudentPhotoApprovalLocators,Upload_Profile_Photo_Menu {
	

	public studentPhotoApprovalPage() {
		PageFactory.initElements(BaseClass.driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(how = How.XPATH, using = MENU_STUDENT_PHOTO_APPROVAL_XPATH)
	private WebElement menu_student_photo_Approval;
	
	@FindBy(how = How.XPATH, using = BTN_MANAGE_REQUEST_XPATH)
	private WebElement btn_manage_request;
	
	@FindBy(how = How.XPATH, using = BTN_APPROVE_REQUEST_XPATH)
	private WebElement btn_approve_request;
	
	@FindBy(how = How.XPATH, using = MSG_NO_REQUEST_AVAILABLE_XPATH)
	private WebElement msg_no_Request_Available;
	
	@FindBy(how = How.XPATH, using = TAB_STUDENT_PHOTO_REQ_MANAGEMENT_XPATH)
	private WebElement tab_student_photo;
	
	@FindBy(how = How.XPATH, using = MENU_STUDENT_PHOTO_APPROVAL_XPATH)
	private WebElement student_menu_upload_profile;
	
	@FindBy(how = How.XPATH, using = UPLOAD_PROFILE_FIELD_XPATH)
	private WebElement student_upload_profile_field;
	
	@FindBy(how = How.XPATH, using = BTN_UPDATE_XPATH)
	private WebElement student_btn_update;
	
	@FindBy(how = How.XPATH, using = MSG_PROFILE_APPROVED_XPATH)
	private WebElement student_msg_profile_upload;

	@FindBy(how = How.XPATH, using = MSG_ADMIN_APPROVED_XPATH)
	private WebElement student_msg_approved;
	
	
	public WebElement getMenu_student_photo_Approval() {
		return menu_student_photo_Approval;
	}

	public WebElement getBtn_manage_request() {
		return btn_manage_request;
	}

	public WebElement getBtn_approve_request() {
		return btn_approve_request;
	}

	public WebElement getMsg_no_Request_Available() {
		return msg_no_Request_Available;
	}

	public WebElement getTab_student_photo() {
		return tab_student_photo;
	}
	
	public WebElement getStudent_menu_upload_profile() {
		return student_menu_upload_profile;
	}

	public WebElement getStudent_upload_profile_field() {
		return student_upload_profile_field;
	}

	public WebElement getStudent_btn_update() {
		return student_btn_update;
	}

	public WebElement getStudent_msg_profile_upload() {
		return student_msg_profile_upload;
	}

	public WebElement getStudent_msg_approved() {
		return student_msg_approved;
	}

	
	
	public void navigateToStudentPhotoRequestPage() throws InterruptedException {
		waitForMinTime();
		getMenu_student_photo_Approval().click();
		waitForPageLoad();
	}
	
	public void aprrovePhotoRequest() throws Exception {
		verifyElement(getTab_student_photo(),"Student Photo Request");
		getBtn_manage_request().click();
		waitForMaxTime();
		getBtn_approve_request().click();
		waitForMaxTime();
		verifyElement(getMsg_no_Request_Available(),"Message No Request Available");
	}
	
	public void navigateToUploadProfilePhoto() throws InterruptedException
	{
		waitForPageLoad();
		getStudent_menu_upload_profile().click();
		waitForPageLoad();
	}
	public void sendPhotoApprovalRequest() throws Exception {
		FrameworkMethods.logger.info("Uploading the photo");

		getStudent_upload_profile_field().sendKeys("D:\\Up\\Novatesoft Ramana\\Selenium_RCC\\ramana_automationTests\\resource\\Images\\1.jpg");
		getStudent_btn_update().click();
		waitForMaxTime();
		verifyElement(getStudent_msg_approved(),"Your profile photo is under review and will be visible once approved by Admin");
	}
	public void verifyPhotoAprrovalMessage()throws Exception {
		waitForMaxTime();
		navigateToUploadProfilePhoto();
		verifyElement(getStudent_msg_profile_upload(),"Profile Photo Already Approved Message");
	}
	
	
	
}
