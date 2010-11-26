package com.deepsouthsoftware.execspec.pages

import geb.Page

class PaymentPage extends Page {
	static url = "rental/payment"
	
	static at = { title == "Payment" }
}