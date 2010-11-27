package com.deepsouthsoftware.execspec.pages

import geb.Page

class FindAFluffboxPage extends Page {
	static url = "kiosk/find"
	
	static at = { title == "Find a Fluffbox" }
	
	static content = {
		searchKiosksForm { $('form', name: 'searchKiosksForm') } 
		searchButton { $('input', name: 'searchButton') }
		findSpeakersHere { $('a.kioskLink').getAt(1) }
	}
}