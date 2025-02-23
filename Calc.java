public class Calc {
        //private data fields
        private double num1;
        private double num2;


        //public Constructor(s)
        public Calc()
        {
            this.num1 = 0.0;
            this.num2 = 0.0;
        }

        //public set methods
        public void setNum1(double num1){
            this.num1 = num1;
        }

        public void setNum2(double num2){
            this.num2 = num2;
        }

        //public get methods
        public double getNum1(){
            return this.num1;
        }

        public double getNum2(){
            return this.num2;
        }

        //Add, subtract, multiply, divide methods
        public double add(){
            return num1 + num2;
        }

        public double subtract(){
            return num1 - num2;
        }

        public double multiply(){
            return num1 * num2;
        }

        public double divide(){
            return num1 / num2;
        }

        //toString method
        public String toString(){
            return "Displaying private data fields using toString(): \n" +
                    "Num1: " + num1 + "\n" +
                    "Num2: " + num2;
        }

    }


