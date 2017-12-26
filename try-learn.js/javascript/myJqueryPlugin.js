(function($){
	$.fn.myJqueryPlugin = function(options){
		var defaults = {
			evenRowClass:"evenRow",
			oddRowClass:"oddRow",
			activeRowClass:"activeRow"			
		}
		var options = $.extend(defaults, options);
		this.each(function(){
			
			//�����ż����ɫ
			$(this).find("tr:even").addClass(options.evenRowClass);
			$(this).find("tr:odd").addClass(options.oddRowClass);
			//��ӻ����ɫ
			$(this).find("tr").bind("mouseover",function(){
				$(this).addClass(options.activeRowClass);
			});
			$(this).find("tr").bind("mouseout",function(){
				$(this).removeClass(options.activeRowClass);
			});
		});
	};
})(jQuery);