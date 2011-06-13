package com.deepsouthsoftware.execspec.modules

import geb.Module

class AlexMillerModule extends Module {
	
	static content = {
		link { $("div.speakerRow > div.speaker > a", 2) }
	}
	
}