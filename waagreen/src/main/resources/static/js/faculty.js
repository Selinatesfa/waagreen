/*window.onload= function(){
	alert("load");
	
		document.getElementById('#mybtn').onclick= clickStart;
	
};*/


$( document ).ready(function(){
	$("#mybtn").click(function(){
		alert('clicked');
	});
});
//$("#mybtn").onclick= function(){
//	alert("btn");
//}

//

function clickStart(){
	alert("start")
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
	}
//var bl=document.getElementById('blockid').value;
//var cr=	document.getElementById('courseid').value;
	

