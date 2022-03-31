// Cau 1

const cau1 = document.getElementById("text");

cau1.style.color = "#777";
cau1.style.fontSize = "2rem";
cau1.innerHTML =
  "Tôi có thể làm <em> bất cứ điều gì </em> tôi muốn với JavaScript.";

// Cau 2

const cau2 = document.querySelectorAll("ul:nth-child(2) li");

for (let i = 0; i < cau2.length; i++) {
  cau2[i].style.color = "blue";
}

//Cau 3

const cau3 = document.getElementById("list");

// 3.1 Thêm 3 thẻ <li> có nội dung Item 8, Item 9, Item 10 vào cuối danh sác

for (let i = 8; i <= 10; i++) {
  cau3.innerHTML += `<li>Item ${i}</li>`;
}

// 3.2 Sửa nội dung cho thẻ <li> 1 thành màu đỏ (color)

document.querySelector("#list li:first-child").style.color = "red";

// 3.3 Sửa background cho thẻ <li> 3 thành màu xanh (background-color)

document.querySelector("#list li:nth-child(3)").style.backgroundColor = "blue";

// 3.4 Remove thẻ <li> 4

document.querySelector("#list li:nth-child(4)").remove();

document
  .querySelector("#list li:nth-child(4)")
  .insertAdjacentHTML("beforebegin", "<li>replace the li 4</li>");
