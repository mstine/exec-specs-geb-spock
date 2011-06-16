package com.deepsouthsoftware.execspec.specs

import geb.spock.GebSpec
import com.deepsouthsoftware.execspec.pages.*

class SpeakerTitleSpec extends GebSpec {
		
	String getBaseUrl() {
		"http://localhost:8080"
	}
	
	def "test find speaker flow"() {
		given: "Customer is at the Fluffbox Home Page"
		to HomePage
		
		when: "Customer clicks on 'FIND A SPEAKER'"
		findASpeaker.click()
		
		and: "Customer clicks on a speaker's name"
		at FindASpeakerPage
		speakerLink(speaker).click()
		
		then: "Customer should see speaker's title"
		speakerTitle == title
		
		where:
		speaker					| title
		"Craig Walls"			| "Author of Spring in Action"
		"Venkat Subramaniam"	| "Founder of Agile Developer, Inc."
		"Brian Sletten"			| "Forward Leaning Software Engineer"
		"Ken Sipe"				| "Gradleware CTO"
	}
	
}