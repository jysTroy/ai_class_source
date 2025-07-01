import React, { use } from 'react';
import { useParams } from 'react-router-dom';

const Listpage = () => {
  const params = useParams();
  return <h1>글 목록</h1>;
};

export default React.memo(Listpage);
