package protest.circlecitest.entity.enum_type;

public enum Rating {
    G("G") {
        @Override
        public String getRatingName() {
            return "G";
        }
    },
    PG("PG") {
        @Override
        public String getRatingName() {
            return "PG";
        }
    },
    PG13("PG-13") {
        @Override
        public String getRatingName() {
            return "PG-13";
        }
    },
    R("R") {
        @Override
        public String getRatingName() {
            return "R";
        }
    },
    NC17("NC-17") {
        @Override
        public String getRatingName() {
            return "NC-17";
        }
    };


    Rating(String ratingName) {

    }

    public String getRatingName() {
        return "";
    }
}
