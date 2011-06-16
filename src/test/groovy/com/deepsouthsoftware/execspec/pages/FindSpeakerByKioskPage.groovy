package com.deepsouthsoftware.execspec.pages

import geb.Page
import com.deepsouthsoftware.execspec.modules.MattStineModule

class FindSpeakerByKioskPage extends Page {
	static url = "speakerClone/findByKiosk/1"
	
	static at = { 
		$("h1").text() == "All Speakers" && $("h2").text() == "Selected Fluffbox:"
	}
	
	static content = {
		mattStine(to: MattStineClonePage) { module MattStineModule }
	}
}