(ns ogbe.fulcro.mui.icons.crop-portrait-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CropPortraitRounded" :default CropPortraitRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-crop-portrait-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CropPortraitRounded)))