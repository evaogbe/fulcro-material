(ns ogbe.fulcro.mui.icons.crop-square
  #?(:cljs (:require
            ["@mui/icons-material/CropSquare" :default CropSquare]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-crop-square
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CropSquare)))