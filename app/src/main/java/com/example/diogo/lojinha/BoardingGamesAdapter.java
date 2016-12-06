package com.example.diogo.lojinha;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by diogo on 15/11/2016.
 */

public class BoardingGamesAdapter extends ArrayAdapter<BoardingGames> {
    Context context;
    List<BoardingGames> games;
    int resource;
    public BoardingGamesAdapter(Context context, int resource, List<BoardingGames> objects) {
        super(context, resource, objects);
        this.context = context;
        this.games = objects;
        this.resource = resource;
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater
                                .from(context)
                                .inflate(resource,parent,false);
        }

        TextView game_title = (TextView) convertView.findViewById(R.id.game_title);
        TextView game_description = (TextView) convertView.findViewById(R.id.game_description);
        TextView game_price = (TextView) convertView.findViewById(R.id.game_price);
        ImageView game_view = (ImageView) convertView.findViewById(R.id.game_image);

        game_title.setText(games.get(position).getTitle());
        game_description.setText(games.get(position).getDescription());
        game_price.setText(Float.toString(games.get(position).getPrice()));
        //TODO:set images por the thumbsnails

        return convertView;

    }
}
