package com.oauthserver.securityserver.config.handle;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.zalando.problem.spring.web.advice.AdviceTrait;
import org.zalando.problem.spring.web.advice.ProblemHandling;

@ControllerAdvice
@ConditionalOnMissingBean(AdviceTrait.class)
class ProblemExceptionHandler implements ProblemHandling {


}