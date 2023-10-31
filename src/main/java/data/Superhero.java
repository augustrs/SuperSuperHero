package data;

public class Superhero {
        private String heroName;
        private String realName;
        private String superPower;
        private int strength;
        private int birthYear;
        private boolean isHuman;

        public Superhero(String heroName, String realName, String superPower, int strength, int birthYear, boolean isHuman) {
                this.heroName = heroName;
                this.realName = realName;
                this.superPower = superPower;
                this.strength = strength;
                this.birthYear = birthYear;
                this.isHuman = isHuman;
        }

        public String getHeroName() {
                return heroName;
        }

        public String getRealName() {
                return realName;
        }
        public String getSuperPower() {
                return superPower;
        }
        public int getStrength() {
                return strength;
        }
        public int getBirthYear(){
                return birthYear;
        }
        public boolean getIsHuman(){
                return isHuman;
        }

        public void setHeroName(String heroName) {
                this.heroName = heroName;
        }

        public void setRealName(String realName) {
                this.realName = realName;
        }

        public void setSuperPower(String superPower) {
                this.superPower = superPower;
        }

        public void setStrength(int strength) {
                this.strength = strength;
        }

        public void setBirthYear(int birthYear) {
                this.birthYear = birthYear;
        }

        public void setIsHuman(boolean isHuman) {
                this.isHuman = isHuman;
        }

        public String toString() {
                return "Your superhero's hero name: " + heroName +
                        ", your superhero's real name: " + realName +
                        ", their super power: " + superPower +
                        ", their power level: " + strength +
                        ", year they were born: " + birthYear +
                        ", are they human: " + isHuman;
        }

        /*public String isHuman() {
                if (isHuman == true) {
                        return "Menneskelig";
                } else {
                        return "Ikke menneskelig/alien";
                }
        }

         */
}
