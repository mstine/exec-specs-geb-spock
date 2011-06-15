package com.deepsouthsoftware.execspec.pages

import geb.Page

class HomePage extends Page {
	static url = "/fluffbox-rwx"
	
	static at = { title == "Fluffbox" }
	
	static content = {
		findASpeaker(to: FindASpeakerPage) { $("div.headerBox > a.headerLink", 0) }
		findAFluffbox(to: FindAFluffboxPage) { $("div.headerBox > a.headerLink", 1) }
	}
}