# Central de Erros

<h2>Objetivo</h2>

Em projetos modernos é cada vez mais comum o uso de arquiteturas baseadas em serviços ou microsserviços. Nestes ambientes complexos, erros podem surgir em diferentes camadas da aplicação (backend, frontend, mobile, desktop) e mesmo em serviços distintos. Desta forma, é muito importante que os desenvolvedores possam centralizar todos os registros de erros em um local, de onde podem monitorar e tomar decisões mais acertadas. Neste projeto vamos implementar um sistema para centralizar registros de erros de aplicações.

<h2>A arquitetura do projeto é formada por:</h2>

<h3>Backend - API</h3>
criar endpoints para serem usados pelo frontend da aplicação
criar um endpoint que será usado para gravar os logs de erro em um banco de dados relacional
a API deve ser segura, permitindo acesso apenas com um token de autenticação válido
Frontend
deve implementar as funcionalidades apresentadas nos wireframes
deve ser acessada adequadamente tanto por navegadores desktop quanto mobile
deve consumir a API do produto
desenvolvida na forma de uma Single Page Application
<h2>Observações</h2>
Se a aceleração tiver ênfase no backend (Java, Python, C#, Go, PHP, etc) a equipe deve obrigatoriamente implementar a API. A implementação do frontend é considerado um bônus importante
Se a aceleração tiver ênfase em frontend (React, Vue, Angular, etc) a equipe deve obrigatoriamente implementar o frontend da aplicação e o backend pode ser substituido por uma aplicação mock. A implementação da API é considerado um bônus importante

<h2>Wireframes</h2>
Os wireframes a seguir servem para demonstrar as funcionalidades básicas da aplicação.



