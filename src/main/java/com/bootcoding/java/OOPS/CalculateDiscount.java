package com.bootcoding.java.OOPS;


    public class CalculateDiscount {
        public static String[] returnDiscountList(int[] frequencyOfShopping){
            String[] discountList = new String[frequencyOfShopping.length];

            for (int i = 0; i < frequencyOfShopping.length; i++){
                discountList[i] = getDiscount(frequencyOfShopping[i]);
            }
            return discountList;
        }

        public static String getDiscount(int countOfShopping){
            String discount;

            if(countOfShopping >= 8){
                discount = "50%";
            } else if (countOfShopping >=4 && countOfShopping <=7 ) {
                discount = "30%";
            } else if (countOfShopping >=1 && countOfShopping <=3) {
                discount = "10%";
            } else {
                discount = "0%";
            }

            return discount;
        }

        public static void main(String[] args) {
            int frequencyOfShopping[] = {8, 10, 2, 5, 0, 6};

            String[] finalDiscountList = returnDiscountList(frequencyOfShopping);

            for(int i = 0; i < finalDiscountList.length; i++){
                System.out.println(frequencyOfShopping[i] + " -> " + finalDiscountList[i]);
            }

        }
    }

