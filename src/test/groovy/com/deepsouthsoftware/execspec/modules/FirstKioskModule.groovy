package com.deepsouthsoftware.execspec.modules

import geb.Module

class FirstKioskModule extends Module {
	
	static content = {
		link { $('a.kioskLink', 1) }
	}
	
}