package contactmanager

class Phone {
	
	String label
	String npa
	String nxx
	String nxxx
	Person owner
	
	static belongsTo = [Person]
	
    static constraints = {
		label blank:false
		npa   blank:false
		nxx   blank:false
		nxxx  blank:false
		owner
    }

	String toString(){
		"($npa) $nxx-$nxxx"
	}
}
