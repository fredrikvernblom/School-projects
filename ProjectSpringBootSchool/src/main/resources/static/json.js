var myJsObj = {
    firstName: "Fredrik",
    lastName: "Vernblom",
    age: 31,
    listOfPets: ["Oliver", "Olga"]
};

var myJsonObj = JSON.stringify(myJsObj);

document.write(myJsonObj);

var newJsonObj = '{"firstName":"Marcus","lastName":"Henriksson","age":32,"likes":["Computer Science","Strategy Games","Drawing","Playing the Piano"],"faveColor":"Green","faveSuperHero":{"firstName":"Bruce","lastName":"Wayne","age":56,"alterEgo":"Batman"}}'


//Konverterar JSON stringen till ett JS objekt
var obj = JSON.parse(newJsonObj);

//En For In loop för att gå igenom fälten i objektet.
var strOutput = '';

for (i in obj) {
    strOutput += i + ": " + obj[i] + "<br>";
}
for (i in obj.faveSuperHero) {
    strOutput += i + ": " + obj.faveSuperHero[i] + "<br>";
}

//Resultatet skrivs ut till en output tag.
//document.getElementById("output").innerHTML = strOutput;
document.write( strOutput );