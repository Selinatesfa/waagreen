window.onload= function(){
		document.getElementById('mybtn').onclick= clickStart;
	var bl=document.getElementById('blockid').value;
var cr=	document.getElementById('courseid').value;
	alert(bl+cr)
}

var contextRoot = "/" + window.location.pathname.split('/')[1];
//

function clickStart(){
	//$('#result').hide();
	//alert(bl + cr);
//							
		$.ajax({
			type : 'GET',
			url : contextRoot + 'faculty/Restfaculty?blook=' +bl +"?course="+cr,
			dataType : "json",
						contentType : 'application/json', 
			success : function(response) {
//					$("#result").append();
//				
//				$('#result').show();
				alert("succes");
			},
			error : function(errorObject) {
										
					//alert(errorObject.responseJSON.errors(0)); 
					alert("error")
				}
			}
	};
	function getSelectedOption(sel) {
	    var opt;
	    for ( var i = 0, len = sel.options.length; i < len; i++ ) {
	        opt = sel.options[i];
	        if ( opt.selected === true ) {
	            break;
	        }
	    }
	    return opt;
	}




