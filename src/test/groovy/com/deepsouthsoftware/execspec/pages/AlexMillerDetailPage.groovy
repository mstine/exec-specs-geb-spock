package com.deepsouthsoftware.execspec.pages

import geb.Page
import com.deepsouthsoftware.execspec.modules.SpeakerDetailLinkModule

class AlexMillerDetailPage extends Page {
	static url = "speaker/show/3"
	
	static at = { $("h1").text() == "Alex Miller" }
	
	static content = {
		findThisSpeaker { module SpeakerDetailLinkModule }
	}
}