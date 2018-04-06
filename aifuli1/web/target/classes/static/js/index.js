$(function() {

    $('.send').click(function() {

        $.ajax({
            type: "POST",
            url: "sendOrder",
            data: {order:$("#order").val()},
            dataType: "json",
            success: function(data){
             alert('发送订单成功');
            }
        });

    });
})