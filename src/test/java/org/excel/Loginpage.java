 package org.excel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends BaseClass {
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='username']")
	private WebElement Username;
	@FindBy(xpath="//input[@type='password']")
	private WebElement Password;
	@FindBy(xpath="//input[@type='Submit']")
	private WebElement btnclick;
	@FindBy(id="location")
	private WebElement Location;
	@FindBy(id="hotels")
	private WebElement Hotel;
	@FindBy(id="room_type")
	private WebElement RoomType;
	@FindBy(id="room_nos")
	private WebElement NumberOfRoom;
	@FindBy(id="datepick_in")
	private WebElement Checkin;
	@FindBy(id="datepick_out")
	private WebElement CheckOut;
	@FindBy(id="adult_room")
	private WebElement Adult;
	@FindBy(id="child_room")
	private WebElement Child;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement ClickSearch;
	@FindBy(xpath="//input[@type='radio']")
	private WebElement radio;
	@FindBy(id="continue")
	private WebElement Countine;
	@FindBy(id="first_name")
	private WebElement FullName;
	@FindBy(id="last_name")
	private WebElement LastName;
	@FindBy(id="address")
	private WebElement BillingAddress;
	@FindBy(id="cc_num")
	private WebElement CardNumber;
	@FindBy(id="cc_type")
	private WebElement CardType;
	@FindBy(id="cc_exp_month")
	private WebElement Date;
	@FindBy(id="cc_exp_year")
	private WebElement Year;
	@FindBy(id="cc_cvv")
	private WebElement CcvNumber;
	@FindBy(id="book_now")
	private WebElement BookNow;
	@FindBy(id="order_no")
	private WebElement OrderNumber;
	@FindBy(name="adults_room")
	private WebElement AdultCount;
	public WebElement getUsername() {
		return Username;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getBtnclick() {
		return btnclick;
	}
	
	public WebElement getLocation() {
		return Location;
	}
	public WebElement getHotel() {
		return Hotel;
	}
	public WebElement getRoomType() {
		return RoomType;
	}
	public WebElement getNumberOfRoom() {
		return NumberOfRoom;
	}
	public WebElement getCheckin() {
		return Checkin;
	}
	public WebElement getCheckOut() {
		return CheckOut;
	}
	public WebElement getAdult() {
		return Adult;
	}
	public WebElement getChild() {
		return Child;
	}
	public WebElement getClickSearch() {
		return ClickSearch;
	}
	public WebElement getRadio() {
		return radio;
		}
	public WebElement getCountine() {
		return Countine;
		}
	public WebElement getFullName() {
		return FullName;
		
		}
	public WebElement getLastName() {
		return LastName;
		}
	public WebElement getBillingAddress(){
		return BillingAddress;
		}
	public WebElement getCardNumber() {
		return CardNumber;
		}
	public WebElement getCardType(){
		return CardType;
		
	}
	public WebElement getDate() {
		return Date;
		}
	public WebElement getYear() {
		return Year;
		}
	public WebElement getCcvNumber() {
		return CcvNumber;
		}
	public WebElement getBookNow() {
		return BookNow;
		}
	
	public WebElement getOrderNumber() {
		return OrderNumber;
		}
	public WebElement getAdultcount() {
		return AdultCount;
		
		
	}
	
	
}

 