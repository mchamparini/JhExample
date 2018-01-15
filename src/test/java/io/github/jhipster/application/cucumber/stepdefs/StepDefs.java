package io.github.jhipster.application.cucumber.stepdefs;

import io.github.jhipster.application.JhExampleApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhExampleApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
