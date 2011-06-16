package com.deepsouthsoftware.execspec.pages

import geb.Page
import com.deepsouthsoftware.execspec.modules.SpeakerDetailLinkModule

class MattStineDetailPage extends Page {
	static url = "speaker/show/3"
	
	static at = { $("h1").text() == "Matt Stine" }
	
	static content = {
		findThisSpeaker(to: FindKioskBySpeakerPage) { module SpeakerDetailLinkModule }
	}
}