package com.deepsouthsoftware.execspec.pages

import geb.Page

class ReserveSpeakerPage extends Page {
	static url = "rental/reserve/3"
	
	static at = { $("div.reserveLocation > h2").text() == "Pickup location:" }
	
	static content = {
		continueToSignInOrCreateAccount { $("h1.bigLink > a") }
	}
}