
public interface ISurface {

    double getSurface();

    default int isLargerThan(ISurface other){
        if (this.getSurface() < other.getSurface()) return -1;
        else if (this.getSurface() > other.getSurface()) return 1;
        else return 0;
    }

}
