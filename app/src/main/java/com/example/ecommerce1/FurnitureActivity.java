package com.example.ecommerce1;

import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.ar.core.Anchor;
import com.google.ar.sceneform.AnchorNode;
import com.google.ar.sceneform.math.Quaternion;
import com.google.ar.sceneform.math.Vector3;
import com.google.ar.sceneform.rendering.ModelRenderable;
import com.google.ar.sceneform.rendering.ViewRenderable;
import com.google.ar.sceneform.ux.ArFragment;
import com.google.ar.sceneform.ux.TransformableNode;


public class FurnitureActivity extends AppCompatActivity implements View.OnClickListener{


    ArFragment arFragment;

    private ModelRenderable aluminium_chairRenderable,
            armchairRenderable,
            basketball_hoopRenderable,
            benchRenderable,
            cheminiRenderable,
            college_tableRenderable,
            cottage_lightRenderable,
            doorRenderable,
            door1Renderable,
            drawerRenderable,
            eb_nightstandRenderable,
            footballRenderable,
            kitchen_wardrobeRenderable,
            office_chairRenderable,
            outdoorparkbenchesRenderable,
            ps4Renderable,
            samsung_led_tvRenderable,
            shelfRenderable,
            sink_longRenderable,
            tableRenderable,
            table_chairRenderable,
            toiletRenderable,
            treadmillRenderable,
            tvcabinetRenderable,
            whirlpool_gas_cookerRenderable,
            wineglassRenderable;

    ImageView aluminium_chair,armchair,basketball_hoop,bench,chemini,college_table,cottage_light,door,door1,drawer,eb_nightstand,football,kitchen_wardrobe,office_chair,outdoorparkbenches,ps4,samsung_led_tv,shelf,sink_long,table,table_chair,toilet,treadmill,tvcabinet,whirlpool_gas_cooker,wineglass;

    View arrayView[];
    int selected =1; //Default aluminium_chair choose;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_furniture);

        arFragment = (ArFragment)getSupportFragmentManager().findFragmentById(R.id.sceneform_ux_fragment);

        aluminium_chair =(ImageView)findViewById(R.id.aluminium_chair);
        armchair =(ImageView)findViewById(R.id.armchair);
        basketball_hoop =(ImageView)findViewById(R.id.basketball_hoop);
        bench =(ImageView)findViewById(R.id.bench);
        chemini =(ImageView)findViewById(R.id.chemini);
        college_table =(ImageView)findViewById(R.id.college_table);
        cottage_light =(ImageView)findViewById(R.id.cottage_light);
        door =(ImageView)findViewById(R.id.door);
        door1 =(ImageView)findViewById(R.id.door1);
        drawer =(ImageView)findViewById(R.id.drawer);
        eb_nightstand =(ImageView)findViewById(R.id.eb_nightstand);
        football =(ImageView)findViewById(R.id.football);
        kitchen_wardrobe =(ImageView)findViewById(R.id.kitchen_wardrobe);
        office_chair =(ImageView)findViewById(R.id.office_chair);
        outdoorparkbenches =(ImageView)findViewById(R.id.outdoorparkbenches);
        ps4 =(ImageView)findViewById(R.id.ps4);
        samsung_led_tv =(ImageView)findViewById(R.id.samsung_led_tv);
        shelf =(ImageView)findViewById(R.id.shelf);
        sink_long =(ImageView)findViewById(R.id.sink_long);
        table =(ImageView)findViewById(R.id.table);
        table_chair =(ImageView)findViewById(R.id.table_chair);
        toilet =(ImageView)findViewById(R.id.toilet);
        treadmill =(ImageView)findViewById(R.id.treadmill);
        tvcabinet =(ImageView)findViewById(R.id.tvcabinet);
        whirlpool_gas_cooker =(ImageView)findViewById(R.id.whirlpool_gas_cooker);
        wineglass =(ImageView)findViewById(R.id.wineglass);

        setArrayView();
        setClickListener();
        setupModel();

        arFragment.setOnTapArPlaneListener((hitResult, plane, motionEvent) -> {

            Anchor anchor = hitResult.createAnchor();
            AnchorNode anchorNode = new AnchorNode(anchor);
            anchorNode.setParent(arFragment.getArSceneView().getScene());
            createModel(anchorNode, selected);
        });
    }



    private void setupModel() {
        ModelRenderable.builder()
                .setSource(this,R.raw.aluminium_chair)
                .build().thenAccept(renderable -> aluminium_chairRenderable = renderable)
                .exceptionally(
                        throwable -> {
                            Toast toast =
                                    Toast.makeText(this, "Unable to Load ark", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER,0,0);
                            toast.show();
                            return null;
                        }
                );

        ModelRenderable.builder()
                .setSource(this,R.raw.armchair)
                .build().thenAccept(renderable -> armchairRenderable = renderable)
                .exceptionally(
                        throwable -> {
                            Toast toast =
                                    Toast.makeText(this, "Unable to Load ark", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER,0,0);
                            toast.show();
                            return null;
                        }
                );

        ModelRenderable.builder()
                .setSource(this,R.raw.basketball_hoop)
                .build().thenAccept(renderable -> basketball_hoopRenderable = renderable)
                .exceptionally(
                        throwable -> {
                            Toast toast =
                                    Toast.makeText(this, "Unable to Load ark", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER,0,0);
                            toast.show();
                            return null;
                        }
                );

        ModelRenderable.builder()
                .setSource(this,R.raw.bench)
                .build().thenAccept(renderable -> benchRenderable = renderable)
                .exceptionally(
                        throwable -> {
                            Toast toast =
                                    Toast.makeText(this, "Unable to Load ark", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER,0,0);
                            toast.show();
                            return null;
                        }
                );

        ModelRenderable.builder()
                .setSource(this,R.raw.chemini)
                .build().thenAccept(renderable -> cheminiRenderable = renderable)
                .exceptionally(
                        throwable -> {
                            Toast toast =
                                    Toast.makeText(this, "Unable to Load ark", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER,0,0);
                            toast.show();
                            return null;
                        }
                );

        ModelRenderable.builder()
                .setSource(this,R.raw.college_table)
                .build().thenAccept(renderable -> college_tableRenderable = renderable)
                .exceptionally(
                        throwable -> {
                            Toast toast =
                                    Toast.makeText(this, "Unable to Load ark", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER,0,0);
                            toast.show();
                            return null;
                        }
                );

        ModelRenderable.builder()
                .setSource(this,R.raw.cottage_light)
                .build().thenAccept(renderable -> cottage_lightRenderable = renderable)
                .exceptionally(
                        throwable -> {
                            Toast toast =
                                    Toast.makeText(this, "Unable to Load ark", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER,0,0);
                            toast.show();
                            return null;
                        }
                );

        ModelRenderable.builder()
                .setSource(this,R.raw.door)
                .build().thenAccept(renderable -> doorRenderable = renderable)
                .exceptionally(
                        throwable -> {
                            Toast toast =
                                    Toast.makeText(this, "Unable to Load ark", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER,0,0);
                            toast.show();
                            return null;
                        }
                );
        ModelRenderable.builder()
                .setSource(this,R.raw.door1)
                .build().thenAccept(renderable -> door1Renderable = renderable)
                .exceptionally(
                        throwable -> {
                            Toast toast =
                                    Toast.makeText(this, "Unable to Load ark", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER,0,0);
                            toast.show();
                            return null;
                        }
                );

        ModelRenderable.builder()
                .setSource(this,R.raw.drawer)
                .build().thenAccept(renderable -> drawerRenderable = renderable)
                .exceptionally(
                        throwable -> {
                            Toast toast =
                                    Toast.makeText(this, "Unable to Load ark", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER,0,0);
                            toast.show();
                            return null;
                        }
                );

        ModelRenderable.builder()
                .setSource(this,R.raw.eb_nightstand)
                .build().thenAccept(renderable -> eb_nightstandRenderable = renderable)
                .exceptionally(
                        throwable -> {
                            Toast toast =
                                    Toast.makeText(this, "Unable to Load ark", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER,0,0);
                            toast.show();
                            return null;
                        }
                );

        ModelRenderable.builder()
                .setSource(this,R.raw.football)
                .build().thenAccept(renderable -> footballRenderable = renderable)
                .exceptionally(
                        throwable -> {
                            Toast toast =
                                    Toast.makeText(this, "Unable to Load ark", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER,0,0);
                            toast.show();
                            return null;
                        }
                );

        ModelRenderable.builder()
                .setSource(this,R.raw.kitchen_wardrobe)
                .build().thenAccept(renderable -> kitchen_wardrobeRenderable = renderable)
                .exceptionally(
                        throwable -> {
                            Toast toast =
                                    Toast.makeText(this, "Unable to Load ark", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER,0,0);
                            toast.show();
                            return null;
                        }
                );

        ModelRenderable.builder()
                .setSource(this,R.raw.office_chair)
                .build().thenAccept(renderable -> office_chairRenderable = renderable)
                .exceptionally(
                        throwable -> {
                            Toast toast =
                                    Toast.makeText(this, "Unable to Load ark", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER,0,0);
                            toast.show();
                            return null;
                        }
                );

        ModelRenderable.builder()
                .setSource(this,R.raw.outdoorparkbenches)
                .build().thenAccept(renderable -> outdoorparkbenchesRenderable = renderable)
                .exceptionally(
                        throwable -> {
                            Toast toast =
                                    Toast.makeText(this, "Unable to Load ark", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER,0,0);
                            toast.show();
                            return null;
                        }
                );

        ModelRenderable.builder()
                .setSource(this,R.raw.ps4)
                .build().thenAccept(renderable -> ps4Renderable = renderable)
                .exceptionally(
                        throwable -> {
                            Toast toast =
                                    Toast.makeText(this, "Unable to Load ark", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER,0,0);
                            toast.show();
                            return null;
                        }
                );

        ModelRenderable.builder()
                .setSource(this,R.raw.samsung_led_tv)
                .build().thenAccept(renderable -> samsung_led_tvRenderable = renderable)
                .exceptionally(
                        throwable -> {
                            Toast toast =
                                    Toast.makeText(this, "Unable to Load ark", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER,0,0);
                            toast.show();
                            return null;
                        }
                );

        ModelRenderable.builder()
                .setSource(this,R.raw.shelf)
                .build().thenAccept(renderable -> shelfRenderable = renderable)
                .exceptionally(
                        throwable -> {
                            Toast toast =
                                    Toast.makeText(this, "Unable to Load ark", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER,0,0);
                            toast.show();
                            return null;
                        }
                );

        ModelRenderable.builder()
                .setSource(this,R.raw.sink_long)
                .build().thenAccept(renderable -> sink_longRenderable = renderable)
                .exceptionally(
                        throwable -> {
                            Toast toast =
                                    Toast.makeText(this, "Unable to Load ark", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER,0,0);
                            toast.show();
                            return null;
                        }
                );

        ModelRenderable.builder()
                .setSource(this,R.raw.table)
                .build().thenAccept(renderable -> tableRenderable = renderable)
                .exceptionally(
                        throwable -> {
                            Toast toast =
                                    Toast.makeText(this, "Unable to Load ark", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER,0,0);
                            toast.show();
                            return null;
                        }
                );

        ModelRenderable.builder()
                .setSource(this,R.raw.table_chair)
                .build().thenAccept(renderable -> table_chairRenderable = renderable)
                .exceptionally(
                        throwable -> {
                            Toast toast =
                                    Toast.makeText(this, "Unable to Load ark", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER,0,0);
                            toast.show();
                            return null;
                        }
                );

        ModelRenderable.builder()
                .setSource(this,R.raw.toilet)
                .build().thenAccept(renderable -> toiletRenderable = renderable)
                .exceptionally(
                        throwable -> {
                            Toast toast =
                                    Toast.makeText(this, "Unable to Load ark", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER,0,0);
                            toast.show();
                            return null;
                        }
                );

        ModelRenderable.builder()
                .setSource(this,R.raw.treadmill)
                .build().thenAccept(renderable -> treadmillRenderable = renderable)
                .exceptionally(
                        throwable -> {
                            Toast toast =
                                    Toast.makeText(this, "Unable to Load ark", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER,0,0);
                            toast.show();
                            return null;
                        }
                );

        ModelRenderable.builder()
                .setSource(this,R.raw.tvcabinet)
                .build().thenAccept(renderable -> tvcabinetRenderable = renderable)
                .exceptionally(
                        throwable -> {
                            Toast toast =
                                    Toast.makeText(this, "Unable to Load ark", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER,0,0);
                            toast.show();
                            return null;
                        }
                );

        ModelRenderable.builder()
                .setSource(this,R.raw.whirlpool_gas_cooker)
                .build().thenAccept(renderable -> whirlpool_gas_cookerRenderable = renderable)
                .exceptionally(
                        throwable -> {
                            Toast toast =
                                    Toast.makeText(this, "Unable to Load ark", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER,0,0);
                            toast.show();
                            return null;
                        }
                );

        ModelRenderable.builder()
                .setSource(this,R.raw.wineglass)
                .build().thenAccept(renderable -> wineglassRenderable = renderable)
                .exceptionally(
                        throwable -> {
                            Toast toast =
                                    Toast.makeText(this, "Unable to Load ark", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER,0,0);
                            toast.show();
                            return null;
                        }
                );
    }

    private void createModel(AnchorNode anchorNode, int selected) {
        if(selected == 1)
        {
            TransformableNode aluminum_chair = new TransformableNode(arFragment.getTransformationSystem());
            aluminum_chair.setLocalRotation(Quaternion.axisAngle(new Vector3(1f, 0, 0), 360f));
            //aluminum_chair.setLocalScale(new Vector3(0.1f, 0.1f, 0.1f));
            aluminum_chair.getScaleController().setMaxScale(1.01f);
            aluminum_chair.getScaleController().setMinScale(0.01f);
            aluminum_chair.setParent(anchorNode);
            aluminum_chair.setRenderable(aluminium_chairRenderable);
            aluminum_chair.select();

            addName(anchorNode,aluminum_chair,"Aluminium Chair");
        }
        if(selected == 2)
        {
            TransformableNode armchair = new TransformableNode(arFragment.getTransformationSystem());
            armchair.setLocalRotation(Quaternion.axisAngle(new Vector3(1f, 0, 0), 360f));
            //armchair.setLocalScale(new Vector3(0.1f, 0.1f, 0.1f));
            armchair.getScaleController().setMaxScale(1.01f);
            armchair.getScaleController().setMinScale(0.01f);
            armchair.setParent(anchorNode);
            armchair.setRenderable(armchairRenderable);
            armchair.select();

            addName(anchorNode,armchair,"Office Chair");
        }
        if(selected == 3)
        {
            TransformableNode basketball_hoop = new TransformableNode(arFragment.getTransformationSystem());
            basketball_hoop.setLocalRotation(Quaternion.axisAngle(new Vector3(1f, 0, 0), 360f));
            //basketball_hoop.setLocalScale(new Vector3(0.1f, 0.1f, 0.1f));
            basketball_hoop.getScaleController().setMaxScale(1.01f);
            basketball_hoop.getScaleController().setMinScale(0.01f);
            basketball_hoop.setParent(anchorNode);
            basketball_hoop.setRenderable(basketball_hoopRenderable);
            basketball_hoop.select();

            addName(anchorNode,basketball_hoop,"BasketBall_hoop");
        }
        if(selected == 4)
        {
            TransformableNode bench = new TransformableNode(arFragment.getTransformationSystem());
            bench.setLocalRotation(Quaternion.axisAngle(new Vector3(1f, 0, 0), 360f));
            //bench.setLocalScale(new Vector3(0.1f, 0.1f, 0.1f));
            bench.getScaleController().setMaxScale(1.01f);
            bench.getScaleController().setMinScale(0.01f);
            bench.setParent(anchorNode);
            bench.setRenderable(benchRenderable);
            bench.select();

            addName(anchorNode,bench,"Park Bench");
        }
        if(selected == 5)
        {
            TransformableNode chemini = new TransformableNode(arFragment.getTransformationSystem());
            chemini.setLocalRotation(Quaternion.axisAngle(new Vector3(1f, 0, 0), 360f));
            //chemini.setLocalScale(new Vector3(0.1f, 0.1f, 0.1f));
            chemini.getScaleController().setMaxScale(1.01f);
            chemini.getScaleController().setMinScale(0.01f);
            chemini.setParent(anchorNode);
            chemini.setRenderable(cheminiRenderable);
            chemini.select();

            addName(anchorNode,chemini,"Chemini");
        }
        if(selected == 6)
        {
            TransformableNode college_table = new TransformableNode(arFragment.getTransformationSystem());
            college_table.setLocalRotation(Quaternion.axisAngle(new Vector3(1f, 0, 0), 360f));
            // college_table.setLocalScale(new Vector3(0.1f, 0.1f, 0.1f));
            college_table.getScaleController().setMaxScale(1.10f);
            college_table.getScaleController().setMinScale(0.01f);
            college_table.setParent(anchorNode);
            college_table.setRenderable(college_tableRenderable);
            college_table.select();

            addName(anchorNode,college_table,"College Table");
        }
        if(selected == 7)
        {
            TransformableNode cottage_light = new TransformableNode(arFragment.getTransformationSystem());
            cottage_light.setLocalRotation(Quaternion.axisAngle(new Vector3(1f, 0, 0), 360f));
            // cottage_light.setLocalScale(new Vector3(0.1f, 0.1f, 0.1f));
            cottage_light.getScaleController().setMaxScale(1.01f);
            cottage_light.getScaleController().setMinScale(0.01f);
            cottage_light.setParent(anchorNode);
            cottage_light.setRenderable(cottage_lightRenderable);
            cottage_light.select();

            addName(anchorNode,cottage_light,"Cottage light");
        }
        if(selected == 8)
        {
            TransformableNode door = new TransformableNode(arFragment.getTransformationSystem());
            door.setLocalRotation(Quaternion.axisAngle(new Vector3(1f, 0, 0), 360f));
            // door.setLocalScale(new Vector3(0.1f, 0.1f, 0.1f));
            door.getScaleController().setMaxScale(1.01f);
            door.getScaleController().setMinScale(0.01f);
            door.setParent(anchorNode);
            door.setRenderable(doorRenderable);
            door.select();

            addName(anchorNode,door,"Door");
        }
        if(selected == 9)
        {
            TransformableNode door1 = new TransformableNode(arFragment.getTransformationSystem());
            door1.setLocalRotation(Quaternion.axisAngle(new Vector3(1f, 0, 0), 360f));
            // door1.setLocalScale(new Vector3(0.1f, 0.1f, 0.1f));
            door1.getScaleController().setMaxScale(1.01f);
            door1.getScaleController().setMinScale(0.01f);
            door1.setParent(anchorNode);
            door1.setRenderable(door1Renderable);
            door1.select();

            addName(anchorNode,door1,"Wooden Door");
        }
        if(selected == 10)
        {
            TransformableNode drawer = new TransformableNode(arFragment.getTransformationSystem());
            drawer.setLocalRotation(Quaternion.axisAngle(new Vector3(1f, 0, 0), 360f));
            // drawer.setLocalScale(new Vector3(0.1f, 0.1f, 0.1f));
            drawer.getScaleController().setMaxScale(1.01f);
            drawer.getScaleController().setMinScale(0.01f);
            drawer.setParent(anchorNode);
            drawer.setRenderable(drawerRenderable);
            drawer.select();

            addName(anchorNode,drawer,"Drawer");
        }
        if(selected == 11)
        {
            TransformableNode eb_nightstand = new TransformableNode(arFragment.getTransformationSystem());
            eb_nightstand.setLocalRotation(Quaternion.axisAngle(new Vector3(1f, 0, 0), 360f));
            // eb_nightstand.setLocalScale(new Vector3(0.1f, 0.1f, 0.1f));
            eb_nightstand.getScaleController().setMaxScale(1.01f);
            eb_nightstand.getScaleController().setMinScale(0.01f);
            eb_nightstand.setParent(anchorNode);
            eb_nightstand.setRenderable(eb_nightstandRenderable);
            eb_nightstand.select();

            addName(anchorNode,eb_nightstand,"Nightstand");
        }
        if(selected == 12)
        {
            TransformableNode football = new TransformableNode(arFragment.getTransformationSystem());
            football.setLocalRotation(Quaternion.axisAngle(new Vector3(1f, 0, 0), 360f));
            // football.setLocalScale(new Vector3(0.1f, 0.1f, 0.1f));
            football.getScaleController().setMaxScale(1.01f);
            football.getScaleController().setMinScale(0.01f);
            football.setParent(anchorNode);
            football.setRenderable(footballRenderable);
            football.select();

            addName(anchorNode,football,"Football");
        }
        if(selected == 13)
        {
            TransformableNode kitchen_wardrobe = new TransformableNode(arFragment.getTransformationSystem());
            kitchen_wardrobe.setLocalRotation(Quaternion.axisAngle(new Vector3(1f, 0, 0), 360f));
            // kitchen_wardrobe.setLocalScale(new Vector3(0.1f, 0.1f, 0.1f));
            kitchen_wardrobe.getScaleController().setMaxScale(1.01f);
            kitchen_wardrobe.getScaleController().setMinScale(0.01f);
            kitchen_wardrobe.setParent(anchorNode);
            kitchen_wardrobe.setRenderable(kitchen_wardrobeRenderable);
            kitchen_wardrobe.select();

            addName(anchorNode,kitchen_wardrobe,"Kitchen Wardrobe");
        }
        if(selected == 14)
        {
            TransformableNode office_chair = new TransformableNode(arFragment.getTransformationSystem());
            office_chair.setLocalRotation(Quaternion.axisAngle(new Vector3(1f, 0, 0), 360f));
            // office_chair.setLocalScale(new Vector3(0.1f, 0.1f, 0.1f));
            office_chair.getScaleController().setMaxScale(1.01f);
            office_chair.getScaleController().setMinScale(0.01f);
            office_chair.setParent(anchorNode);
            office_chair.setRenderable(office_chairRenderable);
            office_chair.select();

            addName(anchorNode,office_chair,"Office Chair");
        }
        if(selected == 15)
        {
            TransformableNode outdoorparkbenches = new TransformableNode(arFragment.getTransformationSystem());
            outdoorparkbenches.setLocalRotation(Quaternion.axisAngle(new Vector3(1f, 0, 0), 360f));
            // outdoorparkbenches.setLocalScale(new Vector3(0.1f, 0.1f, 0.1f));
            outdoorparkbenches.getScaleController().setMaxScale(1.01f);
            outdoorparkbenches.getScaleController().setMinScale(0.01f);
            outdoorparkbenches.setParent(anchorNode);
            outdoorparkbenches.setRenderable(outdoorparkbenchesRenderable);
            outdoorparkbenches.select();

            addName(anchorNode,outdoorparkbenches,"OutdoorPark Benches");
        }
        if(selected == 16)
        {
            TransformableNode ps4 = new TransformableNode(arFragment.getTransformationSystem());
            ps4.setLocalRotation(Quaternion.axisAngle(new Vector3(1f, 0, 0), 360f));
            // ps4.setLocalScale(new Vector3(0.1f, 0.1f, 0.1f));
            ps4.getScaleController().setMaxScale(1.01f);
            ps4.getScaleController().setMinScale(0.01f);
            ps4.setParent(anchorNode);
            ps4.setRenderable(ps4Renderable);
            ps4.select();

            addName(anchorNode,ps4,"PlayStation 4");
        }
        if(selected == 17)
        {
            TransformableNode samsung_led_tv = new TransformableNode(arFragment.getTransformationSystem());
            samsung_led_tv.setLocalRotation(Quaternion.axisAngle(new Vector3(1f, 0, 0), 360f));
            // samsung_led_tv.setLocalScale(new Vector3(0.1f, 0.1f, 0.1f));
            samsung_led_tv.getScaleController().setMaxScale(1.01f);
            samsung_led_tv.getScaleController().setMinScale(0.01f);
            samsung_led_tv.setParent(anchorNode);
            samsung_led_tv.setRenderable(samsung_led_tvRenderable);
            samsung_led_tv.select();

            addName(anchorNode,samsung_led_tv,"Samsung Led Tv");
        }
        if(selected == 18)
        {
            TransformableNode shelf = new TransformableNode(arFragment.getTransformationSystem());
            shelf.setLocalRotation(Quaternion.axisAngle(new Vector3(1f, 0, 0), 360f));
            // shelf.setLocalScale(new Vector3(0.1f, 0.1f, 0.1f));
            shelf.getScaleController().setMaxScale(1.01f);
            shelf.getScaleController().setMinScale(0.01f);
            shelf.setParent(anchorNode);
            shelf.setRenderable(shelfRenderable);
            shelf.select();

            addName(anchorNode,shelf,"shelf");
        }
        if(selected == 19)
        {
            TransformableNode sink_long = new TransformableNode(arFragment.getTransformationSystem());
            sink_long.setLocalRotation(Quaternion.axisAngle(new Vector3(1f, 0, 0), 360f));
            // sink_long.setLocalScale(new Vector3(0.1f, 0.1f, 0.1f));
            sink_long.getScaleController().setMaxScale(1.01f);
            sink_long.getScaleController().setMinScale(0.01f);
            sink_long.setParent(anchorNode);
            sink_long.setRenderable(sink_longRenderable);
            sink_long.select();

            addName(anchorNode,sink_long,"Another Sink");
        }
        if(selected == 20)
        {
            TransformableNode table = new TransformableNode(arFragment.getTransformationSystem());
            table.setLocalRotation(Quaternion.axisAngle(new Vector3(1f, 0, 0), 360f));
            // table.setLocalScale(new Vector3(0.1f, 0.1f, 0.1f));
            table.getScaleController().setMaxScale(1.01f);
            table.getScaleController().setMinScale(0.01f);
            table.setParent(anchorNode);
            table.setRenderable(tableRenderable);
            table.select();

            addName(anchorNode,table,"Table");
        }
        if(selected == 21)
        {
            TransformableNode table_chair = new TransformableNode(arFragment.getTransformationSystem());
            table_chair.setLocalRotation(Quaternion.axisAngle(new Vector3(1f, 0, 0), 360f));
            // table_chair.setLocalScale(new Vector3(0.1f, 0.1f, 0.1f));
            table_chair.getScaleController().setMaxScale(1.01f);
            table_chair.getScaleController().setMinScale(0.01f);
            table_chair.setParent(anchorNode);
            table_chair.setRenderable(table_chairRenderable);
            table_chair.select();

            addName(anchorNode,table_chair,"Dining Table");
        }
        if(selected == 22)
        {
            TransformableNode toilet = new TransformableNode(arFragment.getTransformationSystem());
            toilet.setLocalRotation(Quaternion.axisAngle(new Vector3(1f, 0, 0), 360f));
            // toilet.setLocalScale(new Vector3(0.1f, 0.1f, 0.1f));
            toilet.getScaleController().setMaxScale(1.01f);
            toilet.getScaleController().setMinScale(0.01f);
            toilet.setParent(anchorNode);
            toilet.setRenderable(toiletRenderable);
            toilet.select();

            addName(anchorNode,toilet,"Toilet");
        }
        if(selected == 23)
        {
            TransformableNode treadmill = new TransformableNode(arFragment.getTransformationSystem());
            treadmill.setLocalRotation(Quaternion.axisAngle(new Vector3(1f, 0, 0), 360f));
            // treadmill.setLocalScale(new Vector3(0.1f, 0.1f, 0.1f));
            treadmill.getScaleController().setMaxScale(1.01f);
            treadmill.getScaleController().setMinScale(0.01f);
            treadmill.setParent(anchorNode);
            treadmill.setRenderable(treadmillRenderable);
            treadmill.select();

            addName(anchorNode,treadmill,"Treadmill");
        }
        if(selected == 24)
        {
            TransformableNode tvcabinet = new TransformableNode(arFragment.getTransformationSystem());
            tvcabinet.setLocalRotation(Quaternion.axisAngle(new Vector3(1f, 0, 0), 360f));
            // tvcabinet.setLocalScale(new Vector3(0.1f, 0.1f, 0.1f));
            tvcabinet.getScaleController().setMaxScale(1.01f);
            tvcabinet.getScaleController().setMinScale(0.01f);
            tvcabinet.setParent(anchorNode);
            tvcabinet.setRenderable(tvcabinetRenderable);
            tvcabinet.select();

            addName(anchorNode,tvcabinet,"Tv Cabinet");
        }
        if(selected == 25)
        {
            TransformableNode whirlpool_gas_cooker = new TransformableNode(arFragment.getTransformationSystem());
            whirlpool_gas_cooker.setLocalRotation(Quaternion.axisAngle(new Vector3(1f, 0, 0), 360f));
            // whirlpool_gas_cooker.setLocalScale(new Vector3(0.1f, 0.1f, 0.1f));
            whirlpool_gas_cooker.getScaleController().setMaxScale(1.01f);
            whirlpool_gas_cooker.getScaleController().setMinScale(0.01f);
            whirlpool_gas_cooker.setParent(anchorNode);
            whirlpool_gas_cooker.setRenderable(whirlpool_gas_cookerRenderable);
            whirlpool_gas_cooker.select();

            addName(anchorNode,whirlpool_gas_cooker,"Whirlpool Gas Cooker");
        }
        if(selected == 26)
        {
            TransformableNode wineglass = new TransformableNode(arFragment.getTransformationSystem());
            wineglass.setLocalRotation(Quaternion.axisAngle(new Vector3(1f, 0, 0), 360f));
            // wineglass.setLocalScale(new Vector3(0.1f, 0.1f, 0.1f));
            wineglass.getScaleController().setMaxScale(1.01f);
            wineglass.getScaleController().setMinScale(0.01f);
            wineglass.setParent(anchorNode);
            wineglass.setRenderable(wineglassRenderable);
            wineglass.select();

            addName(anchorNode,wineglass,"Wine Glass");
        }
    }

    private void addName(AnchorNode anchorNode, TransformableNode model, String name) {

        //Each model we will create each name
        ViewRenderable.builder().setView(this,R.layout.name_furniture)
                .build()
                .thenAccept(viewRenderable -> {
                    TransformableNode nameView = new TransformableNode(arFragment.getTransformationSystem());
                    nameView.setLocalPosition(new Vector3(0f,model.getLocalPosition().y+0.5f,0));
                    nameView.setParent(anchorNode);
                    nameView.setRenderable(viewRenderable);
                    nameView.select();

                    //set Text
                    TextView txt_name =(TextView)viewRenderable.getView();
                    txt_name.setText(name);

                    //Click to Text View to remove model
                    txt_name.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            anchorNode.setParent(null);
                        }
                    });
                });
    }

    private void setClickListener() {
        for(int i=0;i<arrayView.length;i++)
            arrayView[i].setOnClickListener(this);
    }

    private void setArrayView() {
        arrayView = new View[]{
                aluminium_chair,armchair,basketball_hoop,bench,chemini,college_table,cottage_light,door,door1,drawer,eb_nightstand,football,kitchen_wardrobe,office_chair,outdoorparkbenches,ps4,samsung_led_tv,shelf,sink_long,table,table_chair,toilet,treadmill,tvcabinet,whirlpool_gas_cooker,wineglass
        };
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.aluminium_chair)
        {
            selected = 1;
            setBackground(v.getId());
        }
        else if(v.getId() == R.id.armchair)
        {
            selected = 2;
            setBackground(v.getId());
        }
        else if(v.getId() == R.id.basketball_hoop)
        {
            selected = 3;
            setBackground(v.getId());
        }
        else if(v.getId() == R.id.bench)
        {
            selected = 4;
            setBackground(v.getId());
        }
        else if(v.getId() == R.id.chemini)
        {
            selected = 5;
            setBackground(v.getId());
        }
        else if(v.getId() == R.id.college_table)
        {
            selected = 6;
            setBackground(v.getId());
        }
        else if(v.getId() == R.id.cottage_light)
        {
            selected = 7;
            setBackground(v.getId());
        }
        else if(v.getId() == R.id.door)
        {
            selected = 8;
            setBackground(v.getId());
        }
        else if(v.getId() == R.id.door1)
        {   selected = 9;
            setBackground(v.getId());
        }
        else if(v.getId() == R.id.drawer)
        {
            selected = 10;
            setBackground(v.getId());
        }
        else if(v.getId() == R.id.eb_nightstand)
        {
            selected = 11;
            setBackground(v.getId());
        }
        else if(v.getId() == R.id.football)
        {
            selected = 12;
            setBackground(v.getId());
        }
        else if(v.getId() == R.id.kitchen_wardrobe)
        {
            selected = 13;
            setBackground(v.getId());
        }
        else if(v.getId() == R.id.office_chair)
        {
            selected = 14;
            setBackground(v.getId());
        }
        else if(v.getId() == R.id.outdoorparkbenches)
        {
            selected = 15;
            setBackground(v.getId());
        }
        else if(v.getId() == R.id.ps4)
        {
            selected = 16;
            setBackground(v.getId());
        }
        else if(v.getId() == R.id.samsung_led_tv)
        {
            selected = 17;
            setBackground(v.getId());
        }
        else if(v.getId() == R.id.shelf)
        {
            selected = 18;
            setBackground(v.getId());
        }
        else if(v.getId() == R.id.sink_long)
        {
            selected = 19;
            setBackground(v.getId());
        }
        else if(v.getId() == R.id.table)
        {
            selected = 20;
            setBackground(v.getId());
        }
        else if(v.getId() == R.id.table_chair)
        {
            selected = 21;
            setBackground(v.getId());
        }
        else if(v.getId() == R.id.toilet)
        {
            selected = 22;
            setBackground(v.getId());
        }
        else if(v.getId() == R.id.treadmill)
        {
            selected = 23;
            setBackground(v.getId());
        }
        else if(v.getId() == R.id.tvcabinet)
        {
            selected = 24;
            setBackground(v.getId());
        }
        else if(v.getId() == R.id.whirlpool_gas_cooker)
        {
            selected = 25;
            setBackground(v.getId());
        }
        else if(v.getId() == R.id.wineglass)
        {
            selected = 26;
            setBackground(v.getId());
        }
    }

    private void setBackground(int id) {
        for (int i=0;i<arrayView.length;i++) {
            if (arrayView[i].getId() == id) {
                arrayView[i].setBackgroundColor(Color.parseColor("#A0FFEE58"));
            }
            else {
                arrayView[i].setBackgroundColor(Color.red(5));
            }
        }
    }
}
