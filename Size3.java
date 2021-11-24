
    enum Size3 {
        SMALL {
            public String toString() {
                return "La taille est petite.";
            }
        },

        MEDIUM {
            @Override
            public String toString() {
                return "La taille est moyenne.";
            }
        };
    }


