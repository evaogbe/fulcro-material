(ns ogbe.fulcro.mui.icons.crop-original
  #?(:cljs (:require
            ["@mui/icons-material/CropOriginal" :default CropOriginal]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-crop-original
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CropOriginal)))