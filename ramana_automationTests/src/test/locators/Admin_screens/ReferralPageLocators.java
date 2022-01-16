package Admin_screens;

public interface ReferralPageLocators {
	static String MENU_REFERRAL_PROGRAMME_XPATH="//span[contains(.,'Referral Program')]";
	static String TAB_REFER_NOW_XPATH="//span[contains(.,' Refer Now')]";
	static String TAB_MY_REFERAL_XPATH="//span[contains(.,'My Referrals')]";
	static String TXT_NAME_XPATH="//input[@id='name']";
	static String TXT_EMAIL_XPATH="//input[@id='email']";
	static String TXT_PHONE_XPATH="//input[@id='phone']";
	static String BTN_INVITE_XPATH="//button[@type='submit']";
	static String TXT_MESSAGE_XATH="//textarea";
	static String MSG_SUCCESS_XPATH="//strong[text()='Congratulations!']";
	static String BTN_RESEND_XPATH="(//button[contains(.,'Resend')])[1]";
}
