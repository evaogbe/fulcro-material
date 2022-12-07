(ns ogbe.fulcro.mui.icons.cyclone
  #?(:cljs (:require
            ["@mui/icons-material/Cyclone" :default Cyclone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cyclone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Cyclone)))