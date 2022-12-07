(ns ogbe.fulcro.mui.icons.bloodtype
  #?(:cljs (:require
            ["@mui/icons-material/Bloodtype" :default Bloodtype]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bloodtype
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Bloodtype)))