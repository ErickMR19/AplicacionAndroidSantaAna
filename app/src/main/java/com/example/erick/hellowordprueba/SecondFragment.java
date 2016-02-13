package com.example.erick.hellowordprueba;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SecondFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SecondFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SecondFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public SecondFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SecondFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SecondFragment newInstance(String param1, String param2) {
        SecondFragment fragment = new SecondFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_secondfragment, container, false);
        TextView theTextView = (TextView) view.findViewById(R.id.textContent);
        theTextView.setText(Html.fromHtml("" +
                "<h2>Geología</h2>" +
                "<p>El cantón de Santa Ana está constituido geológicamente por materiales de los períodos Terciario y Cuaternario; son las rocas sedimentarias del Terciario las que predominan en la región. Del período Terciario se encuentran rocas de origen sedimentario e intrusivo de la época Mioceno. Las sedimentarias están agrupadas bajo el nombre de formación Pacacua, que corresponde a una secuencia de materiales, constituida por interestratificaciones de conglomerados brechosos y areniscas conglomeráticas, areniscas, limolitas y lutitas, todas tobáceas, en algunas partes con coloraciones moráceas; ubicadas entre el cerro Coyote y el sector suroeste del poblado Matinilla, y de este último hasta el cerro Mesas; así como en el sector aledaño al cerro Mina.</p>" +
                "<p>Las rocas intrusivas, corresponden a los Intrusivos Acidos de la Cordillera de Talamanca, tales como dioritas cuárcicas y granodioritas, también gabros y granitos; los cuales se ubican en los cerros Escazú, así como en cerro Palomas. Entre los materiales del periodo Cuaternario, se hallan rocas de origen volcánico y sedimentario de la época Holoceno. Las primeras corresponden a materiales Volcánicos, tales como lavas, tobas y piroclastos; situados en la zona comprendida por las villas Pozos, Río Oro, Piedades y el límite norte del cantón; y a Depósitos Fluviales y Coluviales; localizados en el sector aledaño a ciudad de Santa Ana y sector sur de esta, lo mismo que en las márgenes del curso medio del río Oro.</p>" +
                "<br>" +
                "<h2>Geomorfología</h2>" +
                "<p>El cantón de Santa Ana presenta tres unidades geomórificas, denominadas forma originada por acción intrusiva, de origen volcánico y originado por remoción en masa. La unidad originada por acción intrusiva, se divide en dos subunidades llamadas Macizo de Escazú y Loma del Alto de las Palomas.</p>" +
                "<p>La subunidad Macizo de Escazú, se localiza en la zona comprendida por villa Salitral, confluencia de los ríos Virilla y Uruca, cerros de Escazú y el límite sur y oeste del cantón; se caracteriza por presentar laderas de fuerte pendiente, las divisorias son redondeadas pero muy escarpadas; esta unidad se compone propiamente de rocas ígneas intrusivas y volcánicas con escamas o intercalaciones de sedimentos, las cuales en superficie se encuentran muy meteorizadas, se observan evidencias de la acción hidrotermal, y neumatolítica a consecuencia de la vecindad en el subsuelo de masas intrusivas, manifestadas con calinización de las rocas, hilillos de sílice y silicificación en general; esta subunidad se originó por la acción causada por cuerpos intrusivos.</p>" +
                "<p>La subunidad Loma del Alto de las Palomas, se ubica entre los poblados Honduras y Alto Palomas oeste; constituye una loma alargada, las laderas son de pendiente suave, redondeada, convexas, con muy pocas vías de drenaje superficial; esta unidad corresponde a la Formación Pacacua, cubierta hacia los flancos bajos de las laderas por ignimbritas recientes, dentro de las rocas se encuentran areniscas tobáceas muy meteorizadas y algo afectadas por la acción hidrotermal de intrusiones locales, es frecuente la presencia de zonas muy arcillificadas que tienen problemas de estabilidad; su forma se ha originado por la acción que la erosión ha ejercido sobre rocas volcano sedimentarias de la citada formación, afectadas por distintos grados de efectos intrusivos.</p>" +
                "<p>La unidad de origen volcánico, representada por el relleno volcánico del valle central, se sitúa en la zona comprendida por ciudad de Santa Ana villa Piedades, y los poblados de Lindora y Honduras, así como en el sector este de villa Salitral; corresponde a un relieve plano ondulado. La unidad está formada en superficie por rocas volcánicas, principalmente, lavas, tobas e ignimbritas cubierta por ceniza en un espesor variable.</p>" +
                "<p>La secuencia de lavas descansa sobre roca sedimentaria . Las lavas son del tipo andesítico. Geomorfológicamente, esta unidad no es un valle, sin embargo para efectos políticos, socio económicos y todo tipo de referencia, se considera preferible seguirlo denominando Valle Central.</p>" +
                "<p>El nombre técnico correcto es fosa tectónica, debido a la presencia de una falla a todo lo largo del pie de la sierra volcánica Central, la cual está evidenciada por la existencia de fuentes termominerales; así como la interrupción brusca y alineada con la supuesta falla de las estribaciones que bajan de la mencionada sierra hacia el valle; lo mismo que por la presencia de un vulcanismo sin explicación aparente (Formación Pacacua), en correspondencia con la posición de la falla o cerca de ella la unidad originada por remoción en masa, se manifiesta por el deslizamiento del alto de Tapezco, el cual se encuentra en un pequeño sector al sureste del poblado Matinilla.</p>" +
                "<p>Se caracteriza por una marcada cicatriz en la parte superior donde se inicia el movimiento de tierras, grietas longitudinales siguiendo aproximadamente curvas de nivel y que generalmente marcó grandes diferencias de relieve, terracitas en gran cantidad, e irregularidades abundantes en forma de montículos y depresiones.</p>" +
                "<p>Los desplazamientos verticales son en algunos sitios de siete metros, producto del hundimiento del terreno. Las rocas de esta unidad corresponden a la formación Pacacua encontrándose areniscas, conglomerados y lutitas; todo en un alto grado de meteorización. El origen de este deslizamiento está en una capa arcillosa, que se encuentra en algunos lugares a profundidades de diez metros y en otros a veinte metros. La gran humedad dentro de estas rocas es factor primordial que favorece al movimiento de la masa del terreno.</p>"));
        theTextView.setMovementMethod(new ScrollingMovementMethod());
        return view;
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
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
