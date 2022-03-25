//  Main - running
let x = calculateFactorial(5);
console.log(x);

let y = reverseString("Dzung");
console.log(y);

let z = getHello("VN");
console.log(z);

let s = subString("hoanganhdung0566");
console.log(s);

// Calculate factorial

function calculateFactorial(a) {
  let b = a;
  for (let i = a - 1; i > 0; i--) {
    b = b * i;
  }
  return b;
}

// revertString

function reverseString(a) {
  a = a.split("");
  let len = a.length;
  let temp = "";
  for (let i = 0; i <= len / 2; i++) {
    temp = a[len - i - 1];
    a[len - i - 1] = a[i];
    a[i] = temp;
  }
  return a.join("");
}

// get Hello

function getHello(a) {
  switch (a) {
    case "VN":
      return "Xin chào";
    case "EN":
      return "Hello";
    case "ROM":
      return "Buna ziua";
    case "GEM":
      return "Hallo";
    case "LAT":
      return "Salve";
    default:
      return "Not found this country code";
  }
}

// Sub String

function subString(a) {
  if (a.length < 16) {
    return "";
  }
  let b = a.substring(0, 10) + "...";
  return b;
}
