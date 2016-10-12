$(document).ready(function(){
	
	$('#add').on('click', function(){
		$('#modal_reference_code_detail #modal_employee_detail_header').text('Add Reference');
		$('#save_action').val('add');
		
		$('#modal_reference_code_detail #key').val('');
		$('#modal_reference_code_detail #value').val('');
		$('#modal_reference_code_detail #description').val('');
		
		Materialize.updateTextFields();
		
		$('#modal_reference_code_detail').openModal( {dismissible: false} );
	});
  
    $('.delete').on('click', function(){
		var $row = $(this).closest('tr');
		
		var name = $row.find('#td_name').text();
		
		$('#confirm_modal #confirm_modal_header').text('Confirm');
		$('#confirm_modal #confirm_modal_message').text('Are you sure?');

		$('#save_action').val($row.attr('id'));
		
		$('#confirm_modal').openModal( {dismissible: false} );
   });
    
  //Edit Modal
	$('.edit').on('click', function(){
		$('#modal_reference_code_detail #modal_reference_code_detail_header').text('Edit Reference Code');
		$('#save_action').val('update');
		
		var $row = $(this).closest('tr');
		
		var key = $row.find('#td_key').text();
		var value = $row.find('#td_value').text();
		var description = $row.find('#td_description').text();

		$('#modal_reference_code_detail #key').val(key);
		$('#modal_reference_code_detail #value').val(value);
		$('#modal_reference_code_detail #description').val(description);
		
		Materialize.updateTextFields();
		
		$('#modal_reference_code_detail').openModal( {dismissible: false} );
	});
  
  $('#btn_detail_save').on('click', function(){

		var referenceCodeDetailForm = $('#referenceCodeDetailForm').serialize();
		
		showLoadingProgressInd();
		
		var url = '';		
		var saveAction = $('#save_action').val();
		
		if(saveAction){
			if(saveAction == 'add'){
				url = $('#add_action').attr('href');
			}
			else if(saveAction == 'update'){
				url = $('#update_action').attr('href');
			}
			
			if(url != ''){
				$.ajax({
					url : url,
					type : 'POST',
					data : referenceCodeDetailForm,
					complete: function(){
						$.unblockUI();
						$('.lean-overlay').remove();
					},
					success : function(data) {
						if (data.responseCode && data.responseCode == RESPONSE_CODE_SUCCESS) {
							$('#message_modal #message_modal_header').text('Success');
						}
						else {
							$('#message_modal #message_modal_header').text('Error');
						}
						$('#message_modal #message_modal_message').text(data.responseMsg);

						$('#message_modal_close_action').val("reloadPage");				
						$('#message_modal').openModal( {dismissible: false} );
					},
					error : function() {
						$('#message_modal #message_modal_header').text('Error');
						$('#message_modal #message_modal_message').text('Unknown Error');

						$('#message_modal_close_action').val('');
						$('#message_modal').openModal( {dismissible: false} );
					}
				});
			}
		}
	});
  
  $('#btn_detail_save').on('click', function(){
			
			if(url != ''){
				$.ajax({
					url : url,
					type : 'POST',
					data : referenceCodeDetailForm,
					complete: function(){
						$.unblockUI();
						$('.lean-overlay').remove();
					},
					success : function(data) {
						if (data.responseCode && data.responseCode == RESPONSE_CODE_SUCCESS) {
							$('#message_modal #message_modal_header').text('Success');
						}
						else {
							$('#message_modal #message_modal_header').text('Error');
						}
						$('#message_modal #message_modal_message').text(data.responseMsg);

						$('#message_modal_close_action').val("reloadPage");				
						$('#message_modal').openModal( {dismissible: false} );
					},
					error : function() {
						$('#message_modal #message_modal_header').text('Error');
						$('#message_modal #message_modal_message').text('Unknown Error');

						$('#message_modal_close_action').val('');
						$('#message_modal').openModal( {dismissible: false} );
					}
				});
			}
	});

  
  $('#search').on('click', function(){
		var url = $('#search').attr('href');

		showLoadingProgressInd();
		
		$.ajax({
			url : url,
			type : 'POST',
			data : { 'params' : null,
				     'fetchSize': 3,
				      'page': 3},
				      
			complete: function(){
				$.unblockUI();
				$('.lean-overlay').remove();
			},
			success : function(data) {
			  console.log(data);
			},
			error : function() {
				$('#message_modal #message_modal_header').text('Error');
				$('#message_modal #message_modal_message').text('Unknown Error');

				$('#message_modal_close_action').val('');
				$('#message_modal').openModal( {dismissible: false} );
			}
		});
	});
  
  $('select').material_select()
}); 