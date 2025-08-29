public final class ImmutableInstance {
    final String name;
    final String game;

    ImmutableInstance(ImmutableInstanceBuilder x) {
        this.name = x.name;
        this.game = x.game;
    }

    // no setters
    // If getters then return a deep copy

    static class ImmutableInstanceBuilder {
        private String name;
        private String game;

        ImmutableInstanceBuilder setName(String name) {
            this.name = name;
            return this;
        }

        ImmutableInstanceBuilder setGame(String game) {
            this.game = game;
            return this;
        }

        ImmutableInstance build() {
            return new ImmutableInstance(this);
        }
    }

}
