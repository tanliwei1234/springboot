<!DOCTYPE html>
<html lang="en">

<head>
    <script type="text/javascript" src="/js/jquery-1.11.3.min.js"></script>
    <script type="text/javascript" src="/js/ai-lib.js"></script>
    <script src="/js/cheat-order.js"></script>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript">
        function AjaxButton() {
            var optionJson=[];
            $.ajax({
                type:"post",
                url:"/user/ajax",
                data:{},
                async:true,
                success:function (data) {
                    optionJson=data;

                    var str="";

                    str+="<tr>"+
                            "<td>"+optionJson.u+"</td>"+
                            "<td>"+optionJson.s+"</td>"+
                            "<td>"+optionJson.e+"</td>"+
                            "<td>"+optionJson.r+"</td>"+
                            "</tr>";

                    document.getElementById("tbodydata").innerHTML = str;
                }
            })
        }
    </script>
</head>


<body>
<table>
<#if user?? >
    <#if user.id== '1'>
        <input type="text" name="id" value="${user.id}"><br/>
        <input type="text" name="name" value="${user.name}"><br/>
        <input type="text" name="sex" value="${user.sex}"><br/>
        <input type="text" name="age" value="${user.age}"><br/>
    <#else>
    else
    </#if>
</#if>
   <!-- <input type="submit" value="修改"><br/>-->


    <tbody id="tbodydata">
    <tr>
        <td>6666</td><br/>
        <td>6666</td><br/>
        <td>6666</td><br/>
        <td>6666</td><br/>
    </tr>
    </tbody>
    <button onclick="AjaxButton()">ajax</button>
</table>
</body>
</html>