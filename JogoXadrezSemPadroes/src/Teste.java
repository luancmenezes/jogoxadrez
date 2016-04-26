/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lmenezes
 */

public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrentConditionsDisplay condicaoAtual = new CurrentConditionsDisplay();
		StatisticsDisplay estatistica = new StatisticsDisplay();
		ForecastDisplay previsao = new ForecastDisplay();
		WeatherDate estacao = new WeatherDate();
		
		estacao.registerObserver(condicaoAtual);
		estacao.registerObserver(estatistica);
		estacao.registerObserver(previsao);
		
		estacao.setHumidity(25);
		
		

	}

}
