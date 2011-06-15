package com.deepsouthsoftware.execspec.pages

import geb.Page
import com.deepsouthsoftware.execspec.modules.SpeakerDetailLinkModule

class AlexMillerClonePage extends Page {
	static url = "speakerClone/show/3"
	
	static at = { $("h1").text() == "Alex Miller" }
	
	static content = {
		rentNow(to: ReserveSpeakerPage) { module SpeakerDetailLinkModule }
	}
}