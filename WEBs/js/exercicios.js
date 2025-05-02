//ex01 p17
let myLuckyNumber = 7;
let myName = "Rafael";
let mySecondName = "Costa";

//ex02 p28 
const MESSAGE = "   TASTE THE RAINBOW! ";
let whisper = MESSAGE.trim().toLowerCase();

//ex03 p30
const WORD = "skateboard";
let facialHair = WORD.slice(5).replace("o", "e");

//exauxiliar
//let userName = prompt("ex04\nDigite seu nome: ");
//console.log(`\n\nex.aux\nOlá ${userName}, tudo bem?`);

//ex04 p35  === comentado para nao abrir o alert e promps ===
let firstName = "Rafael"//prompt("Digite o seu primeiro nome: ");
let lastName = "Costa"//prompt("Digite o seu ultimo nome: ");
//alert(`Olá ${firstName} ${lastName}`);

//ex05 p39
//ex05 .1
// let diaDaSemana = prompt("Digite o dia da semana: ");
// diaDaSemana = diaDaSemana.toLowerCase();
// if (diaDaSemana == "sexta")
//     console.log("Yay! sobrevivemos a mais uma semana");
// else
//     console.log("Aguenta mais um pouco");
//ex05 .2
// let password = prompt("Digite uma password: ");
// if (password.length < 6) 
//     alert("Password muito curta!");
// else
//     alert("Password ok!");
//ex05 .3
// let diaDaSemana = prompt("Digite o dia da semana: ");
// diaDaSemana = diaDaSemana.toLowerCase();

// switch (diaDaSemana) {
//     case "segunda":
//         alert("Falta 4 dias para sexta!");
//         break;
//     case "terca":
//         alert("Falta 3 dias para sexta!");
//         break;
//     case "quarta":
//         alert("Falta 2 dias para sexta!");
//         break;
//     case "quinta":
//         alert("Amanha é sexta!");
//         break;
//     case "sexta":
//         alert("Yay! sobrevivemos a mais uma semana");
//         break;
//     case "sábado":
//         alert("Sabado para relxar!");
//         break;
//     case "domingo":
//         alert("Hoje é domingo! amanha é segunda! :(");
//         break;
//     default:
//         alert("Dia inválido!");
// }


//Apresentacao
console.log(`\nex01\n${myName} ${mySecondName}\n${myLuckyNumber}
    \n\nex02\nantes: ${MESSAGE}\ndepois: ${whisper}
    \n\nex03\nantes: ${WORD}\ndepois: ${facialHair}
    \n\nex04\nAlert: Ola, ${firstName} ${lastName}!
    \n\n`); 

