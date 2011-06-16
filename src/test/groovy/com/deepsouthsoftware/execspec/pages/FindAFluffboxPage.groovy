package com.deepsouthsoftware.execspec.pages

import geb.Page
import com.deepsouthsoftware.execspec.modules.FirstKioskModule

class FindAFluffboxPage extends Page {
	static url = "kiosk/find"
	
	static at = { title == "Find a Fluffbox" }
	
	def searchForKiosks(def where) {
		searchKiosksForm.searchCriteria = where
		searchButton.click()
		waitFor(5, 0.5) { findSpeakersHere.link.present }
	}
	
	static content = {
		searchKiosksForm { $('form', name: 'searchKiosksForm') } 
		searchButton { $('input', name: 'searchButton') }
		findSpeakersHere(to: FindSpeakerByKioskPage) { module FirstKioskModule }
	}
}