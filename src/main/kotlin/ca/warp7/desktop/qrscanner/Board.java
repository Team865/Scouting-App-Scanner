package ca.warp7.desktop.qrscanner;


import static ca.warp7.desktop.qrscanner.Alliance.Blue;
import static ca.warp7.desktop.qrscanner.Alliance.Red;

@SuppressWarnings("unused")
public enum Board {
    R1(Red), R2(Red), R3(Red),
    B1(Blue), B2(Blue), B3(Blue),
    RX(Red), BX(Blue);

    private Alliance alliance;

    public Alliance getAlliance() {
        return alliance;
    }

    Board(Alliance alliance) {
        this.alliance = alliance;
    }
}
