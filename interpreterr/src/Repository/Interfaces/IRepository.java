package Repository.Interfaces;

import Model.Utils.Interfaces.IProgramState;

import java.io.IOException;

public interface IRepository {
    public void addProgramState(IProgramState st);
    public IProgramState getProgramState(int index);
    public int getSize();
    public void clean();
    void logProgramStates() throws IOException;

}
