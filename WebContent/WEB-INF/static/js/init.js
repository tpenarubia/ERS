$(function() {
	 $('#loading_progress').hide();
	 
	 $('#message_modal_close').on('click', function(){
			var action =  $('#message_modal_close_action').val();
			if(action && action != ""){
				switch(action) {
			    	case 'reloadPage':
			    		var delay = 1000;
		    			location.reload();
			    		break;
			    	case 'reloadTable':
			    		//globalPageTable is a variable declared in functions.js to hold datatable initialized table variable
			    		if (globalPageTable && globalPageTable != null){
			    			globalPageTable.ajax.reload();
			    		}
			    		break;
				}
			}
		});
}); // end of jQuery name space
