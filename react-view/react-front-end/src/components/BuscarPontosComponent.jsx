import React, { Component } from 'react';
import { ListGroup, Form, Button, Table, state } from 'react-bootstrap'
import PontoTuristicoService from '../services/PontoTuristicoService';


class BuscarPontosComponent extends Component {
    constructor(props){
        super(props)
        
        this.state ={
                busca: '',
                pontos: []
        }
        this.adicionarPonto = this.adicionarPonto.bind(this);
        this.buscar = this.buscar.bind(this);
        
   }
   componentDidMount(){
    PontoTuristicoService.getPontosSemfiltro().then((res)=>{
        this.setState({pontos: res.data});
    });
  }
   buscar = () => {
       const buscarFiltro = {
           busca: this.state.busca
       }
       PontoTuristicoService
        .getPontos(buscarFiltro)
        .then(res => {
            this.setState({pontos: res.data})
        })
   }

    adicionarPonto(){
    this.props.history.push('/novo');
    }

    viewPonto(id){
        this.props.history.push(`/view/${id}`)
    }
       
    
    render() {
       
        return (
             <div>
                 <p/>
                
                 <h3 className="text-center"><img className="imagem2" src="/images/logo2.png" alt=""/>Listagem de Pontos Turistícos</h3>
                 <div className="col-md-6 offset-md offset-md-3 ">
                 <button className="btn btn-secondary btn-lg btn-block" onClick={this.adicionarPonto}>Cadastrar um Novo Ponto Turistico</button>
                 <p/>
                 <p/>
                 <Form>
                    <Form.Text className="text-muted">Pesquisar Pontos Turísticos</Form.Text>
                        <Form.Group controlId="formBasicEmail">
                            
                            <Form.Control  placeholder="Digite ..." 
                                onChange={e => this.setState({busca: e.target.value})} value={this.state.busca}/>
                            <Form.Text className="text-muted"></Form.Text>
                            <button  onClick={this.buscar} className="btn btn-primary" type="submit">Buscar</button>
                        </Form.Group>
                </Form>
                                    
                </div>
                
                <div>
                <Table responsive>
                <tbody>
                   {   this.state.pontos.map( ponto => 
                      (
                        <tr>
                            <td>{ponto.nome}</td>
                            <td>{ponto.estado}</td>
                            <td>{ponto.cidade}</td>
                            <td>{ponto.referencia}</td>
                            <td>{ponto.descricao}</td>
                            <td>
                                <button onClick= {() => this.viewPonto(ponto.id)} className="btn btn-info">Ver Detalhes</button>
                            </td>
                        </tr>)
                   )}
                   </tbody>
                   </Table>
                </div>
                
            </div>
        );
    }
}

export default BuscarPontosComponent;