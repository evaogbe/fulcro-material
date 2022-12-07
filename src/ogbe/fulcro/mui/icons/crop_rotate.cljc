(ns ogbe.fulcro.mui.icons.crop-rotate
  #?(:cljs (:require
            ["@mui/icons-material/CropRotate" :default CropRotate]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-crop-rotate
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CropRotate)))