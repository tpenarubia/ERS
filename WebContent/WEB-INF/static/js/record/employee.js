$(document).ready(function(){
  $('#add').on('click', function(){
		$('#modal_employee_detail #modal_employee_detail_header').text('Add Employee');
		$('#save_action').val('add');
		
		$('#modal_employee_detail #id').val('0');
		$('#modal_employee_detail #code').val('');
		$('#modal_employee_detail #name').val('');
		$('#modal_employee_detail #payGrade').val('');
		$('#modal_employee_detail #dateHired').val('');
		
		Materialize.updateTextFields();
		$('#modal_employee_detail #payGrade').material_select();
		
		$('#modal_employee_detail').openModal( {dismissible: false} );
	});
  
  $('#btn_detail_save').on('click', function(){

		var employeeDetailForm = $('#employeeDetailForm').serialize();
		
		showLoadingProgressInd('Saving record');
		
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
					data : employeeDetailForm,
					complete: function(){
						hideLoadingProgressInd();
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
}); 