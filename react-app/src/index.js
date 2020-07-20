import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App'; // APP컴포넌트를 App이라는 js에서 불러와서 참조하는것
import * as serviceWorker from './serviceWorker';

ReactDOM.render(
  <React.StrictMode>
    <App /> 
  </React.StrictMode>,
  document.getElementById('root')
);

// import한 App이름과 같은태그로 써야됨
// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
