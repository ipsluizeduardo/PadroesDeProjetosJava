package DIO.gof;

import DIO.gof.facade.Facade;
import DIO.gof.singleton.SingletonEager;
import DIO.gof.singleton.SingletonHolder;
import DIO.gof.singleton.SingletonLazy;
import DIO.gof.strategy.Comportamento;
import DIO.gof.strategy.ComportamentoAgressivo;
import DIO.gof.strategy.ComportamentoDefensivo;
import DIO.gof.strategy.ComportamentoNormal;
import DIO.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		// Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonHolder lazyHolder = SingletonHolder.getInstancia();
		System.out.println(lazyHolder);
		
		
		// Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();	
		
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Luiz", "798588824");
	}

}
