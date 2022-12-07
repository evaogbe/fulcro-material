(ns ogbe.fulcro.mui.icons.crop-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CropRounded" :default CropRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-crop-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CropRounded)))