package com.deepsouthsoftware.execspec.pages

import geb.Page

class FindASpeakerPage extends Page {
	static url = "speaker/find"
	
	static at = { title == "Find a Speaker" }
	
	static content = {
		alexMiller { $("div.speakerRow > div.speaker > a").getAt(2) }
	}
}