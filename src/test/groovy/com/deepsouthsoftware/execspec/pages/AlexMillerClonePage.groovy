package com.deepsouthsoftware.execspec.pages

import geb.Page

class AlexMillerClonePage extends Page {
	static url = "speaker/show/3"
	
	static at = { $("h1").text() == "Alex Miller" }
	
	static content = {
		rentNow { $("div.speakerDetailsLeft > p > a") }
	}
}