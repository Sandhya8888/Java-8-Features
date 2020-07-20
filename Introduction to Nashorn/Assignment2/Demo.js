var fun1=
function(n){ 
var i, flag = true; 
for(i = 2; i <= n - 1; i++) {
if (n % i == 0) { 
flag = false; 
break; 
} 
}
if (flag == true) {
return true;
}
else{
return false;
}
} 
