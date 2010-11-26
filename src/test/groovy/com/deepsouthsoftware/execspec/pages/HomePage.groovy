package com.deepsouthsoftware.execspec.pages

import geb.Page

class HomePage extends Page {
	static url = "/fluffbox-rwx"
	
	static at = { title == "Fluffbox" }
	
	static content = {
		findASpeaker { $("div.headerBox > a.headerLink").getAt(0) }
	}
}