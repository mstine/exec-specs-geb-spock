package com.deepsouthsoftware.execspec.modules

import geb.Module

class SpeakerDetailLinkModule extends Module {
	
	static content = {
		link { $("div.speakerDetailsLeft > p > a") }
	}
	
}