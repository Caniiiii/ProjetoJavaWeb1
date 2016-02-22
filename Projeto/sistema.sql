 


CREATE TABLE `categoria` (  
  `id_categoria` int(6) NOT NULL AUTO_INCREMENT,  
  `nomeCategoria` varchar(40) NOT NULL,  
  `observacao` varChar(120) NOT NULL,  
  PRIMARY KEY (`id_categoria`)  
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;  



CREATE TABLE `departamento` (  
  `id_departamento` int(6) NOT NULL AUTO_INCREMENT,  
  `nomeDepartamento` varchar(40) NOT NULL,  
  `telefone` varChar(30) NOT NULL, 
  `observacao` varChar(120) NOT NULL, 
  `id_unidade` int,
  PRIMARY KEY (`id_departamento`),
  FOREIGN KEY (`id_unidade`) REFERENCES unidade(`id_unidade`)

) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;


CREATE TABLE `endereco` (  
  `id_endereco` int(6) NOT NULL AUTO_INCREMENT,  
  `cep` varchar(40) NOT NULL,  
  `logradouro` varChar(30) NOT NULL, 
  `numero` varChar(30) NOT NULL,
  `bairro` varChar(30) NOT NULL,
  `cidade` varChar(30) NOT NULL,
   `estado` Char(2) NOT NULL,
   `pais` varChar(30) NOT NULL,
   `id_fabricante` int, 
  PRIMARY KEY (`id_endereco`), 
  FOREIGN KEY (id_fabricante) REFERENCES fabricante(id_fabricante)

) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;  


CREATE TABLE `fabricante` (  
  `id_fabricante` int(6) NOT NULL AUTO_INCREMENT,  
  `nomeFabricante` varchar(40) NOT NULL,  
  `telefone` varChar(30) NOT NULL, 
  `site` varChar(30) NOT NULL,
  `strEndereco` int,
  `observacao` varChar(120), 
  PRIMARY KEY (`id_fabricante`)  
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;


CREATE TABLE `item` (  
  `id_item` int(6) NOT NULL AUTO_INCREMENT,  
  `codigo` int NOT NULL,
  `numeroPlaqueta` int NOT NULL,  
  `dataDeCompra` VarChar(20) NOT NULL, 
  `responsavel` varChar(30), 
  `observacao` varChar(120),
  `quantidade` int NOT NULL,
  `notaFiscalPdf` varChar(40),
  `situacao` varChar(15),
   `prodId` int,
   `uniId` int,
   `departId` int,
   `notaCaminho` varChar(90),
  `id_produto` int,
  `id_unidade` int,
  `id_departamento` int,
  PRIMARY KEY (`id_item`),
  FOREIGN KEY (`id_unidade`) REFERENCES unidade(`id_unidade`),
  FOREIGN KEY (`id_departamento`) REFERENCES departamento(`id_departamento`),
  FOREIGN KEY (`id_produto`) REFERENCES produtos(`id_produto`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;


CREATE TABLE `unidade` (  
  `id_unidade` int(6) NOT NULL AUTO_INCREMENT, 
  `id_endereco` int,
  `nomeUnidade` varChar(30) NOT NULL, 
  `telefone` varChar(30) default NULL,
  `strEndereco` varChar(20) default NULL,
  `observacao` varChar(120) default NULL, 
  PRIMARY KEY (`id_unidade`),  
  UNIQUE KEY `id_endereco_UNIQUE` (`id_endereco`),
  CONSTRAINT `fk_conf_endereco` FOREIGN KEY (`id_endereco`)
  REFERENCES endereco (`id_endereco`) ON DELETE CASCADE ON UPDATE CASCADE

) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;


CREATE TABLE `usuario` (  
  `id` int(6) NOT NULL AUTO_INCREMENT,  
  `userName` varChar(30) NOT NULL,  
  `senha` varChar(30) NOT NULL, 
  `perfil` varChar(6) NOT NULL,
  PRIMARY KEY (`id`)  
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;



CREATE TABLE `produtos` (  
  `id_produto` int NOT NULL AUTO_INCREMENT,
   `id_categoria` int,
   `id_fabricante` int,
   `codigo` int NOT NULL,
   `nomeProduto` varChar(30)  NOT NULL,
   `tempoGarantia` varChar(30),
   `observacao` varChar(120),
   `imagemProduto` varChar(150),
   `caminhoFab` int,
   `caminhoCat` int,
   PRIMARY KEY(`id_produto`)

) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

