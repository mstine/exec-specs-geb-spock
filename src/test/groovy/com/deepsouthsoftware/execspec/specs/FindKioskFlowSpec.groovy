package com.deepsouthsoftware.execspec.specs

import geb.spock.GebSpec
import com.deepsouthsoftware.execspec.pages.*

class FindKioskFlowSpec extends GebSpec {
	
	String getBaseUrl() {
		"http://localhost:8080"
	}
	
	def "test find kiosk flow"() {
		given: "Customer is at the Fluffbox Home Page"
		to HomePage
		
		when: "Customer clicks on 'FIND A FLUFFBOX'"
		findAFluffbox.click()
		
		and: "Customer searches for kiosks in Ft. Lauderdale"
		at FindAFluffboxPage
		searchKiosksForm.searchCriteria = 'Ft. Lauderdale'
		searchButton.click()
		
		and: "Customer selects the first kiosk"
		findSpeakersHere.link.click()
		
		and: "Customer clicks on 'Matt Stine'"
		at FindSpeakerByKioskPage
		mattStine.link.click()
		
		and: "Customer clicks 'RENT NOW!'"
		at MattStineClonePage
		rentNow.link.click()
		
		and: "Customer clicks on 'Continue'"
		at ReserveSpeakerPage
		continueToSignInOrCreateAccount.click()
		
		and: "Customer enters username, password, and clicks 'Log in'"
		at LoginPage
		loginForm.j_username = "joeuser"
		loginForm.j_password = "password"
		loginButton.click()
		
		then: "If we'd implemented payment, we'd be ready to pay."
		at PaymentPage
	}
}