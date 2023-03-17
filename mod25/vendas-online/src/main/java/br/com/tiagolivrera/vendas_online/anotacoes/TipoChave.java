package br.com.tiagolivrera.vendas_online.anotacoes;

import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

	String value();
}
