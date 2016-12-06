package com.example.diogo.lojinha;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ShopFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class ShopFragment extends Fragment {
    //TODO CHANGE IP INTO YOURS
    String ip ="http://192.168.10.1";

        URL url;





    private OnFragmentInteractionListener mListener;

    public ShopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_shop, container, false);
        GridView thumbs = (GridView) v.findViewById(R.id.thumbnails);
       try {
           url = new URL(ip + "/shop/adiciona");
       }catch (MalformedURLException e){
           e.printStackTrace();
       }


        List<BoardingGames> lsta = new ArrayList<>(5);
        BoardingGames bb = new BoardingGames("Grande jogo pah",0,null,"Monopolio",14);
        lsta.add(bb);
        BoardingGames bc = new BoardingGames("Grande jogo pah",0,null,"Catan",19.99f);
        lsta.add(bc);
        BoardingGames bd = new BoardingGames("Grande jogo pah",0,null,"Xerif",14);
        lsta.add(bd);
        BoardingGames be = new BoardingGames("Grande jogo pah",0,null,"Risco",12.4f);
        lsta.add(be);
        BoardingGames bf = new BoardingGames("Grande jogo pah",0,null,"Carcassone",14);
        lsta.add(bf);
        BoardingGamesAdapter boardingGamesAdapter = new BoardingGamesAdapter(getContext(),R.layout.thumbnail,lsta);
        thumbs.setAdapter(boardingGamesAdapter);

        return v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
