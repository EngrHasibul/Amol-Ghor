package com.example.shohihadis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class NamajActivity extends AppCompatActivity {

    ArrayList<String> NamajNames=new ArrayList<>(Arrays.asList
            ("১। আমার কথা (অন্যদের কাছে) পৌছিয়ে দাও, তা যদি একটি আয়াতও হয়।\n" +
            "(সহীহ বুখারীঃ ৩২১৫)",
                    "২। রাসূল (সাঃ) বলেছেন, কোন ব্যক্তির মিথ্যাবাদী হওয়ার জন্য এতটকুই যথেষ্ঠ যে, সে যা শোনে (যাচাই ব্যতীত) তাই বলে বেড়ায়।\n" +
                            "(সহীহ মুসলিম, মুকাদ্দামা, অনুচ্ছেদ -৩)",
                    "৩।রাসূল (সাঃ) বলেছেনঃ যে ব্যক্তি আমার প্রতি মিথ্যা আরোপ করবে সে জাহান্নামে যাবে।\n" +
                            "(সহীহ বুখারীঃ ১০৭,১০৯,১০৯,১১০,১১১ মুসলিম,মুকাদ্দামা)",
                    "৪।পিতা-মাতার সন্তুষ্টিতে আল্লাহ্ সন্তুষ্ট আর পিতা-মাতার অসন্তুষ্টে আল্লাহ্ অসন্তুষ্ট।\n" +
                            "(তিরমিযী, সনদ হাসান, মিশকাত হা/৪৭১০)",
                    "৫। পাঁচ ওয়াক্ত সলাত আদায় করলে পঞ্চাশ ওয়াক্ত সলাতের সওয়াব পাওয়া যায়।\n" +
                            "(সহীহ বুখায়, মুসলিম ও তিরমিযীঃ ২১৩)",
                    "৬। ব্যক্তি এবং শিরক ও কুফরের মাঝখানে সলাত ছেড়ে দেওয়াই হচ্ছে ব্যবধান।\n" +
                            "(সহীহ মুসলিমঃ ১৫৪,১৫৫, মিশকাত)",
                    "৭। ক্বিয়ামতের দিন বান্দার কাজসমূহের মধ্যে সর্বপ্রথম সলাতের হিসাব নেওয়া হবে।\n" +
                            "(সহীহ তিরমিযীঃ ৪১৩, ইবনু মাযাহঃ ১৪২৫,১৪২৬)",
                    "৮। যে ব্যক্তি ফজর ও আসরের নামায আদায় করবে সে জান্নাতে যাবে।\n" +
                            "(সহীহ বুখারীঃ ৫৪৬)",
                    "৯। আল্লাহ্ তা'আলার নিকট প্রিয় ঐ আমল যা নিয়মিত করা হয় যদিও তা অল্প হয়।\n" +
                            "(সহীহ বুখারীঃ ৪১,৬০২০)",
                    "১০। যে ব্যক্তি (পুরুষ) পায়ের টাখনুর নিচে কাপড় ঝুলিয়ে পরবে, সে জাহান্নামী।\n" +
                            "(সহীহ বুখারীঃ৫৩৭১, মিশকাত, হা/৪১২৫)",
                    "১১। কালিজিরায় মৃত্যু ছাড়া আর সকল রোগের চিকিৎসা রয়েছে।\n" +
                            "(বুখারী, হা/৫২৮৬ ও মুসলিম)",
                    "১২। নবী করীম (সাঃ) মিষ্টি ও মধু খুব ভালো বাসতেন।\n" +
                            "(বুখারী, হা:৫২৮০)",
                    "১৩। যারা আমার সুন্নতের প্রতি বিরাগ পোষন (অনিহা প্রকাশ) করবে, তারা আমার উম্মতের অন্তর্ভূক্ত নয়।\n" +
                            "(সহীহ বুখারীঃ ৪৬৯৭)",
                    "১৪। যে ব্যক্তি বিদআত সৃষ্টি করবে ও আশ্রয় দিবে তার উপর আল্লাহ্ তা'আলার, ফেরেশতা ও সকল মানব সম্প্রদায়ের লানত ।\n" +
                            "(সহীহ বুখারীঃ ৬৮০৮)",
                    "১৫। যার অন্তরে সরিষা সমপরিমাণ ঈমান আছে, সে জাহান্নামে যাবে না। আর যার অন্তরে সরিষা সমপরিমাণ অহংকার আছে সে জান্নাতে যাবে না।\n" +
                            "(মুসলিম, মিশকাত হা/৫১০৮) ",
                    "১৬। যে ঘরে কুকুর ও (প্রাণীর) ছবি থাকে,সে ঘরে রহমতের ফেরেশতা প্রবেশ করে না।\n" +
                            "(সহীহ বুখারীঃ ২৯৯৮, ৫৫২৫, মিশকাত হাঃ৪২৯৮)",
                    "১৭। তিন ব্যক্তির দিকে কিয়ামতের দিন আল্লাহ্ তাদের দিকে করুণার দৃষ্টি দিবেন না ও তাদের জন্য কঠিন শাস্তি-\n" +
                            "(ক) টাকনুর নিচে কাপড় পরিধানকারী পুরুষ \n" +
                            "(খ) খোটাদানকারী\n" +
                            "(গ) মিথ্যা কসমে পণ্য বিক্রয়কারী।\n" +
                            "(মুসলিম, মিশকাত হা/২৬৭৩)",
                    "১৮। যে ব্যক্তি মারা গেল অথচ জিহাদ করেনি এমনকি জিহাদের আকাঙ্ক্ষাও ব্যক্ত করেনি, সে মুনাফিকের ন্যায় মৃত্যুবরণ করল।\n" +
                            "(সহীহ মুসলিমঃ ৪৭৭৯, নাসায়ীঃ ৩০৯৯)",
                    "১৯। আত্নীয়ের সাথে ভালো ব্যবহার করলে রিযিক ও হায়াত বৃদ্ধি পায়।\n" +
                            "(সহীহ বুখারীঃ ৫৫৫৯,৫৫৬০)",
                    "২০। কেউ সওয়াল থেকে পবিত্র থাকতে চাইলে আল্লাহ্ তাকে পবিত্র রাখেন। যে অমুখাপেক্ষী থাকতে চায়, আল্লাহ্ তাকে অমুখাপেক্ষী রাখেন এবং যে ধৈর্য ধারণ করতে চায়, আল্লাহ্ তাকে তাই দান করেন।\n" +
                            "ধৈর্যের চায়ে অধিক ব্যাপক কিছু দান করা হয়নি।\n" +
                            "(সহীহ বুখারী, হা/১৪৬৯,মুসলিম, আবু দাউদ, হা/১৬৪৪)",
                    "২১। বিনা হিসেবে জান্নাতে যাবে (সত্তর হাজার) ওসব লোক যারা অশুভ অমঙ্গল চিহ্ন মানে না,যারা ঝাড়-ফুক করায় না, যারা মন্ত্রতন্ত্রের ধার ধারে না এবং আগুনে পোড়া লোহার দাগ লাগায় না ; বরং সদা সর্বদা তাদের পরোয়ারদেগারের উপর পূর্ণ ভরসা রাখে।\n" +
                            "(সহীহ বুখারী, হাদিস ৫৩৪১,৬২৮,৬০৯৯)",
                    "২২। যে ব্যক্তি নিষ্ঠার সাথে শহীদি মৃত্যু কামনা করে, আল্লাহ্ তাকে শহীদদের মর্যাদায় পৌছিয়ে দিবেন, যদিও সে তার বিছানায় মৃত্যুবরণ করে।\n" +
                            "(সহীহ মুসলিমঃ ৪৭৭৮)",
                    "২৩। যখন কোন ব্যক্তি তার ভাইয়ের অনুপস্থিতিতে তার জন্য দু'আ করে, তখন ফেরেশতাগণ বলেন, আমীন, এবং তোমার জন্যও অনুরুপ হবে।\n" +
                            "(সহীহ মুসলিম ও আবু দাউদ,হাঃ১৫৩৪)",
                    "২৪। কোন ব্যক্তির মন্দ হওয়ার জন্য অশ্লীল বাকচারী ও কৃপণ হওয়াই যথেষ্ট।\n" +
                            "(আহমাদ, মিশকাত হা/৪৬৯৩)",
                    "২৫। রাসূল বলেছেন: “যে ব্যক্তি প্রতি ফরয নামায শেষে আয়াতুল কুরসী পড়ে, তার জান্নাতে প্রবেশ করতে মৃত্যু ছাড়া কোন কিছু বাধা হবে না।\n" +
                            "(সহীহ আল্ জামে :৬৪৬৪, নাসায়ী, ইবনে হিব্বান, ত্বাবরানী, আল্লামা আলবানী রহ. এর সিলসিলাতুল আহাদিস আস-সহীহা খণ্ড দুই হাদিস নং-৯৭২)",
                    "২৬। যে ব্যক্তি উযূ করে এবং উযূকে পূরণাংগরুপে সম্পন্ন করে, তারপর কালেমা শাহাদাত পাঠ করে,তার জন্য জান্নাতের ৮(আট)টি দরজা খুলে যায় । সে যে দরজা দিয়ে ইচ্ছা জান্নাতে প্রবেশ করতে পারবে ।\n" +
                            "(সহিহ মুসলিমঃ ৪৬০, তিরমিযীঃ৫৫, ইবনু মাযাহঃ ৪৭০)",
                    "২৭। যে ব্যক্তি দিবসে ১ বার ও রাতে ১ বার আন্তরিকতার সাথে সাইয়্যেদুল ইস্তেগফার পাঠ করে যদি সে দিন বা রাতে মারা যায়,তাহলে ওই ব্যক্তি জান্নাতি ।\n" +
                            "(সহিহ বুখারী-৫৮৬৭)",
                    "২৮। ওযু করার সময় কেউ যদি উত্তমরূপে ওযু করে তাহলে তার শরীরের সব গুণাহ বের হয়ে যায়। এমনকি তার নখের নিচের গুণাহও বের হয়ে যায়।\n" +
                            "(সহীহ মুসলিমঃ ৪৮৪,৪৮৫)",
                    "২৯। রাসূল (সাঃ) ইরশাদ করেছেন, তোমাদের মধ্যে সে ব্যক্তি সর্বোত্তম যে কুরান শিখে এবং অন্যকে শিক্ষা দেয়।\n" +
                            "(সহীহ বুখারীঃ ৪৬৬১,৪৬৬২)",
                    "৩০। কুরআন পাঠে দক্ষ ব্যক্তি উচ্চ মর্যাদা ফিরিশতাদের সঙ্গী হবে। আর যে ব্যক্তি কুরাআন পড়ার সময় আটকে যায় এবং কষ্ট করে তিলাওয়াত করে তার জন্য রয়েছে দ্বিগুণ সওয়াব।\n" +
                            "(সহীহ বুখারী-৪৯৩৭, মুসলিম আবু দাউদ -১৪৫৪ ক্বাতাদাহ হতে)",
                    "৩১। রাসূল্লাহ (সাঃ) বলেছেন, যখন তোমাদের কেউ মসজিদে প্রবেশ করবে, তখন সে যেন দু’রাকাত সালাত আদায় করা ব্যতীত না বসে।\n" +
                            "(বুখারী হা/৪৪৪ , ১১৬৭ ; মুসলিম হা/ ৭১৪ ; তিরমিযী হা/ ৩১৬ ; নাসাঈ হা/ ৭৩০ ;\n" +
                            "আবু দাউদ হা/ ৪৬৭ ; ইবনু মাজাহ হা/ ১১২৩ ; আহমাদ হা/ ২২০১৭ , ২২০৭২ , ২২০৮৮ , ২২১৪৬ ;দারেমী হা/ ১৩৯৩)",
                    "৩২। রাসূল (সাঃ) বলেছেনঃ আমার প্রত্যেক উম্মতের গুণাহ মাফ হবে, তবে যে গুণাহ করে বলে বেড়ায়, তার গুনাহ মাফ হবে না।\n" +
                            "(সহীহ বুখারীঃ ৫৬৪৩, সহীহ মুসলিমঃ ৭২৬৭)",
                    "৩৩। ইউসায়রাহ (রাঃ) সূত্রে বর্ণিত। নবী (সাঃ) তাদেরকে নির্দেশ দিয়েছেনঃ তোমরা তাকবীর, তাকদীস এবং তাহলীল এগুলো খুব ভালভাবে স্মরণে রাখবে এবং এগুলোকে আঙ্গুলে গুনে রাখবে। কেননা আঙ্গুলগুলোকে জিজ্ঞাসা করা হবে এবং এগুলোও সেদিন (ক্বিয়ামতে) কথা বলবে।\n" +
                            "\n" +
                            "(আবু দাউদ, হা/১৫০১, আলবানীর মতে হাসান, তিরমিযী, হা/৩৫৮৫,\n" +
                            "তিরমিযীর মতে গরীব, আহমাদ,৬/৩৭০)",
                    "৩৪। যে ব্যক্তি দুনিয়াতে কোন ব্যক্তির দোষ-ত্রূটি গোপন রাখবে, কিয়ামতের দিন আল্লাহ্ তা'আলাও তার ত্রূটি গোপন রাখবেন।\n" +
                            "(সহীহ মুসলিমঃ ৬৩৯২,৬৪০৮,৬৩০৯)",
                    "৩৫। বিদাতী হাউজে কাওছারের পানি পাবে না।\n" +
                            "(সহীহ বুখারীঃ ৬১২৭,৬৫৭৩, মুসলিমঃ ৫৭৯৯,৫৮০২,৫৮০৩)",
                    "৩৬। যে ব্যক্তি নম্রতা ও সহনশীলতার বৈশিষ্ট্য থেকে বঞ্চিত সে কল্যান থেকে বঞ্চিত।\n" +
                            "(সহীহ মুসলিমঃ ৬৪১২,৬৪১৩,৬৪১৪)",
                    "৩৭। মানুষের মধ্যে সর্বাপেক্ষা নিকৃষ্ট হল 'দ্বিমুখী ব্যক্তি'। তারা এদের কাছে বলে এক কথা আর ওদের কাছে বলে আর এক কথা।\n" +
                            "(সহীহ বুখারীঃ ৬৬৯০)",
                    "৩৮। নেশা সৃষ্টি করে এমন যে কোন পানীয় হারাম।\n" +
                            "(সহীহ বুখারীঃ ৫২৫৮, সহীহ মুসলিমঃ ৫০৫১,৫০৫২,৫০৫৩,৫০৫৪)",
                    "৩৯। রাসূল (সাঃ) বলেছেন যে ব্যক্তি তার দু'চোয়ালের মাঝখান (অর্থাৎ জিহ্ববা) এবং দ'পায়ের মাঝখান (অর্থাৎ লজ্জাস্থান)- এর জামানত আমাকে দিবে, আমি তার জান্নাতের জামিন হব।\n" +
                            "(সহীহ বুখারীঃ ৬০৩০, মিশকাত হাঃ৪৬০১)",
                    "৪০। ঈমানের সত্তরের কিছু বেশী শাখার মধ্যে সর্বোত্তম শাখা হচ্ছে 'লা-ইলাহা ইল্লাল্লাহু' বলা এবং সাধারণ শাখা হচ্ছে চলার পথ থেকে কষ্টদায়ক বস্তু সরিয়ে দেয়া। আর লজ্জা হচ্ছে ঈমানের একটি বিশেষ শাখা।\n" +
                            "(সহীহ মুসলিমঃ ৬১)"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namaj);

        RecyclerView RV=(RecyclerView) findViewById(R.id.recyclerViewId);
        RV.setLayoutManager(new LinearLayoutManager(this));

        NamajAdapter adapt=new NamajAdapter(this,NamajNames);
        RV.setAdapter(adapt);
    }
}