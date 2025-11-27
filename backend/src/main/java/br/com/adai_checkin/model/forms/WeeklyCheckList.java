package br.com.adai_checkin.model.forms;

import java.time.LocalDate;

public class WeeklyCheckList {
    
    // only to supervisors

    private String name;
    private LocalDate serverDate;
    private boolean anyOneLate;
    private String names;
    private boolean anyMissedOut;
    private String namesMissedOut;
    private boolean devocional;
    private String anyRecomendation;
    private Long giftsLeft;
    private String anyObservation;

}
