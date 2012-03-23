package com.treppid

class UserController {
	
	def index() {
		redirect (action: login)
	}
	
	def login = {
	}
	
	def doLogin ={
		def user = User.findWhere(email:params['email'],
			password:params['password'])
		session.user = user

	}
}
