(ns ogbe.fulcro.mui.icons.crop-free
  #?(:cljs (:require
            ["@mui/icons-material/CropFree" :default CropFree]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-crop-free
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CropFree)))