import logo from './logo.svg';
import './App.css';
import {BrowserRouter as Router, Route, Switch}from 'react-router-dom'
import HeaderComponent from './components/HeaderComponent';
import FooterComponent from './components/FooterComponent';
import AdicionarPontoComponent from './components/AdicionarPontoComponent';
import BuscarPontosComponent from './components/BuscarPontosComponent';
import ViewPontoComponent from './components/ViewPontoComponent';

function App() {
  return (
    <div>
      <HeaderComponent/>
       <Router>
        <div className="container">
          
            <div className="container">
              <Switch>
                <Route path="/" exact component={BuscarPontosComponent}></Route>
                <Route path="/pontos" component={BuscarPontosComponent}></Route>
                <Route path="/novo" component={AdicionarPontoComponent}></Route>
                <Route path="/view/:id" component={ViewPontoComponent}></Route>
                
              </Switch>
            </div>
          
        </div>
      </Router>
      <FooterComponent/>
    </div>
  );
}

export default App;
