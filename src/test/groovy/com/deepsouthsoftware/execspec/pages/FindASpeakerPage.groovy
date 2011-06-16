package com.deepsouthsoftware.execspec.pages

import geb.Page
import com.deepsouthsoftware.execspec.modules.MattStineModule

class FindASpeakerPage extends Page {
	static url = "speaker/find"
	
	static at = { title == "Find a Speaker" }
	
	static content = {
		mattStine(to: MattStineDetailPage) { module MattStineModule }
		speakerLink(to: SpeakerDetailPage) { name -> $('a', text: name) }
	}
}