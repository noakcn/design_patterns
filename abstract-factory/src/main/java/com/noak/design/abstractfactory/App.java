package com.noak.design.abstractfactory;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yeww
 * @since 2018-07-03
 */
@Data
@Slf4j
public class App {

    private King king;
    private Castle castle;
    private Army army;

    public void createKingdom(KingdomFactory factory) {
        this.king = factory.createKing();
        this.castle = factory.createCastle();
        this.army = factory.createArmy();
    }

    public static void main(String[] args) {
        App app = new App();

        log.info("build elf kingdom");
        app.createKingdom(FactoryMaker.makeFactory(FactoryMaker.KingdomType.ELF));
        log.info("\nking = {} \n castle = {} \n army = {}",
                app.getKing().getDescription(),
                app.getCastle().getDescription(),
                app.getArmy().getDescription());

        log.info("build orc kingdom");
        app.createKingdom(FactoryMaker.makeFactory(FactoryMaker.KingdomType.ORC));
        log.info("\nking = {} \n castle = {} \n army = {}",
                app.getKing().getDescription(),
                app.getCastle().getDescription(),
                app.getArmy().getDescription());

    }
}
