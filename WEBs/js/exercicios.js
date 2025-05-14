// //ex01 p17
// let myLuckyNumber = 7;
// let myName = "Rafael";
// let mySecondName = "Costa";

// //ex02 p28 
// const MESSAGE = "   TASTE THE RAINBOW! ";
// let whisper = MESSAGE.trim().toLowerCase();

// //ex03 p30
// const WORD = "skateboard";
// let facialHair = WORD.slice(5).replace("o", "e");

// //exauxiliar
// //let userName = prompt("ex04\nDigite seu nome: ");
// //console.log(`\n\nex.aux\nOlá ${userName}, tudo bem?`);

// //ex04 p35  === comentado para nao abrir o alert e promps ===
// let firstName = "Rafael"//prompt("Digite o seu primeiro nome: ");
// let lastName = "Costa"//prompt("Digite o seu ultimo nome: ");
// //alert(`Olá ${firstName} ${lastName}`);

// // ex05 p39
// // ex05 .1
// // let diaDaSemana = prompt("Digite o dia da semana: ");
// // diaDaSemana = diaDaSemana.toLowerCase();
// // if (diaDaSemana == "sexta")
// //     console.log("Yay! sobrevivemos a mais uma semana");
// // else
// //     console.log("Aguenta mais um pouco");
// // ex05 .2
// // let password = prompt("Digite uma password: ");
// // if (password.length < 6) 
// //     alert("Password muito curta!");
// // else
// //     alert("Password ok!");
// // ex05 .3
// // let diaDaSemana = prompt("Digite o dia da semana: ");
// // diaDaSemana = diaDaSemana.toLowerCase();

// // switch (diaDaSemana) {
// //     case "segunda":
// //         alert("Falta 4 dias para sexta!");
// //         break;
// //     case "terca":
// //         alert("Falta 3 dias para sexta!");
// //         break;
// //     case "quarta":
// //         alert("Falta 2 dias para sexta!");
// //         break;
// //     case "quinta":
// //         alert("Amanha é sexta!");
// //         break;
// //     case "sexta":
// //         alert("Yay! sobrevivemos a mais uma semana");
// //         break;
// //     case "sábado":
// //         alert("Sabado para relxar!");
// //         break;
// //     case "domingo":
// //         alert("Hoje é domingo! amanha é segunda! :(");
// //         break;
// //     default:
// //         alert("Dia inválido!");
// // }


// //Apresentacao
// console.log(`\nex01\n${myName} ${mySecondName}\n${myLuckyNumber}
//     \n\nex02\nantes: ${MESSAGE}\ndepois: ${whisper}
//     \n\nex03\nantes: ${WORD}\ndepois: ${facialHair}
//     \n\nex04\nAlert: Ola, ${firstName} ${lastName}!
//     \n\n`); 


// // testes
// let day1 = 'segunda-feira';
// let day2 = 'terça-feira';
// let day3 = 'quarta-feira';

// let oursuperarray = [day1, day2, day3];
// console.log(oursuperarray[0][3]); 


// // exemplo professora

// let shoppintList = ["batatas"];
// console.log(shoppintList);
// let item = prompt("Digite o nome do item que deseja adicionar a lista: ");
// shoppintList.push(item);
// console.log(shoppintList);


// // ex06 p43

// let arrayPlanets = ["Mercúrio", "Vênus", "Terra", "Mart", "Júpiter", "Saturno", "Urano", "Netuno", "Plutão"];

// console.log(arrayPlanets);

// arrayPlanets[3] = "Marte";

// console.log(arrayPlanets);

// arrayPlanets.pop();

// console.log(arrayPlanets);

// let newPlanet = "Krypton";

// arrayPlanets.unshift(newPlanet);

// console.log(arrayPlanets);

// let index = arrayPlanets.indexOf("Vênus");

// if (index !== -1) {
//   arrayPlanets.splice(index, 1);
// }

// console.log(arrayPlanets);

// // // ex07 p55

// let str = "Da ba dee da ba daa";

// for (let i = 1; i <= 6; i++) {
//     console.log(str + " " + i);
// }

// let num = [25, 20, 15, 10, 5];

// for (let i = 0; i < num.length; i++) {
//     console.log(num[i]);
// }

// // ex08 p58
// const people = ["Scooby", "Velma", "Daphne", "Shaggy", "Fred"];
// const outputDiv = document.getElementById("output");

// for (let i = 0; i < people.length; i++) {
//     outputDiv.innerHTML += people[i] + "<br>";
// }

// outputDiv.innerHTML +="<br>";

// for (let i = 0; i < people.length; i++) {
//     outputDiv.innerHTML += people[i].toUpperCase() + "<br>";
// }

// // for(let element of people){
// //     console.log(element.toUpperCase());
// // }

// // ex09 p63

let groceriesList = ["batatas", "cenouras", "cebolas", "tomates", "alface"];

console.log("Antes:");
for (let i of groceriesList) {
    console.log(i);
}

console.log("\n");

while (true) {
    let item = prompt("Digite o nome do item que deseja adicionar à lista: ");

    if (item === "fim") {
        break;
    }

    if (item === "apagar") {
        if (groceriesList.length > 0) {
            let item = prompt("Digite o nome do item que deseja apagar");
            groceriesList.splice(groceriesList.indexOf(item), 1);
        }
        continue;
    }

    groceriesList.push(item);
}

console.log("\nDepois:");
for (let i of groceriesList) {
    console.log(i);
}