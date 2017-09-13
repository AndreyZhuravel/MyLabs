
function getRadioValue(){
	
	var mybutton = ""; /*создаем переменную*/
	mybutton = document.myform.mybutton.value /*передаем значение кнопки в переменную*/
	
	if (mybutton == "") { /*проверяем выделена ли хоть 1 кнопка*/
		alert ("Please select item");
		return false
		} 
	else if (mybutton == 1) { /*проверяем нужную нам кнопку*/
		alert ("Right !");
		return true
		} 
	else /*если выбрана не та кнопка которая нам нужна*/
		alert ("Sorry, wrong answer :)"); 
		return false
		}

/** на всякий случай организовать цикл и пробежать по элементам
var len = document.myform.mybutton.length;
	
	var i
	for (i = 0; i < len; i++) {

		if (document.myform.mybutton[i].checked) {
			mybutton = document.myform.mybutton[i].value;
			alert (mybutton);
			break;
			}
**/
