package com.deepsouthsoftware.execspec.pages

import geb.Page
import com.deepsouthsoftware.execspec.modules.SpeakerDetailLinkModule

class MattStineClonePage extends Page {
	static url = "speakerClone/show/3"
	
	static at = { $("h1").text() == "Matt Stine" }
	
	static content = {
		rentNow(to: ReserveSpeakerPage) { module SpeakerDetailLinkModule }
	}
}