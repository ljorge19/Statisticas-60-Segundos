package br.com.fiap.trabalhofinal.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

import br.com.fiap.trabalhofinal.model.Statistic;
import br.com.fiap.trabalhofinal.model.Transaction;
import br.com.fiap.trabalhofinal.repository.ApiRepository;

@RestController
@Api(value = "Statistic", description = "Statistic REST API")
public class ApiController {

	private static ApiRepository repository = new ApiRepository();
	
	@GetMapping("/statistics")
	@ApiOperation(httpMethod = "GET", value = "Metodo GET para calcular estatisticas dos ultimos 60 segundos dentro de um timezone")
    @ApiResponses(value = {
        @ApiResponse(
            code = 200,
            message = "Retorna a estatistica baseada nas transacoes que aconteceram nos últimos 60 segundos",
            response = Statistic.class
        )
    })
    public ResponseEntity<Statistic> statistic() throws Exception {

        return new ResponseEntity<>(repository.all(), HttpStatus.OK);
    }
	
	@PostMapping("/transactions")
	@ApiOperation(httpMethod = "POST", value = "Metodo POST para incluir os dados de uma transacao realizada nos ultimos 60 segundos")
    @ApiResponses(value = {
        @ApiResponse(
            code = 201,
            message = "Transacao criada"
        ),
        @ApiResponse(
            code = 204,
            message = "Transacao realizada a mais de 60 segundos"
        ),
    })
    public ResponseEntity<Transaction> transaction(@RequestBody Transaction transaction) throws Exception {

		return new ResponseEntity<Transaction>(repository.save(transaction) ? HttpStatus.CREATED : HttpStatus.NO_CONTENT);       
    }
}
