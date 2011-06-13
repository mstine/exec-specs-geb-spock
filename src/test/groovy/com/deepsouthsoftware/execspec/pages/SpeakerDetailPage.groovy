package com.deepsouthsoftware.execspec.pages

import geb.Page
import com.deepsouthsoftware.execspec.modules.SpeakerDetailLinkModule

class SpeakerDetailPage extends Page {
	
	static content = {
	  speakerTitle { $("h2").text() }
		findThisSpeaker { module SpeakerDetailLinkModule }
	}
}