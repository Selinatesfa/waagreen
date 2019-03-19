// pathname is contextRoot/path/path/ so we want to get [1] 
// that is where contextRoot is
// [0] has "" as a result of split 
var contextRoot = "/" + window.location.pathname.split('/')[1];

function serializeObject(form) {
	var jsonObject = {};
	var array = form.serializeArray();
	$.each(array, function() {
		jsonObject[this.name] = this.value;
	});
	return jsonObject;
};
$( document ).ready(function() {
	$('#result').hide();
	
	$('#submitBtn').click(function(event){
		event.preventDefault();
				//var dataToSend = JSON.stringify(serializeObject($('#categoryForm')));
		$.ajax({
			type : 'GET',
			url : contextRoot + 'faculty/faculty',
			dataType : "json", // Accept header
			//data : dataToSend,
			contentType : 'application/json', // Sends - Content-type
			success : function(response) {
					$("#result").append();
				
				$('#result').show();
				alert("succes");
			},
			error : function(errorObject) {
										
					//alert(errorObject.responseJSON.errors(0)); 
					alert("error")
				}
			}
		});
		
	});  
});


