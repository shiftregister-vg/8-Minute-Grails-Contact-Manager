package contactmanager

class Address {
	
	String street1
	String street2
	String city
	String state
	String zip
	
	static belongsTo = [Person]
	static hasMany = [people:Person]
	
    static constraints = {
		street1 blank:false
		street2 blank:true, nullable:true
		city    blank:false
		state   blank:false
		zip     blank:false
    }

	String toString(){
		"$street1 ${ street2 ?: '' }, $city, $state $zip"
	}
}
