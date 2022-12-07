(ns ogbe.fulcro.mui.icons.crop-din
  #?(:cljs (:require
            ["@mui/icons-material/CropDin" :default CropDin]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-crop-din
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CropDin)))