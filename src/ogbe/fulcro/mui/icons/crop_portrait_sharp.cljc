(ns ogbe.fulcro.mui.icons.crop-portrait-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CropPortraitSharp" :default CropPortraitSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-crop-portrait-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CropPortraitSharp)))