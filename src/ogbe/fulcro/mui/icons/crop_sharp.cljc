(ns ogbe.fulcro.mui.icons.crop-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CropSharp" :default CropSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-crop-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CropSharp)))