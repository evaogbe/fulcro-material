(ns ogbe.fulcro.mui.icons.houseboat
  #?(:cljs (:require
            ["@mui/icons-material/Houseboat" :default Houseboat]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-houseboat
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Houseboat)))