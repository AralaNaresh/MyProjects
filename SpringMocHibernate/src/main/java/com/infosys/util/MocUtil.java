package com.infosys.util;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan(basePackages = "com.infosys")
@EnableTransactionManagement
public class MocUtil {

}
