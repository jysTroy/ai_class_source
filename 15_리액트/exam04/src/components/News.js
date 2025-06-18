import { useState, useEffect } from 'react';

const News = () => {
  useEffect(() => {
    // 컴포넌트가 마운트 되었을 때 호출
    fetch(
      'https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=0f121e8f1a484c9ab7c911824eb4dfed',
    )
      .then((res) => res.json())
      .then((items) => console.log(items));
  });

  return <></>;
};

export default News;
