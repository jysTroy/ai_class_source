const emo = document.createElement("div");
emo.textContent = "🦖";
emo.style.position = "fixed";
emo.style.fontSize = "2rem";
emo.style.pointerEvents = "none";
emo.style.zIndex = 9999;
document.body.appendChild(emo);

document.addEventListener("mousemove", (e) => {
  emo.style.left = `${e.pageX + 10}px`;
  emo.style.top = `${e.pageY + 10}px`;
});
