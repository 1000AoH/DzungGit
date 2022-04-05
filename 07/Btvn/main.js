let colors = ["#3498db", "#9b59b6", "#e74c3c", "#2c3e50", "#d35400"];
let wrap = document.querySelector(".wrap");
let moreBoxes = document.getElementById("btn");
let totalBoxes = document.getElementById("score");
let divBoxes = document.getElementsByClassName("box");

// Khởi tạo khi refresh page

createFiveColors();
totalBoxes.innerText = `Total box: ${divBoxes.length}`;

// Hàm tạo 5 màu theo đúng thứ tự

function createFiveColors() {
  for (let i = 0; i < colors.length; i++) {
    let x = document.createElement("div");
    x.className = "box";
    x.style.backgroundColor = colors[i];
    wrap.appendChild(x);
  }
  addRemove();
}

// Hàm add thêm event click remove cho từng element trong class.

function addRemove() {
  for (let i = 0; i < divBoxes.length; i++) {
    divBoxes[i].addEventListener("click", function () {
      this.remove();
      totalBoxes.innerText = `Total box: ${divBoxes.length}`;
    });
  }
}

// Event khi click vào thêm màu

moreBoxes.addEventListener("click", function () {
  createFiveColors();
  totalBoxes.innerText = `Total box: ${divBoxes.length}`;
});

// Update totalBox đang hiển thị

// document.addEventListener("click", function () {
//   totalBoxes.innerText = `Total box: ${divBoxes.length}`;
// });
