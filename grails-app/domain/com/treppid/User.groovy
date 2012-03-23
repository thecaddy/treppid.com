package com.treppid

class User {
	
	Long id
	Long version
	
	String email
	String password
	String userName
	
	String toString() { "$email" }

    static constraints = {
		email(email:true)
		password(blank:false, password:true)
    }
}
