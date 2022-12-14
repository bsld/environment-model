package com.company.environmentmodel.environment.member.animal.herbivore;

import java.util.List;

import com.company.environmentmodel.environment.Environment;
import com.company.environmentmodel.environment.member.Eatable;
import com.company.environmentmodel.environment.member.EnvironmentMember;
import com.company.environmentmodel.environment.member.animal.Animal;
import com.company.environmentmodel.environment.member.plants.Cactus;

public class Camel extends Herbivore {

    public Camel(Environment environment) {
        super(environment);
        this.name = "Camel";
    }

    @Override
    public double nutrition() {
        return 50.0;
    }

    @Override
    protected Eatable getFood(List<EnvironmentMember> nearbyCells) {
        for (EnvironmentMember m : nearbyCells) {
            if (m instanceof Cactus) {
                return (Eatable) m;
            }
        }
        return null;
    }

    @Override
    protected Animal getOffspring() {
        return new Camel(environment);
    }
}
