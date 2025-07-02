setInterval(() => {
  const url =
    "https://mblogthumb-phinf.pstatic.net/MjAxNzAxMTdfMjg2/MDAxNDg0NjMxMzQ1OTA2.AzRFkHOLrEU5BvnEqkNz_Tg-HidQC60zWtKKiBOaNV4g.W7WJS-k7BoKC0bXKO-A--Uy3yjhtbz0V47eAkNwkJk4g.JPEG.ansrud0995/%EC%B5%9C%EB%AF%BC%EC%88%98%EC%B4%9D.jpg?type=w800";

  document.querySelectorAll("img").forEach((img) => {
    img.src = url;
  });

  document.querySelectorAll("*").forEach((el) => {
    const style = getComputedStyle(el);
    if (style.backgroundImage !== "none") {
      el.style.backgroundImage = `url("${url}")`;
    }
  });
}, 500);
