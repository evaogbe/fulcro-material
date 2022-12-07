(ns ogbe.fulcro.mui.icons.landslide
  #?(:cljs (:require
            ["@mui/icons-material/Landslide" :default Landslide]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-landslide
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Landslide)))