package com.deepsouthsoftware.execspec.pages

import geb.Page
import com.deepsouthsoftware.execspec.modules.FirstKioskModule

class FindKioskBySpeakerPage extends Page {
	static url = "speakerClone/findBySpeaker/3"
	
	static at = { 
		$("h2").text() == "Find a Fluffbox" && $("h3").text() == "Selected speaker:"
	}
	
	static content = {
		rentNow(to: ReserveSpeakerPage) { module FirstKioskModule }
	}
}