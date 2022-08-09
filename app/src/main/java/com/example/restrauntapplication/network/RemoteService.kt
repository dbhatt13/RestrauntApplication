package com.example.restrauntapplication.network

import androidx.lifecycle.MutableLiveData
import com.example.restrauntapplication.data.Latlng
import com.example.restrauntapplication.data.OperatingHours
import com.example.restrauntapplication.data.Restaurant
import com.example.restrauntapplication.data.Review

class RemoteService {

    fun getData(): MutableLiveData<List<Restaurant>> {

        val rest1 = Restaurant(
            1,"Mission Chinese Food","Manhattan",
            "1.jpg","171 E Broadway, New York, NY 10002",
            Latlng(40.713829,-73.989667),
            "Asian, Chinese", OperatingHours("5:30 pm - 11:00 pm",
                "5:30 pm - 12:00 am","5:30 pm - 12:00 am",
                "5:30 pm - 12:00 am","5:30 pm - 12:00 am",
                "12:00 pm - 4:00 pm, 5:30 pm - 12:00 am",
                "12:00 pm - 4:00 pm, 5:30 pm - 11:00 pm"),
            mutableListOf(
                Review("Steve","October 26, 2020",4,
                "Mission Chinese Food has grown up from its scrappy " +
                        "Orchard Street days into a big, two story restaurant equipped with a pizza oven, " +
                        "a prime rib cart, and a much broader menu. " +
                        "Yes, it still has all the hits — the kung pao pastrami, " +
                        "the thrice cooked bacon —but chef/proprietor Danny Bowien and executive chef Angela Dimayuga have also added a raw bar, " +
                        "two generous family-style set menus, and showstoppers like duck baked in clay. " +
                        "And you can still get a lot of food without breaking the bank."),
                        Review("Morgan","October 26, 2020",4,
                            "This place is a blast. Must orders: GREEN TEA NOODS," +
                                    " sounds gross (to me at least) but these were incredible!, " +
                                    "Kung pao pastrami (but you already knew that), " +
                                    "beef tartare was a fun appetizer that we decided to try, " +
                                    "the spicy ma po tofu SUPER spicy but delicious, " +
                                    "egg rolls and scallion pancake i could have passed on... " +
                                    "I wish we would have gone with a larger group, " +
                                    "so much more I would have liked to try!"
                        )
            )
        )

        val rest2 = Restaurant(
            2,"Emily","Brooklyn","2.jpg",
            "919 Fulton St, Brooklyn, NY 11238", Latlng(40.713829,-73.989667),
            "Pizza, American", OperatingHours("5:30 pm - 11:00 pm","5:30 pm - 11:00 pm",
                "5:30 pm - 11:00 pm","5:30 pm - 11:00 pm","5:30 pm - 11:00 pm",
                "5:00 pm - 11:30 pm","12:00 pm - 3:00 pm, 5:00 pm - 11:00 pm"),
            mutableListOf(
                Review("Steph","October 26, 2020",4,
                "Five star food, two star atmosphere. " +
                        "I would definitely get takeout from this place - " +
                        "but dont think I have the energy to deal with the hipster ridiculousness again. " +
                        "By the time we left the wait was two hours long."),
                        Review("Steve","October 26, 2020",4,
                            "This cozy Clinton Hill restaurant excels at both straightforward " +
                                    "and unusual wood-fired pizzas. If you want a taste of the latter, " +
                                    "consider ordering the Emily, which is topped with mozzarella, pistachios, " +
                                    "truffled sottocenere cheese, and honey. " +
                                    "The menu includes salads and a handful of starters, " +
                                    "as well as a burger that some meat connoisseurs consider to be among the best in the city."
                        )
            )
        )
        val rest3 = Restaurant(
            3,"Indian Food","Manhattan",
            "3.jpg","171 E Broadway, New York, NY 10002",
            Latlng(40.713829,-73.989667),
            "Indian, Chinese", OperatingHours("5:30 pm - 11:00 pm",
                "5:30 pm - 12:00 am","5:30 pm - 12:00 am",
                "5:30 pm - 12:00 am","5:30 pm - 12:00 am",
                "12:00 pm - 4:00 pm, 5:30 pm - 12:00 am",
                "12:00 pm - 4:00 pm, 5:30 pm - 11:00 pm"),
            mutableListOf(
                Review("Steve","October 26, 2020",4,
                "Mission Chinese Food has grown up from its scrappy " +
                        "Orchard Street days into a big, two story restaurant equipped with a pizza oven, " +
                        "a prime rib cart, and a much broader menu. " +
                        "Yes, it still has all the hits — the kung pao pastrami, " +
                        "the thrice cooked bacon —but chef/proprietor Danny Bowien and executive chef Angela Dimayuga have also added a raw bar, " +
                        "two generous family-style set menus, and showstoppers like duck baked in clay. " +
                        "And you can still get a lot of food without breaking the bank."),
                Review("Morgan","October 26, 2020",4,
                    "This place is a blast. Must orders: GREEN TEA NOODS," +
                            " sounds gross (to me at least) but these were incredible!, " +
                            "Kung pao pastrami (but you already knew that), " +
                            "beef tartare was a fun appetizer that we decided to try, " +
                            "the spicy ma po tofu SUPER spicy but delicious, " +
                            "egg rolls and scallion pancake i could have passed on... " +
                            "I wish we would have gone with a larger group, " +
                            "so much more I would have liked to try!"
                )
            )
        )

        val rest4 = Restaurant(
            4,"Indo-Chinese Kitchen","Manhattan",
            "4.jpg","171 E Broadway, New York, NY 10002",
            Latlng(40.713829,-73.989667),
            "Indonesian, Chinese", OperatingHours("5:30 pm - 11:00 pm",
                "5:30 pm - 12:00 am","5:30 pm - 12:00 am",
                "5:30 pm - 12:00 am","5:30 pm - 12:00 am",
                "12:00 pm - 4:00 pm, 5:30 pm - 12:00 am",
                "12:00 pm - 4:00 pm, 5:30 pm - 11:00 pm"),
            mutableListOf(
                Review("Steve","October 26, 2020",4,
                "Mission Chinese Food has grown up from its scrappy " +
                        "Orchard Street days into a big, two story restaurant equipped with a pizza oven, " +
                        "a prime rib cart, and a much broader menu. " +
                        "Yes, it still has all the hits — the kung pao pastrami, " +
                        "the thrice cooked bacon —but chef/proprietor Danny Bowien and executive chef Angela Dimayuga have also added a raw bar, " +
                        "two generous family-style set menus, and showstoppers like duck baked in clay. " +
                        "And you can still get a lot of food without breaking the bank."),
                Review("Morgan","October 26, 2020",4,
                    "This place is a blast. Must orders: GREEN TEA NOODS," +
                            " sounds gross (to me at least) but these were incredible!, " +
                            "Kung pao pastrami (but you already knew that), " +
                            "beef tartare was a fun appetizer that we decided to try, " +
                            "the spicy ma po tofu SUPER spicy but delicious, " +
                            "egg rolls and scallion pancake i could have passed on... " +
                            "I wish we would have gone with a larger group, " +
                            "so much more I would have liked to try!"
                )
            )
        )

        val rest5 = Restaurant(
            5,"Asian Fiction","Manhattan",
            "5.jpg","171 E Broadway, New York, NY 10002",
            Latlng(40.713829,-73.989667),
            "Asian, Chinese ,Thai", OperatingHours("5:30 pm - 11:00 pm",
                "5:30 pm - 12:00 am","5:30 pm - 12:00 am",
                "5:30 pm - 12:00 am","5:30 pm - 12:00 am",
                "12:00 pm - 4:00 pm, 5:30 pm - 12:00 am",
                "12:00 pm - 4:00 pm, 5:30 pm - 11:00 pm"),
            mutableListOf(
                Review("Steve","October 26, 2020",4,
                "Mission Chinese Food has grown up from its scrappy " +
                        "Orchard Street days into a big, two story restaurant equipped with a pizza oven, " +
                        "a prime rib cart, and a much broader menu. " +
                        "Yes, it still has all the hits — the kung pao pastrami, " +
                        "the thrice cooked bacon —but chef/proprietor Danny Bowien and executive chef Angela Dimayuga have also added a raw bar, " +
                        "two generous family-style set menus, and showstoppers like duck baked in clay. " +
                        "And you can still get a lot of food without breaking the bank."),
                Review("Morgan","October 26, 2020",4,
                    "This place is a blast. Must orders: GREEN TEA NOODS," +
                            " sounds gross (to me at least) but these were incredible!, " +
                            "Kung pao pastrami (but you already knew that), " +
                            "beef tartare was a fun appetizer that we decided to try, " +
                            "the spicy ma po tofu SUPER spicy but delicious, " +
                            "egg rolls and scallion pancake i could have passed on... " +
                            "I wish we would have gone with a larger group, " +
                            "so much more I would have liked to try!"
                )
            )
        )

        val rest6 = Restaurant(
            1,"Call Me Chow ","Manhattan",
            "6.jpg","171 E Broadway, New York, NY 10002",
            Latlng(40.713829,-73.989667),
            "Japanese, Chinese ,Thai", OperatingHours("5:30 pm - 11:00 pm",
                "5:30 pm - 12:00 am","5:30 pm - 12:00 am",
                "5:30 pm - 12:00 am","5:30 pm - 12:00 am",
                "12:00 pm - 4:00 pm, 5:30 pm - 12:00 am",
                "12:00 pm - 4:00 pm, 5:30 pm - 11:00 pm"),
            mutableListOf(
                Review("Steve","October 26, 2020",4,
                "Mission Chinese Food has grown up from its scrappy " +
                        "Orchard Street days into a big, two story restaurant equipped with a pizza oven, " +
                        "a prime rib cart, and a much broader menu. " +
                        "Yes, it still has all the hits — the kung pao pastrami, " +
                        "the thrice cooked bacon —but chef/proprietor Danny Bowien and executive chef Angela Dimayuga have also added a raw bar, " +
                        "two generous family-style set menus, and showstoppers like duck baked in clay. " +
                        "And you can still get a lot of food without breaking the bank."),
                Review("Morgan","October 26, 2020",4,
                    "This place is a blast. Must orders: GREEN TEA NOODS," +
                            " sounds gross (to me at least) but these were incredible!, " +
                            "Kung pao pastrami (but you already knew that), " +
                            "beef tartare was a fun appetizer that we decided to try, " +
                            "the spicy ma po tofu SUPER spicy but delicious, " +
                            "egg rolls and scallion pancake i could have passed on... " +
                            "I wish we would have gone with a larger group, " +
                            "so much more I would have liked to try!"
                )
            )
        )

        val rest7 = Restaurant(
            7,"Shanghai Court","Manhattan",
            "7.jpg","171 E Broadway, New York, NY 10002",
            Latlng(40.713829,-73.989667),
            "Thai, Chinese", OperatingHours("5:30 pm - 11:00 pm",
                "5:30 pm - 12:00 am","5:30 pm - 12:00 am",
                "5:30 pm - 12:00 am","5:30 pm - 12:00 am",
                "12:00 pm - 4:00 pm, 5:30 pm - 12:00 am",
                "12:00 pm - 4:00 pm, 5:30 pm - 11:00 pm"),
            mutableListOf(
                Review("Steve","October 26, 2020",4,
                "Mission Chinese Food has grown up from its scrappy " +
                        "Orchard Street days into a big, two story restaurant equipped with a pizza oven, " +
                        "a prime rib cart, and a much broader menu. " +
                        "Yes, it still has all the hits — the kung pao pastrami, " +
                        "the thrice cooked bacon —but chef/proprietor Danny Bowien and executive chef Angela Dimayuga have also added a raw bar, " +
                        "two generous family-style set menus, and showstoppers like duck baked in clay. " +
                        "And you can still get a lot of food without breaking the bank."),
                Review("Morgan","October 26, 2020",4,
                    "This place is a blast. Must orders: GREEN TEA NOODS," +
                            " sounds gross (to me at least) but these were incredible!, " +
                            "Kung pao pastrami (but you already knew that), " +
                            "beef tartare was a fun appetizer that we decided to try, " +
                            "the spicy ma po tofu SUPER spicy but delicious, " +
                            "egg rolls and scallion pancake i could have passed on... " +
                            "I wish we would have gone with a larger group, " +
                            "so much more I would have liked to try!"
                )
            )
        )

        val rest8 = Restaurant(
            8,"The Pallet","Manhattan",
            "8.jpg","171 E Broadway, New York, NY 10002",
            Latlng(40.713829,-73.989667),
            "Asian, Chinese,Continental", OperatingHours("5:30 pm - 11:00 pm",
                "5:30 pm - 12:00 am","5:30 pm - 12:00 am",
                "5:30 pm - 12:00 am","5:30 pm - 12:00 am",
                "12:00 pm - 4:00 pm, 5:30 pm - 12:00 am",
                "12:00 pm - 4:00 pm, 5:30 pm - 11:00 pm"),
            mutableListOf(
                Review("Steve","October 26, 2020",4,
                "Mission Chinese Food has grown up from its scrappy " +
                        "Orchard Street days into a big, two story restaurant equipped with a pizza oven, " +
                        "a prime rib cart, and a much broader menu. " +
                        "Yes, it still has all the hits — the kung pao pastrami, " +
                        "the thrice cooked bacon —but chef/proprietor Danny Bowien and executive chef Angela Dimayuga have also added a raw bar, " +
                        "two generous family-style set menus, and showstoppers like duck baked in clay. " +
                        "And you can still get a lot of food without breaking the bank."),
                Review("Morgan","October 26, 2020",4,
                    "This place is a blast. Must orders: GREEN TEA NOODS," +
                            " sounds gross (to me at least) but these were incredible!, " +
                            "Kung pao pastrami (but you already knew that), " +
                            "beef tartare was a fun appetizer that we decided to try, " +
                            "the spicy ma po tofu SUPER spicy but delicious, " +
                            "egg rolls and scallion pancake i could have passed on... " +
                            "I wish we would have gone with a larger group, " +
                            "so much more I would have liked to try!"
                )
            )
        )

        val rest9 = Restaurant(
            9,"KFC","Brooklyn","9.jpg",
            "919 Fulton St, Brooklyn, NY 11238", Latlng(40.713829,-73.989667),
            "Pizza, American,Burger", OperatingHours("5:30 pm - 11:00 pm","5:30 pm - 11:00 pm",
                "5:30 pm - 11:00 pm","5:30 pm - 11:00 pm","5:30 pm - 11:00 pm",
                "5:00 pm - 11:30 pm","12:00 pm - 3:00 pm, 5:00 pm - 11:00 pm"),
            mutableListOf(
                Review("Steph","October 26, 2020",4,
                "Five star food, two star atmosphere. " +
                        "I would definitely get takeout from this place - " +
                        "but dont think I have the energy to deal with the hipster ridiculousness again. " +
                        "By the time we left the wait was two hours long."),
                Review("Steve","October 26, 2020",4,
                    "This cozy Clinton Hill restaurant excels at both straightforward " +
                            "and unusual wood-fired pizzas. If you want a taste of the latter, " +
                            "consider ordering the Emily, which is topped with mozzarella, pistachios, " +
                            "truffled sottocenere cheese, and honey. " +
                            "The menu includes salads and a handful of starters, " +
                            "as well as a burger that some meat connoisseurs consider to be among the best in the city."
                )
            )
        )
        val rest10 = Restaurant(
            10,"Leon Grill","Brooklyn","10.jpg",
            "919 Fulton St, Brooklyn, NY 11238", Latlng(40.713829,-73.989667),
            "Burger,Fast Food, Wraps", OperatingHours("5:30 pm - 11:00 pm","5:30 pm - 11:00 pm",
                "5:30 pm - 11:00 pm","5:30 pm - 11:00 pm","5:30 pm - 11:00 pm",
                "5:00 pm - 11:30 pm","12:00 pm - 3:00 pm, 5:00 pm - 11:00 pm"),
            mutableListOf(
                Review("Steph","October 26, 2020",4,
                "Five star food, two star atmosphere. " +
                        "I would definitely get takeout from this place - " +
                        "but dont think I have the energy to deal with the hipster ridiculousness again. " +
                        "By the time we left the wait was two hours long."),
                Review("Steve","October 26, 2020",4,
                    "This cozy Clinton Hill restaurant excels at both straightforward " +
                            "and unusual wood-fired pizzas. If you want a taste of the latter, " +
                            "consider ordering the Emily, which is topped with mozzarella, pistachios, " +
                            "truffled sottocenere cheese, and honey. " +
                            "The menu includes salads and a handful of starters, " +
                            "as well as a burger that some meat connoisseurs consider to be among the best in the city."
                )
            )
        )

        val rest11 = Restaurant(
            11,"Pepe's Pizza","Brooklyn","11.jpg",
            "919 Fulton St, Brooklyn, NY 11238", Latlng(40.713829,-73.989667),
            "Pizza, American,Pasta,Burger", OperatingHours("5:30 pm - 11:00 pm","5:30 pm - 11:00 pm",
                "5:30 pm - 11:00 pm","5:30 pm - 11:00 pm","5:30 pm - 11:00 pm",
                "5:00 pm - 11:30 pm","12:00 pm - 3:00 pm, 5:00 pm - 11:00 pm"),
            mutableListOf(
                Review("Steph","October 26, 2020",4,
                "Five star food, two star atmosphere. " +
                        "I would definitely get takeout from this place - " +
                        "but dont think I have the energy to deal with the hipster ridiculousness again. " +
                        "By the time we left the wait was two hours long."),
                Review("Steve","October 26, 2020",4,
                    "This cozy Clinton Hill restaurant excels at both straightforward " +
                            "and unusual wood-fired pizzas. If you want a taste of the latter, " +
                            "consider ordering the Emily, which is topped with mozzarella, pistachios, " +
                            "truffled sottocenere cheese, and honey. " +
                            "The menu includes salads and a handful of starters, " +
                            "as well as a burger that some meat connoisseurs consider to be among the best in the city."
                )
            )
        )

        val rest12 = Restaurant(
            12,"Smoke House Deli","Brooklyn","12.jpg",
            "919 Fulton St, Brooklyn, NY 11238", Latlng(40.713829,-73.989667),
            "Italian,Pasta,Burger", OperatingHours("5:30 pm - 11:00 pm","5:30 pm - 11:00 pm",
                "5:30 pm - 11:00 pm","5:30 pm - 11:00 pm","5:30 pm - 11:00 pm",
                "5:00 pm - 11:30 pm","12:00 pm - 3:00 pm, 5:00 pm - 11:00 pm"),
            mutableListOf(
                Review("Steph","October 26, 2020",4,
                "Five star food, two star atmosphere. " +
                        "I would definitely get takeout from this place - " +
                        "but dont think I have the energy to deal with the hipster ridiculousness again. " +
                        "By the time we left the wait was two hours long."),
                Review("Steve","October 26, 2020",4,
                    "This cozy Clinton Hill restaurant excels at both straightforward " +
                            "and unusual wood-fired pizzas. If you want a taste of the latter, " +
                            "consider ordering the Emily, which is topped with mozzarella, pistachios, " +
                            "truffled sottocenere cheese, and honey. " +
                            "The menu includes salads and a handful of starters, " +
                            "as well as a burger that some meat connoisseurs consider to be among the best in the city."
                )
            )
        )

        val rest13 = Restaurant(
            13,"Buffalo Wild Wings","Brooklyn","13.jpg",
            "919 Fulton St, Brooklyn, NY 11238", Latlng(40.713829,-73.989667),
            "American,Mexican", OperatingHours("5:30 pm - 11:00 pm","5:30 pm - 11:00 pm",
                "5:30 pm - 11:00 pm","5:30 pm - 11:00 pm","5:30 pm - 11:00 pm",
                "5:00 pm - 11:30 pm","12:00 pm - 3:00 pm, 5:00 pm - 11:00 pm"),
            mutableListOf(
                Review("Steph","October 26, 2020",4,
                "Five star food, two star atmosphere. " +
                        "I would definitely get takeout from this place - " +
                        "but dont think I have the energy to deal with the hipster ridiculousness again. " +
                        "By the time we left the wait was two hours long."),
                Review("Steve","October 26, 2020",4,
                    "This cozy Clinton Hill restaurant excels at both straightforward " +
                            "and unusual wood-fired pizzas. If you want a taste of the latter, " +
                            "consider ordering the Emily, which is topped with mozzarella, pistachios, " +
                            "truffled sottocenere cheese, and honey. " +
                            "The menu includes salads and a handful of starters, " +
                            "as well as a burger that some meat connoisseurs consider to be among the best in the city."
                )
            )
        )

        val rest14 = Restaurant(
            14,"French Street Food","Brooklyn","14.jpg",
            "919 Fulton St, Brooklyn, NY 11238", Latlng(40.713829,-73.989667),
            "French Continental", OperatingHours("5:30 pm - 11:00 pm","5:30 pm - 11:00 pm",
                "5:30 pm - 11:00 pm","5:30 pm - 11:00 pm","5:30 pm - 11:00 pm",
                "5:00 pm - 11:30 pm","12:00 pm - 3:00 pm, 5:00 pm - 11:00 pm"),
            mutableListOf(
                Review("Steph","October 26, 2020",4,
                "Five star food, two star atmosphere. " +
                        "I would definitely get takeout from this place - " +
                        "but dont think I have the energy to deal with the hipster ridiculousness again. " +
                        "By the time we left the wait was two hours long."),
                Review("Steve","October 26, 2020",4,
                    "This cozy Clinton Hill restaurant excels at both straightforward " +
                            "and unusual wood-fired pizzas. If you want a taste of the latter, " +
                            "consider ordering the Emily, which is topped with mozzarella, pistachios, " +
                            "truffled sottocenere cheese, and honey. " +
                            "The menu includes salads and a handful of starters, " +
                            "as well as a burger that some meat connoisseurs consider to be among the best in the city."
                )
            )
        )

        val rest15 = Restaurant(
            15,"Toscano","Brooklyn","15.jpg",
            "919 Fulton St, Brooklyn, NY 11238", Latlng(40.713829,-73.989667),
            "Italian , Continental", OperatingHours("5:30 pm - 11:00 pm","5:30 pm - 11:00 pm",
                "5:30 pm - 11:00 pm","5:30 pm - 11:00 pm","5:30 pm - 11:00 pm",
                "5:00 pm - 11:30 pm","12:00 pm - 3:00 pm, 5:00 pm - 11:00 pm"),
            mutableListOf(
                Review("Steph","October 26, 2020",4,
                "Five star food, two star atmosphere. " +
                        "I would definitely get takeout from this place - " +
                        "but dont think I have the energy to deal with the hipster ridiculousness again. " +
                        "By the time we left the wait was two hours long."),
                Review("Steve","October 26, 2020",4,
                    "This cozy Clinton Hill restaurant excels at both straightforward " +
                            "and unusual wood-fired pizzas. If you want a taste of the latter, " +
                            "consider ordering the Emily, which is topped with mozzarella, pistachios, " +
                            "truffled sottocenere cheese, and honey. " +
                            "The menu includes salads and a handful of starters, " +
                            "as well as a burger that some meat connoisseurs consider to be among the best in the city."
                )
            )
        )

        val rest16 = Restaurant(
            16,"Little Italy","Brooklyn","16.jpg",
            "919 Fulton St, Brooklyn, NY 11238", Latlng(40.713829,-73.989667),
            "Italian,Dessert,Beverages", OperatingHours("5:30 pm - 11:00 pm","5:30 pm - 11:00 pm",
                "5:30 pm - 11:00 pm","5:30 pm - 11:00 pm","5:30 pm - 11:00 pm",
                "5:00 pm - 11:30 pm","12:00 pm - 3:00 pm, 5:00 pm - 11:00 pm"),
            mutableListOf(
                Review("Steph","October 26, 2020",4,
                "Five star food, two star atmosphere. " +
                        "I would definitely get takeout from this place - " +
                        "but dont think I have the energy to deal with the hipster ridiculousness again. " +
                        "By the time we left the wait was two hours long."),
                Review("Steve","October 26, 2020",4,
                    "This cozy Clinton Hill restaurant excels at both straightforward " +
                            "and unusual wood-fired pizzas. If you want a taste of the latter, " +
                            "consider ordering the Emily, which is topped with mozzarella, pistachios, " +
                            "truffled sottocenere cheese, and honey. " +
                            "The menu includes salads and a handful of starters, " +
                            "as well as a burger that some meat connoisseurs consider to be among the best in the city."
                )
            )
        )

        val rest17 = Restaurant(
            17,"Dominos","Brooklyn","17.jpg",
            "919 Fulton St, Brooklyn, NY 11238", Latlng(40.713829,-73.989667),
            "Pizza, American", OperatingHours("5:30 pm - 11:00 pm","5:30 pm - 11:00 pm",
                "5:30 pm - 11:00 pm","5:30 pm - 11:00 pm","5:30 pm - 11:00 pm",
                "5:00 pm - 11:30 pm","12:00 pm - 3:00 pm, 5:00 pm - 11:00 pm"),
            mutableListOf(
                Review("Steph","October 26, 2020",4,
                "Five star food, two star atmosphere. " +
                        "I would definitely get takeout from this place - " +
                        "but dont think I have the energy to deal with the hipster ridiculousness again. " +
                        "By the time we left the wait was two hours long."),
                Review("Steve","October 26, 2020",4,
                    "This cozy Clinton Hill restaurant excels at both straightforward " +
                            "and unusual wood-fired pizzas. If you want a taste of the latter, " +
                            "consider ordering the Emily, which is topped with mozzarella, pistachios, " +
                            "truffled sottocenere cheese, and honey. " +
                            "The menu includes salads and a handful of starters, " +
                            "as well as a burger that some meat connoisseurs consider to be among the best in the city."
                )
            )
        )
        val restaurants = listOf(rest1,rest2,rest3,rest4,rest5,rest6,rest7,rest8,rest9,
        rest10, rest11,rest12,rest13,rest14,rest15,rest16,rest17)
        return  MutableLiveData<List<Restaurant>>(restaurants)
        }

}