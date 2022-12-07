(ns ogbe.fulcro.mui.icons.crop-portrait
  #?(:cljs (:require
            ["@mui/icons-material/CropPortrait" :default CropPortrait]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-crop-portrait
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CropPortrait)))