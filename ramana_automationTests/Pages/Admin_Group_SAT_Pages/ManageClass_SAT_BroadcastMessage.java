package Admin_Group_SAT_Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Admin_screens.Admin_Group_SAT_Locators.Broadcast_Message_Locators;
import Admin_screens.Admin_Group_SAT_Locators.Manage_Class_Video_Locators;
import coaching_center_base.BaseClass;

public class ManageClass_SAT_BroadcastMessage extends SAT_TemplatePage
		implements Broadcast_Message_Locators, Manage_Class_Video_Locators {
	public ManageClass_SAT_BroadcastMessage() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	@FindBy(how = How.XPATH, using = DRP_SELECT_BATCH_XPATH)
	private WebElement drp_select_batch;

	@FindBy(how = How.XPATH, using = BROADCAST_MESSAGE_XPATH)
	private WebElement msg_broadcast;

	@FindBy(how = How.XPATH, using = BTN_SENT_MSG_XPATH)
	private WebElement btn_sent_msg;

	@FindBy(how = How.XPATH, using = BTN_CLEAR_TEXT_XPATH)
	private WebElement btn_clear_text;

	@FindBy(how = How.XPATH, using = TAB_BROADCAST_MSG_XPATH)
	private WebElement tab_broadcastMsg;
	
	@FindBy(how = How.XPATH, using = TAB_MANAGE1_BATCH_XPATH)
	private WebElement tab_manage_batch;

	public WebElement getDrp_select_batch() {
		return drp_select_batch;
	}

	public WebElement getMsg_broadcast() {
		return msg_broadcast;
	}

	public WebElement getBtn_sent_msg() {
		return btn_sent_msg;
	}

	public WebElement getBtn_clear_text() {
		return btn_clear_text;
	}

	public WebElement getTab_broadcastMsg() {
		return tab_broadcastMsg;
	}

	public WebElement getTab_manage_batch() {
		return tab_manage_batch;
	}

	public void navigateToBroadcastMessagePage() throws InterruptedException {
		waitForMinTime();
		getMenu_manage_class().click();
		waitForPageLoad();
		getTab_manage_batch().click();
		waitForMinTime();
		scrollDown();
		getTab_broadcastMsg().click();
	}

	public void verifyBroadcastMessage() throws Exception {
		Select selectBatch = new Select(getDrp_select_batch());
		selectBatch.selectByIndex(1);
		getMsg_broadcast().sendKeys("Test Message");
		getBtn_sent_msg().click();
		verifyElement(getMsg_broadcast(), "Success Message");
		
	}
}
