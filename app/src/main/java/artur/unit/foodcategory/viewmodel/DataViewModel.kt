package artur.unit.foodcategory.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import artur.unit.foodcategory.R
import artur.unit.foodcategory.presentation.model.FoodModel
import artur.unit.foodcategory.presentation.model.FoodPojo

class DataViewModel(context: Context) : ViewModel() {

    val foodList = mutableListOf(
        FoodPojo(
            context.getString(R.string.breakfast),
            listOf(
                FoodModel(
                    title = context.getString(R.string.title1_1),
                    desc = context.getString(R.string.desc1_1),
                    calories = 320,
                    protein = 18,
                    carbs = 10,
                    fat = 22,
                    ingredients = listOf(
                        context.getString(R.string.eggs),
                        context.getString(R.string.tomatoes),
                        context.getString(
                            R.string.mushrooms
                        ),
                        context.getString(R.string.spinach),
                        context.getString(R.string.salt),
                        context.getString(
                            R.string.pepper
                        )
                    ),
                    cookingTime = context.getString(R.string._20_minutes),
                    img = R.drawable.breakfast_1,
                    websiteUrl = "https://youtu.be/gAaMKulYO5c?si=ek0LdTPB_qL_b6sA"
                ),
                FoodModel(
                    title = context.getString(R.string.title1_2),
                    desc = context.getString(R.string.desc1_2),
                    calories = 280,
                    protein = 10,
                    carbs = 45,
                    fat = 8,
                    ingredients = listOf(
                        context.getString(R.string.granola),
                        context.getString(R.string.yogurt),
                        context.getString(R.string.strawberries),
                        context.getString(R.string.raspberries),
                        context.getString(R.string.honey)
                    ),
                    cookingTime = context.getString(R.string._15_minutes),
                    img = R.drawable.breakfast_2,
                    websiteUrl = "https://youtu.be/8jwFwVHTgZc?si=ozE5tiZPfOCOK9YQ"
                ),
                FoodModel(
                    title = context.getString(R.string.title1_3),
                    desc = context.getString(R.string.desc1_3),
                    calories = 310,
                    protein = 9,
                    carbs = 25,
                    fat = 20,
                    ingredients = listOf(
                        context.getString(R.string.bread),
                        context.getString(R.string.avocado),
                        context.getString(R.string.tomatoes),
                        context.getString(R.string.salt),
                        context.getString(R.string.olive_oil)
                    ),
                    cookingTime = context.getString(R.string._10_minutes),
                    img = R.drawable.breakfast_3,
                    websiteUrl = "https://youtu.be/Rh4EI4luKAQ?si=Q_HGNVDE0_NSOp3h"
                ),
                FoodModel(
                    title = context.getString(R.string.title1_4),
                    desc = context.getString(R.string.desc1_4),
                    calories = 250,
                    protein = 5,
                    carbs = 40,
                    fat = 6,
                    ingredients = listOf(
                        context.getString(R.string.raspberries),
                        context.getString(R.string.strawberries),
                        context.getString(R.string.banana),
                        context.getString(R.string.milk),
                        context.getString(R.string.honey)
                    ),
                    cookingTime = context.getString(R.string._5_minutes),
                    img = R.drawable.breakfast_4,
                    websiteUrl = "https://youtu.be/J83nEr7sg3c?si=7Fti0yR2YSUW_ajx"
                ),
                FoodModel(
                    title = context.getString(R.string.title1_5),
                    desc = context.getString(R.string.desc1_5),
                    calories = 290,
                    protein = 8,
                    carbs = 45,
                    fat = 9,
                    ingredients = listOf(
                        context.getString(R.string.oatmeal),
                        context.getString(R.string.milk),
                        context.getString(R.string.honey),
                        context.getString(R.string.nuts)
                    ),
                    cookingTime = context.getString(R.string._15_minutes),
                    img = R.drawable.breakfast_5,
                    websiteUrl = "https://youtu.be/ywkEGKXk2cQ?si=iJ8U08Z3trPMhc18"
                )
            )
        ),
        FoodPojo(
            context.getString(R.string.snacks),
            listOf(
                FoodModel(
                    title = context.getString(R.string.title2_1),
                    desc = context.getString(R.string.desc2_1),
                    calories = 180,
                    protein = 5,
                    carbs = 25,
                    fat = 8,
                    ingredients = listOf(
                        context.getString(R.string.chickpeas),
                        context.getString(R.string.tahini),
                        context.getString(R.string.lemon_juice),
                        context.getString(R.string.olive_oil),
                        context.getString(R.string.garlic),
                        context.getString(R.string.pita_bread)
                    ),
                    cookingTime = context.getString(R.string._15_minutes),
                    img = R.drawable.hummus_img,
                    websiteUrl = "https://youtu.be/zXDVu9Eth34?si=H2Zioq7BxNoay_gF"
                ),
                FoodModel(
                    title = context.getString(R.string.title2_2),
                    desc = context.getString(R.string.desc2_2),
                    calories = 220,
                    protein = 8,
                    carbs = 15,
                    fat = 16,
                    ingredients = listOf(
                        context.getString(R.string.tomatoes),
                        context.getString(R.string.cucumbers),
                        context.getString(R.string.kalamata_olives),
                        context.getString(R.string.feta_cheese),
                        context.getString(R.string.olive_oil),
                        context.getString(R.string.oregano)
                    ),
                    cookingTime = context.getString(R.string._10_minutes),
                    img = R.drawable.greek_salad_img,
                    websiteUrl = "https://youtu.be/kwq4vl610iY?si=nPphsuD3uDHpImUG"
                ),
                FoodModel(
                    title = context.getString(R.string.title2_3),
                    desc = context.getString(R.string.desc2_3),
                    calories = 160,
                    protein = 2,
                    carbs = 12,
                    fat = 12,
                    ingredients = listOf(
                        context.getString(R.string.avocados),
                        context.getString(R.string.lime_juice),
                        context.getString(R.string.onions),
                        context.getString(R.string.cilantro),
                        context.getString(R.string.tortilla_chips)
                    ),
                    cookingTime = context.getString(R.string._10_minutes),
                    img = R.drawable.guacamole_img,
                    websiteUrl = "https://youtu.be/5ch37EM9BV4?si=LvCWpWjLJFZxdUq7"
                ),
                FoodModel(
                    title = context.getString(R.string.title2_4),
                    desc = context.getString(R.string.desc2_4),
                    calories = 210,
                    protein = 6,
                    carbs = 5,
                    fat = 18,
                    ingredients = listOf("Almonds", "Cashews", "Walnuts", "Sea Salt"),
                    cookingTime = context.getString(R.string._15_minutes),
                    img = R.drawable.mixed_nuts_img,
                    websiteUrl = "https://youtu.be/xcz2LIvpMwI?si=UBnwF-UhZLmioJDx"
                ),
                FoodModel(
                    title = context.getString(R.string.title2_5),
                    desc = context.getString(R.string.desc2_5),
                    calories = 120,
                    protein = 6,
                    carbs = 4,
                    fat = 9,
                    ingredients = listOf(
                        context.getString(R.string.cherry_tomatoes),
                        context.getString(R.string.fresh_mozzarella),
                        context.getString(R.string.basil_leaves),
                        context.getString(R.string.balsamic_glaze)
                    ),
                    cookingTime = context.getString(R.string._15_minutes),
                    img = R.drawable.caprese_skewers_img,
                    websiteUrl = "https://youtu.be/cdOpzer1U6Y?si=9jp2xLHXb_6sqBQ9"
                )
            )
        ),
        FoodPojo(
            context.getString(R.string.dinner),
            listOf(
                FoodModel(
                    title = context.getString(R.string.title3_1),
                    desc = context.getString(R.string.desc3_1),
                    calories = 450,
                    protein = 25,
                    carbs = 30,
                    fat = 28,
                    ingredients = listOf(
                        context.getString(R.string.chicken_breast),
                        context.getString(R.string.fettuccine_pasta),
                        context.getString(R.string.heavy_cream),
                        context.getString(R.string.parmesan_cheese),
                        context.getString(R.string.garlic)
                    ),
                    cookingTime = context.getString(R.string._35_minutes),
                    img = R.drawable.chicken_alfredo_img,
                    websiteUrl = "https://youtu.be/F7CU0qBdj04?si=RdnUJRuqwyXd4NuT"
                ),
                FoodModel(
                    title = context.getString(R.string.title3_2),
                    desc = context.getString(R.string.desc3_2),
                    calories = 380,
                    protein = 30,
                    carbs = 10,
                    fat = 25,
                    ingredients = listOf(
                        context.getString(R.string.salmon_fillet),
                        context.getString(R.string.lemon_juice),
                        context.getString(R.string.fresh_dill),
                        context.getString(R.string.butter),
                        context.getString(R.string.garlic)
                    ),
                    cookingTime = context.getString(R.string._30_minutes),
                    img = R.drawable.salmon_img,
                    websiteUrl = "https://youtu.be/Iv3to4yuv3I?si=Dkkm1lGNRDGBh67w"
                ),
                FoodModel(
                    title = context.getString(R.string.title3_3),
                    desc = context.getString(R.string.desc3_3),
                    calories = 320,
                    protein = 15,
                    carbs = 45,
                    fat = 12,
                    ingredients = listOf(
                        context.getString(R.string.tofu),
                        context.getString(R.string.broccoli),
                        context.getString(R.string.carrots),
                        context.getString(R.string.bell_peppers),
                        context.getString(R.string.soy_sauce)
                    ),
                    cookingTime = context.getString(R.string._25_minutes),
                    img = R.drawable.stir_fry_img,
                    websiteUrl = "https://youtu.be/lNdFgQ4fBCI?si=0hptNJoV0lrHx6A9"
                ),
                FoodModel(
                    title = context.getString(R.string.title3_4),
                    desc = context.getString(R.string.desc3_4),
                    calories = 420,
                    protein = 18,
                    carbs = 55,
                    fat = 16,
                    ingredients = listOf(
                        context.getString(R.string.ground_beef),
                        context.getString(R.string.tomato_sauce),
                        context.getString(R.string.onion),
                        context.getString(R.string.garlic),
                        context.getString(R.string.spaghetti)
                    ),
                    cookingTime = context.getString(R.string._40_minutes),
                    img = R.drawable.spaghetti_bolognese_img,
                    websiteUrl = "https://youtu.be/wcj80v67YJ4?si=uzL0HtUjDQxPf450"
                ),
                FoodModel(
                    title = context.getString(R.string.title3_5),
                    desc = context.getString(R.string.desc3_5),
                    calories = 280,
                    protein = 8,
                    carbs = 40,
                    fat = 10,
                    ingredients = listOf(
                        context.getString(R.string.zucchini),
                        context.getString(R.string.eggplant),
                        context.getString(R.string.bell_peppers),
                        context.getString(R.string.cherry_tomatoes),
                        context.getString(R.string.balsamic_vinegar)
                    ),
                    cookingTime = context.getString(R.string._20_minutes),
                    img = R.drawable.grilled_vegetables_img,
                    websiteUrl = "https://youtu.be/P5P3NMJvJTc?si=Y2X15bfRnJaL0zal"
                )
            )
        ),
        FoodPojo(
            context.getString(R.string.lunch),
            listOf(
                FoodModel(
                    title = context.getString(R.string.title4_1),
                    desc = context.getString(R.string.desc4_1),
                    calories = 420,
                    protein = 35,
                    carbs = 20,
                    fat = 25,
                    ingredients = listOf(
                        context.getString(R.string.romaine_lettuce),
                        context.getString(R.string.grilled_chicken_breast),
                        context.getString(R.string.croutons),
                        context.getString(R.string.caesar_dressing),
                        context.getString(R.string.parmesan_cheese)
                    ),
                    cookingTime = context.getString(R.string._15_minutes),
                    img = R.drawable.lunch_1,
                    websiteUrl = "https://youtu.be/AGwfmY60FOM?si=WJRroJ8wPC_ogCwD"
                ),
                FoodModel(
                    title = context.getString(R.string.title4_2),
                    desc = context.getString(R.string.desc4_2),
                    calories = 380,
                    protein = 12,
                    carbs = 60,
                    fat = 14,
                    ingredients = listOf(
                        context.getString(R.string.arborio_rice),
                        context.getString(R.string.mushrooms),
                        context.getString(R.string.onions),
                        context.getString(R.string.white_wine),
                        context.getString(R.string.parmesan_cheese)
                    ),
                    cookingTime = context.getString(R.string._30_minutes),
                    img = R.drawable.lunch_2,
                    websiteUrl = "https://youtu.be/ju9H1RlYNxk?si=WIN9OFizJAjamMK4"
                ),
                FoodModel(
                    title = context.getString(R.string.title4_3),
                    desc = context.getString(R.string.desc4_3),
                    calories = 280,
                    protein = 10,
                    carbs = 15,
                    fat = 20,
                    ingredients = listOf(
                        context.getString(R.string.cucumbers),
                        context.getString(R.string.tomatoes),
                        context.getString(R.string.black_olives),
                        context.getString(R.string.red_onions),
                        context.getString(R.string.feta_cheese),
                        context.getString(R.string.greek_dressing)
                    ),
                    cookingTime = context.getString(R.string._10_minutes),
                    img = R.drawable.lunch_3,
                    websiteUrl = "https://youtu.be/kwq4vl610iY?si=KOJoQVJ4MkayeL7G"
                ),
                FoodModel(
                    title = context.getString(R.string.title4_4),
                    desc = context.getString(R.string.desc4_4),
                    calories = 320,
                    protein = 22,
                    carbs = 30,
                    fat = 12,
                    ingredients = listOf(
                        context.getString(R.string.tuna),
                        context.getString(R.string.lettuce),
                        context.getString(R.string.tomatoes),
                        context.getString(R.string.mayo_mustard_dressing),
                        context.getString(R.string.whole_wheat_tortilla)
                    ),
                    cookingTime = context.getString(R.string._15_minutes),
                    img = R.drawable.lunch_4,
                    websiteUrl = "https://youtu.be/Vf26Xh4cZ_A?si=L7zd3fXCJF7ygEag"
                ),
                FoodModel(
                    title = context.getString(R.string.title4_5),
                    desc = context.getString(R.string.desc4_5),
                    calories = 350,
                    protein = 15,
                    carbs = 45,
                    fat = 14,
                    ingredients = listOf(
                        context.getString(R.string.fresh_mozzarella),
                        context.getString(R.string.basil_leaves),
                        context.getString(R.string.ripe_tomatoes),
                        context.getString(R.string.balsamic_glaze),
                        context.getString(R.string.ciabatta_bread)
                    ),
                    cookingTime = context.getString(R.string._20_minutes),
                    img = R.drawable.lunch_5,
                    websiteUrl = "https://youtu.be/hFVsK2fZq2w?si=B9DoqCH1_YCNaWwS"
                )
            )
        ),
        FoodPojo(
            context.getString(R.string.smoothies),
            listOf(
                FoodModel(
                    title = context.getString(R.string.title5_1),
                    desc = context.getString(R.string.desc5_1),
                    calories = 220,
                    protein = 5,
                    carbs = 35,
                    fat = 3,
                    ingredients = listOf(
                        context.getString(R.string.mixed_berries),
                        context.getString(R.string.yogurt),
                        context.getString(R.string.honey)
                    ),
                    cookingTime = context.getString(R.string._5_minutes),
                    img = R.drawable.smoothie_1,
                    websiteUrl = "https://youtu.be/SHaWNkVn8-8?si=jfiB4CQLYW72g7P4"
                ),
                FoodModel(
                    title = context.getString(R.string.title5_2),
                    desc = context.getString(R.string.desc5_2),
                    calories = 250,
                    protein = 7,
                    carbs = 40,
                    fat = 6,
                    ingredients = listOf(
                        context.getString(R.string.spinach),
                        context.getString(R.string.banana),
                        context.getString(R.string.almond_milk),
                        context.getString(R.string.chia_seeds)
                    ),
                    cookingTime = context.getString(R.string._7_minutes),
                    img = R.drawable.smoothie_2,
                    websiteUrl = "https://youtu.be/kmuIZk_KLW4?si=FLsSiJhbs2f5tzDI"
                ),
                FoodModel(
                    title = context.getString(R.string.title5_3),
                    desc = context.getString(R.string.desc5_3),
                    calories = 280,
                    protein = 4,
                    carbs = 50,
                    fat = 8,
                    ingredients = listOf(
                        context.getString(R.string.pineapple),
                        context.getString(R.string.mango),
                        context.getString(R.string.coconut_milk),
                        context.getString(R.string.lime)
                    ),
                    cookingTime = context.getString(R.string._6_minutes),
                    img = R.drawable.smoothie_3,
                    websiteUrl = "https://youtu.be/WaaQyqDGR5k?si=I-F6xgwO9x0dZD6J"
                ),
                FoodModel(
                    title = context.getString(R.string.title5_4),
                    desc = context.getString(R.string.desc5_4),
                    calories = 340,
                    protein = 10,
                    carbs = 45,
                    fat = 15,
                    ingredients = listOf(
                        context.getString(R.string.peanut_butter),
                        context.getString(R.string.banana),
                        context.getString(R.string.oats),
                        context.getString(R.string.milk)
                    ),
                    cookingTime = context.getString(R.string._8_minutes),
                    img = R.drawable.smoothie_4,
                    websiteUrl = "https://youtu.be/FSCVgmLjjQI?si=AawiQDsHK6TGcDj4"
                ),
                FoodModel(
                    title = context.getString(R.string.title5_5),
                    desc = context.getString(R.string.desc5_5),
                    calories = 300,
                    protein = 20,
                    carbs = 25,
                    fat = 12,
                    ingredients = listOf(
                        context.getString(R.string.chocolate_protein_powder),
                        context.getString(R.string.almond_milk),
                        context.getString(R.string.banana)
                    ),
                    cookingTime = context.getString(R.string._5_minutes),
                    img = R.drawable.smoothie_5,
                    websiteUrl = "https://youtu.be/QrIpXPNadvI?si=xhCjKEF99mqOIIRu"
                )
            )
        )
    )
}
