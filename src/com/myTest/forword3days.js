function beforeDay(num,sysdate){
    //设置日期，当前日期的前num天
    var myDate = new Date(sysdate);
    myDate.setDate(myDate.getDate() - (num-1));
    var dateArray = [];
    var dateTemp;
    var flag = 1;
    for (var i = 0; i < num; i++) {
        dateTemp = myDate.getFullYear()+'-'+(myDate.getMonth()+1)+'-'+myDate.getDate();
        dateArray.push(dateTemp);
        myDate.setDate(myDate.getDate() + flag);
    }
    return dateArray;
}

function string2Date(str){
    //将8位字符日期格式拼接为带中划线的字符日期格式
    var dateString = str.substring(0,4) + '-' + str.substring(4,6) + '-' + str.substring(6,8);
    //将字符串转换成Date类型
    var temp  = new Date(dateString);
    //获取不带 0 的日期字符串
    var returnDate = temp.getFullYear()+'-'+(temp.getMonth()+1)+"-"+temp.getDate();
    return returnDate;
}
