package com.deepsouthsoftware.execspec.pages

import geb.Page
import com.deepsouthsoftware.execspec.modules.AlexMillerModule

class FindASpeakerPage extends Page {
	static url = "speaker/find"
	
	static at = { title == "Find a Speaker" }
	
	static content = {
		alexMiller(to: AlexMillerDetailPage) { module AlexMillerModule }
		speakerLink(to: SpeakerDetailPage) { name -> $('a', text: name) }
	}
}