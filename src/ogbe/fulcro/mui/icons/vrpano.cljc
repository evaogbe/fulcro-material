(ns ogbe.fulcro.mui.icons.vrpano
  #?(:cljs (:require
            ["@mui/icons-material/Vrpano" :default Vrpano]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-vrpano
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Vrpano)))