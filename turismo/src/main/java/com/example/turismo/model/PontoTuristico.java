package com.example.turismo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "pontos")
public class PontoTuristico {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(name = "nome", length = 100 )
		private String nome;
		
		@Column(name = "descricao")
		private String descricao;
		
		@Column(name = "referencia")
		private String referencia;
		
		@Column(name = "cidade")
		private String cidade;
		
		@Column(name = "estado")
		private String estado;
		
		
		@Temporal(TemporalType.DATE)
		@Column(name = "data")
		private Date data;
		
		public PontoTuristico() {
			
		}
			
		public PontoTuristico(String nome, String descricao, String referencia, String cidade, String estado, Date data) {
			super();
			this.nome = nome;
			this.descricao = descricao;
			this.referencia = referencia;
			this.cidade = cidade;
			this.estado = estado;
			this.data = data;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public String getReferencia() {
			return referencia;
		}

		public void setReferencia(String referencia) {
			this.referencia = referencia;
		}

		public String getCidade() {
			return cidade;
		}

		public void setCidade(String cidade) {
			this.cidade = cidade;
		}

		public String getEstado() {
			return estado;
		}

		public Date getData() {
			return data;
		}

		public void setData(Date data) {
			this.data = data;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}
		
		
}
