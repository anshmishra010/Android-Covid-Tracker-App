package com.profile.coivdtracker;

// for displaying the list of the countries

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class MyCustomAdapter extends ArrayAdapter<CountryModel> {

    private Context context;
    private List<CountryModel>countryModelList;
    private List<CountryModel>countryModelListFiltered; // this the searched country which is being filtered

    // constructor
    public MyCustomAdapter( Context context, List<CountryModel>countryModelList) {

//        here we are linking the list xml file to this file
        super(context, R.layout.list_custom_item,countryModelList);

        this.context = context;
        this.countryModelList = countryModelList;
        this.countryModelListFiltered = countryModelList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // main work is done here
        // we will be adding the data which we are getting
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_custom_item,null,true);
        TextView tvCountryName = view.findViewById(R.id.tvCountryName);
        ImageView imageView = view.findViewById(R.id.imageFlag);


        tvCountryName.setText(countryModelListFiltered.get(position).getCountry());

        // getting flag image via glide library
        Glide.with(context).load(countryModelListFiltered.get(position).getFlag()).into(imageView);


        return view;
    }


    // it will return the size of the list
    @Override
    public int getCount() {
        return countryModelListFiltered.size();
    }

    @Nullable
    @Override
    public CountryModel getItem(int position) {
        return countryModelListFiltered.get(position);
    }

    // for the position
    @Override
    public long getItemId(int position) {
        return position;
    }

    // in this function we are performing the actual filtering process
    @Override
    public Filter getFilter() {
             Filter filter = new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {

                // storing the filter result
                FilterResults filterResults = new FilterResults();
                if(constraint == null || constraint.length() == 0){
                    // if entered data got matched then we will store the data into the count and values
                    filterResults.count = countryModelList.size();
                    filterResults.values = countryModelList;

                }
                else{
                    List<CountryModel> resultsModel = new ArrayList<>();
                    String searchStr = constraint.toString().toLowerCase();

                    // here we are matching the alphabet and storing into the resultmodel
                    for(CountryModel itemsModel:countryModelList){
                        if(itemsModel.getCountry().toLowerCase().contains(searchStr)){
                            resultsModel.add(itemsModel);

                        }
                        filterResults.count = resultsModel.size();
                        filterResults.values = resultsModel;
                    }


                }

                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {

               countryModelListFiltered = (List<CountryModel>) results.values;
                AffectedCountries.countryModelsList = (List<CountryModel>) results.values;
                notifyDataSetChanged();

            }
        };
        return filter;
    }
}
