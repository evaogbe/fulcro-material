(ns ogbe.fulcro.mui.icons.crop
  #?(:cljs (:require
            ["@mui/icons-material/Crop" :default Crop]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-crop
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Crop)))