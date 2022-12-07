(ns ogbe.fulcro.mui.icons.flatware
  #?(:cljs (:require
            ["@mui/icons-material/Flatware" :default Flatware]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flatware
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Flatware)))