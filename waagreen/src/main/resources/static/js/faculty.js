window.onload= function(){
		//document.getElementById('#mybtn').onclick= clickStart;
	alert("load")
};
//$("#mybtn").onclick= function(){
//	alert("btn");
//}

//

<<<<<<< HEAD
//function clickStart(){
//	//$('#result').hide();
//	//alert(bl + cr);
////							
//		$.ajax({
//			type : 'GET',
//			url : contextRoot + 'faculty/Restfaculty?blook=' +bl +"?course="+cr,
//			dataType : "json",
//						contentType : 'application/json', 
//			success : function(response) {
////					$("#result").append();
////				
////				$('#result').show();
//				alert("succes");
//			},
//			error : function(errorObject) {
//										
//					//alert(errorObject.responseJSON.errors(0)); 
//					alert("error")
//				}
//			}
//	};
//var bl=document.getElementById('blockid').value;
//var cr=	document.getElementById('courseid').value;
	
=======
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
			});
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
>>>>>>> branch 'master' of https://selina.tesfabrhan%40gmail.com@github.com/Selinatesfa/waagreen.git




