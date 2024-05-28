package bites.examples;

public class StoryBuilder {
    String plot;

    public String getPlot() {
        return plot;
    }

    public StoryBuilder(String plot) {
        this.plot = plot;
    }

    public void addPlotline(String plotline) {
        this.plot += String.format(" %s", plotline);
    }

    public static void main(String[] args) {
        StoryBuilder storyBuilder = new StoryBuilder("Once upon a time, there was a little dog.");
        storyBuilder.addPlotline("This dog was very brave and clever.");
        storyBuilder.addPlotline("He was loved by all.");
        System.out.println(storyBuilder.getPlot());
    }
}
