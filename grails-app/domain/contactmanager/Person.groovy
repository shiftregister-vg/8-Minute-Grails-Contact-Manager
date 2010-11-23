package contactmanager

class Person {
	
	String firstName
	String lastName
	String email
	
	static hasMany = [addresses:Address, phones:Phone]
	
    static constraints = {
		firstName blank:false
		lastName  blank:false
		email     blank:false, email:true
    }
	
	String toString(){
		"$firstName $lastName"
	}
	
}
