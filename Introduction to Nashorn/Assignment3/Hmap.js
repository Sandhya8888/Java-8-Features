var j=Java.type('java.util.HashMap');
var capitals = new j();
capitals.put("India","New Delhi");
capitals.put("Australia","canberra");
capitals.put("China","Beijing");
capitals.put("Finland","Helsinki");
capitals.put("Russia","Moscow");
print("Country"+"\t"+"Capital");
for (var i in capitals){
print(i+"\t"+capitals[i]);
}


