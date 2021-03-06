package state;

import context.Phone;

public class OffState extends State {
    public OffState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        phone.setState(new LockedState(phone));
        return "[NO ACTION]";
    }

    @Override
    public String onOffOn() {
        phone.setState(new LockedState(phone));
        return "Screen is on, but locked";
    }
}
