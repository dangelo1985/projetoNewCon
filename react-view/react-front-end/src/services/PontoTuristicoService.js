import axios from "axios";

const PONTOS_API_BASE_URL = "http://localhost:8080/api/v1/pontos";
class PontoService{
    
    getPontosSemfiltro(filtro){
        return axios.get(PONTOS_API_BASE_URL);
    }
    getPontos(filtro){
        return axios.get(PONTOS_API_BASE_URL+"/nome/"+filtro);
    }
    getPontosID(filtroID){
        return axios.get(PONTOS_API_BASE_URL+"/id/"+filtroID);
    }
    
    salvar(ponto){
        return axios.post(PONTOS_API_BASE_URL, ponto);
        
    }
    
}
export default new PontoService()