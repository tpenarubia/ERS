var globalPageTable = null;

//Show loading progress (indeterminate)
var showLoadingProgressInd = function(){
    $('#loading_progress_message').text("Loading Please wait...");
	
	$.blockUI({
		message: $('#loading_progress'),
		css:{
			padding: 0,
            margin: 0,
            width: '30%',
            top: '40%',
            left: '35%',
            textAlign: 'center',
            cursor: 'wait',
            border: 'none',
            backgroundColor: 'none'
       	}
	});
};