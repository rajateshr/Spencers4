package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpCheckoutPage {
	public SpCheckoutPage (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
		@FindBy(xpath="html/body/div[3]/main/div[2]/div/div[5]/div[2]/div[1]/h1[text()='Checkout']")
		public WebElement checkoutheading;
		
		@FindBy(xpath="html/body/div[3]/main/div[2]/div/div[5]/div[2]/div[4]/ul/li[1]/div/div[@class='dilivery_icon_checkout01 sprite_account_landing']")
		public WebElement deliveryicon;
		
		@FindBy(xpath="html/body/div[3]/main/div[2]/div/div[5]/div[2]/div[4]/ul/li[1]//child::div[@class='dilivery_icon']//following-sibling::p[text()='Delivery Info']")
		public WebElement deliveryInfoHead;
		

		@FindBy(xpath="html/body/div[3]/main/div[2]/div/div[5]/div[2]/div[4]/ul/li[3]/div/div[@class='payment_icon_checkout01 sprite_account_landing']")
		public WebElement paymenticon;
		
		@FindBy(xpath="html/body/div[3]/main/div[2]/div/div[5]/div[2]/div[4]/ul/li[3]/p[text()='Payment Info']")
		public WebElement paymentinfoHead;
		
		@FindBy(xpath="//div[@id='attached_add_new_address']/div[@class='add_new_address_block']/div[@class='col-lg-4 col-md-4 col-sm-6 col-xs-12 fourth_card slect_content_block_1']/div[@class='action action-show-popup']/div[@class='content_checkout_card']/div[@class='content_add ellips_img ellips_checkout']")
		public WebElement createaddressicon;
		
		@FindBy(xpath="html/body/div[4]/aside[3]/div[@class='modal-inner-wrap']")
		public WebElement addresscreatepopup;
		
		@FindBy(xpath="//form[@class='form form-shipping-address']/div[@id='shipping-new-address-form']/div[@name='shippingAddress.firstname']/div/input[@name='firstname']")
		public WebElement firstnameAddress;
		
		@FindBy(xpath="//form[@class='form form-shipping-address']/div[@id='shipping-new-address-form']/fieldset/div[@class='control']/div[@name='shippingAddress.street.0']/div/input[@name='street[0]']")
		public WebElement streetaddress;
		
		@FindBy(xpath="//form[@class='form form-shipping-address']/div[@id='shipping-new-address-form']/fieldset/div[@class='control']/div[@name='shippingAddress.street.1']/div/input[@name='street[1]']")
		public WebElement streetaddress1;
		
		@FindBy(xpath="//form[@class='form form-shipping-address']/div[@id='shipping-new-address-form']/div[@name='shippingAddress.postcode']/div/input[@name='postcode']")
		public WebElement pincode;
		
		@FindBy(xpath="//form[@class='form form-shipping-address']/div[@id='shipping-new-address-form']/div[@name='shippingAddress.city']/div/input[@name='city']")
		public WebElement city;
		
		@FindBy(xpath="//form[@class='form form-shipping-address']/div[@id='shipping-new-address-form']/div[@name='shippingAddress.telephone']/div/input[@name='telephone']")
		public WebElement phonenumber;
		
		@FindBy(xpath="//div[@class='control']/div[@class='choice field']/section/p[2]//child::input[@value='Office']")
		public WebElement officecheck;
		
		@FindBy(xpath="//div[@class='control']/div[@class='choice field']/section/p[2]//child::label[text()='Office']")
		public WebElement officelabel;
		
		@FindBy(xpath="//footer/button[@class='action primary action-save-address']")
		public WebElement UpdateButton;
		
		@FindBy(xpath="html/body/div[3]/main/div[2]/div/div[5]/div[3]/ol/li[1]/div[2]/div/div[1]/div/div/div[1]/div[1]/div[1]/div[@class='col-sm-9 col-xs-9 checkout_middel_content']/label[text()='Office']")
		public WebElement selectaddress;
		
		@FindBy(xpath="html/body/div[3]/main/div[2]/div/div[5]/div[3]/ol/li[1]/div[2]/div/div[1]/div/div/div[1]/div[1]/div[1]/div[2]/label")
		public WebElement addresschkbox;
		
		@FindBy(xpath="//ul[@class='nav nav-tabs nav-stacked text-center bottom_tab_checkout']//child::li[normalize-space(@class)='del_slot']//child::a[@data-slot='Wednesday3']//child::span[text()='28 Feb, 2018']")
		public WebElement selectslot;
		
		@FindBy(xpath="//div[@class='content_date_time']/div[@class='col-sm-12 del_tim_slot']//child::div[@data-slot-time='7:00 PM - 10:00 PM'][@data-slot-date='2018-02-28']")
		public WebElement selectslottiming;
		
		@FindBy(xpath="//div[@class='content_tab_delivery col-sm-12 no_padding slots_selected']/div[2]/ul[@class='nav nav-tabs nav-stacked text-center bottom_tab_checkout']/li[@class='del_slot active']/a[@data-slot='Wednesday3']/span[text()='28 Feb, 2018']")
		public WebElement selectslotdisplay;
		
		@FindBy(xpath="//div[contains(@class,'slots_selected')]//child::div[contains(@class,'content slots_selected')]//child::div[@class='tab-pane fade active in slots_selected']//child::div[@class='content_date_time slots_selected']//child::div[@class='col-sm-12 del_tim_slot slots_selected']//child::div[@data-slot-time='7:00 PM - 10:00 PM']//child::div[@class='time_slot_content']//child::p[normalize-space(text())='7:00 PM - 10:00 PM']")
		public WebElement selectslottimingdisplay;
		
		@FindBy(xpath="//form[@class='form methods-shipping']//child::div[@class='total_product_block']//child::div[contains(@class,'total_payment_checkout02')]//child::span[text()='₹50']")
		public WebElement ordervalue;
		
		@FindBy(xpath="html/body/div[4]/main/div[2]/div/div[5]/div[3]/ol/li[1]/div[3]/div/form/div[4]/div/div[3]/div/button[@class='button action continue primary']")
		public WebElement payamountbutton;
		
		@FindBy(xpath="html/body/div[4]/main/div[2]/div/div[5]/div[3]/ol/li[1]/div[3]/div/form/div[4]/div/div[3]/div/button/span[text()='₹50']")
		public WebElement paybuttonprice;
		
		@FindBy(xpath="//div[@data-bind='html: window.checkoutConfig.delivery_slots_content']/div[@class='content_tab_delivery col-sm-12 no_padding slots_selected']/div[@class='work-box slot-selected-text']/div[@class='col-xs-2']/span[@class='caret time_slot_btn']")
		public WebElement expandbutton;
		
		@FindBy(xpath="html/body/div[4]/main/div[2]/div/div[5]/div[3]/ol/li[2]/div/form/fieldset/div[1]/div[1]/div/div/div[1]/div/ul/li[1]/p[1]/span[text()='Total']")
		public WebElement TotalText;
		
		@FindBy(xpath="html/body/div[4]/main/div[2]/div/div[5]/div[3]/ol/li[2]/div/form/fieldset/div[1]/div[1]/div/div/div[1]/div/ul/li[1]/p[2]/span[text()='₹20']")
		public WebElement OrderTotal;
		
		@FindBy(xpath="html/body/div[4]/main/div[2]/div/div[5]/div[3]/ol/li[2]/div/form/fieldset/div[1]/div[1]/div/div/div[1]/div/ul/li[2]/p/span[text()='Delivery Charges']")
		public WebElement deliveryChargestext;
		
		@FindBy(xpath="html/body/div[4]/main/div[2]/div/div[5]/div[3]/ol/li[2]/div/form/fieldset/div[1]/div[1]/div/div/div[1]/div/ul/li[2]/span/span[text()='30']")
		public WebElement deliveryChargesvalue;
		
		@FindBy(xpath="html/body/div[4]/main/div[2]/div/div[5]/div[3]/ol/li[2]/div/form/fieldset/div[1]/div[1]/div/div/div[1]/div/ul/li[3]/p/span[text()='Promo Cash']")
		public WebElement promocashtext;
		
		@FindBy(xpath="html/body/div[4]/main/div[2]/div/div[5]/div[3]/ol/li[2]/div/form/fieldset/div[1]/div[1]/div/div/div[1]/div/ul/li[@class='payment_rewards col-sm-12']/span/span[text()='0']")
		public WebElement promocashamount;
		
		/*@FindBy(xpath="html/body/div[4]/main/div[2]/div/div[5]/div[3]/ol/li[2]/div/form/fieldset/div[1]/div[1]/div/div/div[1]/div/ul/li[4]/p/span[text()='Spencer wallet']")
		public WebElement spencerwallettext;
		
		@FindBy(xpath="html/body/div[4]/main/div[2]/div/div[5]/div[3]/ol/li[2]/div/form/fieldset/div[1]/div[1]/div/div/div[1]/div/ul/li[4]/span/span[text()='70']")
		public WebElement spencerwalletamount;
		
		@FindBy(xpath="html/body/div[4]/main/div[2]/div/div[5]/div[3]/ol/li[2]/div/form/fieldset/div[1]/div[1]/div/div/div[1]/div/ul/li[4]/span/span[text()='0']")
		public WebElement Currentspencerwallet;*/
		
		@FindBy(xpath="//div[@class='inner-container']//child::div[@class='payment_page payment_page_totals']//child::div[@class='col-sm-12 no_padding content_fail_total']//child::div[@class='col-sm-8 no_padding fail_left']//child::div[@class='left_content_payment']//child::ul//child::li[contains(@class,'payment_you_pay')]//child::p[@class='col-sm-7']//child::span[text()='You Pay']")
		public WebElement YouPayText;
		
		@FindBy(xpath="html/body/div[4]/main/div[2]/div/div[5]/div[3]/ol/li[2]/div/form/fieldset/div[1]/div[1]/div/div/div[1]/div[@class='left_content_payment']/ul/li[@class='payment_you_pay col-sm-12']/span/span[text()='₹50']")
		public WebElement YouPayamount;
		
		@FindBy(xpath="html/body/div[4]/main/div[2]/div/div[5]/div[3]/ol/li[2]/div/form/fieldset/div[1]/div[1]/div/div/div[2]/div/ul/li[1]/p[2]/a/span[text()='Undo']")
		public WebElement UndoWallet;
		
		@FindBy(xpath="html/body/div[4]/main/div[2]/div/div[5]/div[3]/ol/li[2]/div/form/fieldset/div[1]/div[2]/div[1]/div[text()='Select Payment Mode']")
		public WebElement selectPayment;
		
		@FindBy(xpath="html/body/div[4]/main/div[2]/div/div[5]/div[3]/ol/li[2]/div/form/fieldset/div[1]/div[2]/div[1]/div[2]/div/ul/li[4]/a/span/span[text()='Cash/Card on Delivery']")
		public WebElement CODPaymentSelection;
		
		@FindBy(xpath="//label[@for='cashondelivery']//preceding-sibling::input[@id='cashondelivery']")
		public WebElement CODPaymentSelectionBox;
		
		@FindBy(xpath="html/body/div[4]/main/div[2]/div/div[5]/div[3]/ol/li[2]/div/form/fieldset/div[1]/div[2]/div[1]/div[3]/div/div/div[4]/div[2]/div[1]/label/span[text()='Cash on Delivery']")
		public WebElement CODPaymentSelectionLabel;
		
		@FindBy(xpath="html/body/div[4]/main/div[2]/div/div[5]/div[3]/ol/li[2]/div/form/fieldset/div[1]/div[2]/div[1]/div[3]/div/div/div[4]/div[2]/div[2]/div[6]/div/button/span/span[text()='Confirm Order']")
		public WebElement confirmOrderButton;
		
		@FindBy(xpath="html/body/div[3]/main/div[3]/div/div[5]/div[1]/div[1]/h1[text()='Order Successful!']")
		public WebElement OrderSuccessfull;
		
		@FindBy(xpath="html/body/div[3]/main/div[3]/div/div[5]/div[1]/div[2]/div[1]/div/h2/a[text()='(Track Order)']")
		public WebElement trackorderlink;
		
		@FindBy(xpath="html/body/div[3]/main/div[3]/div/div[5]/div[1]/div[2]/div[2]/div/h2[text()='Order Details']")
		public WebElement OrderDetailstext;
		
		@FindBy(xpath="html/body/div[3]/main/div[3]/div/div[5]/div[1]/div[2]/div[2]/div/ul/li[1]/p[text()='Delivery Date:']")
		public WebElement deliverydatetext;
		
		@FindBy(xpath="html/body/div[3]/main/div[3]/div/div[5]/div[1]/div[2]/div[2]/div/ul/li[1]/span[text()='Wed, 28th Feb 2018']")
		public WebElement deliverydatevalue;
		
		@FindBy(xpath="html/body/div[3]/main/div[3]/div/div[5]/div[1]/div[2]/div[2]/div/ul/li[2]/p[text()='Delivery Slot:']")
		public WebElement deliveryslottext;
		
		@FindBy(xpath="html/body/div[3]/main/div[3]/div/div[5]/div[1]/div[2]/div[2]/div/ul/li[2]/span[text()='7:00 PM - 10:00 PM']")
		public WebElement deliveryslottime;
		
		@FindBy(xpath="html/body/div[3]/main/div[3]/div/div[5]/div[1]/div[2]/div[2]/div/ul/li[3]/p[text()='Payment Mode:']")
		public WebElement paymentmodetext;
		
		@FindBy(xpath="html/body/div[3]/main/div[3]/div/div[5]/div[1]/div[2]/div[2]/div/ul/li[3]/span[text()='Cash on Delivery']")
		public WebElement paymentmodeCOD;
		
		@FindBy(xpath="html/body/div[3]/main/div[3]/div/div[5]/div[2]/div/div/div[2]/div/div/div[1]/h2[text()='Order Summary']")
		public WebElement ordersummary;
		
		@FindBy(xpath="html/body/div[3]/main/div[3]/div/div[5]/div[2]/div/div/div[2]/div/div/div[2]/ul/li[1]/p[text()='Price']")
		public WebElement priceText;
		
		@FindBy(xpath="html/body/div[3]/main/div[3]/div/div[5]/div[2]/div/div/div[2]/div/div/div[2]/ul/li[1]/span[text()='₹20']")
		public WebElement priceVALUE;
		
		@FindBy(xpath="html/body/div[3]/main/div[3]/div/div[5]/div[2]/div/div/div[2]/div/div/div[2]/ul/li[2]/p[text()='Promos & Discount']")
		public WebElement promodiscountText;
		
		@FindBy(xpath="html/body/div[3]/main/div[3]/div/div[5]/div[2]/div/div/div[2]/div/div/div[2]/ul/li[3]/p[text()='Delivery Charges']")
		public WebElement deliverychargesText;
		
		@FindBy(xpath="html/body/div[3]/main/div[3]/div/div[5]/div[2]/div/div/div[2]/div/div/div[2]/ul/li[3]/span[text()='₹30']")
		public WebElement deliverycharges;
	
		@FindBy(xpath="html/body/div[3]/main/div[3]/div/div[5]/div[2]/div/div/div[2]/div/div/div[3]/ul/li/p[text()='Total']")
		public WebElement STotalText;
		
		@FindBy(xpath="html/body/div[3]/main/div[3]/div/div[5]/div[2]/div/div/div[2]/div/div/div[3]/ul/li/span[normalize-space(text())='₹50']")
		public WebElement STotalValue;
		
		@FindBy(xpath="html/body/div[3]/main/div[3]/div/div[5]/div[2]/div/div/div[2]/div/div/div[4]/p[text()='Thank you for placing the Order.']")
		public WebElement TYFPO;
		
		@FindBy(xpath="html/body/div[3]/main/div[3]/div/div[5]/div[2]/div/div/div[1]/div/div[1]/div/div[1]/p[text()='Product']")
		public WebElement productcolumn;
		
		@FindBy(xpath="html/body/div[3]/main/div[3]/div/div[5]/div[2]/div/div/div[1]/div/div[1]/div/div[2]/p[text()='Per unit Price']")
		public WebElement perunitpricecolumn;
		
		@FindBy(xpath="html/body/div[3]/main/div[3]/div/div[5]/div[2]/div/div/div[1]/div/div[1]/div/div[3]/p[text()='Quantity']")
		public WebElement quantitycolumn;
		
		@FindBy(xpath="html/body/div[3]/main/div[3]/div/div[5]/div[2]/div/div/div[1]/div/div[1]/div/div[4]/p[text()='Amount']")
		public WebElement amountcolumn;
		
		@FindBy(xpath="html/body/div[3]/main/div[3]/div/div[5]/div[2]/div/div/div[1]/div/div[2]/div[1]/div[1]/span/span/img[@src='https://d17oijia0osjmt.cloudfront.net/media/catalog/product/cache/06b3bb8c90e91c2d87d1c6beaa3af431/1/2/1277042p.jpg']")
		public WebElement ordersuccessPrdimg;
		
		@FindBy(xpath="//div[@class='left_cart_content']/div[contains(@class,'product order_success_full_bottom')]/div[@class='col-md-5 col-sm-5 col-xs-6 no_padding']/div[contains(@class,'product_info_cart no_padding')]/p[text()='Amul Kool Badam Milk 200ml']")
		public WebElement ordersuccessPrdname;
		
		@FindBy(xpath="//div[@class='left_cart_content']/div[contains(@class,'product order_success_full_bottom')]/div[@class='col-md-5 col-sm-5 col-xs-6 no_padding']/div[contains(@class,'product_info_cart no_padding')]/p[text()='Amul Kool Badam Milk 200ml']//parent::div[contains(@class,'product_info_cart no_padding')]//parent::div[@class='col-md-5 col-sm-5 col-xs-6 no_padding']//following-sibling::div[@class='col-md-3 col-sm-3 col-xs-3 no_padding hidden-xs']//child::div[@class='price_product']//child::p[text()='₹20']")
		public WebElement ordersuccessUnitPrice;
		
		@FindBy(xpath="html/body/div[3]/main/div[3]/div/div[5]/div[2]/div/div/div[1]/div/div[2]/div[normalize-space(text())='1']")
		public WebElement ordersuccessPrdCount;
		
		@FindBy(xpath="html/body/div[3]/main/div[3]/div/div[5]/div[2]/div/div/div[1]/div/div[2]/div[4]/div/span[text()='₹20']")
		public WebElement ordersuccessPrdfullamt;
		
		
		}	


