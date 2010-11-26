package com.deepsouthsoftware.execspec.pages

import geb.Page

class LoginPage extends Page {
	static url = "login/auth"
	
	static at = { title == "Login" }
	
	static content = {
		loginForm { $("form", name: "loginForm") }
		loginButton { $("a#loginButton") }
	}
}