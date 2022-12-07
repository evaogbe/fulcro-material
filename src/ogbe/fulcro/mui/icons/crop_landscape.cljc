(ns ogbe.fulcro.mui.icons.crop-landscape
  #?(:cljs (:require
            ["@mui/icons-material/CropLandscape" :default CropLandscape]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-crop-landscape
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CropLandscape)))