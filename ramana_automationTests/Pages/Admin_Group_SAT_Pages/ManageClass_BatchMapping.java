package Admin_Group_SAT_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Admin_screens.Admin_Group_SAT_Locators.Admin_Group_SAT_Menu;
import Admin_screens.Admin_Group_SAT_Locators.Batch_Mapping_Locators;
import coaching_center_base.BaseClass;

public class ManageClass_BatchMapping extends SAT_TemplatePage implements Admin_Group_SAT_Menu, Batch_Mapping_Locators {

	public ManageClass_BatchMapping() {
		PageFactory.initElements(BaseClass.driver, this);
			}

	@FindBy(how = How.XPATH, using = TAB_MANAGE3_BATCH_XPATH)
	private WebElement tab_manage_batch;

	@FindBy(how = How.XPATH, using = TAB_BATCH_AND_STUDENT_MAPPING_XPATH)
	private WebElement tab_batch_and_student_mapping;

	@FindBy(how = How.XPATH, using = TAB_BATCH_AND_TEACHER_MAPPING_XPATH)
	private WebElement tab_batch_and_teacher_mapping;

	@FindBy(how = How.XPATH, using = TAB_BATCH_AND_TEXTBOOK_MAPPING_XPATH)
	private WebElement tab_batch_and_textbook_mapping;

	@FindBy(how = How.XPATH, using = DRP_SELECT_STUDENT_XPATH)
	private WebElement drp_select_student;

	@FindBy(how = How.XPATH, using = DRP_SELECT_BATCH_XPATH)
	private WebElement drp_select_batch;

	@FindBy(how = How.XPATH, using = BTN_SAVE_XPATH)
	private WebElement btn_save;

	@FindBy(how = How.XPATH, using = SUCCESS_MESSAGE_XPATH)
	private WebElement sucess_msg;
	
	@FindBy(how = How.XPATH, using = BT_SUCCESS_MESSAGE_XPATH)
	private WebElement bt_sucess_msg;

	@FindBy(how = How.XPATH, using = DRP_TEACHER_SELECT_BATCH_XPATH)
	private WebElement drp_teacher_select_batch;

	@FindBy(how = How.XPATH, using = DRP_TEACHER_XPATH)
	private WebElement drp_teahcer;

	@FindBy(how = How.XPATH, using = BTN_SAVE_BATCH_TEACHER_XPATH)
	private WebElement btn_save_batch_teacher;

	@FindBy(how = How.XPATH, using = DRP_SELECT_TEXTBOOK_BATCH__XPATH)
	private WebElement drp_select_textbook_batch;

	@FindBy(how = How.XPATH, using = DRP_TEXTBOOK_XPATH)
	private WebElement drp_textbook_batch;

	@FindBy(how = How.XPATH, using = BTN_SAVE_BOOK_XPATH)
	private WebElement btn_save_book;
	
	@FindBy(how = How.XPATH, using = TB_SUCCESS_MESSAGE_XPATH)
	private WebElement tb_success_message;
	

	public WebElement getBt_sucess_msg() {
		return bt_sucess_msg;
	}

	public WebElement getTab_manage_batch() {
		return tab_manage_batch;
	}

	public WebElement getTab_batch_and_student_mapping() {
		return tab_batch_and_student_mapping;
	}

	public WebElement getTab_batch_and_teacher_mapping() {
		return tab_batch_and_teacher_mapping;
	}

	public WebElement getTab_batch_and_textbook_mapping() {
		return tab_batch_and_textbook_mapping;
	}

	public WebElement getDrp_select_student() {
		return drp_select_student;
	}

	public WebElement getDrp_select_batch() {
		return drp_select_batch;
	}

	public WebElement getBtn_save() {
		return btn_save;
	}

	public WebElement getSucess_msg() {
		return sucess_msg;
	}

	public WebElement getDrp_teacher_select_batch() {
		return drp_teacher_select_batch;
	}

	public WebElement getDrp_teahcer() {
		return drp_teahcer;
	}

	public WebElement getBtn_save_batch_teacher() {
		return btn_save_batch_teacher;
	}

	public WebElement getDrp_select_textbook_batch() {
		return drp_select_textbook_batch;
	}

	public WebElement getDrp_textbook_batch() {
		return drp_textbook_batch;
	}

	public WebElement getBtn_save_book() {
		return btn_save_book;
	}
	

	public WebElement getTb_success_message() {
		return tb_success_message;
	}

	public void navigateToBatchAndStudentMapping() throws InterruptedException {
		waitForMinTime();
		getMenu_manage_class().click();
		waitForPageLoad();
		getTab_batch_and_student_mapping().click();
	}

	public void navigateToBatchAndTeacherMapping() throws InterruptedException{
		waitForMinTime();
		getTab_batch_and_teacher_mapping().click();
		waitForPageLoad();
	}

	public void navigateToBatchAndBookMapping() throws InterruptedException{
		waitForMinTime();
		getTab_batch_and_textbook_mapping().click();
		waitForPageLoad();
	}

	public void verifyBatchAndStudentMapping() throws Exception {
		scrollUp();
		waitForMinTime();
		Select student=new Select(getDrp_select_student());
		student.selectByIndex(1);
		Select batch=new Select(getDrp_select_batch());
		batch.selectByIndex(1);
		getBtn_save().click();
		waitForMinTime();
		verifyElement(getSucess_msg(),"Sucess Message");
		waitForMinTime();
		getTab_batch_and_student_mapping().click();
		
	}
	
	public void verifyBatchAndTeacherMapping()throws Exception  {
		Select teacher=new Select(getDrp_teahcer());
		teacher.selectByIndex(1);
		Select batch=new Select(getDrp_teacher_select_batch());
		batch.selectByIndex(1);
		getBtn_save_batch_teacher().click();
		waitForMinTime();
		verifyElement(getBt_sucess_msg(),"Sucess Message");
		waitForMinTime();
		getTab_batch_and_teacher_mapping().click();
		
	}
	
	public void verifyBatchAndTextMapping()throws Exception  {
		Select batch=new Select(getDrp_select_textbook_batch());
		batch.selectByIndex(3);
		Select textBook=new Select(getDrp_textbook_batch());
		textBook.selectByIndex(1);
		getBtn_save_book().click();
		waitForMinTime();
		verifyElement(getTb_success_message(),"Sucess Message");
		waitForMinTime();
	}
	
}
