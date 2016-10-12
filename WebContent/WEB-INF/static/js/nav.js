var navigation = function() {
	var that, currentActive,
	
	setToInactive = function(currentActive){
		$('#navBarId li.active').removeClass('active');
	}
	setSelectedtoActive = function(selectedMenu) {
	   if(!$('#'+ selectedMenu).hasClass('active')){
		   $('#'+ selectedMenu).addClass('active'); 
	   }
	}

	that = {
		setActive: function(selectedMenu) {		
			setToInactive();
			setSelectedtoActive(selectedMenu);
		},
		
		getActive: function(){
			return currentActive;
		},
	}
	return that;
}