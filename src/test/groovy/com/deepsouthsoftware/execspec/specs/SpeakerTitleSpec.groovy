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
		findASpeaker.click(FindASpeakerPage)
		
		and: "Customer clicks on a speaker's name"
		at FindASpeakerPage
		$('a', text: speaker).click()
		
		then: "Customer should see speaker's title"
		$("h2").text() == title
		
		where:
		speaker					| title
		"Alex Miller"		| "Sr. Engineer with Terracotta Inc."
		"Aaron Bedra"		| "Principal at Relevance, Member Clojure/core"
		"Andrew Glover"	| "Founder of easyb"
		"Brian Goetz"		| "Author of Java Concurrency in Practice"
	}
}