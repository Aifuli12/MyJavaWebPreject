<!DOCTYPE html>
<html>
<head lang="en">
    <title>Spring Boot Demo - FreeMarker</title>
    <link href="/css/index.css" rel="stylesheet">
    <script type="text/javascript" src="/js/jquery-3.3.1.min.js" ></script>
    <script type="text/javascript" src="/js/index.js"></script>
</head>
<body>
<h2>首页</h2>
<input type="text" id="order" name="order">
<button class="send"> send Order</button>

</body>

<script>
    var websocket = null;
    if('WebSocket' in window) {
        websocket = new WebSocket('ws://localhost:20008/webSocket');
        alert('该浏览器支持websocket');
    }else {
        alert('该浏览器不支持websocket!');
    }

    websocket.onopen = function (event) {
        console.log('建立连接');
    }

    websocket.onclose = function (event) {
        console.log('连接关闭');
    }

    websocket.onmessage = function (event) {
        console.log('收到消息:' + event.data)
        //弹窗提醒, 播放音乐
     alert('收到消息:' + event.data);

//        document.getElementById('notice').play();
    }

    websocket.onerror = function () {
        alert('websocket通信发生错误！');
    }

    window.onbeforeunload = function () {
        websocket.close();
    }

</script>
</html>