package com.deepsouthsoftware.execspec.pages

import geb.Page

class AlexMillerDetailPage extends Page {
	static url = "speaker/show/3"
	
	static at = { $("h1").text() == "Alex Miller" }
	
	static content = {
		findThisSpeaker { $("div.speakerDetailsLeft > p > a") }
	}
}