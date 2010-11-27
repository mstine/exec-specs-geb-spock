package com.deepsouthsoftware.execspec.pages

import geb.Page
import com.deepsouthsoftware.execspec.modules.FirstKioskModule

class FindAFluffboxPage extends Page {
	static url = "kiosk/find"
	
	static at = { title == "Find a Fluffbox" }
	
	static content = {
		searchKiosksForm { $('form', name: 'searchKiosksForm') } 
		searchButton { $('input', name: 'searchButton') }
		findSpeakersHere { module FirstKioskModule }
	}
}