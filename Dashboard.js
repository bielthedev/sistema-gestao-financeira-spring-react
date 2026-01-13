
import React, { useEffect, useState } from 'react';
import api from '../services/api';

function Dashboard() {
  const [total, setTotal] = useState(0);

  useEffect(() => {
    api.get('/despesas/total').then(res => setTotal(res.data));
  }, []);

  return (
    <div>
      <h1>Relatório Financeiro</h1>
      <p>Total de despesas: R$ {total}</p>
    </div>
  );
}

export default Dashboard;
